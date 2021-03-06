/*
*  By downloading the PROGRAM you agree to the following terms of use:
*
*  BROAD INSTITUTE - SOFTWARE LICENSE AGREEMENT - FOR ACADEMIC NON-COMMERCIAL RESEARCH PURPOSES ONLY
*
*  This Agreement is made between the Broad Institute, Inc. with a principal address at 7 Cambridge Center, Cambridge, MA 02142 (BROAD) and the LICENSEE and is effective at the date the downloading is completed (EFFECTIVE DATE).
*
*  WHEREAS, LICENSEE desires to license the PROGRAM, as defined hereinafter, and BROAD wishes to have this PROGRAM utilized in the public interest, subject only to the royalty-free, nonexclusive, nontransferable license rights of the United States Government pursuant to 48 CFR 52.227-14; and
*  WHEREAS, LICENSEE desires to license the PROGRAM and BROAD desires to grant a license on the following terms and conditions.
*  NOW, THEREFORE, in consideration of the promises and covenants made herein, the parties hereto agree as follows:
*
*  1. DEFINITIONS
*  1.1 PROGRAM shall mean copyright in the object code and source code known as GATK2 and related documentation, if any, as they exist on the EFFECTIVE DATE and can be downloaded from http://www.broadinstitute/GATK on the EFFECTIVE DATE.
*
*  2. LICENSE
*  2.1   Grant. Subject to the terms of this Agreement, BROAD hereby grants to LICENSEE, solely for academic non-commercial research purposes, a non-exclusive, non-transferable license to: (a) download, execute and display the PROGRAM and (b) create bug fixes and modify the PROGRAM.
*  The LICENSEE may apply the PROGRAM in a pipeline to data owned by users other than the LICENSEE and provide these users the results of the PROGRAM provided LICENSEE does so for academic non-commercial purposes only.  For clarification purposes, academic sponsored research is not a commercial use under the terms of this Agreement.
*  2.2  No Sublicensing or Additional Rights. LICENSEE shall not sublicense or distribute the PROGRAM, in whole or in part, without prior written permission from BROAD.  LICENSEE shall ensure that all of its users agree to the terms of this Agreement.  LICENSEE further agrees that it shall not put the PROGRAM on a network, server, or other similar technology that may be accessed by anyone other than the LICENSEE and its employees and users who have agreed to the terms of this agreement.
*  2.3  License Limitations. Nothing in this Agreement shall be construed to confer any rights upon LICENSEE by implication, estoppel, or otherwise to any computer software, trademark, intellectual property, or patent rights of BROAD, or of any other entity, except as expressly granted herein. LICENSEE agrees that the PROGRAM, in whole or part, shall not be used for any commercial purpose, including without limitation, as the basis of a commercial software or hardware product or to provide services. LICENSEE further agrees that the PROGRAM shall not be copied or otherwise adapted in order to circumvent the need for obtaining a license for use of the PROGRAM.
*
*  3. OWNERSHIP OF INTELLECTUAL PROPERTY
*  LICENSEE acknowledges that title to the PROGRAM shall remain with BROAD. The PROGRAM is marked with the following BROAD copyright notice and notice of attribution to contributors. LICENSEE shall retain such notice on all copies.  LICENSEE agrees to include appropriate attribution if any results obtained from use of the PROGRAM are included in any publication.
*  Copyright 2012 Broad Institute, Inc.
*  Notice of attribution:  The GATK2 program was made available through the generosity of Medical and Population Genetics program at the Broad Institute, Inc.
*  LICENSEE shall not use any trademark or trade name of BROAD, or any variation, adaptation, or abbreviation, of such marks or trade names, or any names of officers, faculty, students, employees, or agents of BROAD except as states above for attribution purposes.
*
*  4. INDEMNIFICATION
*  LICENSEE shall indemnify, defend, and hold harmless BROAD, and their respective officers, faculty, students, employees, associated investigators and agents, and their respective successors, heirs and assigns, (Indemnitees), against any liability, damage, loss, or expense (including reasonable attorneys fees and expenses) incurred by or imposed upon any of the Indemnitees in connection with any claims, suits, actions, demands or judgments arising out of any theory of liability (including, without limitation, actions in the form of tort, warranty, or strict liability and regardless of whether such action has any factual basis) pursuant to any right or license granted under this Agreement.
*
*  5. NO REPRESENTATIONS OR WARRANTIES
*  THE PROGRAM IS DELIVERED AS IS.  BROAD MAKES NO REPRESENTATIONS OR WARRANTIES OF ANY KIND CONCERNING THE PROGRAM OR THE COPYRIGHT, EXPRESS OR IMPLIED, INCLUDING, WITHOUT LIMITATION, WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, NONINFRINGEMENT, OR THE ABSENCE OF LATENT OR OTHER DEFECTS, WHETHER OR NOT DISCOVERABLE. BROAD EXTENDS NO WARRANTIES OF ANY KIND AS TO PROGRAM CONFORMITY WITH WHATEVER USER MANUALS OR OTHER LITERATURE MAY BE ISSUED FROM TIME TO TIME.
*  IN NO EVENT SHALL BROAD OR ITS RESPECTIVE DIRECTORS, OFFICERS, EMPLOYEES, AFFILIATED INVESTIGATORS AND AFFILIATES BE LIABLE FOR INCIDENTAL OR CONSEQUENTIAL DAMAGES OF ANY KIND, INCLUDING, WITHOUT LIMITATION, ECONOMIC DAMAGES OR INJURY TO PROPERTY AND LOST PROFITS, REGARDLESS OF WHETHER BROAD SHALL BE ADVISED, SHALL HAVE OTHER REASON TO KNOW, OR IN FACT SHALL KNOW OF THE POSSIBILITY OF THE FOREGOING.
*
*  6. ASSIGNMENT
*  This Agreement is personal to LICENSEE and any rights or obligations assigned by LICENSEE without the prior written consent of BROAD shall be null and void.
*
*  7. MISCELLANEOUS
*  7.1 Export Control. LICENSEE gives assurance that it will comply with all United States export control laws and regulations controlling the export of the PROGRAM, including, without limitation, all Export Administration Regulations of the United States Department of Commerce. Among other things, these laws and regulations prohibit, or require a license for, the export of certain types of software to specified countries.
*  7.2 Termination. LICENSEE shall have the right to terminate this Agreement for any reason upon prior written notice to BROAD. If LICENSEE breaches any provision hereunder, and fails to cure such breach within thirty (30) days, BROAD may terminate this Agreement immediately. Upon termination, LICENSEE shall provide BROAD with written assurance that the original and all copies of the PROGRAM have been destroyed, except that, upon prior written authorization from BROAD, LICENSEE may retain a copy for archive purposes.
*  7.3 Survival. The following provisions shall survive the expiration or termination of this Agreement: Articles 1, 3, 4, 5 and Sections 2.2, 2.3, 7.3, and 7.4.
*  7.4 Notice. Any notices under this Agreement shall be in writing, shall specifically refer to this Agreement, and shall be sent by hand, recognized national overnight courier, confirmed facsimile transmission, confirmed electronic mail, or registered or certified mail, postage prepaid, return receipt requested.  All notices under this Agreement shall be deemed effective upon receipt.
*  7.5 Amendment and Waiver; Entire Agreement. This Agreement may be amended, supplemented, or otherwise modified only by means of a written instrument signed by all parties. Any waiver of any rights or failure to act in a specific instance shall relate only to such instance and shall not be construed as an agreement to waive any rights or fail to act in any other instance, whether or not similar. This Agreement constitutes the entire agreement among the parties with respect to its subject matter and supersedes prior agreements or understandings between the parties relating to its subject matter.
*  7.6 Binding Effect; Headings. This Agreement shall be binding upon and inure to the benefit of the parties and their respective permitted successors and assigns. All headings are for convenience only and shall not affect the meaning of any provision of this Agreement.
*  7.7 Governing Law. This Agreement shall be construed, governed, interpreted and applied in accordance with the internal laws of the Commonwealth of Massachusetts, U.S.A., without regard to conflict of laws principles.
*/
package org.broadinstitute.gatk.tools.walkers.bqsr;

import org.broadinstitute.gatk.engine.walkers.WalkerTest;
import org.broadinstitute.gatk.utils.Utils;
import org.broadinstitute.gatk.utils.exceptions.UserException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import static org.testng.Assert.assertTrue;

/**
 * Tests Analyze Covariates.
 * <p/>
 * Notice that since PDF report generated by R are different every-time this program
 * is executed their content won't be tested. It only will verify that file has a healthy size.
 *
 */
public class AnalyzeCovariatesIntegrationTest extends WalkerTest {

    private static final String TOOL_NAME = AnalyzeCovariates.class.getSimpleName();

    /**
     * Directory where the testdata is located.
     */
    private static final File TEST_DATA_DIR = new File(privateTestDir,"AnalyzeCovariates");

    /**
     * File containing the before report for normal testing.
     */
    private static final File BEFORE_FILE = new File(TEST_DATA_DIR,"before.table");

    /**
     * File containing the after report for normal testing.
     */
    private static final File AFTER_FILE = new File(TEST_DATA_DIR,"after.table");


    /**
     * File containing the bqsr report for normal testing.
     */
    private static final File BQSR_FILE = new File(TEST_DATA_DIR,"bqsr.table");

    /**
     * Test the content of the generated csv file.
     *
     * @throws IOException should never happen. It would be an indicator of a
     * problem with the testing environment.
     */
    @Test(enabled = true)
    public void testCsvGeneration()
            throws IOException {

       final WalkerTestSpec spec = new WalkerTestSpec(
               buildCommandLine("%s",null,true,true,true),
               Collections.singletonList("106709d32e6f0a0a9dd6a6340ec246ab"));
       executeTest("testCsvGeneration",spec);
    }


    /**
     * Test the size of the generated pdf.
     * <p/>
     * Unfortunately we cannot test the content as it changes slightly
     *    every time the tool is run.
     *
     * @throws IOException should never happen. It would be an
     *    indicator of a problem with the testing environment.
     */
    @Test(enabled = true)
    public void testPdfGeneration()
            throws IOException {
        final File pdfFile = createTempFile("ACTest", ".pdf");
        pdfFile.delete();

        final List<String> md5 = Collections.emptyList();
        final WalkerTestSpec spec = new WalkerTestSpec(
                buildCommandLine(null,pdfFile.toString(),true,true,true),md5);
        executeTest("testPdfGeneration",spec);
        assertTrue(pdfFile.exists(),"the pdf file was not created");
        assertTrue(pdfFile.length() > 260000,"the pdf file size does"
                + " not reach the minimum of 260Kb");
    }

    /**
     * Test the effect of changing some recalibration parameters.
     * @param afterFileName name of the alternative after recalibration file.
     * @param description describes what has been changed.
     * @throws IOException should never happen. It would be an
     *        indicator of a problem with the testing environment.
     */
    @Test(enabled = true, dataProvider="alternativeAfterFileProvider")
    public void testParameterChangeException(final String afterFileName,
            final String description)
            throws IOException  {

        final File afterFile = new File(TEST_DATA_DIR,afterFileName);
        afterFile.deleteOnExit();
        final WalkerTestSpec spec = new WalkerTestSpec(
                buildCommandLine(null,"%s",true,true,afterFile),
                1,UserException.IncompatibleRecalibrationTableParameters.class);
        executeTest("testParameterChangeException - " + description, spec);
    }


    /**
     * Test combinations of input and output inclusion exclusion of the command
     * line that cause an exception to be thrown.
     *
     * @param useCsvFile  whether to include the output csv file.
     * @param usePdfFile  whether to include the output pdf file.
     * @param useBQSRFile whether to include the -BQSR input file.
     * @param useBeforeFile whether to include the -before input file.
     * @param useAfterFile  whether to include the -after input file.
     * @throws IOException never thrown, unless there is a problem with the testing environment.
     */
    @Test(enabled = true, dataProvider="alternativeInOutAbsenceCombinations")
    public void testInOutAbsenceException(final boolean useCsvFile, final boolean usePdfFile,
            final boolean useBQSRFile, final boolean useBeforeFile, final boolean useAfterFile)
            throws IOException {
        final WalkerTestSpec spec = new WalkerTestSpec(buildCommandLine(useCsvFile,usePdfFile,
                useBQSRFile,useBeforeFile,useAfterFile),0,UserException.class);
        executeTest("testInOutAbsencePresenceException", spec);
    }

    /**
     * Test combinations of input and output inclusion exclusion of the
     * command line that won't cause an exception.
     *
     * @param useCsvFile  whether to include the output csv file.
     * @param usePdfFile  whether to include the output pdf file.
     * @param useBQSRFile whether to include the -BQSR input file.
     * @param useBeforeFile whether to include the -before input file.
     * @param useAfterFile  whether to include the -after input file.
     * @throws IOException never thrown, unless there is a problem with the testing environment.
     */
    @Test(enabled = true, dataProvider="alternativeInOutAbsenceCombinations")
    public void testInOutAbsence(final boolean useCsvFile, final boolean usePdfFile,
            final boolean useBQSRFile, final boolean useBeforeFile, final boolean useAfterFile)
            throws IOException {
        final List<String> md5 = Collections.emptyList();
        final WalkerTestSpec spec = new WalkerTestSpec(buildCommandLine(useCsvFile,usePdfFile,
                useBQSRFile,useBeforeFile,useAfterFile),md5);
        executeTest("testInOutAbsencePresence", spec);
    }



    @DataProvider
    public Iterator<Object[]> alternativeInOutAbsenceCombinations(Method m) {
        List<Object[]> result = new LinkedList<Object[]>();
        if (m.getName().endsWith("Exception")) {
           result.add(new Object[] { false, false, true, true, true });
           result.add(new Object[] { true, true, false, false ,false});
        }
        else {
           result.add(new Object[] { true, true, true, false, false });
           result.add(new Object[] { true, true, false, true, false });
           result.add(new Object[] { true, true, false, false, true });
           result.add(new Object[] { true, false,false, true, false });
           result.add(new Object[] { false, true, true, false, false });

        }
        return result.iterator();
    }

    /**
     * Provide recalibration parameter change data to relevant tests.
     * @param m target test method.
     * @return never <code>null</code>.
     */
    @DataProvider
    public Iterator<Object[]> alternativeAfterFileProvider (Method m) {
        final boolean expectsException = m.getName().endsWith("Exception");
        final List<Object[]> result = new LinkedList<Object[]>();
        for (final Object[] data : DIFFERENT_PARAMETERS_AFTER_FILES) {
           if (data[1].equals(expectsException)) {
               result.add(new Object[] { data[0], data[2] });
           }
        }
        return result.iterator();
    }

    /**
     * Triplets &lt; alfter-grp-file, whether it should fail, what is different &gt;
     */
    private final Object[][] DIFFERENT_PARAMETERS_AFTER_FILES = {
            {"after-cov.table", true, "Adds additional covariate: repeat-length" },
            {"after-dpSOLID.table", true, "Change the default platform to SOLID" },
            {"after-noDp.table",true, "Unset the default platform" },
            {"after-mcs4.table", true, "Changed -mcs parameter from 2 to 4" }
    };

    /**
     * Build the AC command line given what combinations of input and output files should be included.
     *
     * @param useCsvFile  whether to include the output csv file.
     * @param usePdfFile  whether to include the output pdf file.
     * @param useBQSRFile whether to include the -BQSR input file.
     * @param useBeforeFile whether to include the -before input file.
     * @param useAfterFile  whether to include the -after input file.
     * @return never <code>null</code>.
     * @throws IOException never thrown, unless there is a problem with the testing environment.
     */
    private String buildCommandLine(final boolean useCsvFile, final boolean usePdfFile,
            final boolean useBQSRFile, final boolean useBeforeFile, final boolean useAfterFile)
            throws IOException {

        final File csvFile = useCsvFile ? createTempFile("ACTest",".csv") : null;
        final File pdfFile = usePdfFile ? createTempFile("ACTest",".pdf") : null;

        return buildCommandLine(csvFile == null ? null : csvFile.toString(),
                pdfFile == null ? null : pdfFile.toString(),
                useBQSRFile,useBeforeFile,useAfterFile);
    }

    /**
     * Build the AC command line given the output file names explicitly and what test input files to use.
     * <p/>
     *
     * @param csvFileName the csv output file, <code>null</code> if none should be provided.
     * @param pdfFileName the plots output file, <code>null</code> if none should be provided.
     * @param useBQSRFile whether to include the -BQSR input file.
     * @param useBeforeFile whether to include the -before input file.
     * @param useAfterFile  whether to include the -after input file.
     *
     * @return never <code>null</code>.
     */
    private String buildCommandLine(final String csvFileName, final String pdfFileName, final boolean useBQSRFile,
                                    final boolean useBeforeFile, final boolean useAfterFile) {
        return buildCommandLine(csvFileName,pdfFileName,useBQSRFile ? BQSR_FILE : null,
                useBeforeFile ? BEFORE_FILE : null,
                useAfterFile ? AFTER_FILE : null);
    }

    /**
     * Build the AC command line given the output file names and the after file name explicitly and what other
     * test input files to use.
     * <p/>
     *
     * @param csvFileName the csv output file, <code>null</code> if none should be provided.
     * @param pdfFileName the plots output file, <code>null</code> if none should be provided.
     * @param useBQSRFile whether to include the -BQSR input file.
     * @param useBeforeFile whether to include the -before input file.
     * @param afterFile  the after input report file, <code>null</code> if none should be provided.
     *
     * @return never <code>null</code>.
     */
    private String buildCommandLine(final String csvFileName, final String pdfFileName, final boolean useBQSRFile,
                                    final boolean useBeforeFile, final File afterFile) {
        return buildCommandLine(csvFileName,pdfFileName,useBQSRFile ? BQSR_FILE : null,
                useBeforeFile ? BEFORE_FILE : null,
                afterFile);
    }

    /**
     * Build the AC command line given the output file names and the after file name explicitly and what other
     * test input files to use.
     * <p/>
     *
     * @param csvFileName the csv output file, <code>null</code> if none should be provided.
     * @param pdfFileName the plots output file, <code>null</code> if none should be provided.
     * @param bqsrFile the BQSR input report file, <code>null</code> if none should be provided.
     * @param beforeFile the before input report file, <code>null</code> if non should be provided.
     * @param afterFile  the after input report file, <code>null</code> if none should be provided.
     *
     * @return never <code>null</code>.
     */
    private String buildCommandLine(final String csvFileName, final String pdfFileName, final File bqsrFile,
        final File beforeFile, final File afterFile) {

        final List<String> args = new LinkedList<String>();
        args.add("-T");
        args.add(TOOL_NAME);
        args.add("-R");
        args.add(hg19Reference);
        args.add("-ignoreLMT");

        if (csvFileName != null) {
            args.add("-" + AnalyzeCovariates.CSV_ARG_SHORT_NAME);
            args.add("'" + csvFileName + "'");
        }
        if (pdfFileName != null) {
            args.add("-" + AnalyzeCovariates.PDF_ARG_SHORT_NAME);
            args.add("'" + pdfFileName + "'");
        }
        if (bqsrFile != null) {
            args.add("-BQSR");
            args.add("'" + bqsrFile.getAbsoluteFile().toString() + "'");
        }
        if (beforeFile != null) {
            args.add("-" + AnalyzeCovariates.BEFORE_ARG_SHORT_NAME);
            args.add("'" + beforeFile.getAbsolutePath().toString() + "'");
        }
        if (afterFile != null) {
            args.add("-" + AnalyzeCovariates.AFTER_ARG_SHORT_NAME);
            args.add("'" + afterFile.getAbsolutePath().toString() + "'");
        }
        return Utils.join(" ", args);

    }
}
