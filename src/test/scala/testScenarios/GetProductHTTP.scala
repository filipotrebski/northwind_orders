package testScenarios

import io.gatling.core.scenario.Simulation
import io.gatling.core.Predef._

import scala.util.Random
import io.gatling.http.Predef._

import scala.concurrent.duration._
import scala.language.postfixOps


class GetProductHTTP extends  Simulation {

  val httpConf = http.baseUrl("http://localhost:8080/v1")
    .acceptLanguageHeader("en-US,en;q=0.5")
    .acceptEncodingHeader("gzip, deflate")
    .userAgentHeader("Mozilla/5.0 (Windows NT 5.1; rv:31.0) Gecko/20100101 Firefox/31.0")

  val scn = scenario("Get product from database with atOnce")
    .repeat(100) {
      exec(http("getProduct").get(s"/product/{id}?id=${Random.nextInt(1000)+1}"))
        .pause(10 millis)

    }

  setUp(
    scn.inject(atOnceUsers(50))
  ).protocols(httpConf)
}
