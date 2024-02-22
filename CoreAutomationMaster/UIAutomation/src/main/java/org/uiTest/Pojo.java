package org.uiTest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.openqa.selenium.WebDriver;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Pojo {

    private ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();

    public void setwebDriver(WebDriver wDriver) {
        this.webDriver.set(wDriver);
    }
    public WebDriver getwebDriver(){
        return webDriver.get();
    }

    public void unload(){
        webDriver.remove();
    }


}
