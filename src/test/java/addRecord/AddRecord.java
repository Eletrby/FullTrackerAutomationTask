package addRecord;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AddRecord {
    String carNumber = "155";
    String fuelinLiters = "15";
    String fuelCost = "500";
    String fuelTyp = "solar";
    String customerCompanyID="20";
   // String value="2023-10-26T17:12";
    protected WebDriver driver;
    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://hiring.petroapp.com/test2.html");


}

    private By carNumberField = new By.ByCssSelector("input[name=\"carNumber\"]");
    private By fuelinLitersField = new By.ByCssSelector("input[name=\"fuelInLiters\"]");
    private By fuelCostField= new By.ByCssSelector("input[name=\"fuelCost\"]");
    private By fuelTypeField = new By.ByCssSelector("input[name=\"fuelType\"]");
    private By dateandTime = new By.ByXPath("/html/body/div[1]/div/form/div[5]/input");
 //   private By dateandTimeValue = new By.ByCssSelector("input[value=\"2023-10-26T16:54\"]");

    private By customerCompanyIDfield= new By.ByCssSelector("input[name=\"companyId\"]");
    private By addButton = new By.ByCssSelector("button[type=\"submit\"]");

    @Test(priority = 1)
    public void insertcarNumber() {
        driver.findElement(carNumberField).sendKeys(carNumber);
    }
    @Test(priority = 2)

    public void insertfuelinLiters() {
        driver.findElement(fuelinLitersField).sendKeys(fuelinLiters);
    }
    @Test(priority = 3)
    public void insertfuelCost() {
        driver.findElement(fuelCostField).sendKeys(fuelCost);
    }
    @Test(priority = 4)
    public void insertfullType() {
        driver.findElement(fuelTypeField).sendKeys(fuelTyp);
    }
    @Test(priority = 5)
    public void setDateandTime() throws InterruptedException {
        driver.findElement(dateandTime).click();
        Thread.sleep(2000);
    }
//    @Test(priority = 6)
//    public void setDateandTimeValue() {
//        driver.findElement(dateandTimeValue).sendKeys(value);
//    }
    @Test(priority = 7)
    public void insertID() {
        driver.findElement(customerCompanyIDfield).sendKeys(customerCompanyID);
    }
    @Test(priority = 8)
    public void setAddButton() {
        driver.findElement(addButton).click();
    }
}