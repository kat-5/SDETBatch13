package com.syntax.Class23;

public class BrowserTester {
    public static void main(String[] args) {
        WebDriver chrome=new Chrome();
        chrome.startBrowser();
        chrome.openUrl("www.google.com");
        chrome.testLoginPage();
        chrome.closeBrowser();

        WebDriver [] browsers={new Chrome(),new Safari(),new Edge(), new FireFox()};

        for(WebDriver driver:browsers){

            driver.startBrowser();
            driver.openUrl("www.google.com");
            driver.testLoginPage();
            driver.closeBrowser();
        }



        //WebDriver v=new Chrome();

       // Chrome chrome1=(Chrome) v;  // class cast


        double num=10.0;
        int num2=(int)num;     //type casting

        /*for(int i=0; i< browsers.length;i++){
            browsers[i].startBrowser();
            browsers[i].openUrl("www.google.com");
            browsers[i].testLoginPage();
            browsers[i].closeBrowser();  */
  //  }

    //regular for loop

        }
    }

    /*Method chaining with .

    example WebDriverManager.firefoxdriver().setup();*/