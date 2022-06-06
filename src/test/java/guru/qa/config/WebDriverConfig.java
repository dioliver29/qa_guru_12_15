package guru.qa.config;

import org.aeonbits.owner.Config;

import java.net.URL;

@Config.Sources({
        "classpath:${browserConfig}.properties"
})

public interface WebDriverConfig extends Config {

    @Key("baseUrl")
    String getBaseUrl();

    @Key("browser")
    @DefaultValue("CHROME")
    Browser getBrowser();

    @Key("browserVersion")
    @DefaultValue("101.0")
    Browser getBrowserVersion();

    @Key("remote")
    URL getRemoteUrl();


}
