import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWork {

    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }

    @Test
    public void locators() {
        //by tagName
        WebElement input = wd.findElement(By.tagName("input"));
        WebElement input1 = wd.findElement(By.cssSelector("input"));

        WebElement button = wd.findElement(By.tagName("button"));
        WebElement button1 = wd.findElement(By.cssSelector("button"));

        List<WebElement> list = wd.findElements(By.tagName("a"));
        List<WebElement> el1 = wd.findElements(By.cssSelector("a"));

        WebElement div = wd.findElement(By.tagName("div"));
        WebElement div1 = wd.findElement(By.cssSelector("div"));

        WebElement h1 = wd.findElement(By.tagName("h1"));
        WebElement h11 = wd.findElement(By.cssSelector("h1"));

        WebElement form = wd.findElement(By.tagName("form"));
        WebElement form1 = wd.findElement(By.cssSelector("form"));


        //by class
        WebElement container = wd.findElement(By.className("container"));
        WebElement container1 = wd.findElement(By.cssSelector(".container"));

        WebElement navbar = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
        WebElement navbar1 = wd.findElement(By.className("navbar-component_nav__1X_4m"));

        WebElement loginByClass = wd.findElement(By.className("active"));
        WebElement loginByClass1 = wd.findElement(By.cssSelector(".active"));


        //by id
        WebElement id = wd.findElement(By.id("root"));
        WebElement id1 = wd.findElement(By.cssSelector("#root"));


        //by attribute

        WebElement inputEmail = wd.findElement(By.cssSelector("[placeholder = 'Email']"));
        WebElement inputPassword = wd.findElement(By.cssSelector("[placeholder = 'Password']"));
        WebElement buttonHome = wd.findElement(By.cssSelector("[href='/home']"));
        WebElement buttonAbout = wd.findElement(By.cssSelector("[href='/about']"));
        WebElement buttonLogin = wd.findElement(By.cssSelector("[href='/login']"));

        WebElement login = wd.findElement(By.name("login"));
        WebElement login1 = wd.findElement(By.cssSelector("[name='login']"));

        WebElement registration = wd.findElement(By.name("registration"));
        WebElement registration1 = wd.findElement(By.cssSelector("[name='registration']"));

        //one of elements find by attribute ==> start & end & contains value
        WebElement emailStart = wd.findElement(By.cssSelector("[placeholder^='Em'"));
        WebElement passwordEnd = wd.findElement(By.cssSelector("[placeholder$='word']"));
        WebElement registrationContains =wd.findElement(By.cssSelector("[name*='str']"));

    }

    @AfterClass
    public void close() {
        wd.close();
    }

}



