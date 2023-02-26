package appointment;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppointmentTest {
	
	Date currentDate = new Date(2025, Calendar.MAY, 1);
	Date pastDate = new Date(0);

	

	
	// Test to make sure that the appointment is able to read that each part of the code is setup correctly such as checking that the appointment unique ID, 
	// and appointment description are correct. 
	@Test
	void testAppointment() 
	{
		Appointment appointment = new Appointment("App 1", currentDate, "Test Description" );
		assertTrue(appointment.getUniqueID().equals("App 1"));
		assertTrue(appointment.getDescription().equals("Test Description"));
	}
	
	// Checking to see if the correct throw exception is thrown when appointment unique ID is longer than 10 digits
	@Test
	void testAppointmentIDToLong() 
	{
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Appointment("Appointment Test For Too Long Of A Unique ID", currentDate, "Test Appointment Description");
		});
	}
	
	// Checking to see if the correct throw exception is thrown when appointment unique ID is equal to null
	@Test
	void testAppointmentIDNull() 
	{
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Appointment(null, currentDate, "Test Appointment Description");
		});
	}
	
	// Checking to see if the correct throw exception is thrown when appointment date is in the past
	@Test
	void testAppointmentDateInThePast() 
	{
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Appointment("App Test", pastDate, "Test Appointment Description");
		});
	}
	
	// Checking to see if the correct throw exception is thrown when appointment date is set to null
	@Test
	void testAppointmentDateNull() 
	{
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Appointment("App Test", null, "Test Appointment Description");
		});
	}
	
	// Checking to see if the correct throw exception is thrown when appointment description is longer than 50 characters
	@Test
	void testAppointmentDescriptionToLong() 
	{
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Appointment("App Test", currentDate, "Test Appointment Description That is longer than 50 characters in which it will throw");
		});
	}
	
	// Checking to see if the correct throw exception is thrown when appointment description is set to null
	@Test
	void testAppointmentDescriptionNull() 
	{
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Appointment("App Test", currentDate, null);
		});
	}

}
