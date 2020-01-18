package testScenarios

import io.gatling.core.Predef._
import io.gatling.core.scenario.Simulation
import io.gatling.http.Predef._

import scala.concurrent.duration._
import scala.language.postfixOps


class GetAllEmployeesHTTP extends Simulation {
  val httpConf = http.baseUrl("http://localhost:8080/v1")
    .acceptLanguageHeader("en-US,en;q=0.5")
    .acceptEncodingHeader("gzip, deflate")
    .userAgentHeader("Mozilla/5.0 (Windows NT 5.1; rv:31.0) Gecko/20100101 Firefox/31.0")

  val scn = scenario("Get employees from database with ramp user method")
    .repeat(100) {
      exec(http("Get All Employees ramp Users").get(s"/employee"))
        .pause(10 millis)
    }

  setUp {
    scn.inject(rampUsers(500) during (2 minutes)).
      throttle(reachRps(100) in (10 seconds),
        holdFor(2 minutes))
  }.protocols(httpConf)
}
