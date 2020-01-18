package testScenarios

import io.gatling.core.Predef.{atOnceUsers, exec, scenario}
import io.gatling.http.Predef.http

import io.gatling.core.scenario.Simulation
import io.gatling.core.Predef._

import scala.util.Random

import scala.concurrent.duration._
import scala.language.postfixOps
import scala.language.postfixOps

class GetCategory extends Simulation {

  val httpConf = http.baseUrl("http://localhost:8080/v1")
    .acceptLanguageHeader("en-US,en;q=0.5")
    .acceptEncodingHeader("gzip, deflate")
    .userAgentHeader("Mozilla/5.0 (Windows NT 5.1; rv:31.0) Gecko/20100101 Firefox/31.0")

  val scn = scenario("Get category from database")
    .repeat(10) {
      exec(http("getCategory").get(s"/category/"))
        .pause(1 millis)
    }

  setUp(
    scn.inject(atOnceUsers(50))
  ).protocols(httpConf)
}