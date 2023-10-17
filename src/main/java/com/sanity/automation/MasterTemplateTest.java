package com.sanity.automation;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MasterTemplateTest {
    private WebDriver driver;

    public MasterTemplateTest(WebDriver driver) {
        this.driver = driver;
    }

    public void runTests() throws InterruptedException {
    	   JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
    	// Get the current timestamp
           SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
           String timestamp = dateFormat.format(new Date());
    	   
           
        // Open the browser and navigate to the website
        driver.get("https://www.cadentgas.com");
        driver.manage().window().maximize();

     // Store the handle of the original tab
        String originalWindowHandle = driver.getWindowHandle();
        
     // Find and click the Close button of title message
        driver.findElement(By.linkText("Close")).click();
            Thread.sleep(2000);
            System.out.println("Title Message Closed Successfully [" + timestamp + "]" );
            
            // Find and click  access all cookies button 
            driver.findElement(By.xpath("/html/body/div[1]/p[1]")).click();
            Thread.sleep(2000);
            System.out.println("Accepted All Cookies [" + timestamp + "]");
         
            // Scroll from top to bottom of the webpage
            long windowHeight = (Long) jsExecutor.executeScript("return window.innerHeight");
            long fullPageHeight = (Long) jsExecutor.executeScript("return document.body.scrollHeight");
            long currentScroll = 0;
            while (currentScroll < fullPageHeight) {
                currentScroll += windowHeight / 10; // Adjust scroll step as needed for smoother scrolling
                jsExecutor.executeScript("window.scrollTo(0, " + currentScroll + ")");
                Thread.sleep(100); // Reduce delay for smoother scrolling
            }

            // Scroll back to the top of the webpage using the same increments
            while (currentScroll > 0) {
                currentScroll -= windowHeight / 10; // Adjust scroll step as needed for smoother scrolling
                if (currentScroll < 0) {
                    currentScroll = 0;
                }
                jsExecutor.executeScript("window.scrollTo(0, " + currentScroll + ")");
                Thread.sleep(100); // Reduce delay for smoother scrolling
            }
           
            // Find and click on accessibility tool
            driver.findElement(By.cssSelector("#form > div.header.nav-down > div.container > div.row.hidden-xs > div > div.accessibility-tools > button > span")).click();
            Thread.sleep(5000);
            System.out.println("Accessibility Tool Button Clicked and working successfully");
            
            //Close the accessibility tool
            driver.findElement(By.cssSelector("#recite-close")).click();
            Thread.sleep(2000);
            
            //Click ok on confirmation box
            driver.findElement(By.id("recite-modal-button-ok")).click();
            System.out.println("Closed Accessibility Tool [" + timestamp + "]");
            Thread.sleep(2000);
            
            // MAIN NAVIGATION BAR OPTIONS
            
         // Find and click on the About Us to open the dropdown
            WebElement aboutUs = driver.findElement(By.linkText("About us")); 
            aboutUs.click();
            System.out.println("About Us Worked [" + timestamp + "]");
            Thread.sleep(2000);
            
         // Find and click on the News & Media to open the dropdown
            WebElement newsMedia = driver.findElement(By.linkText("News & Media")); 
            newsMedia.click();
            System.out.println("News & Media Worked [" + timestamp + "]");
            Thread.sleep(2000);
            
            // Find and click on the Careers to open the dropdown
            WebElement careers = driver.findElement(By.linkText("Careers")); 
            careers.click();
            System.out.println("Careers Worked [" + timestamp + "]");
            Thread.sleep(2000);
            
            // Find and click on the Suppliers
            WebElement suppliers = driver.findElement(By.linkText("Suppliers")); 
            suppliers.click();
            System.out.println("Suppliers Worked [" + timestamp + "]");
            Thread.sleep(2000);
            
            while (currentScroll < fullPageHeight) {
                currentScroll += windowHeight / 10; // Adjust scroll step as needed for smoother scrolling
                jsExecutor.executeScript("window.scrollTo(0, " + currentScroll + ")");
                Thread.sleep(100); // Reduce delay for smoother scrolling
            }
            
         // Press the back button to return to the home page
            driver.navigate().back();
            System.out.println("Navigated back to Home page [" + timestamp + "]");
            Thread.sleep(2000);
            
            // Find and click on the Contact Us
            WebElement contactus = driver.findElement(By.linkText("Contact-us")); 
            contactus.click();
//            Actions action = new Actions(driver);
//            action.moveToElement(contactus);
            System.out.println("Contact Us Worked [" + timestamp + "]");
            Thread.sleep(5000);
            
         // Press the back button to return to the home page
            driver.navigate().back();
            System.out.println("Navigated back to Home page[" + timestamp + "]");
            Thread.sleep(2000);	
            
         // Find and click on the Emergencies
            WebElement emergencies = driver.findElement(By.linkText("Emergencies")); 
            emergencies.click();
            System.out.println("Emergencies Worked [" + timestamp + "]");
            Thread.sleep(2000);
            
         // Find and click on the Connections
            WebElement connections = driver.findElement(By.linkText("Connections")); 
            connections.click();
            System.out.println("Connections Worked [" + timestamp + "]");
            Thread.sleep(2000);
         // Press the back button to return to the home page
            driver.navigate().back();
            System.out.println("Navigated back to Home page [" + timestamp + "]");
            Thread.sleep(2000);	
            
         // Find and click on the In-Your-Area
            WebElement inYourArea = driver.findElement(By.linkText("In Your Area")); 
            inYourArea.click();
            System.out.println("In Your Area Worked [" + timestamp + "]");
            Thread.sleep(2000);
            
         // Find and click on the Help-And-Advice
            WebElement helpAndAdvice = driver.findElement(By.linkText("Help & advice")); 
            helpAndAdvice.click();
            System.out.println("Help And Advice Worked [" + timestamp + "]");
            Thread.sleep(2000);
          
            // Find and click on the Future Of Gas
            WebElement futureOfGas = driver.findElement(By.linkText("Future of gas")); 
            futureOfGas.click();
            System.out.println("Future Of Gas Worked [" + timestamp + "]");
            Thread.sleep(2000);
         // Press the back button to return to the home page
            driver.navigate().back();
            System.out.println("Navigated back to Home page [" + timestamp + "]");
            Thread.sleep(2000);	
            
            // Find and click on the Sustainability
            WebElement sustainability = driver.findElement(By.linkText("Sustainability")); 
            sustainability.click();
            System.out.println("Sustainability Worked [" + timestamp + "]");
            Thread.sleep(2000);
         // Press the back button to return to the home page
            driver.navigate().back();
            System.out.println("Navigated back to Home page [" + timestamp + "]");
            Thread.sleep(2000);	
            
            // Find and click on the Cadent Foundation
            WebElement cadentFoundation = driver.findElement(By.linkText("Cadent Foundation")); 
            cadentFoundation.click();
            System.out.println("Cadent Foundation Worked [" + timestamp + "]");
            Thread.sleep(2000);
         // Press the back button to return to the home page
            driver.navigate().back();
            System.out.println("Navigated back to Home page [" + timestamp + "]");
            Thread.sleep(2000);	
            
//            //Checking search button
//            driver.findElement(By.xpath("//img[@src='/nggdwsdev/media/Icons/icon-search.svg?ext=.svg']")).click();
//            driver.findElement(By.xpath("//input[@name='p$lt$ctl11$SmartSearchBox$txtWord' and @class='form-control' and @autocomplete='off']")).sendKeys("gas");
//            Thread.sleep(2000);
//            driver.findElement(By.xpath("//input[@name='p$lt$ctl11$SmartSearchBox$btnSearch' and @id='p_lt_ctl11_SmartSearchBox_btnSearch']")).click();
//            Thread.sleep(2000);
//            // Press the back button to return to the home page
//               driver.navigate().back();
//               System.out.println("Navigated back to Home page [" + timestamp + "]");
//               Thread.sleep(2000);	
//               
//            
            //Check If Latest News Is Visible
            WebElement latestNewsSection = driver.findElement(By.cssSelector("#main-content > div.container.main > div > div > div:nth-child(9) > div > div:nth-child(1)"));
            System.out.println("Latest News is Available [" + timestamp + "]");
            WebElement viewAllNewsLink = driver.findElement(By.cssSelector("#p_lt_ctl12_pageplaceholder_p_lt_ctl01_RowLayout_RowLayout_9_WebPartZone3_WebPartZone3_zone_Link_Button1_btnElem_lblText"));
            viewAllNewsLink.click();
            Thread.sleep(2000);
            // Press the back button to return to the home page
               driver.navigate().back();
               System.out.println("Navigated back to Home page [" + timestamp + "]");
               Thread.sleep(2000);	
               
       System.out.println("View All News Button Working [" + timestamp + "]");
       //Press the back button to return to the home page
       driver.navigate().back();
       driver.navigate().refresh();
       System.out.println("Navigated back to Home page [" + timestamp + "]");
       Thread.sleep(2000);

       //Check If FAQs available at home
       WebElement faqs = driver.findElement(By.cssSelector("#main-content > div.container.main > div > div > div:nth-child(9) > div > div.wrapper.faqs-home"));
       System.out.println("FAQS Available [" + timestamp + "]");
       WebElement viewAllFAQsElement = driver.findElement(By.cssSelector("#p_lt_ctl12_pageplaceholder_p_lt_ctl01_RowLayout_RowLayout_9_WebPartZone4_WebPartZone4_zone_Link_Button_btnElem_lblText"));

       // Scroll to the bottom of the page
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
       
       viewAllFAQsElement.click();
       System.out.println("View All FAQs Button Working [" + timestamp + "]");
       //Press the back button to return to the home page
       driver.navigate().back();
       //driver.navigate().refresh();
       System.out.println("Navigated back to Home page [" + timestamp + "]");
       Thread.sleep(2000);

       //Check If connect with Us is available
       WebElement connectWithUs = driver.findElement(By.cssSelector("#form > div.container.footer > footer > div.footer-nav > div > div > div > div > div.col-sm-4.foundation > div > div:nth-child(1) > div"));
       System.out.println("Connect With Us is Available [" + timestamp + "]");
       //Click and check on Contact us button
       WebElement contactUs = driver.findElement(By.cssSelector("#form > div.container.footer > footer > div.footer-nav > div > div > div > div > div.col-sm-4.foundation > div > div:nth-child(1) > div > div.dropdowns > a"));
       contactUs.click();
       Thread.sleep(2000);
       System.out.println("Contact Us Button Worked [" + timestamp + "]");
       //Press the back button to return to the home page
       driver.navigate().back();
       driver.navigate().refresh();
       System.out.println("Navigated back to Home page [" + timestamp + "]");
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
           System.out.println("Twitter URL is correct. [" + timestamp + "]");
       } else {
           System.out.println("Twitter URL is not correct. [" + timestamp + "]");
       }
       System.out.println("Twitter Link Working [" + timestamp + "]");
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
           System.out.println("Facebook URL is correct. [" + timestamp + "]");
       } else {
           System.out.println("Faebook URL is not correct.[" + timestamp + "]");
       }
       System.out.println("Facebook Link Working [" + timestamp + "]");
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
           System.out.println("Linkedin URL is correct. [" + timestamp + "]");
       } else {
           System.out.println("Linkedin URL is not correct.[" + timestamp + "]");
       }
       System.out.println("Linkedin Link Working [" + timestamp + "]");
       // Close the Linkedin tab
       driver.close();

       // Switch back to the original Cadent Gas tab
       driver.switchTo().window(originalWindowHandle);
       Thread.sleep(2000);
       
       // Check Smell Gas Message is there or not
       driver.findElement(By.cssSelector("#form > div.container.footer > footer > div.footer-nav > div > div > div > div > div.col-sm-8 > div > div:nth-child(1) > div"));
       WebElement whatElseShouldYouDo = driver.findElement(By.linkText("What else should you do?"));
       whatElseShouldYouDo.click();
       System.out.println("Emergency Info Button 1 worked [" + timestamp + "]");
       Thread.sleep(2000);
    // Press the back button to return to the home page
       driver.navigate().back();
       System.out.println("Navigated back to Home page [" + timestamp + "]");
       Thread.sleep(2000);	
       
       WebElement whatElseShouldYouDoButton = driver.findElement(By.linkText("What else should you do?"));
       whatElseShouldYouDoButton.click(); 
       System.out.println("Emergency Info Button 2 worked [" + timestamp + "]");
       Thread.sleep(2000);
    // Press the back button to return to the home page
       driver.navigate().back();
       System.out.println("Navigated back to Home page [" + timestamp + "]");
       Thread.sleep(2000);	
       
       //Check Language Change option is available
       driver.findElement(By.cssSelector("#form > div.container.footer > footer > div.footer-nav > div > div > div > div > div.col-sm-8 > div > div:nth-child(2) > div > div"));
       //Check By Clicking on any language
       WebElement languageChangeButton = driver.findElement(By.cssSelector("#form > div.container.footer > footer > div.footer-nav > div > div > div > div > div.col-sm-8 > div > div:nth-child(2) > div > div > p > a:nth-child(7)"));
       languageChangeButton.click();
       Thread.sleep(2000);
       // Press the back button to return to the home page
          driver.navigate().back();
          System.out.println("Navigated back to Home page [" + timestamp + "]");
          Thread.sleep(2000);	
          

          //Checking Footer Message 
          WebElement footerMessage = driver.findElement(By.cssSelector("#callDisclaimer"));
          
       // Check if the message element is displayed
          String footermessage = footerMessage.getText();
          
       // Define the expected text
          String expectedText = "* All calls are recorded and may be monitored. Please only call the national gas emergency number 0800 111 999 if you have a gas emergency: if you smell gas or you suspect you have a carbon monoxide issue. Please see this ";
          
          if (footermessage.contains(expectedText)) {
              System.out.println("Expected text is present in the element.. [" + timestamp + "]");
          }
          else {
              System.out.println("Expected text is not present in the element. [" + timestamp + "]");
          }
          
          //Click on advice button
          WebElement adviceButton = driver.findElement(By.cssSelector("#callDisclaimer > a"));
          adviceButton.click();
          System.out.println("See this advice button is working [" + timestamp + "]");
          Thread.sleep(2000);
          // Press the back button to return to the home page
             driver.navigate().back();
             System.out.println("Navigated back to Home page [" + timestamp + "]");
             Thread.sleep(2000);
      
             //Check If modern slavery Button Works
          WebElement modernSlaveryStatementElement = driver.findElement(By.cssSelector("#form > div.container.footer > footer > div.footer-content.brand-dark > div > div:nth-child(1) > div.col-sm-8 > p:nth-child(2) > a"));
           modernSlaveryStatementElement.click();
           System.out.println("Modern slavery Button Worked [" + timestamp + "]");
           Thread.sleep(2000);
           // Switch the control to new tab
           for (String windowHandle : driver.getWindowHandles()) {
               if (!windowHandle.equals(originalWindowHandle)) {
                   driver.switchTo().window(windowHandle);
                   break;
               }
           } 
           Thread.sleep(2000);
           driver.close();

           // Switch back to the original Cadent Gas tab
           driver.switchTo().window(originalWindowHandle);
           System.out.println("Returned Back to Home Tab [" + timestamp + "]");
           Thread.sleep(2000);

           // Scroll to the bottom of the page
              JavascriptExecutor jse = (JavascriptExecutor) driver;
              jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
              
              // Checking Sitemap, privacy policy and other elements
      driver.findElement(By.id("termsNav"));
      WebElement sitemap = driver.findElement(By.linkText("Sitemap"));
      sitemap.click();
      System.out.println("Sitemap Worked [" + timestamp + "]");
      Thread.sleep(2000);
      // Press the back button to return to the home page
         driver.navigate().back();
         System.out.println("Navigated back to Home page [" + timestamp + "]" );
         Thread.sleep(2000);
         
         WebElement cookiePolicy = driver.findElement(By.linkText("Cookie policy"));
         cookiePolicy.click();
         System.out.println("Cookie policy Worked [" + timestamp + "]");
         Thread.sleep(2000);
      // Press the back button to return to the home page
         driver.navigate().back();
         System.out.println("Navigated back to Home page [" + timestamp + "]");
         Thread.sleep(2000);
         
         WebElement privacyPolicy = driver.findElement(By.linkText("Privacy policy"));
         privacyPolicy.click();
         System.out.println("Privacy Policy Worked [" + timestamp + "]");
         Thread.sleep(2000);
      // Press the back button to return to the home page
         driver.navigate().back();
         System.out.println("Navigated back to Home page [" + timestamp + "]");
         Thread.sleep(2000);
         
         WebElement environmentalInformationRegulations = driver.findElement(By.linkText("Environmental information regulations"));
         environmentalInformationRegulations.click();
         System.out.println("Environmental information regulations Worked [" + timestamp + "]");
         Thread.sleep(2000);
      // Press the back button to return to the home page
         driver.navigate().back();
         System.out.println("Navigated back to Home page [" + timestamp + "]");
         Thread.sleep(2000);
         
         WebElement documentLibrary = driver.findElement(By.linkText("Document library"));
         documentLibrary.click();
         System.out.println("Document Library Worked [" + timestamp + "]");
         Thread.sleep(2000);
      // Press the back button to return to the home page
         driver.navigate().back();
         System.out.println("Navigated back to Home page [" + timestamp + "]");
         Thread.sleep(2000);
         

         
         WebElement termsAndConditions = driver.findElement(By.linkText("Terms & conditions"));
         termsAndConditions.click();
         System.out.println("Terms & conditions Worked [" + timestamp + "]");
         Thread.sleep(2000);
      // Press the back button to return to the home page
         driver.navigate().back();
         System.out.println("Navigated back to Home page [" + timestamp + "]");
         Thread.sleep(2000);
         

         WebElement accessibility = driver.findElement(By.partialLinkText("Accessibility"));
         accessibility.click();
         System.out.println("Accessibility Worked [" + timestamp + "]");
         Thread.sleep(2000);
      // Press the back button to return to the home page
         driver.navigate().back();
         System.out.println("Navigated back to Home page [" + timestamp + "]");
         Thread.sleep(2000);
         
         WebElement gdprForm = driver.findElement(By.cssSelector("#termsNav > li:nth-child(8) > a"));
         gdprForm.click();
         System.out.println("GDPR Form Worked [" + timestamp + "]");
         Thread.sleep(2000);
      // Press the back button to return to the home page
         driver.navigate().back();
         System.out.println("Navigated back to Home page [" + timestamp + "]");
         Thread.sleep(2000);
         
         WebElement cookieDetails = driver.findElement(By.cssSelector("#termsNav > li:nth-child(9) > a"));
         cookieDetails.click();
         System.out.println("Cookie Details Worked [" + timestamp + "]");
         Thread.sleep(2000);
      // Press the back button to return to the home page
         driver.navigate().back();
         System.out.println("Navigated back to Home page [" + timestamp + "]");
         Thread.sleep(2000);
         
         WebElement ourLocation = driver.findElement(By.cssSelector("#termsNav > li:nth-child(10) > a"));
         ourLocation.click();
         System.out.println("Our Location Worked [" + timestamp + "]");
         Thread.sleep(2000);
      // Press the back button to return to the home page
         driver.navigate().back();
         System.out.println("Navigated back to Home page [" + timestamp + "]");
         Thread.sleep(2000);
         
         WebElement socialMediaCommunityGuidelines = driver.findElement(By.cssSelector("#termsNav > li:nth-child(11) > a"));
         socialMediaCommunityGuidelines.click();
         System.out.println("Social media community guidelines Worked [" + timestamp + "]");
         Thread.sleep(2000);
      // Press the back button to return to the home page
         driver.navigate().back();
         System.out.println("Navigated back to Home page [" + timestamp + "]");
         Thread.sleep(2000);
         
         //Checking Copyright Message 
         // Locate the parent element of the footer
         WebElement copyrightMessage = driver.findElement(By.xpath("//*[@id='form']/div[7]/footer/div[3]"));

         // Verify if the footer element's text contains the desired text
         String desiredText = "Cadent Gas Ltd © 2020";
         if (copyrightMessage.getText().contains(desiredText)) {
             System.out.println("Copyright Message is present in the footer.[" + timestamp + "]");
         } else {
             System.out.println("DCopyright Message is not present in the footer.[" + timestamp + "]");
         }
         
         //checking if cadent gas logo is available
         // Locate the Cadent Gas logo by its XPath
         WebElement logoElement = driver.findElement(By.xpath("//*[@id='p_lt_ctl15_ColumnLayout_Bootstrap_ColumnLayout_Bootstrap_1_Link_Button1_btnElem_image']"));

         if (logoElement.isDisplayed()) {
             System.out.println("Cadent Gas logo is present on the page.[" + timestamp + "]");
         } else {
             System.out.println("Cadent Gas logo is not present on the page.[" + timestamp + "]");
         }
         System.out.println("All Links Availability And Elements Tested and Passed Successfully on [" + timestamp + "]");
    }
}

