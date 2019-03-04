package ni.vsbuild.stages

class Test extends AbstractStepStage {

   Test(script, configuration, lvVersion) {
      super(script, 'Test', configuration, lvVersion)
   }

   void executeStage() {
      script.echo 'I am $configuration.test.sequence_location'
      executeSteps(configuration.test)
   }
}
