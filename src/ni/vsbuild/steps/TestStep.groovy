package ni.vsbuild.steps

abstract class TestStep extends AbstractStep {

   def tsVersion

   TestStep(script, mapStep) {
      super(script, mapStep)
      //this.tsVersion = tsVersion
      script.echo 'this is the generic test step'
   }
}
