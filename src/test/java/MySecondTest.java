import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// DOM - urcita struktura elemntov na stranke
// kazdy element ma svoje atributy
// nie vsetky elementy maju id - elementy ktore pouzivame v javascripte alebo v css
public class MySecondTest {
    private WebDriver driver;
    // ide o konstantu
    private final String BASE_URL = "https://furbo.sk/playground/clickmebaby.php";


    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void test(){
        driver.get(BASE_URL);
        driver.findElement(By.id("clickMe"));

        // KALKULACKA
        // css selector test
        // hladam button s id count
        // count sa oznacuje #
        //driver.findElement(By.cssSelector("button#count")).click();
        // trieda sa v css oznacuje .
        //driver.findElement(By.cssSelector("button.btn-success")).click();
        // vramci divu, ak elemnt nema id
        // v css vieme najst aj deti rodicov
        // mam div ktory obsahuje triedu container a niekde v jeho strukture chceme kliknut na button
        driver.findElement(By.cssSelector("div.container button")).click();
        // takto by by to bolo podla priameho rodica
        driver.findElement(By.cssSelector("div.row>button")).click();


    }

    @After
    public void tearDown(){driver.quit();
    }
}
