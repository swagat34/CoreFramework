package org.uiTest;

import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Base extends Pojo{
    private WebDriver Driver;


    private IntializeWebdriver objIntializeWebdriver;
    public void setup(String BrowserName,String url) {
        System.out.println("inside setup");
        this.objIntializeWebdriver = new IntializeWebdriver();
        this.Driver=objIntializeWebdriver.driverConfig(BrowserName);
        setwebDriver(Driver);
        loadUrl(url);

    }

    private  void loadUrl(String url) {
        System.out.println("inside loadurl");
        getwebDriver().get(url);
        getwebDriver().get(url);
        getwebDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        getwebDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

    }

    public void tearDownWebEnvironment() {
        if(getwebDriver()!=null) {
            getwebDriver().manage().deleteAllCookies();
            getwebDriver().quit();
            unload();
        }
    }
}
