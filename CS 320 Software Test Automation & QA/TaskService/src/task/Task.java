////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Name: Ahmad Omar
//    Date: 1/28/2023
//    Class: CS 320 Software Test Automation & QA
//    Professor: Kalysa Wilson
//    Description: Creating a task class in which we are able to set our task with a unique id, task name, 
//    and task description. We then are able to get our information to use in other classes. 
//
//
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////


package task;

public class Task {

	// Setting up parameters to use in our contact class
	private String taskUniqueID;
	private String taskName;
	private String taskDescription; 
	
	// Set what the Contact class will have followed the tutorial in our class to make sure the throw exception are correct.
	public Task(String uniqueID, String name, String description)
	{
		if (uniqueID == null || uniqueID.length() > 10)
		{
				throw new IllegalArgumentException("Task ID must be less than 10 characters and must not be empty");
		}
		
		if (name == null || name.length() > 20)
		{
				throw new IllegalArgumentException("Task name must be less than 20 characters and must not be empty");
		}
		
		if (description == null || description.length() > 50)
		{
				throw new IllegalArgumentException("Description of task must be less than 50 characters and must not be empty");
		}
		
		// set our strings to the strings in this class
		this.taskUniqueID = uniqueID;
		this.taskName = name; 
		this.taskDescription = description; 
	}
	
	// Creating the set classes in which we will be checking for the parameters we were given down below
	public void setTaskUniqueID(String uniqueID)
	{
		this.taskUniqueID = uniqueID;
	}
	
	// Sets unique id class to our task unique ID string 
	public String getTaskUniqueID()
	{
		return taskUniqueID;
	}
	
	// Creating the set classes in which we will be checking for the parameters we were given down below
	public void setTaskName(String name)
	{
		this.taskName = name;
	}
	
	// Sets task name class to our task name string information
	public String getTaskName()
	{
		return taskName;
	}
	
	// Creating the set classes in which we will be checking for the parameters we were given down below
	public void setTaskDescription(String description)
	{
		this.taskDescription = description; 
	}
	
	// Sets task description class to our description string information
	public String getTaskDescription()
	{
		return taskDescription; 
	}
	
	// Gives us the ability to print out the information to test 
	public String toString()
	{
		return taskUniqueID + " " + taskName + " " + taskDescription;
	}

}
