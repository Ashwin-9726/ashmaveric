package StepDefinitions;


	

	import java.util.concurrent.TimeUnit;
    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	import io.cucumber.java.en.*;

	public class SampleLoginSteps {

	  WebDriver driver = new ChromeDriver(); 
		@Given("browser is open")
		public void browser_is_open() {
			
			System.out.println("Inside Step - browser is open");
			
			String projectPath = System.getProperty("user.dir");
			System.out.println("Project path is : "+projectPath);
			
			System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
			driver.manage().window().maximize();
			
			
			
			//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			
			
		}

		@And("user is on login page")
		public void user_is_on_login_page() {
			
			driver.navigate().to("https://example.testproject.io/web/");
			
		}

		@When("user enters username and password")
		public void user_enters_username_and_password(String username, String password) throws InterruptedException  {
			
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Ashwin G");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("12345");
			
			Thread.sleep(2000);
		}
		
		@And("user clicks on login")
		public void user_clicks_on_login() {
			
			driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
		}


		@Then("user is navigated to the home page")
		public void user_is_navigated_to_the_home_page() throws InterruptedException {
			
			driver.findElement(By.xpath("//*[@id=\"logout\"]")).isDisplayed();
			
			Thread.sleep(2000);
			driver.close();
			driver.quit();
			
		}




	}


