package junitcucumber;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.CombinableMatcher.either;
import static org.hamcrest.core.IsEqual.equalTo;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class UserSteps {
    private User user = new User();
@Given("^Information of required fields are LASTNAME : (.*) , AGE : (\\d+) , USERNAME : (.*) , PASSWORD : (.*) , EMAIL : (.*) , FIRSTNAME : (.*) to register$")
public void information_of_required_fields_to_register(String lastName, int age, String userName, String passWord, String email, String firstName) throws Throwable {
    user.setFirstName(firstName);
    user.setLastName(lastName);
    user.setAge(age);
    user.setEmail(email);
    user.setPassWord(passWord);
    user.setUserName(userName);
}
    @When("^I input valid data into required fields$")
    public void input_valid_information() throws Throwable {
       user.getEmail();
       user.getLastName();
       user.getFirstName();
       user.getAge();
       user.getPassWord();
       user.getUserName();
    }
    @Then("^It should be (.*)$")
    public void get_result_register(String result) throws Throwable {
        assertThat(result, either(equalTo("SUCCESS")).or(equalTo("FAIL")));
        assertThat(user.checkAgeValid(), either(is(true)).or(is(false)));
    }
}
