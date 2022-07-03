package com.Homework.Class25;

public interface WebDriver {

    void open();
    void close();
    String getTitle();
}

interface RemoteWebDriver extends com.Class25.WebDriver {
    void navigate();

}
interface TakesScreenshots extends RemoteWebDriver{

}

class ChromeDriver implements RemoteWebDriver{

    @Override
    public void openBrowser() {

    }

    @Override
    public void closeBrowser() {

    }

    @Override
    public void maximizeWindow() {

    }

    @Override
    public void findElement() {

    }

    @Override
    public void navigate() {

    }
}

class FirefoxDriver implements RemoteWebDriver{

    @Override
    public void openBrowser() {

    }

    @Override
    public void closeBrowser() {

    }

    @Override
    public void maximizeWindow() {

    }

    @Override
    public void findElement() {

    }

    @Override
    public void navigate() {

    }
}

class SafariDriver implements RemoteWebDriver{

    @Override
    public void openBrowser() {

    }

    @Override
    public void closeBrowser() {

    }

    @Override
    public void maximizeWindow() {

    }

    @Override
    public void findElement() {

    }

    @Override
    public void navigate() {

    }
}