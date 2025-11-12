import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.nio.file.WatchEvent;
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
        WebElement input2 = wd.findElement(By.xpath("//input"));

        WebElement button = wd.findElement(By.tagName("button"));
        WebElement button1 = wd.findElement(By.cssSelector("button"));
        WebElement button2 = wd.findElement(By.xpath("//button"));


        List<WebElement> list = wd.findElements(By.tagName("a"));
        List<WebElement> el1 = wd.findElements(By.cssSelector("a"));
        List<WebElement> list1 = wd.findElements(By.xpath("//a"));

        WebElement div = wd.findElement(By.tagName("div"));
        WebElement div1 = wd.findElement(By.cssSelector("div"));
        WebElement div2 = wd.findElement((By.xpath("//div")));

        WebElement h1 = wd.findElement(By.tagName("h1"));
        WebElement h11 = wd.findElement(By.cssSelector("h1"));
        WebElement h12 = wd.findElement(By.xpath("//h1"));

        WebElement form = wd.findElement(By.tagName("form"));
        WebElement form1 = wd.findElement(By.cssSelector("form"));
        WebElement form3 = wd.findElement(By.xpath("//form"));


        //by class
        WebElement container = wd.findElement(By.className("container"));
        WebElement container1 = wd.findElement(By.cssSelector(".container"));
        WebElement container2 = wd.findElement(By.xpath("//*[@class='container']"));

        WebElement navbar = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
        WebElement navbar1 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement navbar2 = wd.findElement(By.xpath("//*[@class='navbar-component_nav__1X_4m']"));

        WebElement loginByClass = wd.findElement(By.className("active"));
        WebElement loginByClass1 = wd.findElement(By.cssSelector(".active"));
        WebElement loginByClass2 = wd.findElement(By.xpath("//*[@class='active']"));

        WebElement classForm = wd.findElement(By.className("login_login__3EHKB"));
        WebElement classForm1 = wd.findElement(By.cssSelector(".login_login__3EHKB"));
        WebElement classForm2 = wd.findElement(By.xpath("//*[@class='login_login__3EHKB']"));


        //by id
        WebElement id = wd.findElement(By.id("root"));
        WebElement id1 = wd.findElement(By.cssSelector("#root"));
        WebElement id2 = wd.findElement(By.xpath("//*[@id='root']"));


        //by attribute

        WebElement inputEmail = wd.findElement(By.cssSelector("[placeholder = 'Email']"));
        WebElement inputEmail1 = wd.findElement(By.xpath("//*[@placeholder='Email']"));

        WebElement inputPassword = wd.findElement(By.cssSelector("[placeholder = 'Password']"));
        WebElement inputPassword1 = wd.findElement(By.xpath("//*[@placeholder='Password']"));

        WebElement buttonHome = wd.findElement(By.cssSelector("[href='/home']"));
        WebElement buttonHome1 = wd.findElement(By.xpath("//*[@href='/home']"));

        WebElement buttonAbout = wd.findElement(By.cssSelector("[href='/about']"));
        WebElement buttonAbout1 = wd.findElement(By.xpath("//*[@href='/about']"));

        WebElement buttonLogin = wd.findElement(By.cssSelector("[href='/login']"));
        WebElement buttonLogin1 = wd.findElement(By.xpath("//*[@href='/login']"));

        WebElement login = wd.findElement(By.name("login"));
        WebElement login1 = wd.findElement(By.cssSelector("[name='login']"));
        WebElement login2 = wd.findElement(By.xpath("//*[@name='login']"));

        WebElement registration = wd.findElement(By.name("registration"));
        WebElement registration1 = wd.findElement(By.cssSelector("[name='registration']"));
        WebElement registration2 = wd.findElement(By.xpath("//*[@name='registration']"));

        //one of elements find by attribute ==> start & end & contains value
        WebElement emailStart = wd.findElement(By.cssSelector("[placeholder^='Em']"));
        WebElement emailStart1 = wd.findElement(By.xpath("//*[starts-with(@placeholder, 'Em')]"));

        WebElement passwordEnd = wd.findElement(By.cssSelector("[placeholder$='word']"));
        WebElement passwordEnd1 = wd.findElement(By.xpath("//*[contains(@placeholder, 'word')]"));

        WebElement registrationContains = wd.findElement(By.cssSelector("[name*='str']"));
        WebElement registrationContains1 = wd.findElement(By.xpath("//*[contains(@name,'str')]"));

        WebElement password = wd.findElement(By.cssSelector("[placeholder='Password']"));
        WebElement password1 = wd.findElement(By.cssSelector("[placeholder^='Pass']"));
        WebElement password3 = wd.findElement(By.cssSelector("[placeholder*='sw']"));
        WebElement password2 = wd.findElement(By.cssSelector("[placeholder$='rd']"));
        WebElement password_xP1 = wd.findElement(By.xpath("//input[@placeholder='Password']"));
        WebElement password_xP2 = wd.findElement(By.xpath("//input[starts-with(@placeholder, 'Pa')]"));
        WebElement password_xP3 = wd.findElement(By.xpath("//*[contains(@placeholder, 'sw')]"));
        WebElement password_xP4 = wd.findElement(By.xpath("//*[contains(@placeholder, 'rd')]"));


    }

    @Test
    public void classwork() {
        WebElement el = wd.findElement(By.xpath("//h1/.."));

        WebElement el1 = wd.findElement(By.xpath("//h1/parent::*"));
        WebElement el2 = wd.findElement(By.xpath("//h1/parent::div"));

        WebElement el3 = wd.findElement(By.xpath("//h1/ancestor::*"));
        WebElement el4 = wd.findElement(By.xpath("//h1/ancestor::div"));
        WebElement el5 = wd.findElement(By.xpath("//h1/ancestor::div[2]"));

        WebElement el6 = wd.findElement((By.xpath("//h1/ancestor-or-self::*")));
        List<WebElement> list = wd.findElements(By.xpath("//h1/ancestor-or-self::*"));
        List<WebElement> list1 = wd.findElements(By.xpath("//h1/following-sibling::*"));

        List<WebElement> list2 = wd.findElements(By.xpath("//a[last()]/preceding-sibling::*"));
        WebElement el7 = wd.findElement(By.xpath("//a[last()]/preceding-sibling::a[1]"));

    }

    @Test
    public void classwork2() {
        WebElement element = wd.findElement(By.cssSelector("[name='login']"));
        String text = element.getText();
        System.out.println(text);
        WebElement form = wd.findElement(By.xpath("//form"));
        String textForm = form.getText();
        System.out.println("**************************");
        System.out.println(textForm);

        WebElement html = wd.findElement(By.tagName("html"));
        String textAll = html.getText();
        System.out.println("****************");
        System.out.println(textAll);

        WebElement br = wd.findElement(By.tagName("br"));
        String textBr = br.getText();
        System.out.println("*****************");
        System.out.println("text br -->" + textBr);
    }

    @AfterClass
    public void close() {
        wd.close();
    }

}



