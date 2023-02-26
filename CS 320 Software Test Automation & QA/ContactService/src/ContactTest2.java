import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest2 {

	// Test to make sure that the contact is able to read that each part of the code is setup correctly such as checking that the contact, name, phone number, 
	// and address are correct. 
	@Test
	void testContact() 
	{
		Contact contact = new Contact("Contact1", "FName","LName","123456789","Address");
		assertTrue(contact.getContactId().equals("Contact1"));
		assertTrue(contact.getFirstName().equals("FName"));
		assertTrue(contact.getLastName().equals("LName"));
		assertTrue(contact.getPhoneNumber().equals("123456789"));
		assertTrue(contact.getHomeAddress().equals("Address"));
	}
	
	// Checking to see if the correct throw exception is thrown when contact is longer than 10 digits
	@Test
	void testContactIDTooLong() 
	{
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact("Contact11111111", "FName", "LName", "123456789", "Address");
		});
	}
	
	// Checking to see if the correct throw exception is thrown when contact id is set to null
	@Test
	void testContactIDNull() 
	{
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact(null, "FName", "LName", "123456789", "Address");
		});
	}
	
	
	// Checking to see if the correct throw exception is thrown when contact first name is longer than 10 digits
	@Test
	void testContactFirstNameTooLong() 
	{
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact("Contact1", "FName11111111111", "LName", "123456789", "Address");
		});
	}
	
	// Checking to see if the correct throw exception is thrown when first name is set to null 
	@Test
	void testContactFirstNameNull() 
	{
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact("Contact1", null, "LName", "123456789", "Address");
		});
	}
	
	// Checking to see if the correct throw exception is thrown when contact last name is longer than 10 digits
	@Test
	void testContactLastNameTooLong() 
	{
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact("Contact1", "FName", "LName1111111111111", "123456789", "Address");
		});
	}
	
	// Checking to see if the correct throw exception is thrown when last name is set to null 
	@Test
	void testContactLastNameNull() 
	{
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact("Contact1", "FName", null, "123456789", "Address");
		});
	}
	
	// Checking to see if the correct throw exception is thrown when contact phone number is longer than 10 digits
	@Test
	void testContactPhoneNumberTooLong() 
	{
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact("Contac1", "FName", "LName", "12345678912345", "Address");
		});
	}
	
	// Checking to see if the correct throw exception is thrown when phone number is set to null 
	@Test
	void testContactPhoneNumberNull() 
	{
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact("Contac1", "FName", "LName", null, "Address");
		});
	}
	
	// Checking to see if the correct throw exception is thrown when contact address is longer than 30 characters
	@Test
	void testContactHomeAddressTooLong() 
	{
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact("Contact1", "FName", "LName", "123456789", "Address123456789123456789123456789");
		});
	}
	
	// Checking to see if the correct throw exception is thrown when home address is set to null
	@Test
	void testContactHomeAddressNull() 
	{
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact("Contact1", "FName", "LName", "123456789", null);
		});
	}
	
}


