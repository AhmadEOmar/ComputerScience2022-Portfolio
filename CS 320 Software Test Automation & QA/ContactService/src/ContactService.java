////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Name: Ahmad Omar
//    Date: 1/22/2023
//    Class: CS 320 Software Test Automation & QA
//    Professor: Kalysa Wilson
//    Description: Creating the contact service class in which it gives us the ability to 
//    add contacts to our array list, delete contacts by contact id, and update our contact information
//
//
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////


import java.util.ArrayList; // import the ArrayList class

public class ContactService {

		String uniqueId;
		
	
		// creates a new array list called contact
		ArrayList<Contact> contacts = new ArrayList<>();
	
	
		// How we will be able to add a contact to our array list
		public boolean addContact(Contact addContact)
		{
			// set a boolean to false to use when needing to change our expression for the correct outcome
			boolean contactListCheck = false;
			// loop through the contact list 
			// Ran into this way to loop through in Java when I was checking on how to do this and decided to try it out.
			// learned about this in this slackoverflow thread: https://stackoverflow.com/questions/5851025/why-are-there-two-different-kinds-of-for-loops-in-java
			for(Contact contactServiceList : contacts)
			{
				// if the contact id is equal to the contact id it will mean that there is something in there
				if(contactServiceList.getContactId().equals(addContact.getContactId()))
				{
					// set boolean to true 
					contactListCheck = true; 
					// break the loop 
					break;
				}
			}
			
			// If there is no contact in the list check
			if(!contactListCheck)
			{
				// add contact to the contact array
				contacts.add(addContact);
				// return true which ends the add method
				return true;
			}
			else 
			{
				return false; 
			}
				
		}
	
		// how we will delete from our array by looking for an ID string
		public boolean deleteContactID(String ID)
		{
			// loop through the contact list 
			// Ran into this way to loop through in Java when I was checking on how to do this and decided to try it out.
			// learned about this in this slackoverflow thread: https://stackoverflow.com/questions/5851025/why-are-there-two-different-kinds-of-for-loops-in-java
			for(Contact contactServiceList : contacts)
			{
				// if we find the contact id that matches 
				if(contactServiceList.getContactId().equals(ID))
				{
					// we will remove the contact from our array
					contacts.remove(contactServiceList);
					return true;
				}
			}
			
			return false;
		}
		
		// How we will update the name in which we search for the contact id and then update the first name
		public boolean updateFirstName(String ID, String newfirstName)
		{
			// set a boolean to false to use when needing to change our expression for the correct outcome
			boolean updateFirstName = false;
			
			// loop through the contact list 
			// Ran into this way to loop through in Java when I was checking on how to do this and decided to try it out.
			// learned about this in this slackoverflow thread: https://stackoverflow.com/questions/5851025/why-are-there-two-different-kinds-of-for-loops-in-java
			for(Contact contactServiceList : contacts )
			{
				// if the contact id is equal to what we found
				if(contactServiceList.getContactId().equals(ID));
				{
					// update the name string to the new name string
					contactServiceList.setFirstName(newfirstName);
					updateFirstName = true;
					// break loop 
					break;
				}
			}
			// return the updated first name
			return updateFirstName;
		}
		
		// Use the same class from above to change the name of the last name of the contact 
		public boolean updateLastName(String ID, String newLasttName)
		{
			boolean updateLastName = false;
			for(Contact contactServiceList : contacts )
			{
				if(contactServiceList.getContactId().equals(ID));
				{
					contactServiceList.setLastName(newLasttName);
					updateLastName = true;
					break;
				}
			}
			return updateLastName;
		}
		
		// Use the same class from above to change the name of the last name of the contact 
		public boolean updatePhoneNumber(String ID, String newPhoneNumber)
		{
			boolean updatePhoneNumber = false;
			for(Contact contactServiceList : contacts )
			{
				if(contactServiceList.getContactId().equals(ID));
				{
					contactServiceList.setPhoneNumber(newPhoneNumber);
					updatePhoneNumber = true;
					break;
				}
			}
			return updatePhoneNumber;
		}
		
		// Use the same class from above to change the name of the last name of the contact 
		public boolean updateHomeAddress(String ID, String newHomeAddress)
		{
			boolean updateHomeAddress = false;
			for(Contact contactServiceList : contacts )
			{
				if(contactServiceList.getContactId().equals(ID));
				{
					contactServiceList.setHomeAddress(newHomeAddress);
					updateHomeAddress = true;
					break;
				}
			}
			return updateHomeAddress;
		}
		
		// print out the list, I used this to test my outputs to make sure it was acting as intended
		public void printContactList()
		{
			// loops through the contact list
			for(Contact contactServiceList : contacts )
			{
				// use the toString function in the contact class to print out the list of contacts.
				System.out.println(contactServiceList.toString());
			}
			
		}
			

}


