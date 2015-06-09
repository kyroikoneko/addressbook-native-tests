package com.example.tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.fw.Contact;

public class TestContactDelete extends TestBase {
	
	@Test
	public void shouldDeleteContacts() throws InterruptedException  {

		 Contact createdContact= app.getContactHelper().getFirstContact();
		app.getContactHelper().deleteContact();
	    int resultDeletion=app.getContactHelper().checkContactDelete(createdContact);
		app.getContactHelper().exitFormDeletion(); 
	    Assert.assertNotEquals(resultDeletion, 0);
	   
		
}

}