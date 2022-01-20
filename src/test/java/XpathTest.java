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
public class XpathTest {
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
        // absolutna cesta
        driver.findElement(By.xpath("/html/body/div/div/form/div[1]/input")).sendKeys("sonabriskarova@gmail.com");
        driver.findElement(By.xpath("/html/body/div/div/form/div[2]/input")).sendKeys("Soňa");
        driver.findElement(By.xpath("/html/body/div/div/form/div[3]/input")).sendKeys("Briškárová");
        // relativna cesta
        // hladame nie priameho potomka ale hociakeho //
        // vyhodou xpathu je, ze vieme pristupovat k atributom elemntu
        driver.findElement(By.xpath("/form/div[1]/input")).sendKeys("sonabriskarova@gmail.com");
        driver.findElement(By.xpath("/form/div[2]/input")).sendKeys("Soňa");
        driver.findElement(By.xpath("/form/div[3]/input")).sendKeys("Briškárová");

        // pomocou w pathu mozem aj pocitat riadky
        // count(//table/tbody/tr)

        // taktiez mozem aj pomocou napisu (je to menej zvycajne)
        // click me baby
        // //button[@text()="Click me!"]


        // stranka registracia
        // chcem oznacit vsetky elementy = //*
        // kolko elemntov je na stranke? = count(//*)

    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
