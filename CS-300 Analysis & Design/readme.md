# Table Of Content

- [Project One Run Time Analysis](#project-one-run-time-analysis)
    + [Vectors Run Time Analysis](#vectors-run-time-analysis)
    + [HashTables Run Time Analysis](#hashtables-run-time-analysis)
    + [Binary Search Tree Run Time Analysis](#binary-search-tree-run-time-analysis)
- [Project 2 Print Out In Alphanumeric Order](#project-2-print-out-in-alphanumeric-order)
- [Reflection](#reflection)



# Project One Run Time Analysis

### Vectors Run Time Analysis

| Vectors        | Line Cost           | # Times Executes  | Total Cost |
| ------------- |:-------------:| :-------------: | :-------------: |
| Create Vector      | 1 | 1 | 1 |
| Loop through each line in file  | 1 | N | N |
| Create course identifiers | 1 | N | N |
| While prerequisites exist  | 1 | N | N |
| Append prerequisites | 1 | N | N |
| Push back course items  | 1 | N | N |
| Total Cost |  |  | 5n+1 |
| Runtime |  |  | O(n) |


### HashTables Run Time Analysis

| HashTables       | Line Cost           | # Times Executes  | Total Cost |
| ------------- |:-------------:| :-------------: | :-------------: |
| Create HashTable      | 1 | 1 | 1 |
| Create insert key method  | 5 | N | 5N |
| Loop through each line in file  | 1 | N | N |
| Create course Identifiers  | 1 | N | N |
| While Prerequisites exist | 1 | N | N |
| Append Prerequisites  | 1 | N | N |
| Insert course items into HashTable | 1 | N | N |
| Total Cost |  |  | 10n+1 |
| Runtime |  |  | O(n) |


### Binary Search Tree Run Time Analysis

| Binary Search Tree       | Line Cost           | # Times Executes  | Total Cost |
| ------------- |:-------------:| :-------------: | :-------------: |
| Create BST      | 1 | 1 | 1 |
| Create Node and point to root  | 1 | 1 | 1 |
| If root is null add to root  | 1 | N | N |
| If there is no left node   | 1 | N | N |
|      This node becomes left | 1 | N | N |
| If Node is greater than root add to right   | 1 | N | N |
| If there is no right node | 1 | N | N |
|     This Node becomes right  | 1 | N | N |
| Loop through each line in the file  | 1 | N | N |
| Create vector course items  | 1 | N | N |
| While Prerequisites   | 1 | N | N |
| Append the prerequisites | 1 | N | N |
| Insert the course items  | 1 | N | N |
| Total Cost |  |  | 12n+1 |
| Runtime |  |  | O(n) |

# Project 2 Print Out In Alphanumeric Order

```c++
void printCourse(Course course)
{
    // set courseNumber to our courseNumber just makes it easier to use it instead of 
    // having to type out course.courseNumber every time
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
```

# Reflection
+ What was the problem you were solving in the projects for this course? <br/>
[Anaswer goes here] <br/>

+ How did you approach the problem? Consider why data structures are important to understand.  <br/>
[Anaswer goes here] <br/>

+ How did you overcome any roadblocks you encountered while going through the activities or project?  <br/>
[Anaswer goes here] <br/>

+ How has your work on this project expanded your approach to designing software and developing programs?  <br/>
[Anaswer goes here] <br/>

+ How has your work on this project evolved the way you write programs that are maintainable, readable, and adaptable?  <br/>
[Anaswer goes here] <br/>

