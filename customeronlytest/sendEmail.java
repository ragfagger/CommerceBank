package com.example.customeronlytest;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class sendEmail {

    public static void main(String[] args) {

        final String username = "SE3910CommerceBankMailTest@gmail.com";
        final String password = "PleaseWork";

        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "465");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.socketFactory.port", "465");
        prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("SE3910CommerceBankMailTest@gmail.com"));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse("sxm68680@ucmo.edu")
            );
            for(int i = 0; i < 10; i++) {
                message.setSubject("Your appointment was scheduled successfully."+i);
                message.setText("Dear [INSERT NAME],\n\n"
                        + "Your appointment at [BRANCH] was successfully scheduled for [TIME] on [DATE].\n"
                        + "Thank you for choosing Commerce.");

                Transport.send(message);

                System.out.println("Done");
            }
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

}