package ni.vsbuild.stages

import ni.vsbuild.steps.Step
import ni.vsbuild.steps.StepFactory

abstract class AbstractStepStage extends AbstractStage {

   AbstractStepStage(script, stageName, configuration, lvVersion) {
      super(script, stageName, configuration, lvVersion)
   }

   protected void executeSteps(def stepList) {
      List<Step> steps = StepFactory.createSteps(script, stepList, lvVersion)
      script.echo '$steps $(steps.length)'
      for(Step step : steps) {
         script.echo 'Executing $step'
         script.execute(configuration)
      }
   }
}
