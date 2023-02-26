////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Name: Ahmad Omar
//    Date: 1/28/2023
//    Class: CS 320 Software Test Automation & QA
//    Professor: Kalysa Wilson
//    Description: How we will be testing if our task class is working as intended in which I test
//    if the tasks are able to be created correctly and added to our array. Testing if our delete task  
//	  function is working as intended in which we use our unique ID to delete the selected tasks. Finally
//	  we check if our update task function is working in which our task is updated by finding the unique ID
//	  and using that to update the name of the task and the description of the task. 
//
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package task;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TastTest {

	// Test to make sure that the task is able to read that each part of the code is setup correctly such as checking that the task unique ID, task name, task description are correct. 
	@Test
	void testTask() 
	{
		Task task = new Task("Task 1", "Task Name", "Test Task Description");
		assertTrue(task.getTaskUniqueID().equals("Task 1"));
		assertTrue(task.getTaskName().equals("Task Name"));
		assertTrue(task.getTaskDescription().equals("Test Task Description"));
	}
	
	// Checking to see if the correct throw exception is thrown when task unique ID is longer than 10 digits
	@Test
	void testTaskIDTooLong() 
	{
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Task("Task11111111", "Task Name", "Test Task Description");
		});
	}
	
	// Checking to see if the correct throw exception is thrown when task unique id is set to null
	@Test
	void testTaskIDNull() 
	{
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Task(null, "FName", "LName");
		});
	}
	
	// Checking to see if the correct throw exception is thrown when task name is longer than 20 digits
	@Test
	void testTaskNameTooLong() 
	{
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Task("Task 1", "Task Name 111111111111111", "Test Task Description");
		});
	}
	
	// Checking to see if the correct throw exception is thrown when task name is set to null
	@Test
	void testTaskNameNull() 
	{
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Task("Task 1", null, "LName");
		});
	}
	
	// Checking to see if the correct throw exception is thrown when task description is longer than 50 characters
	@Test
	void testTaskDescriptionToLong() 
	{
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Task("Task 1", "Task Name", "Testing Task Description will throw an execption when the task description is too long which has to be longer than 50 characters");
		});
	}
	
	// Checking to see if the correct throw exception is thrown when task description is set to null
	@Test
	void testTaskDescriptionNull() 
	{
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Task("Task 1", "Task Name", null);
		});
	}
}
