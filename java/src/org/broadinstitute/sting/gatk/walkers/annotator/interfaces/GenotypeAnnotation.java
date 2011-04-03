package org.broadinstitute.sting.gatk.walkers.annotator.interfaces;

import org.broad.tribble.util.variantcontext.Genotype;
import org.broad.tribble.util.variantcontext.VariantContext;
import org.broad.tribble.vcf.VCFFormatHeaderLine;
import org.broadinstitute.sting.gatk.contexts.AlignmentContext;
import org.broadinstitute.sting.gatk.refdata.RefMetaDataTracker;
import org.broadinstitute.sting.gatk.contexts.ReferenceContext;

import java.util.Map;
import java.util.List;

public interface GenotypeAnnotation {

    // return annotations for the given contexts/genotype split by sample
    public Map<String, Object> annotate(RefMetaDataTracker tracker, ReferenceContext ref, AlignmentContext stratifiedContext, VariantContext vc, Genotype g);

    // return the FORMAT keys
    public List<String> getKeyNames();

    // return the descriptions used for the VCF FORMAT meta field
    public List<VCFFormatHeaderLine> getDescriptions();
   
}