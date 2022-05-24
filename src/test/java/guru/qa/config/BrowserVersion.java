package guru.qa.config;

public enum BrowserVersion {
    V100("100.0"),V101("101.0"), V99("99.0");
    public final String browserVer;

    BrowserVersion(String browserVer) {
        this.browserVer = browserVer;
    }
}
