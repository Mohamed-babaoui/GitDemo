package StepDefinitions;  // Replace with the actual package of your step definitions
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MyStepdefs {
    private WebDriver driver;
    @Given("Home page")
    public void home_page() {
        WebDriverManager.chromedriver().setup();

        // Create an instance of ChromeDriver
       driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.ebay.com");
        // Implement the logic for the "Home page" step
        System.out.println("home page");
    }
    @When("Link Clicked")
    public void link_clicked() {
        // Implement the logic for the "Link Clicked" step
        System.out.println("clicking link");
        WebElement buttonElement = driver.findElement(By.xpath("//*[@id='gh-as-a']"));


        buttonElement.click();/*lick on the element
        WebElement textField = driver.findElement(By.id("_nkw"));

        // Type something into the text field
        textField.sendKeys("Flowers");
        WebElement searchButton = driver.findElement(By.xpath("/html/body/div[2]/div/main/form/fieldset[1]/div[5]/button"));
        searchButton.click();*/

    }

    @Then("Search Page")
    public void search_page() {
       String expectedURL="https://www.ebay.com/sch/ebayadvsearch";
       String currentURL=driver.getCurrentUrl();
       if(!(expectedURL.equals(currentURL))) fail("ddddddddddddddd");
       // assertEquals("URLs do not match", expectedURL, currentURL);
       driver.quit();
    }
}
