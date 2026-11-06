
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMakeup extends BaseTest {

    @Test(description = "Перевірка прямого переходу з головної сторінки в категорію Парфумерія")
    public void TestPerfumeryCategory() {
        MakeupHomePage homePage = new MakeupHomePage(driver);

        PerfumeryPage perfumeryPage = homePage.clickPerfumeryMenu();

        String headerText = perfumeryPage.getPageHeaderText().trim().toLowerCase();

        boolean isPerfumeryHeader = headerText.contains("парфюмерия") || headerText.contains("парфумерія");

        Assert.assertTrue(isPerfumeryHeader,
                "Перехід не відбувся або заголовок сторінки невірний! Поточний заголовок: " + headerText);
    }
}