package org.uiTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IntializeWebdriver {
private WebDriver webDriver;

    public  WebDriver driverConfig(String bName){
        if(webDriver==null)
        switch (bName.toLowerCase()) {
            case "edge": {
                WebDriverManager.edgedriver().setup();
                EdgeOptions options = new EdgeOptions();
                this.webDriver = new EdgeDriver(options);


                break;
            }
            case "firefox": {
                WebDriverManager.firefoxdriver().clearDriverCache().setup();
                this.webDriver = new FirefoxDriver();
                break;
            }
            case "chrome": {
                //setup the chromedriver using WebDriverManager
                WebDriverManager.chromedriver().clearDriverCache().setup();
                this.webDriver = new ChromeDriver();
                break;
            }

            default: {
                WebDriverManager.chromedriver().clearDriverCache().setup();
                this.webDriver = new ChromeDriver();

            }

        }
        return this.webDriver;
    }
}
