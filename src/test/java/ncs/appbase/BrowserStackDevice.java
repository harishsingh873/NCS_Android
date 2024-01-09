package ncs.appbase;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserStackDevice {

    public static final String UserName = "harishsingh_lKieqU";
    public static final String Automatekey = "8rV6qLzwcsMaSz2nXtok";
//    public static final String url = "https://" + UserName + ":" + Automatekey + "@hub-cloud.browserstack.com/wd/hub";
    public static final String url = "https://" + UserName + ":" + Automatekey + "@hub.browserstack.com/wd/hub";


    @Test
    public void setUp() throws MalformedURLException {

        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("device","Moto G71 5G");
        dc.setCapability("os_version", "11");
        dc.setCapability("project","NCS Project");
        dc.setCapability("build","browserstack-build-1");
        dc.setCapability("name","launch NCS");
        dc.setCapability("app","bs://029f5c42eb3da46605b28039600c612e5189a694");

        AndroidDriver driver = new AndroidDriver(new URL(url),dc);

        driver.quit();
    }
}


