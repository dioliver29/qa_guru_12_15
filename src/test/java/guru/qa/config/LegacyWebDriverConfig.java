package guru.qa.config;

import java.util.Objects;

public class LegacyWebDriverConfig {

    public Browser getBrowser() {
        String browser = System.getProperty("browser");
        String browserVer = System.getProperty("browserVer");
        if (Objects.isNull(browser)) {
            browser = "FIREFOX";
            browserVer = "101.0";
        }
        return Browser.CHROME;
    }

    public String getBrowserVersion() {
        String browserVer = System.getProperty("browserVer");
        if (Objects.isNull(browserVer)) {
            browserVer = "101.0";
        }
        return BrowserVersion.V101.browserVer;
    }

    public String getBaseUrl() {
        String baseUrl = System.getProperty("baseUrl");
        if (Objects.isNull(baseUrl)) {
            baseUrl = "https://github.com";
        }

        return baseUrl;
    }


}
