package ni.vsbuild.steps

import ni.vsbuild.BuildConfiguration

class TestRunSeqStep extends TestStep {

   def seq
   def tsVersion
   def tsBitness

   TestRunSeqStep(script, mapStep) {
      super(script, mapStep)
      this.seq = mapStep.get('sequence_location')
      this.tsVersion = mapStep.get('teststand_version')
      this.tsBitness = mapStep.get('teststand_bitness')
   }

   void executeStep(BuildConfiguration configuration) {
      script.tsRunSeq(seq, '2017', '32')
   }
}
