package guru.qa;

import guru.qa.config.WebDriverProvider;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BrowserConfig {

    private WebDriver driver = new WebDriverProvider().get();

    @Test
    public void testBrowserSetUp() {

        String title = driver.getTitle();
        assertEquals(title, "Some title");
    }

    @AfterEach
    public void stopDriver() {
        driver.quit();
    }
}
