package ni.vsbuild.stages

class Test extends AbstractStepStage {

   Test(script, configuration, lvVersion) {
      super(script, 'Test', configuration, lvVersion)
   }

   void executeStage() {
      
      script.echo '$configuration.test'
      
      executeSteps(configuration.test)
   }
}
