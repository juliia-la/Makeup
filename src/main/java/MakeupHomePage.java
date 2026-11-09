
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class MakeupHomePage {
    private WebDriver driver;
    private WebDriverWait wait;


    private By perfumeryTitle = By.xpath("//a[@href='/ua/categorys/3/']");
    //new

    public MakeupHomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    public PerfumeryPage clickPerfumeryMenu() {
        wait.until(ExpectedConditions.elementToBeClickable(perfumeryTitle)).click();
        return new PerfumeryPage(driver);
    }
}