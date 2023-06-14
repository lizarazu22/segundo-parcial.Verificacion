import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.chromeDriver;

public class TodoLyTest{
    public static void main(String[]args){
        System.out.println("webdriver.chrome.driver", "path/to/chromedriver");

        webDriver driver = new chromeDriver();

        driver.get("https:todolist.com/UsershowRegister");

        WebElement emailField = driver.findElemente(By.id("email"));
        emailField.sendKeys("nombre de usuario");

        WebElement passwordField = driver.findElemente(By.id("password"));
        passwordField.sendKeys("CONTRASENA");

        WebElement registerButton = driver.findElemente(By.cssSelector("submit btn"));
        registerButton.click();

        WebElement loginEmailFild= driver.findElemente(By.id("email"));
        loginEmailFild.sendKeys("nombre de usuario")

        WebElement loginPasswordField = driver.findElemente(By.id("password"));
        loginPasswordField.sendKeys("contrasena");

        WebElement loginButton =driver.findElemente(By.cssSelector("submit btn"));
        loginButton.click();

        webElement projectNameField = driver.findElemente(By.cssSelector("agenda add"));
        addProjectButton.click();

        webElement projectNameField= dirver.findElemente(By.cssSelector(""));
        projectNameField.sendKeys("nuevo projecto");

        webElement createProyectButton = driver.findElemente(By.cssSelector(""));
        createProyectButton.click();

        driver.quit();
    }
}