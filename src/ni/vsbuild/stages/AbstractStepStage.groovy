package ni.vsbuild.stages

import ni.vsbuild.steps.Step
import ni.vsbuild.steps.StepFactory

abstract class AbstractStepStage extends AbstractStage {

   AbstractStepStage(script, stageName, configuration, lvVersion) {
      super(script, stageName, configuration, lvVersion)
   }

   protected void executeSteps(def stepList) {
      def printString = """
      Executing Steps in Abstract Step Stage with the following info:
         StepList: $stepList
         lvVersion: $lvVersion
      """.stripIndent()
      
      script.echo printString
      
      List<Step> steps = StepFactory.createSteps(script, stepList, lvVersion)
      for(Step step : steps) {
         script.execute(configuration)
      }
   }
}
