package ni.vsbuild.steps

import ni.vsbuild.BuildConfiguration

class TestRunSeqStep extends TestStep {

   def seq

   TestRunSeqStep(script, mapStep) {
      super(script, mapStep)
      this.seq = mapStep.get('seq')
   }

   void executeStep(BuildConfiguration configuration) {
      
      def debugString = self.seq
      
      script.echo 'Called Execute Test Step with sequence $debugString'
      
      //script.tsRunSeq(seq, tsVersion)
   }
}
