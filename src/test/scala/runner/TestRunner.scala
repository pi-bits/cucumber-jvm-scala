package runner

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith


@RunWith(classOf[Cucumber])
@CucumberOptions(
  features = Array("classpath:features/Calculator.feature"),
  tags = Array("not d`ddw3±±±±±±±±±±±±±±±±±±±±±±±±±±±±±±ddDDddZa@wip"),
  glue = Array("classpath:steps"),
  plugin = Array("pretty", "html:target/cucumber/html"))
class TestRunner {

}
