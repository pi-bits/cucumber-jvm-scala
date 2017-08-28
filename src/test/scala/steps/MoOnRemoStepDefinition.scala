package steps

import cucumber.api.scala.{EN, ScalaDsl}
import org.junit.Assert
import org.openqa.selenium.WebDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.scalatest.Matchers
import org.scalatest.selenium.WebBrowser
import org.slf4j.LoggerFactory

class MoOnRemoStepDefinition extends ScalaDsl with EN {
  private val log = LoggerFactory.getLogger(classOf[MoOnRemoStepDefinition]);
  implicit var webDriver: WebDriver = _
  val host = "https://apply.santander.co.uk/mortgages/"
  Before("@dip") {
    scenario =>
      webDriver = new FirefoxDriver
  }
  After("@dip") {
    scenario =>
      webDriver.close()
  }

  Given("""^I navigate to eligibility$""") { () =>
    webDriver.get(host + "eligibility")
    Assert.assertEquals(webDriver.getTitle, "Santander Mortgages");


  }
  Given("""^I complete eligibility$""") { () =>
  }
  Then("""^I go to signup$""") { () =>
  }
}
