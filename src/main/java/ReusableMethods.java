import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

import java.io.File;

public class ReusableMethods {
    public static WebDriver driver;
    public static ExtentTest logger;
    public static ExtentReports report;
    public static String Url= "https://demoqa.com/elements";




    public static void StartBrowser(){

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();

    }
    public static void NavigateTo(String Website){
        driver.get(Website);


    }
    public static void HoverOver(String hover){
        WebElement x = driver.findElement(By.xpath(hover));
        Actions mhover = new Actions(driver);
        mhover.moveToElement(x).build().perform();

    }

    public static void Scroll(int A, int B){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy("+A+","+B+")","");

    }
    public static void EnterText(String Locator,String Text){

        driver.findElement(By.xpath(Locator)).sendKeys(Text);
    }
    public static void EnterText(String Locator,String Text,String Type){
        if(Type=="id") {
            driver.findElement(By.id(Locator)).sendKeys(Text);
        }else if(Type=="css"){
            driver.findElement(By.cssSelector(Locator)).sendKeys(Text);
        }

    }


    public static void SelectDropdown (String Locator,String Value){
        WebElement dropdown = driver.findElement(By.xpath(Locator));
        Select sort = new Select(dropdown);
        sort.selectByVisibleText(Value);
        //sort.selectByValue(Value);
        //sort.selectByIndex(1);

    }

    public void Click (String Locator){
        driver.findElement(By.xpath(Locator)).click();


    }
    public static void Click (String Locator,String type){

       if(type=="id") {
           driver.findElement(By.id(Locator)).click();
       }else if(type=="css"){
           driver.findElement(By.cssSelector(Locator)).click();
       }

    }




    public String GetText(String Locator){
        String Text = driver.findElement(By.xpath(Locator)).getText();
        return Text;
    }



    public static void SetupReport(String TestName){

        ExtentHtmlReporter extent = new ExtentHtmlReporter(new File("src/main/java/Testreport.html"));

        report = new ExtentReports();
        report.attachReporter(extent);

        logger = report.createTest(TestName);


    }


    @AfterTest
    public void EndTest(){
        report.flush();

    }







}

