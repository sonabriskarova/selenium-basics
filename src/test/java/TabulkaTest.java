// Generated by Selenium IDE

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;
import java.util.concurrent.TimeUnit;

public class TabulkaTest {
  public WebDriver driver;
  private final String BASE_URL = "https://furbo.sk/playground/tabulka.php";

  @Before
  public void setUp() {
    System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void clickOnce() {
    driver.get(BASE_URL);
    List<WebElement> rows =driver.findElement(By.xpath("//table/tbody/tr"));
    System.out.println(rows);
  }

  @After
  public void tearDown() {
    driver.quit();
  }
}
