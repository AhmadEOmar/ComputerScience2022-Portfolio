package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	// A test to check if adding contacts to contact service will work
	@Test
	void testAddContact() {
		ContactService contact1 = new ContactService();
		Contact testContact1 = new Contact("Contact1", "Ahmad", "Omar", "9198893483", "Test Address");
		assertEquals(true, contact1.addContact(testContact1));
	}
	
	// A test to check if after adding a contact we are able to delete it from our array
	@Test
	void testDeleteContact() {
		ContactService contact1 = new ContactService();
		Contact testContact1 = new Contact("Contact1", "Ahmad", "Omar", "9198893483", "Test Address");
		Contact testContact2 = new Contact("Contact2", "Ahmad", "Omar", "9198893483", "Test Address");
		Contact testContact3 = new Contact("Contact3", "Ahmad", "Omar", "9198893483", "Test Address");
		Contact testContact4 = new Contact("Contact4", "Ahmad", "Omar", "9198893483", "Test Address");
		
		contact1.addContact(testContact1);
		contact1.addContact(testContact2);
		contact1.addContact(testContact3);
		contact1.addContact(testContact4);
		
		assertEquals(true, contact1.deleteContactID("Contact2"));
		assertEquals(true, contact1.deleteContactID("Contact3"));
		assertEquals(true, contact1.deleteContactID("Contact4"));
	}
	
	// A check to make sure we are able to update each section of the contact such as name, phone number, and address
	@Test
	void testUpdateContact() {
		ContactService contact1 = new ContactService();
		Contact testContact1 = new Contact("Contact1", "Ahmad", "Omar", "9198893483", "Test Address");
		
		contact1.addContact(testContact1);
		
		assertEquals(true, contact1.updateFirstName("Contact1", "Doom"));
		assertEquals(true, contact1.updateLastName("Contact1", "Guy"));
		assertEquals(true, contact1.updatePhoneNumber("Contact1", "123456789"));
		assertEquals(true, contact1.updateHomeAddress("Contact1", "New Test Home Address"));
	}

}
