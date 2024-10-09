// Generated by Selenium IDE
package test;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class Addstudent2Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void addstudent2() {
    driver.get("http://localhost:4200/");
    driver.manage().window().setSize(new Dimension(1346, 708));
    driver.findElement(By.linkText("Add Student")).click();
    driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).click();
    driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[1]/input")).sendKeys("Ana Djurdjevic");
    driver.findElement(By.cssSelector(".ng-invalid:nth-child(2)")).click();
    driver.findElement(By.cssSelector(".ng-invalid:nth-child(2)")).click();
    driver.findElement(By.cssSelector(".ng-invalid:nth-child(2)")).click();
    driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).sendKeys("anadjurdjevic@gmail.com");
    driver.findElement(By.cssSelector(".ng-untouched")).click();
    {
      WebElement dropdown = driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[3]/select"));
      dropdown.findElement(By.xpath("//option[. = 'BCA']")).click();
    }
    driver.findElement(By.cssSelector(".btn-success")).click();
    driver.findElement(By.linkText("View Student")).click();
    driver.findElement(By.cssSelector("td:nth-child(2)")).click();
    assertThat(driver.findElement(By.cssSelector("td:nth-child(2)")).getText(), is("anadjurdjevic@gmail.com"));
  }
}
