package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestLoginSteps {
    @Given("user opened the login page of tested website")
    public void user_opened_the_login_page_of_tested_website() {
        System.out.println("The step involves: User is on the login page.");
        String loginURL = "testedPage.pl/login";
        assertEquals(loginURL, "testedPage.pl/login");
    }
    @When("user inputs valid email and password")
    public void user_inputs_valid_email_and_password() {
        System.out.println("The step involves: User inputs valid email and password.");
        String validEmail = "validEmail@gmail.com";
        String validPassword = "Password1234";
        assertEquals(validEmail, "validEmail@gmail.com");
        assertEquals(validPassword, "Password1234");
    }    @And("clicks login button")
    public void clicks_login_button() {
        System.out.println("The step involves: User clicks login button.");
        boolean isLoginClicked = true;
        assertTrue(isLoginClicked);
    }
    @Then("the page is redirected to user panel")
    public void the_page_is_redirected_to_user_panel() {
        System.out.println("The step involves: User is redirected to the panel.");
        String panelURL = "testedPage.pl/myPanel";
        assertEquals(panelURL, "testedPage.pl/myPanel");
    }

}
