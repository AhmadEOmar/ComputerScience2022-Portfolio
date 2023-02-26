////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Name: Ahmad Omar
//    Date: 2/12/2023
//    Class: CS 320 Software Test Automation & QA
//    Professor: Kalysa Wilson
//    Description: How we will be testing if our task service is working as intended in which I test
//    if the tasks are able to be created correctly and added to our array. Testing if our delete task  
//	  function is working as intended in which we use our unique ID to delete the selected tasks. Finally
//	  we check if our update task function is working in which our task is updated by finding the unique ID
//	  and using that to update the name of the task and the description of the task. 
//
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package task;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TaskServiceTest {

	// A test to check if adding tasks to task service will work
	@Test
	void testAddTask() {
		TaskService taskTestService = new TaskService();
		Task testTask = new Task("Task 1", "Buy Dog Food", "Don't forget to buy some dog food");
		assertEquals(true, taskTestService.addTask(testTask));
	}
	
	// A test to check if after adding a task we are able to delete it from our array b by using the unique ID as the identifier 
	@Test
	void testDeleteTask() {
		TaskService taskTestService = new TaskService();
		Task testTask1 = new Task("Task 1", "Buy Dog Food", "Don't forget to buy some dog food");
		Task testTask2 = new Task("Task 2", "Meeting Today", "Don't forget you have a meeting at 1PM");
		Task testTask3 = new Task("Task 3", "Buy Dad BDay Gift", "Dad's birthday is on 1/28/2023 buy him a gift");
		Task testTask4 = new Task("Task 4", "test task name", "Test task description of what I need to do");
		
		taskTestService.addTask(testTask1);
		taskTestService.addTask(testTask2);
		taskTestService.addTask(testTask3);
		taskTestService.addTask(testTask4);
		
		assertEquals(true, taskTestService.deleteTask("Task 2"));
		assertEquals(true, taskTestService.deleteTask("Task 3"));
		assertEquals(true, taskTestService.deleteTask("Task 4"));
	}
	
	// A check to make sure we are able to update the task name and description and checking if the information updated
	@Test
	void testUpdateTask() {
		TaskService taskTestService = new TaskService();
		Task testTask = new Task("Task 1", "Buy Dog Food", "Don't forget to buy some dog food");
		
		taskTestService.addTask(testTask);
		
		assertEquals(true, taskTestService.updateTaskName("Task 1", "Buy Cat Food"));
		assertEquals(true, taskTestService.updateTaskDescription("Task 1", "Don't forget to buy some cat food"));

	}

}
