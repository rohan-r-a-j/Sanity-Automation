package com.sanity.automation;

import javax.mail.*;
import javax.mail.internet.*;

import java.util.Properties;
import java.io.UnsupportedEncodingException;

public class SMTPMailServer {

    public static void sendEmail(String subject, String body, String[] recipientEmails, String[] ccEmails) throws UnsupportedEncodingException {
        // SMTP server details for Outlook
        final String smtpServer = "smtp.office365.com";
        final String username = "rohan.raj@cadentgas.com";
        final String password = "Baadshah@Rohan08";

        // Setting up properties for the SMTP server
        Properties props = new Properties();
        props.put("mail.smtp.host", smtpServer);
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        // Creating a session for authentication
        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            // Create a MimeMessage
            MimeMessage message = new MimeMessage(session);
            // Set custom sender display name and email address
            String senderDisplayName = "Sanity Automation";
            String senderEmail = "rohan.raj@cadentgas.com";
            message.setFrom(new InternetAddress(senderEmail, senderDisplayName));

            // Add recipients
            for (String recipientEmail : recipientEmails) {
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipientEmail));
            }
            
            // Add CC recipients
            for (String ccEmail : ccEmails) {
                message.addRecipient(Message.RecipientType.CC, new InternetAddress(ccEmail));
            }
            message.setSubject(subject);
            // Create the email body in HTML table format
            String tableContent = "<table border='1'>" +
                                  "<tr><th>Test Name</th><th>Test Result</th></tr>" +
                                  body + // Assuming 'body' contains the test results in each row
                                  "</table>";

            // Set email body content
            message.setContent(tableContent, "text/html; charset=utf-8");
            // Send the message
            Transport.send(message);

            System.out.println("Email sent successfully!");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
