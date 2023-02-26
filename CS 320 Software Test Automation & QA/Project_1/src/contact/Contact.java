////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Name: Ahmad Omar
// Date: 2/12/2023
// Class: CS 320 Software Test Automation & QA
// Professor: Kalysa Wilson
// Description: Creating a contact class in which we are able to set our contact information and get it
// while also having throw exceptions to test our software and make sure it's working as intended.
//
//
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package contact;


public class Contact {

// Setting up parameters to use in our contact class
private String contactUniqueId;
private String contactFirstName;
private	String contactLastName;
private String contactPhoneNumber;
private String contactHomeAddress;

/*String testInfo = "TEST";
String testNumber = "9999999999";*/

// Initialize class so they are not equal to null with test information
/*
public Contact(String string, )
{
this.contactUniqueId = testInfo;
this.contactFirstName = testInfo; 
this.contactLastName = testInfo;
this.contactPhoneNumber = testNumber;
this.contactHomeAddress = testInfo;
}
*/

// Set what the Contact class will have followed the tutorial in our class to make sure the throw exception are correct.
public Contact(String uniqueID, String firstName, String lastName, String phoneNumber, String homeAddress)
{
if (uniqueID == null ||  uniqueID.length() > 10)
{
throw new IllegalArgumentException("ID must be less than 10 characters and must not be empty");
}

if (firstName == null || firstName.length() > 10)
{
throw new IllegalArgumentException("First name must be less than 10 characters and must not be empty");
}

if (lastName == null  || lastName.length() > 10)
{
throw new IllegalArgumentException("Last name must be less than 10 characters and must not be empty");
}

if (phoneNumber == null || phoneNumber.length() > 10 )
{
throw new IllegalArgumentException("Phone number must be less than 10 characters and not empty");
}

if (homeAddress == null  || homeAddress.length() > 30)
{
throw new IllegalArgumentException("Home address must be less than 30 characters and not empty");
}

// set our strings to the strings in this class
this.contactUniqueId = uniqueID;
this.contactFirstName = firstName;
this.contactLastName = lastName;
this.contactPhoneNumber = phoneNumber;
this.contactHomeAddress = homeAddress;


}


// Creating the set classes in which we will be checking for the parameters we were given down below
// Java is a bit rusty but I thought this is how we do the throw exceptions, I ran out of time so I will keep this here since everything works for now.
public void setUniqueID(String uniqueID)
{
if(uniqueID.length() <= 10 && uniqueID != null)
{
this.contactUniqueId = uniqueID;
}
else if (uniqueID.length() > 10 || uniqueID == null)
{
throw new IllegalArgumentException("ID must be less than 10 characters and must not be empty");
}
}


// Sets first name class to our contact information
public void setFirstName(String contactFirstName)
{
// Makes sure that the parameters are correct before being able to set the class 
if(contactFirstName.length() <= 10 && contactFirstName != null)
{
this.contactFirstName = contactFirstName;
}
else if (contactFirstName.length() > 10 || contactFirstName == null)
{
throw new IllegalArgumentException("First name must be less than 10 characters and must not be empty");
}

}

// Sets last name class to our contact information
public void setLastName(String contactLastName)
{
// Makes sure that the parameters are correct before being able to set the class 
if(contactLastName.length() <= 10 && contactLastName != null)
{
this.contactLastName = contactLastName;
}
else if (contactLastName.length() > 10 || contactLastName == null)
{
throw new IllegalArgumentException("Last name must be less than 10 characters and must not be empty");
}
}

// Sets phone number to our contact information
public void setPhoneNumber(String contactPhoneNumber)
{
// Makes sure that the parameters are correct before being able to set the class 
if(contactPhoneNumber.length() == 10 && contactPhoneNumber != null)
{
this.contactPhoneNumber = contactPhoneNumber;
}
else if (contactPhoneNumber.length() > 10 || contactPhoneNumber == null)
{
throw new IllegalArgumentException("Phone number must be less than 10 characters and not empty");
}
}

// Sets home address to the correct contact information
public void setHomeAddress(String contactHomeAddress)
{
// Makes sure that the parameters are correct before being able to set the class 
if(contactHomeAddress.length() <= 30 && contactHomeAddress != null)
{
this.contactHomeAddress = contactHomeAddress;
}
else if (contactHomeAddress.length() > 30 || contactHomeAddress == null)
{
throw new IllegalArgumentException("Home address must be less than 30 characters and not empty");
}
}


// Creating the get classes in which we retrieve the information

public String getContactId()
{
return contactUniqueId;
}

public String getFirstName()
{
return contactFirstName;
}



public String getLastName()
{
return contactLastName;
}


public String getPhoneNumber()
{
return contactPhoneNumber;
}


public String getHomeAddress()
{
return contactHomeAddress;
}


// Gives us the ability to print out the information to test 
public String toString()
{
return contactUniqueId + " " + contactFirstName + " " + contactLastName + " " + contactPhoneNumber + " " + contactHomeAddress;
}


}
