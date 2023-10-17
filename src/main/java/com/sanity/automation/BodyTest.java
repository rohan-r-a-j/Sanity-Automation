package com.sanity.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.grid.server.HelpFlags;

public class BodyTest {
    private WebDriver driver;

    public BodyTest(WebDriver driver) {
        this.driver = driver;
    }

    public void performBodyActions() throws InterruptedException {
    	// Store the handle of the original tab
        String originalWindowHandle = driver.getWindowHandle();

//    	 Find the element with the Welcome Message
        WebElement welcomeTitle = driver.findElement(By.cssSelector("#main-content > div.container.main > div > div > div:nth-child(2) > div > h1"));
        System.out.println("The Welcome Title is present");
       WebElement welcomeMessage = driver.findElement(By.cssSelector("#main-content > div.container.main > div > div > div:nth-child(2) > div > p"));
       System.out.println("The Welcome Message is present");
        // Find and click on the Who we are
        WebElement whoWeAre = driver.findElement(By.cssSelector("#main-content > div.container.main > div > div > div:nth-child(2) > div > p > a")); 
        whoWeAre.click();
        System.out.println("Who We Are Worked");
        Thread.sleep(8000);
        // Press the back button to return to the home page
              driver.navigate().back();
        System.out.println("Navigated back to Home page");
        driver.navigate().refresh();

        
        /*
        
// 	 Find the element with the Welcome Message
     WebElement welcomeTitle = driver.findElement(By.cssSelector("#main-content > div.container.main > div > div > div:nth-child(2) > div > h1"));
     System.out.println("The Welcome Title is present");
    WebElement welcomeMessage = driver.findElement(By.cssSelector("#main-content > div.container.main > div > div > div:nth-child(2) > div > p"));
    System.out.println("The Welcome Message is present");
     // Find and click on the Who we are
     WebElement whoWeAre = driver.findElement(By.cssSelector("#main-content > div.container.main > div > div > div:nth-child(2) > div > p > a")); 
     whoWeAre.click();
     System.out.println("Who We Are Worked");
     Thread.sleep(8000);
     // Press the back button to return to the home page
           driver.navigate().back();
     System.out.println("Navigated back to Home page");
     driver.navigate().refresh();

     Thread.sleep(4000);	
           
     
  // Find Getting you connected Message
     WebElement gettingConnected = driver.findElement(By.cssSelector("#main-content > div.container.main > div > div > div:nth-child(3) > div > div > h2"));
     System.out.println("Getting You Connected Title Is Available");
     WebElement gettingConnectedDetail = driver.findElement(By.cssSelector("#main-content > div.container.main > div > div > div:nth-child(3) > div > div > p"));
     System.out.println("Getting you connected Message Is  Available");
     // Checking availability and clicking on Connections Button
     WebElement gettingConnectedSection = driver.findElement(By.cssSelector("#main-content > div.container.main > div > div > div:nth-child(3) > div > div"));
     WebElement readMoreLink = gettingConnectedSection.findElement(By.cssSelector("#main-content > div.container.main > div > div > div:nth-child(3) > div > div > a"));
     readMoreLink.click();
     // Press the back button to return to the home page
     driver.navigate().back();
     System.out.println("Navigated back to Home page");
     Thread.sleep(2000);	
         
     //Find Dedicated Support Entire Message
     WebElement dedicatedSupportTitle = driver.findElement(By.cssSelector("#main-content > div.container.main > div > div > div:nth-child(4) > div > div > h2"));
     System.out.println("Dedicated Support Title Is Available");
     WebElement dedicatedSupportMessage = driver.findElement(By.cssSelector("#main-content > div.container.main > div > div > div:nth-child(4) > div > div > p"));
     System.out.println("Dedicated Support Message Is Available");
     
    // Checking availability and clicking on More About supporting about customers
     WebElement supportingOurCustomers = driver.findElement(By.linkText("More about supporting our customers"));
     supportingOurCustomers.click();
     System.out.println("More about supporting our customers Button Worked");
     Thread.sleep(2000);
     // Press the back button to return to the home page
     driver.navigate().back();
     System.out.println("Navigated back to Home page");
     Thread.sleep(2000);
     
     //Find Future Of Gas Message
     WebElement futureOfGasTitle = driver.findElement(By.cssSelector("#main-content > div.container.main > div > div > div:nth-child(5) > div > div > h2"));
     System.out.println("Future Of Gas Title Available");
     WebElement futureOfGasMessageElement = driver.findElement(By.cssSelector("#main-content > div.container.main > div > div > div:nth-child(5) > div > div > p"));
     System.out.println("Future Of Gas Message Available");
     
     //Checking availability and clicking on Learn more about our Future of Gas programme
     WebElement futureOfGasHome = driver.findElement(By.linkText("Learn more about our Future of Gas programme"));
     futureOfGasHome.click();
     System.out.println("Learn more about our Future of Gas programme Button Worked");
     Thread.sleep(2000);
     // Press the back button to return to the home page
     driver.navigate().back();
     System.out.println("Navigated back to Home page");
     Thread.sleep(2000);
     
     // Find Working Near Our Pipe Message
     WebElement workingNearOurPipeTitle = driver.findElement(By.cssSelector("#main-content > div.container.main > div > div > div:nth-child(6) > div > div > h2 > span"));
     System.out.println("Working Near Our Pipe Title Available ");
     WebElement workingNearOurPipeMessage = driver.findElement(By.cssSelector("#main-content > div.container.main > div > div > div:nth-child(6) > div > div > p"));
     System.out.println("Working Near Our Pipe Message Available ");
     
     //Checking Availability and clicking on More on digging safely
     WebElement workingNearOurPipe = driver.findElement(By.linkText("More on digging safely"));
     workingNearOurPipe.click();
     System.out.println("More on digging safely Button Worked");
     Thread.sleep(2000);
     // Press the back button to return to the home page
     driver.navigate().back();
     System.out.println("Navigated back to Home page");
     Thread.sleep(2000);
  
     //Find Covid-19 update message
     WebElement covidTitle = driver.findElement(By.cssSelector("#main-content > div.container.main > div > div > div:nth-child(7) > div > div > h2"));
     System.out.println("Covid 19 Title Available");
     WebElement covidMessageElement = driver.findElement(By.cssSelector("#main-content > div.container.main > div > div > div:nth-child(7) > div > div > p"));
     System.out.println("Covid 19 Message Available");
     
     //Checking Availability and clicking on More About Our Response
     WebElement moreAboutOurResponse = driver.findElement(By.linkText("More about our response"));
     moreAboutOurResponse.click();
     System.out.println("More about our response Button Worked");
     Thread.sleep(2000);
     // Press the back button to return to the home page
     driver.navigate().back();
     System.out.println("Navigated back to Home page");
     Thread.sleep(2000);
 
     //Check If General Advice Is available
     WebElement generalAdvice = driver.findElement(By.cssSelector("#main-content > div.container.main > div > div > div:nth-child(8) > div"));
     System.out.println("General Advice Is Available");
     
     // Check If Boiler Plate Not Working Button Is Functional
     WebElement boilerPlateNotWorking = driver.findElement(By.cssSelector("#main-content > div.container.main > div > div > div:nth-child(8) > div > p:nth-child(7) > b > a"));
     System.out.println("Boiler Plate Not Working Button Is Functional");
  // Press the back button to return to the home page
     driver.navigate().back();
     System.out.println("Navigated back to Home page");
     Thread.sleep(2000);
     driver.navigate().refresh();
     
     */
     
     //Check If Latest News Is Visible
     WebElement latestNewsSection = driver.findElement(By.cssSelector("#main-content > div.container.main > div > div > div:nth-child(9) > div > div:nth-child(1)"));
     System.out.println("Latest News is Available");
     WebElement viewAllNewsLink = driver.findElement(By.cssSelector("#p_lt_ctl12_pageplaceholder_p_lt_ctl01_RowLayout_RowLayout_9_WebPartZone3_WebPartZone3_zone_Link_Button1_btnElem_lblText"));
     viewAllNewsLink.click();
System.out.println("View All News Button Working");
//Press the back button to return to the home page
driver.navigate().back();
driver.navigate().refresh();
System.out.println("Navigated back to Home page");
Thread.sleep(2000);

//Check If FAQs available at home
WebElement faqs = driver.findElement(By.cssSelector("#main-content > div.container.main > div > div > div:nth-child(9) > div > div.wrapper.faqs-home"));
System.out.println("FAQS Available");
WebElement viewAllFAQsElement = driver.findElement(By.cssSelector("#p_lt_ctl12_pageplaceholder_p_lt_ctl01_RowLayout_RowLayout_9_WebPartZone4_WebPartZone4_zone_Link_Button_btnElem_lblText"));

viewAllFAQsElement.click();
System.out.println("View All FAQs Button Working");
//Press the back button to return to the home page
driver.navigate().back();
//driver.navigate().refresh();
System.out.println("Navigated back to Home page");
Thread.sleep(2000);

//Check If connect with Us is available
WebElement connectWithUs = driver.findElement(By.cssSelector("#form > div.container.footer > footer > div.footer-nav > div > div > div > div > div.col-sm-4.foundation > div > div:nth-child(1) > div"));
System.out.println("Connect With Us is Available");
//Click and check on Contact us button
WebElement contactus = driver.findElement(By.cssSelector("#form > div.container.footer > footer > div.footer-nav > div > div > div > div > div.col-sm-4.foundation > div > div:nth-child(1) > div > div.dropdowns > a"));
contactus.click();
Thread.sleep(2000);
System.out.println("Contact Us Button Worked");
//Press the back button to return to the home page
driver.navigate().back();
driver.navigate().refresh();
System.out.println("Navigated back to Home page");
Thread.sleep(2000);

// Finding If Twitter Link Works
WebElement twitterLogo = driver.findElement(By.cssSelector("#form > div.container.footer > footer > div.footer-nav > div > div > div > div > div.col-sm-4.foundation > div > div:nth-child(1) > div > a.twitter.recite-ignore-styles-background > img"));
twitterLogo.click();
Thread.sleep(2000);
// Switch to the new Twitter tab
for (String windowHandle : driver.getWindowHandles()) {
    if (!windowHandle.equals(originalWindowHandle)) {
        driver.switchTo().window(windowHandle);
        break;
    }
}
Thread.sleep(2000);
// Verify if the URL matches the expected Twitter handle
String expectedTwitterHandle = "https://twitter.com/cadentgasltd";
String currentUrl = driver.getCurrentUrl();
if (currentUrl.equals(expectedTwitterHandle)) {
    System.out.println("Twitter URL is correct.");
} else {
    System.out.println("Twitter URL is not correct.");
}
System.out.println("Twitter Link Working");
//Close the Twitter tab
driver.close();

// Switch back to the original Cadent Gas tab
driver.switchTo().window(originalWindowHandle);
Thread.sleep(2000);

// Finding If Facebook Link Works
WebElement facebookLogo = driver.findElement(By.cssSelector("#form > div.container.footer > footer > div.footer-nav > div > div > div > div > div.col-sm-4.foundation > div > div:nth-child(1) > div > a.facebook.recite-ignore-styles-background"));
facebookLogo.click();
Thread.sleep(2000);
// Switch to the new Twitter tab
for (String windowHandle : driver.getWindowHandles()) {
    if (!windowHandle.equals(originalWindowHandle)) {
        driver.switchTo().window(windowHandle);
        break;
    }
}
Thread.sleep(2000);
// Verify if the URL matches the expected Facebook handle
String expectedFacebookHandle = "https://www.facebook.com/cadentgas/";
String presentUrl = driver.getCurrentUrl();
if (presentUrl.equals(expectedFacebookHandle)) {
    System.out.println("Facebook URL is correct.");
} else {
    System.out.println("Faebook URL is not correct.");
}
System.out.println("Facebook Link Working");
// Close the Facebook tab
driver.close();

// Switch back to the original Cadent Gas tab
driver.switchTo().window(originalWindowHandle);
Thread.sleep(2000);

// Finding If Linkedin Link Works
WebElement linkedinLogo = driver.findElement(By.cssSelector("#form > div.container.footer > footer > div.footer-nav > div > div > div > div > div.col-sm-4.foundation > div > div:nth-child(1) > div > a.linkedin.recite-ignore-styles-background"));
linkedinLogo.click();
Thread.sleep(2000);
// Switch to the new Twitter tab
for (String windowHandle : driver.getWindowHandles()) {
    if (!windowHandle.equals(originalWindowHandle)) {
        driver.switchTo().window(windowHandle);
        break;
    }
}
Thread.sleep(2000);
// Verify if the URL matches the expected Linkedin handle
String expectedlinkedinHandle = "https://www.linkedin.com/company/cadentgas/";
String thisUrl = driver.getCurrentUrl();
if (presentUrl.equals(expectedlinkedinHandle)) {
    System.out.println("Linkedin URL is correct.");
} else {
    System.out.println("Linkedin URL is not correct.");
}
System.out.println("Linkedin Link Working");
// Close the Linkedin tab
driver.close();

// Switch back to the original Cadent Gas tab
driver.switchTo().window(originalWindowHandle);
Thread.sleep(2000);
    }
}
