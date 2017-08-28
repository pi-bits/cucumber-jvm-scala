package steps

import cucumber.api.scala.{EN, ScalaDsl}
import org.junit.Assert
import org.openqa.selenium.firefox.FirefoxDriver
import org.slf4j.LoggerFactory

class CalculatorSteps extends ScalaDsl with EN {

  private val log = LoggerFactory.getLogger(classOf[CalculatorSteps]);
  var calculator: Calculator = _
  Before("@calculator") {
    scenario =>
      calculator = new Calculator
  }
  After("@calculator") {
    scenario =>
  }
  Given("""^I create Calculator$""") {
    () => {

    }
  }


  And(
    """^I enter (\d+) and (\d+) to add$""") {
    (num1: Integer, num2: Integer) => {
      Assert.assertEquals(calculator.add(num1, num2), 3);
    }

  }


}