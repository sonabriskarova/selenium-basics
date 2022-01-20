import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// DOM - urcita struktura elemntov na stranke
// kazdy element ma svoje atributy
// nie vsetky elementy maju id - elementy ktore pouzivame v javascripte alebo v css

// 4 typy lokatorov:
// 1. podla id
// 2. podla name - zvycajne to je pri formularoch
public class MyThirdTest {
    private WebDriver driver;
    // ide o konstantu
    private final String BASE_URL = "https://furbo.sk/playground/registracia.php";


    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void test(){
        driver.get(BASE_URL);
        //driver.findElement(By.name("email")).sendKeys("sonabriskarova@gmail.com");
        // class name
        // hlada vsak z vrchu nadol
        //driver.findElement(By.className("form-control")).sendKeys("sonabriskarova@gmail.com");
        // elemnt moze mat viacero tried ale hladat mozem iba podla 1

        // TAG NAME
        // tag = nazov elemntu
        // tak isto ako class name to hlada zhora nadol
        driver.findElement(By.tagName("input")).sendKeys("sonabriskarova@gmail.com");



    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
