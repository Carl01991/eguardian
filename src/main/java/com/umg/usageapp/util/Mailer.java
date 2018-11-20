package com.umg.usageapp.util;

import java.io.IOException;
import java.util.Locale;
import java.util.Properties;

import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress; 
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import com.umg.usageapp.models.User;
import com.umg.usageapp.services.UserService;


@Service
public class Mailer {
	
	@Autowired
	private TemplateEngine templateEngine;
	

	@Autowired
	ServletContext servletContext;
	@Autowired
	Environment environment;
	
	@Autowired
	UserService userService;
	
	public void executeMailCreate(User user) throws IOException{
		 
	 final Locale locale = null;
	 final Context ctx = new Context(locale.US);
	 final Context ctxno = new Context(locale.US); 
	 String to = user.getEmail();
     String from = "noreplyeguardian@gmail.com"; 
     
    final String username = "noreplyeguardian@gmail.com";
    final String password = "Panconsalchicha6";

    String host = "smtp.gmail.com";

    Properties props = new Properties();
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.starttls.enable", "true");
    props.put("mail.smtp.host", host);
    props.put("mail.smtp.socketFactory.fallback","false");
    props.put("mail.smtp.ssl.enable","true");

    
    

    Session session = Session.getInstance(props,
       new javax.mail.Authenticator() {
          protected PasswordAuthentication getPasswordAuthentication() {
             return new PasswordAuthentication(username, password);
          }
       });
    

    try {

     	        Message message = new MimeMessage(session);

     	        message.setFrom(new InternetAddress(from));
     	        message.setRecipients(Message.RecipientType.TO,
     	           InternetAddress.parse(to));

     	        message.setSubject("Registro Eguardian");

     	        BodyPart messageBodyPart = new MimeBodyPart();
 
     	        	System.out.println(user.getEmail());
     	        
     	        ctxno.setVariable("link","http://68.183.17.17:8080/eguardian/confirmarCorreo/?email="+user.getEmail()); 
     	     	ctxno.setVariable("user", user.getEmail());
     	     	ctxno.setVariable("name", user.getFirstName());
     	    	
     	    	System.out.println("Real  " +servletContext.getRealPath("/"));
     	    	System.out.println("Context "+servletContext.getContextPath());

     	    	final String htmlContentno = this.templateEngine.process("email", ctxno);   	
     	    	
     	    	message.setContent(htmlContentno, "text/html; charset=utf-8");
  
     	        messageBodyPart.setContent(htmlContentno, "text/html"); 
     	        // Create a multipar message
     	        Multipart multipart = new MimeMultipart();
     	        multipart.addBodyPart(messageBodyPart);
     	        messageBodyPart = new MimeBodyPart();

     	        message.setContent(multipart);
     	        Transport.send(message);
     	 
     	     } catch (MessagingException i) {

     	    	 i.printStackTrace();
     	     }

}

	public void executeMailReset(User user, String token) throws IOException{
		 
		 final Locale locale = null;
		 final Context ctx = new Context(locale.US);
		 final Context ctxno = new Context(locale.US); 
		 String to = user.getEmail();
	     String from = "noreplyeguardian@gmail.com"; 
	     
	    final String username = "noreplyeguardian@gmail.com";
	    final String password = "Panconsalchicha6";

	    String host = "smtp.gmail.com";

	    Properties props = new Properties();
	    props.put("mail.smtp.auth", "true");
	    props.put("mail.smtp.starttls.enable", "true");
	    props.put("mail.smtp.host", host);
	    props.put("mail.smtp.socketFactory.fallback","false");
	    props.put("mail.smtp.ssl.enable","true");

	    
	    

	    Session session = Session.getInstance(props,
	       new javax.mail.Authenticator() {
	          protected PasswordAuthentication getPasswordAuthentication() {
	             return new PasswordAuthentication(username, password);
	          }
	       });
	    

	    try {

	     	        Message message = new MimeMessage(session);

	     	        message.setFrom(new InternetAddress(from));
	     	        message.setRecipients(Message.RecipientType.TO,
	     	           InternetAddress.parse(to));

	     	        message.setSubject("Restablecer Contraseña");

	     	        BodyPart messageBodyPart = new MimeBodyPart();
	 
	     	        	System.out.println(user.getEmail());
	     	        
	     	    	ctxno.setVariable("token", token);
	     	     	ctxno.setVariable("user", user.getEmail());
	     	    	
	     	    	System.out.println("Real  " +servletContext.getRealPath("/"));
	     	    	System.out.println("Context "+servletContext.getContextPath());

	     	    	final String htmlContentno = this.templateEngine.process("resetPass", ctxno);   	
	     	    	
	     	    	message.setContent(htmlContentno, "text/html; charset=utf-8");
	  
	     	        messageBodyPart.setContent(htmlContentno, "text/html"); 
	     	        // Create a multipar message
	     	        Multipart multipart = new MimeMultipart();
	     	        multipart.addBodyPart(messageBodyPart);
	     	        messageBodyPart = new MimeBodyPart();

	     	        message.setContent(multipart);
	     	        Transport.send(message);
	     	 
	     	     } catch (MessagingException i) {

	     	    	 i.printStackTrace();
	     	     }

	}

	
	
	public void executeNewUSer(User user, String pass) throws IOException{
		 
		 final Locale locale = null;
		 final Context ctx = new Context(locale.US);
		 final Context ctxno = new Context(locale.US); 
		 String to = user.getEmail();
	     String from = "noreplyeguardian@gmail.com"; 
	     
	    final String username = "noreplyeguardian@gmail.com";
	    final String password = "Panconsalchicha6";

	    String host = "smtp.gmail.com";

	    Properties props = new Properties();
	    props.put("mail.smtp.auth", "true");
	    props.put("mail.smtp.starttls.enable", "true");
	    props.put("mail.smtp.host", host);
	    props.put("mail.smtp.socketFactory.fallback","false");
	    props.put("mail.smtp.ssl.enable","true");

	    
	    

	    Session session = Session.getInstance(props,
	       new javax.mail.Authenticator() {
	          protected PasswordAuthentication getPasswordAuthentication() {
	             return new PasswordAuthentication(username, password);
	          }
	       });
	    

	    try {

	     	        Message message = new MimeMessage(session);

	     	        message.setFrom(new InternetAddress(from));
	     	        message.setRecipients(Message.RecipientType.TO,
	     	           InternetAddress.parse(to));

	     	        message.setSubject("Restablecer Contraseña");

	     	        BodyPart messageBodyPart = new MimeBodyPart();
	 
	     	        	System.out.println(user.getEmail());
	     	        
	     	    	ctxno.setVariable("pass", pass);
	     	     	ctxno.setVariable("user", user.getEmail());
	     	    	
	     	    	System.out.println("Real  " +servletContext.getRealPath("/"));
	     	    	System.out.println("Context "+servletContext.getContextPath());

	     	    	final String htmlContentno = this.templateEngine.process("newUser", ctxno);   	
	     	    	
	     	    	message.setContent(htmlContentno, "text/html; charset=utf-8");
	  
	     	        messageBodyPart.setContent(htmlContentno, "text/html"); 
	     	        // Create a multipar message
	     	        Multipart multipart = new MimeMultipart();
	     	        multipart.addBodyPart(messageBodyPart);
	     	        messageBodyPart = new MimeBodyPart();

	     	        message.setContent(multipart);
	     	        Transport.send(message);
	     	 
	     	     } catch (MessagingException i) {

	     	    	 i.printStackTrace();
	     	     }

	}
	
	
	
}
