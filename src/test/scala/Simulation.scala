import Request.{getStep2, getStep3, getStep4, getStep5, getStep6, getStep7, getStep8, getStep9, getStepDone, postStep2}
import io.gatling.core.Predef
import io.gatling.core.Predef._

object Simulation {
  def getOrdersScen = Predef.scenario("first")
    .exec(getStep2)
    .pause(1)
    .exec(postStep2)
    .pause(2)
    .exec(getStep3)
    .pause(3)
    .exec(getStep4)
    .pause(5)
    .exec(getStep5)
    .pause(1)
    .exec(getStep6)
    .pause(2)
    .exec(getStep7)
    .pause(3)
    .exec(getStep8)
    .pause(5)
    .exec(getStep9)
    .pause(5)
    .exec(getStepDone)

}