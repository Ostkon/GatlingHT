import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._
import io.gatling.core.Predef._



object Request {
  def getStep2:ChainBuilder = {
    exec(
      http("getStep2")
        .get("/step/2")
        .check(status.is(200))

    )
  };

  def postStep2: ChainBuilder = {
    exec(
      http("postStep2")
        .post("/start")
        .body(StringBody("""{"challenger[age]":"18"}"""))
        .check(status.is(422))

    )
  }

  def getStep3: ChainBuilder = {
    exec(
      http("getStep3")
        .get("/step/3")
        .check(status.is(500))

    )
  };

  def getStep4: ChainBuilder = {
    exec(
      http("getStep4")
        .get("/step/4")
        .check(status.is(500))

    )
  }

  def getStep5: ChainBuilder = {
    exec(
      http("getStep5")
        .get("/step/5")
        .check(status.is(200))

    )
  }

  def getStep6: ChainBuilder = {
    exec(
      http("getStep6")
        .get("/step/6")
        .check(status.is(200))

    )
  }

  def getStep7: ChainBuilder = {
    exec(
      http("getStep7")
        .get("/step/7")
        .check(status.is(200))

    )
  }

  def getStep8: ChainBuilder = {
    exec(
      http("getStep8")
        .get("/step/8")
        .check(status.is(200))

    )
  }

  def getStep9: ChainBuilder = {
    exec(
      http("getStep9")
        .get("/step/9")
        .check(status.is(200))

    )
  };

  def getStepDone: ChainBuilder = {
    exec(
      http("getStepDone")
        .get("/done")
        .check(status.is(200))

    )
  }
}