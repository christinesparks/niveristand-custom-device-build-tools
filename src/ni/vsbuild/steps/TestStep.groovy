package ni.vsbuild.steps

abstract class TestStep extends AbstractStep {

   def tsVersion

   TestStep(script, mapStep, tsVersion) {
      super(script, mapStep)
      this.tsVersion = tsVersion
   }
}
