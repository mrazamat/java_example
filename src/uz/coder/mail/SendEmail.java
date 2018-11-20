package uz.coder.mail;

import com.sun.deploy.security.SessionCertStore;

import java.util.Properties;

public class SendEmail {
    public static void main(String[] args) {
        String to = "azamat00189@mail.ru";
        String from = "azamat@coder.uz";
        String host = "localhost";
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host",host);

       // Session session = Session.getDefaultInstance(properties);

    }
}
