package appointment;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Test;

class AppointmentServiceTest {
	Date currentDate = new Date(2025, Calendar.MAY, 1);

	// A test to check if adding appointments to appointment service will work
	@Test
	void testAddAppointment() {
		AppointmentService appiontmentTestService = new AppointmentService();
		Appointment testAppointment = new Appointment("App 1", currentDate, "Don't forget to buy some dog food");
		assertEquals(true, appiontmentTestService.addAppointment(testAppointment));
	}
	
	// A test to check if we are able to delete an appointment from the array by using the unique id
	@Test
	void testDeleteAppointment()
	{
		AppointmentService appiontmentTestService = new AppointmentService();
		Appointment testAppointment = new Appointment("App 1", currentDate, "Don't forget to buy some dog food");
		Appointment testAppointment2 = new Appointment("App 2", currentDate, "Don't forget to buy some cat food");
		Appointment testAppointment3 = new Appointment("App 3", currentDate, "Don't forget to buy some food");
		Appointment testAppointment4 = new Appointment("App 4", currentDate, "Don't forget to buy some grocery");
		
		appiontmentTestService.addAppointment(testAppointment);
		appiontmentTestService.addAppointment(testAppointment2);
		appiontmentTestService.addAppointment(testAppointment3);
		appiontmentTestService.addAppointment(testAppointment4);
		
		assertEquals(true, appiontmentTestService.deleteAppointment("App 2"));
		assertEquals(true, appiontmentTestService.deleteAppointment("App 3"));
		assertEquals(true, appiontmentTestService.deleteAppointment("App 4"));
	}

}
