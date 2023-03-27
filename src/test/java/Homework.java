import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Homework{

    WebDriver  wd;

    @BeforeClass
    public void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        DesiredCapabilities cp = new DesiredCapabilities();
        cp.setCapability(ChromeOptions.CAPABILITY, options);
        options.merge(cp);

        wd = new ChromeDriver(options);

        wd.get("https://telranedu.web.app/login");
    }

    @Test
    public void cssLocators(){
        // by tag name
        WebElement el= wd.findElement(By.tagName("button"));
        WebElement element = wd.findElement(By.cssSelector("button"));
        WebElement xElement =wd.findElement(By.xpath("//button"));

        WebElement el1= wd.findElement(By.tagName("body"));
        WebElement element1 = wd.findElement(By.cssSelector("body"));
        WebElement el2= wd.findElement(By.tagName("div"));
        WebElement element2 = wd.findElement(By.cssSelector("div"));
        WebElement xel =wd.findElement(By.xpath("//div"));

        WebElement el3= wd.findElement(By.tagName("h1"));
        WebElement element3 = wd.findElement(By.cssSelector("h1"));
        WebElement el4= wd.findElement(By.tagName("a"));
        WebElement element4 = wd.findElement(By.cssSelector("a"));
        WebElement el5= wd.findElement(By.tagName("form"));
        WebElement element5 = wd.findElement(By.cssSelector("form"));
        WebElement xel1 =wd.findElement(By.xpath("//form"));

        WebElement el6= wd.findElement(By.tagName("input"));
        WebElement element6 = wd.findElement(By.cssSelector("input"));
        WebElement xel2 =wd.findElement(By.xpath("//input"));

        // by class
        WebElement element7 = wd.findElement(By.className("container"));
        WebElement element8 = wd.findElement(By.cssSelector(".container"));
        WebElement xelement1  = wd.findElement(By.xpath("//*[@class='container']"));

        WebElement element9 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement element10 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
        WebElement xel3  = wd.findElement(By.xpath("//*[@class='navbar-component_nav__1X_4m']"));

        WebElement element11 = wd.findElement(By.className("active"));
        WebElement element12 = wd.findElement(By.cssSelector(".active"));
        WebElement el15 = wd.findElement(By.xpath("//*[@class='active']"));

        //By id

        WebElement element13 = wd.findElement(By.id("root"));
        WebElement element14 = wd.findElement(By.cssSelector("#root"));
        WebElement xel4  = wd.findElement(By.xpath("//*[@id='root']"));

        // by attribute
        WebElement  element15 = wd.findElement(By.cssSelector("[id='root']"));
        WebElement  element16 = wd.findElement(By.cssSelector("[href='/home']"));
        WebElement  element17 = wd.findElement(By.cssSelector("[name='email']"));
        WebElement element18 = wd.findElement(By.name("email"));
        WebElement xel5  = wd.findElement(By.xpath("//*[@href='/home']"));


        // one of elements find by attribute ==> start & end & contains value
        WebElement element19 = wd.findElement(By.cssSelector("[placeholder='Email']"));
        WebElement el9 = wd.findElement(By.xpath("//input[@placeholder='Email']"));
        WebElement xel6 = wd.findElement(By.xpath("//div[@class='login_login__3EHKB']"));


        //Start
        WebElement element20 = wd.findElement(By.cssSelector("[placeholder ^='Em']"));
        WebElement el10 = wd.findElement(By.xpath("//input[starts-with(@placeholder,'Em')]"));
        WebElement xel7 = wd.findElement(By.xpath("//div[starts-with(@class,'lo')]"));

        WebElement element21 = wd.findElement(By.cssSelector("[placeholder $='il']"));

        // contains
        WebElement element22 = wd.findElement(By.cssSelector("[placeholder *='ma']"));
        WebElement el11 = wd.findElement(By.xpath("//input[contains(@placeholder,'ss')]"));
        WebElement xel8 = wd.findElement(By.xpath("//button[contains(@type,'bm')]"));

        WebElement el12 = wd.findElement(By.xpath("//a[3]"));
        WebElement xel9 = wd.findElement(By.xpath("//a[text()='ABOUT']"));
        WebElement xel10= wd.findElement(By.xpath("//a[contains(@style, 'background-color: black; color: white;')]"));

    }

    @Test
    public void classwork1303 (){
        WebElement el = wd.findElement(By.xpath("//h1/parent::*"));

        //ancestor
        WebElement el3 = wd.findElement(By.xpath("//h1/ancestor::*"));
        WebElement el4 = wd.findElement(By.xpath("//h1/ancestor::div"));
        WebElement el5 = wd.findElement(By.xpath("//h1/ancestor::div[2]"));

        //ancestor-or-self
       List<WebElement> list = wd.findElements(By.xpath("//h1/ancestor-or-self::*"));

       //following-sibling
        List<WebElement> list1 = wd.findElements(By.xpath("//h1/following-sibling::a"));

        //preceding-sibling

    }

        }