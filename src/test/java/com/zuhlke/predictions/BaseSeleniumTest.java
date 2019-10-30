package com.zuhlke.predictions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.Remote;
import java.util.concurrent.TimeUnit;

public abstract class BaseSeleniumTest {

    protected static WebDriver driver;

    @BeforeClass
    public static void setup() throws MalformedURLException {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().window().setSize(new Dimension(1920, 1080));
    }

}
