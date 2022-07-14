import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.assertj.core.api.Assertions.*;

public class CalculatorTestStepDefinitions {
    Calculator calculator;
    Integer product;

    @Given("I have a Calculator")
    public void i_have_a_calculator() {
        //  Arrange
        calculator = new Calculator();
    }
    @When("I multiply {int} and {int}")
    public void i_multiply_and(Integer int1, Integer int2) {
        //  Act
        product = calculator.multiply(int1, int2);
    }
    @Then("I should get {int}")
    public void i_should_get(Integer int1) {
        //  Assert
        assertThat(product).isEqualTo(int1);
    }
}
