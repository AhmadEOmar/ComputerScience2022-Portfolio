package appointment;

import java.util.ArrayList;

public class AppointmentService {

	ArrayList<Appointment> appointmnet = new ArrayList<>();
	
	// How we will be able to add a task to our array list
		public boolean addAppointment(Appointment addAppointment)
		{
			// set a boolean to false to use when needing to change our expression for the correct outcome
			boolean appointmentListCheck = false;
			// loop through the task list 
			// Ran into this way to loop through in Java when I was checking on how to do this and decided to try it out.
			// learned about this in this slackoverflow thread: https://stackoverflow.com/questions/5851025/why-are-there-two-different-kinds-of-for-loops-in-java
			for(Appointment AppointmentServiceList : appointmnet)
			{
				// if the task id is equal to the task id it will mean that there is something in there
				if(AppointmentServiceList.getUniqueID().equals(addAppointment.getUniqueID()))
				{
					// set boolean to true 
					appointmentListCheck = true; 
					// break the loop 
					break;
				}
			}
			
			// If there is no task in the list check
			if(!appointmentListCheck)
			{
				// add task to the task array
				appointmnet.add(addAppointment);
				// return true which ends the add method
				return true;
			}
			else 
			{
				return false; 
			}
				
		}
		
		
		// how we will delete from our array by looking for an ID string
		public boolean deleteAppointment(String ID)
		{
			// loop through the task list 
			// Ran into this way to loop through in Java when I was checking on how to do this and decided to try it out.
			// learned about this in this slackoverflow thread: https://stackoverflow.com/questions/5851025/why-are-there-two-different-kinds-of-for-loops-in-java
			for(Appointment AppointmentServiceList : appointmnet)
			{
				// if we find the task id that matches 
				if(AppointmentServiceList.getUniqueID().equals(ID))
				{
					// we will remove the task from our array
					appointmnet.remove(AppointmentServiceList);
					return true;
				}
			}
			
			return false;
		}
}
