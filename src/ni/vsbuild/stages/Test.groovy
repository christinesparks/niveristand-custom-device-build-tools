package ni.vsbuild.stages

class Test extends AbstractStepStage {

   Test(script, configuration, lvVersion) {
      super(script, 'Test', configuration, lvVersion)
      script.echo 'New Test'
   }

   void executeStage() {
      
      script.echo '$configuration.test'
      
      executeSteps(configuration.test)
   }
}
