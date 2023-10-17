package com.sanity.automation;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.mail.MessagingException;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CadentSanityAutomaionApplication {

	public static void main(String[] args) throws InterruptedException, UnsupportedEncodingException, MessagingException {
		 // Get the current timestamp
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String timestamp = dateFormat.format(new Date());

        // Chrome Will Open In Incognito Mode----- Made change on 14-AUG
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--incognito");

        System.setProperty("webdriver.chrome.driver", "src\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(opt);
        System.out.println("Opened Chrome In Incognito Mode");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); // Waits for 15 seconds for an element to complete
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        

        // Execute the tests
        String testResults = executeTests(driver);
//        String testResults = "TESTING THE CODE";
        
        
        // Recipient email addresses
        String[] recipientEmails = {
            "rohan_raj@hcl.com",
            // ...
        };

        String[] ccEmails = {
//            "rohan.raj@cadentgas.com",
            "vishal.mahato@hcl.com"
//            "deepak.kamat@hcl.com"
        };

        // Send email with test results
        sendEmail("Cadent Gas Prod Web: Automated Test Results [" + timestamp + "]", testResults, recipientEmails, ccEmails);

        // Close the WebDriver
        driver.quit();
    }

    private static String executeTests(WebDriver driver) throws InterruptedException {
        // Redirect console output to capture test results
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        PrintStream originalOut = System.out;
        System.setOut(printStream);

        // Create instances of different test classes
        BodyTest bodyTest = new BodyTest(driver);
        MasterTemplateTest masterTest = new MasterTemplateTest(driver);
//        SaleniumScript saleniumScript = new SaleniumScript(driver);

        // Execute the tests
//        saleniumScript.UnderConnection();
        masterTest.runTests();
//        bodyTest.performBodyActions();

        // Restore original console output
        System.out.flush();
        System.setOut(originalOut);

        // Convert captured output to String
        String testResults = outputStream.toString();

        // After all test methods are executed
        System.out.println("All tests executed.");

        return testResults;
    }

    private static void sendEmail(String subject, String body, String[] recipientEmails, String[] ccEmails) throws MessagingException, UnsupportedEncodingException {
        // SMTP server details for sending email
        final String smtpServer = "smtp.office365.com";
        final String username = "rohan.raj@cadentgas.com";
        final String password = "";

        // Call the sendEmail method from SMTPMailServer class
        SMTPMailServer.sendEmail(subject, body, recipientEmails, ccEmails);
    
        
	}

}
