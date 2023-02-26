package appointment;
import java.util.Date;

public class Appointment {
	
	private String uniqueAppointmentID;
	private String description; 
	private Date appointmentDate;
	
	Date currentDate = new Date();
	
	public Appointment (String uniqueID, Date appointmentDate, String description)
	{
		if(uniqueID == null || uniqueID.length() > 10)
		{
			throw new IllegalArgumentException("Appointment ID must be less than 10 characters and must not be empty");
		}
		
		if(appointmentDate == null || appointmentDate.before(new Date()))
		{
			throw new IllegalArgumentException("Appointment date must not be empty and must not be in the past");
		}
		
		if(description == null || description.length() > 50)
		{
			throw new IllegalArgumentException("Appointment description must be less than 50 characters and must not be empty");
		}
		
		this.uniqueAppointmentID = uniqueID;
		this.appointmentDate = appointmentDate;
		this.description = description; 
	}
	
	public void setUniqueID(String ID)
	{
		this.uniqueAppointmentID = ID;
	}
	
	public String getUniqueID()
	{
		return uniqueAppointmentID;
	}
	
	public void setAppointmentDate(Date date)
	{
		this.appointmentDate = date;
	}
	
	public Date getAppointmentDate()
	{
		return appointmentDate;
	}
	
	public void setAppointmnetDescription(String description)
	{
		this.description = description; 
	}
	
	public String getDescription()
	{
		return description; 
	}
	
}
