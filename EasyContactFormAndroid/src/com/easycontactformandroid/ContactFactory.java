package com.easycontactformandroid;

public class ContactFactory {

	static public String emailservice = "EMAIL_SERVICE";
	static public String smsservice = "SMS_SERVICE";
	static public IContact GetContact(String name) {

		IContact contact = null;
		if(emailservice.compareTo(name) == 0)
			contact = new EmailContact();
		else if(smsservice.compareTo(name) == 0)
			contact = new SMSContact();
		
		return contact;

	}
}
