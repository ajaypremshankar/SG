/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Global.Model;

import java.sql.ResultSet;
import java.util.Properties;
import javax.mail.*;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailSender {

    public static String SUB_PARENT_REG="Parent Registration";
    public static String SUB_TEACHER_REG="Teacher Registration";
    private static  String from="schools.global.init@gmail.com";
    private static String password="qwerty@plat";





	public static Boolean send(String to,String subjectKey) {
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class",
				"javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");

		Session session = Session.getDefaultInstance(props,
			new javax.mail.Authenticator() {
            @Override
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(from,password);
				}
			});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(to));
			message.setSubject(SUB_PARENT_REG);
			message.setText(new String(MailSender.getContent(subjectKey,to)));

			Transport.send(message);
            return true;
		} catch (MessagingException e) {
            return false;
        }
	}

   private static StringBuffer getContent(String subjectKey, String to){
   if(subjectKey.equalsIgnoreCase(SUB_PARENT_REG))
   {
   return new StringBuffer("Congrations "+to+" your child is now connected with SchoolsGlobal.com and you welcome to" +
           "the new world of learning environment for your child so get connected and enter the new world where we" +
           " take care of your child and you now free from child related tensions....." +
           "to register urself click on following link...\n <---link coming soon---->  :P");
   }
   return new StringBuffer("");
   }


   public static void wait_list_sender(){
   String query="select email_id,subject from mail_wait_list";
   ResultSet rs=DBOperation.getRecord(query);
   try{
    while(rs.next()){
        while(send(rs.getString(1),rs.getString(2))){
           String queryDel="delete from mail_wait_list where email_id='"+rs.getString(1)+"'";
           DBOperation.DBUpdate(queryDel);
        }
    }
   }
   catch(Exception e){
   System.out.print("Caught you in wait_list_send()");
   }
   }


}