//==========================================================================================
// Name        : Project2.cpp
// Author      : Ahmad Omar
// Version     : 1.0
// Copyright   : Copyright © 2017 SNHU COCE
// Description : Project 2 in C++, we will be reading a text file and print the information
//==========================================================================================

#include <iostream>
#include <algorithm>
#include <fstream>
#include <vector>
#include <string>
#include <iomanip>

using namespace std;

//============================================================================
// Global definitions visible to all methods and classes
//============================================================================

struct Course
{
	string courseNumber;
	string courseName;
	vector<string> prerequsites;

};

// Went with using Tokenizing a string in C++ since we already have a string and since it is seperated by a comma 
// Used https://www.geeksforgeeks.org/tokenizing-a-string-cpp/ to find out more about it and figure out how to implement it
// Used https://stackoverflow.com/questions/14265581/parse-split-a-string-in-c-using-string-delimiter-standard-c this thread to figure out on how to implement it in my case with a delimiter
vector<string> token(string s, string del = " ")
{
    // Vector of string to save tokens
    vector <string> token;

    // Where we will start 
    int start = 0;

    // Where we will end and seperate
    int end = s.find(del);

    // While not at the end of the file 
    while (end != -1)
    {     
        token.push_back(s.substr(start, end - start));
        start = end + del.size();
        end = s.find(del, start);
    }

    token.push_back(s.substr(start, end - start));
    return token;

}

// Loading in the information into our Course vector by reading the text file 
// Used https://www.geeksforgeeks.org/file-handling-c-classes/ to understand on how to read the information 
vector<Course> LoadDataStructure()
{
    // Using ifstream to access the text file within our project
    // Creation of ifstream class object to read the file
    ifstream fin;

    // where we specify the file and open it
    fin.open("ABCU.text", ios::in);

    // Where we will be storing the information from the files
    vector<Course> courses;


    string line;


    // Will go to the end of the file
    while (getline(fin, line))
    {
        // will break when it reaches the end of the file 
        if (line == "-1")
        {
            break;
        }

        
        Course course;

        // creating vector tokenInfo which uses the token function to look by line and find the delimiter of a comma
        vector<string> tokenInfo = token(line, ",");

        // Setting our courseNumber to be the first spot of the data 
        course.courseNumber = tokenInfo[0];

        // Setting our courseName as the second spot 
        course.courseName = tokenInfo[1];

        // loops through and adds any prerequisites if they exsist
        for (int i = 2; i < tokenInfo.size(); i++)
        {
            course.prerequsites.push_back(tokenInfo[i]);
        }

        // pushes back information into course vector
        courses.push_back(course);
    }

    // closes the file 
    fin.close();

    // return the courses
    return courses;

}


void printCourse(Course course)
{
    // set courseNumber to our courseNumber just makes it easier to use it instead of having to type out course.courseNumber every time
    string courseNumber = course.courseNumber;

    // set courseName to our courseName just makes it easier to use it instead of having to type out course.courseName every time
    string courseName = course.courseName;

    // create a vector to store any prerequsities that appear 
    vector<string> prerequisites = course.prerequsites;

    // Print out our information after getting formated
    cout << courseNumber << ", " << courseName << endl;
    cout << "Prerequisites: ";

    // Goes through the prereq vector to print them out if they exist
    for (int i = 0; i < prerequisites.size(); i++)
    {
        cout << prerequisites[i] << " ";
    }

    // creating space between each display of information
    cout << endl << endl;
}

void printCourseScheudle(Course course)
{
    // set courseNumber to our courseNumber just makes it easier to use it instead of having to type out course.courseNumber every time
    string courseNumber = course.courseNumber;

    // set courseName to our courseName just makes it easier to use it instead of having to type out course.courseName every time
    string courseName = course.courseName;

    // Print out our information after getting formated
    cout << courseNumber << ", " << courseName << endl;

}

// Print our sorted information by using bubble sort
// Used https://stackoverflow.com/questions/30963204/c-vector-bubble-sort thread to help get this in place for the project
void printCourseList(vector<Course> courses)
{
    int courseSize = courses.size();

    // Using bubble sort to sort the information
    //comparisons will be done n times
    for (int i = 0; i < courseSize - 1; i++)
    {
        //compare elemet to the next element, and swap if condition is true
        for (int j = 0; j < courseSize - i - 1; j++)
        {
            // checks course numbers and swaps
            if (courses[j].courseNumber > courses[j + 1].courseNumber)
            {
                // swapping happens here
                swap(courses[j + 1], courses[j]);
            }
        }
    }

    // prints out the information by looping through the data and using the printCourse function
    for (int i = 0; i < courseSize; i++)
    {
        printCourse(courses[i]);
    }
}


// Print our sorted information by using bubble sort
// Used https://stackoverflow.com/questions/30963204/c-vector-bubble-sort thread to help get this in place for the project
void printCourseScheduleList(vector<Course> courses)
{
    int courseSize = courses.size();

    // Using bubble sort to sort the information
    //comparisons will be done n times
    for (int i = 0; i < courseSize - 1; i++)
    {
        //compare elemet to the next element, and swap if condition is true
        for (int j = 0; j < courseSize - i - 1; j++)
        {
            // checks course numbers and swaps
            if (courses[j].courseNumber > courses[j + 1].courseNumber)
            {
                // swapping happens here
                swap(courses[j + 1], courses[j]);
            }
        }
    }

    // prints out the information by looping through the data and using the printCourseSchedule function
    for (int i = 0; i < courseSize; i++)
    {
        printCourseScheudle(courses[i]);
    }

    cout << endl;
}

void courseSelection(vector<Course> courses)
{
    int courseSize = courses.size();
    string courseNumber;


    // Prompt user to enter course number
    cout << "Enter Course Number: EX: CSCI350 " << endl;
    cout << "Course Number: ";

    // Takes user input
    cin >> courseNumber;

    cout << endl;

    // Transform string to uppercase forcing us to match courseNumber regardless of user input
    transform(courseNumber.begin(), courseNumber.end(), courseNumber.begin(), ::toupper);

    // loop through vector where information is stored
    for (int i = 0; i < courseSize; i++)
    {
        // if the course number matches it will print out the courses
        if (courses[i].courseNumber == courseNumber)
        {
            // uses printCourse function to print out information that is found
            printCourse(courses[i]);

            break;
        }

        // causes infinite loop to check for incorrect input
        // if user inputs wrong code first it will work but if correct course number is put in will cause the infinite loop due to the fact it is looking for the incorrect number
        /*if (courses[i].courseNumber != courseNumber)
        {
            cout << "Course not found, please verify course number and try again." << endl << endl;
            break;
        }*/

    }

}

// I was creating a user input validation but I ran out of time to fully finish it. 
// I went with a different choice for user validation
/*int getChoice()
{
    int choice = 0;

    cout << "Welcome to the course planner." << endl << endl;

    cout << "Menu:" << endl;
    cout << "  1. Load Data Structure" << endl;
    cout << "  2. Print Course List" << endl;
    cout << "  3. Print Course" << endl;
    cout << "  4. Exit" << endl;
    cout << "Enter choice: ";
    cin >> setw(1) >> choice;

    while (!cin.good())
    {
        cout << "Please enter one choice for input at once" << endl;

        cin.clear();
        cin.ignore(INT_MAX, '\n');

        cout << "Enter choice: ";
        cin >> setw(1) >> choice;
    }

    return choice; 
}*/

// user validation used https://www.learncpp.com/cpp-tutorial/stdcin-and-handling-invalid-input/ to implement it
void ignoreLine()
{
    cin.ignore(numeric_limits<streamsize>::max(), '\n');
}

int main(int argc, char* argv[])
{
    vector<Course> courses;
    int choice = 0;
    

    cout << "Welcome to the course planner." << endl << endl;
    while (choice != 4) {
        cout << "Menu:" << endl;
        cout << "  1. Load Data Structure" << endl;
        cout << "  2. Print Course List" << endl;
        cout << "  3. Print Course" << endl;
        cout << "  4. Exit" << endl;
        cout << "Enter choice: ";
        cin >> choice;

        switch (choice) {

        case 1:
            courses = LoadDataStructure();
            break;

        case 2:
            cout << "Here is a sample schedule: " << endl << endl;
            printCourseScheduleList(courses);
            break;


        case 3:

            courseSelection(courses);
            break;

        }

        if (choice > 4)
        {
            cout << choice << " is not a vaild option." << endl;
        }


        // user validation used https://www.learncpp.com/cpp-tutorial/stdcin-and-handling-invalid-input/ to implement it
        if (!cin)
        {
            cin.clear();
            cout << "Please input only the number choices given above." << endl << endl;
            ignoreLine();
        }
        else
        {
            ignoreLine();
        }
        


    }

    cout << "Thank you for using the course planner!" << endl;

    return 0;
}

