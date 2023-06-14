import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.chromeDriver;

public class TodoLyTest{
    public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        webDriver driver=new chromeDriver();

        driver.get("https://todo.ly/");

        webElemet loginEmailFild= driver.findElemente(By.id("password"));
        loginEmailFild.sendKeys("nombre de ususario");

        webElement loginPasswordField=driver.findElemente(By.id("password"));
        loginPasswordField.sendKeys("contrasenas");

         WebElementloginButton = driver.findElemente(By.id(""));
         loginButton.click();

         webElement settingsDropdown= driver.findElemente(By.id(""));
         settingsDropdown.click();

         webElement mySettingsoption =driver.findElement(By.id(""));
         mySettingsoption.click();

         webElement changePasswordTab = driver.findElement(By.id(""));
         changePasswordTab.click();

         webElement currentPasswordField = driver.findElement(By.id(""));
         currentPasswordField.sendKeys("contrasena actual");

         webElement newPasswordField = driver.findElement(By.id(""));
         newPasswordField.sendKeys("nueva contrasena");

         webElement confirmNewPasswordFild = driver.findElement(By.id(""));
         confirmNewPasswordFild.sendKeys("nueva contrasena");

         webElement sabeChangesButton = driver.findElement(By.id(""));
         saveChangesButton.click();

         driver.quit();
    }
}