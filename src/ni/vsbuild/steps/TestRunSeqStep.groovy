package ni.vsbuild.steps

import ni.vsbuild.BuildConfiguration

class TestRunSeqStep extends TestStep {

   def seq

   TestRunSeqStep(script, mapStep) {
      super(script, mapStep)
      this.seq = mapStep.get('seq')
   }

   void executeStep(BuildConfiguration configuration) {
      
      script.echo 'Called Execute Test Step'
      configuration.printInformation(script)
      
      //script.tsRunSeq(seq, tsVersion)
   }
}
