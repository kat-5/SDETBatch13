package com.syntax.Class23;

public class WebDriver {

    public void startBrowser(){
        System.out.println("Starting the browser");
    }
    public void openUrl(String url){
        System.out.println("opening "+url);
    }
    public void testLoginPage(){
        System.out.println("Checking if login page is visible ");
    }
    public void closeBrowser(){
        System.out.println("closing the browser");

    }
}

class Chrome extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Opening google chrome");
    }

    @Override
    public void openUrl(String url) {
        System.out.println("opening the URL "+url+" on Google Chrome");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page on google chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Google Chrome");
    }
}

class FireFox extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Starting the Firefox");
    }

    @Override
    public void openUrl(String url) {
        System.out.println("opening the URL "+url+" on Firefox");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page on Firefox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Firefox");

    }
}

class Safari extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Starting the Safari");
    }

    @Override
    public void openUrl(String url) {
        System.out.println("opening the URL "+url+" on Safari");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page on Safari");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Safari");

    }
}

class Edge extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Starting the Edge");
    }

    @Override
    public void openUrl(String url) {
        System.out.println("opening the URL "+url+" on Edge");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page on Edge");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Edge");

    }
}