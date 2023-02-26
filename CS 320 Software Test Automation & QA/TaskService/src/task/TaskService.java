////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Name: Ahmad Omar
//    Date: 1/28/2023
//    Class: CS 320 Software Test Automation & QA
//    Professor: Kalysa Wilson
//    Description: Creating a task service class in which we are able to add tasks to our array, 
//    be able to delete the tasks by the unique id, and being able to update the task name and 
//	  description of the task. 	
//
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////


package task;

import java.util.ArrayList;

public class TaskService {
	
	ArrayList<Task> task = new ArrayList<>();

	// How we will be able to add a task to our array list
	public boolean addTask(Task addTask)
	{
		// set a boolean to false to use when needing to change our expression for the correct outcome
		boolean taskListCheck = false;
		// loop through the task list 
		// Ran into this way to loop through in Java when I was checking on how to do this and decided to try it out.
		// learned about this in this slackoverflow thread: https://stackoverflow.com/questions/5851025/why-are-there-two-different-kinds-of-for-loops-in-java
		for(Task taskServiceList : task)
		{
			// if the task id is equal to the task id it will mean that there is something in there
			if(taskServiceList.getTaskUniqueID().equals(addTask.getTaskUniqueID()))
			{
				// set boolean to true 
				taskListCheck = true; 
				// break the loop 
				break;
			}
		}
		
		// If there is no task in the list check
		if(!taskListCheck)
		{
			// add task to the task array
			task.add(addTask);
			// return true which ends the add method
			return true;
		}
		else 
		{
			return false; 
		}
			
	}
	
	// how we will delete from our array by looking for an ID string
	public boolean deleteTask(String ID)
	{
		// loop through the task list 
		// Ran into this way to loop through in Java when I was checking on how to do this and decided to try it out.
		// learned about this in this slackoverflow thread: https://stackoverflow.com/questions/5851025/why-are-there-two-different-kinds-of-for-loops-in-java
		for(Task taskServiceList : task)
		{
			// if we find the task id that matches 
			if(taskServiceList.getTaskUniqueID().equals(ID))
			{
				// we will remove the task from our array
				task.remove(taskServiceList);
				return true;
			}
		}
		
		return false;
	}
	
	// Use the same class from above to change the name of the last name of the task 
	public boolean updateTaskName(String ID, String newTaskName)
	{
		boolean updateTaskName = false;
		for(Task taskServiceList : task )
		{
			if(taskServiceList.getTaskUniqueID().equals(ID));
			{
				taskServiceList.setTaskName(newTaskName);
				updateTaskName = true;
				break;
			}
		}
		return updateTaskName;
	}
	
	// Use the same class from above to change the name of the last name of the task 
	public boolean updateTaskDescription(String ID, String newTaskDescription)
	{
		boolean updateTaskName = false;
		for(Task taskServiceList : task )
		{
			if(taskServiceList.getTaskUniqueID().equals(ID));
			{
				taskServiceList.setTaskName(newTaskDescription);
				updateTaskName = true;
				break;
			}
		}
		return updateTaskName;
	}
	
}
