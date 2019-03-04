package ni.vsbuild.steps

import ni.vsbuild.BuildConfiguration

class TestRunSeqStep extends TestStep {

   def seq

   TestrunSeqStep(script, mapStep, tsVersion) {
      super(script, mapStep, tsVersion)
      this.seq = mapStep.get('seq')
   }

   void executeStep(BuildConfiguration configuration) {
      script.tsRunSeq(seq, tsVersion)
   }
}
