/*
 * Copyright (c) 2009 The Broad Institute
 *
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following
 * conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 */

package org.broadinstitute.sting.gatk.io;

import org.broadinstitute.sting.gatk.io.stubs.Stub;
import org.broadinstitute.sting.gatk.io.storage.StorageFactory;
import org.broadinstitute.sting.gatk.io.storage.Storage;
import org.broadinstitute.sting.gatk.executive.OutputMergeTask;
import org.broadinstitute.sting.utils.StingException;

import java.util.*;
import java.io.File;
import java.io.IOException;

/**
 * An output tracker that tracks its output per-thread.
 *
 * @author mhanna
 * @version 0.1
 */
public class ThreadLocalOutputTracker extends OutputTracker {
    /**
     * Thread-local storage for output streams.
     */
    private ThreadLocal<Map<Stub, Storage>> storage = new ThreadLocal<Map<Stub,Storage>>();

    public <T> T getStorage( Stub<T> stub ) {
        Map<Stub,Storage> threadLocalOutputStreams = storage.get();

        if( threadLocalOutputStreams == null ) {
            threadLocalOutputStreams = new HashMap<Stub,Storage>();
            storage.set( threadLocalOutputStreams );
        }

        Storage target = threadLocalOutputStreams.get(stub);
        if( target == null ) {
            target = StorageFactory.createStorage(stub, createTempFile(stub));
            threadLocalOutputStreams.put(stub, target);
        }

        return (T)target;
    }

    /**
     * Close down any existing temporary files which have been opened.
     */
    public OutputMergeTask closeStorage() {
        Map<Stub,Storage> threadLocalStorage = storage.get();

        if( threadLocalStorage == null || threadLocalStorage.isEmpty() )
            return null;

        OutputMergeTask outputMergeTask = new OutputMergeTask();
        for( Map.Entry<Stub,Storage> entry: threadLocalStorage.entrySet() ) {
            Stub stub = entry.getKey();
            Storage storageEntry = entry.getValue();

            storageEntry.close();
            outputMergeTask.addMergeOperation(getTargetStream(stub),storageEntry);            
        }
        
        threadLocalStorage.clear();

        return outputMergeTask;
    }

    /**
     * Creates a temporary file for a stub of the given type.
     * @param stub Stub for which to create a temporary file.
     * @param <T> Type of the stub to accept.
     * @return A temp file, or throw an exception if the temp file cannot be created.
     */
    private <T> File createTempFile( Stub<T> stub ) {
        File tempFile = null;

        try {
            tempFile = File.createTempFile( stub.getClass().getName(), null );
            tempFile.deleteOnExit();
        }
        catch( IOException ex ) {
            throw new StingException("Unable to create temporary file for stub: " + stub.getClass().getName() );
        }

        return tempFile;
    }
}
