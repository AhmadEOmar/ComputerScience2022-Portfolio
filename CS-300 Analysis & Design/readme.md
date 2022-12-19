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
+ What was the problem you were solving in the projects for this course? <br/> <br/>
The problem we were trying to solve was how we can read data and manipulate that data in a fast and efficient manner where we calculate the speed of our program and the costs it takes to run it. We had the prompt of a college catalog needs to be read and we need to manipulate that data to showcase the course id, course name, and the prerequisites that those classes need, we then had to decide the best data source to handle this information and I choose vectors since that had a smaller memory cost compared to hash tables and binary search trees. <br/>

+ How did you approach the problem? Consider why data structures are important to understand.  <br/><br/>
I first approached this problem by creating pseudocode on what I needed my program to do in which I created pseudocode for vectors, hash tables, and binary search trees on how they will be able to manipulate that data we need to use, after that I create graphs which show the speed and cost for using each of these data structures which after looking at the tables I decided to go with vectors since they had the least cost making it a faster running program.  <br/> <br/> The importance of knowing which data structure to use is more apparent with much larger programs in our case we ran a program that didn't read too much data making anyone of the data solutions as a viable solution to use in our instance, but in the real world with vast data we need to make we are using the most efficient data structure due to the fact that using the wrong data structure will cause bloat in your software which will need to be addressed as the data gets bigger.

+ How did you overcome any roadblocks you encountered while going through the activities or project?  <br/><br/>
The road blocks I ran into was not much since I used our textbook and the coursework we did in the class to create the foundation of the program, after looking in things I did decide to use tokens for how we break down the data that we were given and since I had never used tokens before I did have to consult StackOverflow and any other websites that spoke about the topic to read about how to implement the token code. By using the resources that I had available to me such as StackOverflow and tutorial websites that show example codes is how I was able to solve any problems that I ran into when creating the program this helped me for future jobs since usually the problem you run into will be things you may have never learned about and learning how to scour the web and find the information I needed is a helpful skill to have. <br/>

+ How has your work on this project expanded your approach to designing software and developing programs?  <br/><br/>
The information I have learned in this class will follow me in any job that I take going forward by making me make sure to have pseudocode instead of coding right away, making sure that the data structures that I use are the most efficient ones that I need for the job, and learning how to breakdown anything I see into breakable chunks to make it a much more manageable project instead of something large and unreadable. <br/>

+ How has your work on this project evolved the way you write programs that are maintainable, readable, and adaptable?  <br/><br/>
Such as what I had answered above this class helped me to break down problems into smaller more manageable parts by using pseudocode to plan ahead and making sure I use the most suitable data structure, by breaking down the code into separate chunks I am able to reuse that code multiple times instead of using it once making the code more adaptable, and by writing more comments in my code and making documentation I also help future programmers that I work with to easily understand what my code will be doing. <br/>

