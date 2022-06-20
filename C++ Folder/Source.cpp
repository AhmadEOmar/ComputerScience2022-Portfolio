/***************************************************************************************************
*	Author: Ahmad Omar
*	Date: 04/18/2022
*	Program: This program reads a file and then outputs to what the user want's by the selection 
*	they choose inside the menu
* 
*****************************************************************************************************/


#include <Python.h>
#include <iostream>
#include <Windows.h>
#include <fstream>
#include <cmath>
#include <string>


using namespace std;


/*
Description:
	To call this function, simply pass the function name in Python that you wish to call.
Example:
	callProcedure("printsomething");
Output:
	Python will print on the screen: Hello from python!
Return:
	None
*/


void CallProcedure(string pName)
{
	char* procname = new char[pName.length() + 1];
	std::strcpy(procname, pName.c_str());

	Py_Initialize();
	PyObject* my_module = PyImport_ImportModule("PythonCode");
	PyErr_Print();
	PyObject* my_function = PyObject_GetAttrString(my_module, procname);
	PyObject* my_result = PyObject_CallObject(my_function, NULL);
	Py_Finalize();

	delete[] procname;
}


/*
Description:
	To call this function, pass the name of the Python functino you wish to call and the string parameter you want to send
Example:
	int x = callIntFunc("PrintMe","Test");
Output:
	Python will print on the screen:
		You sent me: Test
Return:
	100 is returned to the C++
*/
int callIntFunc(string proc, string param)
{
	char* procname = new char[proc.length() + 1];
	std::strcpy(procname, proc.c_str());

	char* paramval = new char[param.length() + 1];
	std::strcpy(paramval, param.c_str());


	PyObject* pName, * pModule, * pDict, * pFunc, * pValue = nullptr, * presult = nullptr;
	// Initialize the Python Interpreter
	Py_Initialize();
	// Build the name object
	pName = PyUnicode_FromString((char*)"PythonCode");
	// Load the module object
	pModule = PyImport_Import(pName);
	// pDict is a borrowed reference 
	pDict = PyModule_GetDict(pModule);
	// pFunc is also a borrowed reference 
	pFunc = PyDict_GetItemString(pDict, procname);
	if (PyCallable_Check(pFunc))
	{
		pValue = Py_BuildValue("(z)", paramval);
		PyErr_Print();
		presult = PyObject_CallObject(pFunc, pValue);
		PyErr_Print();
	}
	else
	{
		PyErr_Print();
	}
	//printf("Result is %d\n", _PyLong_AsInt(presult));
	Py_DECREF(pValue);
	// Clean up
	Py_DECREF(pModule);
	Py_DECREF(pName);
	// Finish the Python Interpreter
	Py_Finalize();

	// clean 
	delete[] procname;
	delete[] paramval;


	return _PyLong_AsInt(presult);
}

/*
Description:
	To call this function, pass the name of the Python functino you wish to call and the string parameter you want to send
Example:
	int x = callIntFunc("doublevalue",5);
Return:
	25 is returned to the C++
*/
int callIntFunc(string proc, int param)
{
	char* procname = new char[proc.length() + 1];
	std::strcpy(procname, proc.c_str());

	PyObject* pName, * pModule, * pDict, * pFunc, * pValue = nullptr, * presult = nullptr;
	// Initialize the Python Interpreter
	Py_Initialize();
	// Build the name object
	pName = PyUnicode_FromString((char*)"PythonCode");
	// Load the module object
	pModule = PyImport_Import(pName);
	// pDict is a borrowed reference 
	pDict = PyModule_GetDict(pModule);
	// pFunc is also a borrowed reference 
	pFunc = PyDict_GetItemString(pDict, procname);
	if (PyCallable_Check(pFunc))
	{
		pValue = Py_BuildValue("(i)", param);
		PyErr_Print();
		presult = PyObject_CallObject(pFunc, pValue);
		PyErr_Print();
	}
	else
	{
		PyErr_Print();
	}
	//printf("Result is %d\n", _PyLong_AsInt(presult));
	Py_DECREF(pValue);
	// Clean up
	Py_DECREF(pModule);
	Py_DECREF(pName);
	// Finish the Python Interpreter
	Py_Finalize();

	// clean 
	delete[] procname;

	return _PyLong_AsInt(presult);
}



	// Followed tutorial to make the first letter of a word uppercase https://www.techiedelight.com/convert-first-letter-of-a-string-to-uppercase-in-cpp/
	// Followed this post to make the rest of the word lowercase https://stackoverflow.com/questions/20018961/capitalize-the-first-letter-lower-case-the-rest
	void toUpper(string& str)
	{
		if (str.length() == 0)
		{
			return;
		}

		// Makes the first letter of the word upper case. 
		str[0] = std::toupper(str[0]);

		// For loop that will make the rest of the word input into lower case.
		for (int i = 1; i < str.length(); i++)
		{
			str[i] = std::tolower(str[i]);
		}
	}




	// Function to display the options
	void displayOptions()
	{
		// Shows the options for the user to pick from 
		cout << "1: Item's Purchased & Amount Purchased" << endl;
		cout << "2: Single Items Purchased & Amount Purchased" << endl;
		cout << "3: Histogram Of Items" << endl;
		cout << "4: Exit" << endl;
	}

	// Takes input from user and outputs the right informatin 
	void OptionChoice()
	{
		// The variables we will be using inside our program
		int choice = 0;
		int item_count = 0;
		string word_search;
		ifstream input_file_information;
		string item_name;
		int item_freq;



		// While loop that will run as long as the choice is not 3
		while (choice != 4)
		{
			// Display the options everytime the program gets run again in the while loop 
			displayOptions();
			// Takes choice from user
			cout << "Enter choice here: ";
			cin >> choice;
			
			/*while (!(cin >> choice))
			{
				cout << "ERROR: A number must be entered.";
				cin.clear();
				cin.ignore(132, '\n');
				cout << endl;
			}*/

			
			// If choice is 1 it will CallProcedure and print out the frequency of how many of each item was bought at the store
			if (choice == 1)
			{
				// Prints out the frequency each time each item was purchased
				cout << "The Frequency of each items purchased is: " << endl;
				// Uses CallProcedure to print out the item frequency that was counted in the python code
				CallProcedure("CountedWords");
				cout << endl;
			}
			// If choice is equal to 2 we will ask an input from the user and search how many of that item was bought and print it out to the user
			else if (choice == 2)
			{
				// Ask the user for an input 
				cout << "Enter item to search: ";
				cin >> word_search;
				// Will use the toUpper function to make the first letter capitalized and the following letters lower case to match our file
				toUpper(word_search);
				// Makes word count eqaul to how many of the item was bought
				item_count = callIntFunc("Single_Item_Frequency", word_search);
				// Prints out the word that was searched and how many times it was bought
				cout << word_search << " was bought " << item_count << " times today." << endl;
				cout << endl;

			}
			else if (choice == 3)
			{
				// Makes the Historgram python function work to get the information inside the dat file
				CallProcedure("Histogram");

				// Opens the frequency.dat file so that we can read the information 
				input_file_information.open("frequency.dat");
				// Assigns the strings inside the file to item_name
				input_file_information >> item_name;
				// Assigns the int inside the file to item_freq
				input_file_information >> item_freq;

				// The while loop will continue until it is at the end of the file
				while (!input_file_information.eof())
				{
					// Prints out the item name 
					cout << item_name << " : ";
					// Loops thorugh the item frequency and adds a * for the amount 
					// Used this stackoverflow post to write this section in which I modified the code to match what I needed to get done
					// https://stackoverflow.com/questions/44838472/c-making-a-histogram-with-arrays-pointers-for-loops-im-right-there-im-p
					for (int i = 0; i < item_freq; i++)
					{
						// prints out the * for the amount of times the item frequency shows
						cout << "*";
					}
					// ends line so that it can continue onto the next item name and item frequency
					cout << endl;
					// Gathers the information of the item_name and item_freq from the file input so that we can continue to run the while loop 
					input_file_information >> item_name;
					input_file_information >> item_freq;
				}

				cout << endl;
			}
			// Checks if the number for the choice is greater than 4 it will print out a error and the user will have to input another option for the choice
			else if (choice > 4)
			{
				cout << "Invalid choice please try again!" << endl;
				cout << endl;
			}
			// if the choice is equal to 4 the program will say they exited the program and break the loop and quit the program
			else
			{
				cout << "You have exit the program." << endl;
				break;
			}
		}

	}




int main()
{
	// Calls the function we will be using
	OptionChoice();
	
}
