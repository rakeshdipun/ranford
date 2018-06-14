package Utility;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

public class Library {
	
	public static void screenshort(String screenshortname)
	{
		try {
			Robot r=new Robot();
			
			BufferedImage bi=r.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
			
			ImageIO.write(bi, "png", new File("./target/"+screenshortname+".png"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
	}
	public static void attachement(String screenshortname) 
	{
		screenshort(screenshortname);
		
		EmailAttachment email=new EmailAttachment();
		
		email.setPath("./target/"+screenshortname+".png");
		
		email.setDisposition(EmailAttachment.ATTACHMENT);
		
		email.setDescription("failed screenshort");
		email.setName(screenshortname);
		
		MultiPartEmail attachement=new MultiPartEmail();
		
		try {
			attachement.setAuthenticator(new DefaultAuthenticator("", ""));
			
			attachement.setHostName("smtp.gmail.com");
			
			attachement.setSmtpPort(465);
			
			attachement.setSSLOnConnect(true);
			attachement.setFrom("");
			attachement.addTo("");
			attachement.setSubject("");
			attachement.setMsg("failed screenshort");
			attachement.attach(email);
			attachement.send();
		} catch (EmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
