package basicConfig

import io.gatling.core.scenario.Simulation
import io.gatling.core.Predef._
import io.gatling.http.Predef._

import scala.concurrent.duration._
import scala.language.postfixOps


class TestClass extends Simulation {
  val httpConf = http.baseUrl("http://127.0.0.1:8080/")
    .acceptLanguageHeader("en-US,en;q=0.5")
    .acceptEncodingHeader("gzip, deflate")
    .userAgentHeader("Mozilla/5.0 (Windows NT 5.1; rv:31.0) Gecko/20100101 Firefox/31.0")

  val scn = scenario("Basic scenario")
    .repeat(100) {
      exec(http("Swagger page").get("swagger-ui.html#"))
        .pause(10 millis)
    }

  setUp(
    scn.inject(atOnceUsers(1))
  ).protocols(httpConf)
}
