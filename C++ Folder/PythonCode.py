# The libraries we will be calling inside this function. 
import re
import string
from pprint import pprint

# Takes the information from a file we then loop through the file to output onto the screen how many times the words in the file were counted. 
def CountedWords():
  
    # uses i to loop in the range from 1-11 which will be 1-10 and then prints out the multiplaction table
    open_file = open("Input_File.txt", "r")

    #open_file = open(open_file, "r")

    # How we will be storing the information inside a dictionary function 
    counts = dict()

    # Loops through the file to see how many times the word is counted and then adds it to the counts dict
    for line in open_file:
        # Splits the words into a list where they are seperated
        words = line.split()

        # Loops through and counts the number of times a word is shown inside the file
        for word in words: 
            if word in counts:
                counts[word] += 1
            else:
                counts[word] = 1

    # prints the information in a formated file in which the user is able to view in the console
    pprint(counts)

    # closes the file 
    open_file.close()


        

# Takes a input from the user and searches the file for the amount of times that input was in the file
def Single_Item_Frequency(item_name):
    
    # opens the file that we will be reading from
    open_file = open("Input_File.txt", "r")

    # How we will store the amount of times the word will be counted 
    word_count = 0

    #open_file = open(open_file, "r")

    # Reads the information from the file 
    file_info = open_file.read()

    # Splites the words in the file
    item_list = file_info.split()

    # Counts the number of times the specified word was counted
    item_count = item_list.count(item_name)

    # Word count will equal the amount of times the word was counted
    word_count = item_count

    # Saw the requirement that the pritn statement must be inside the C++ code so I removed the code below to meet that requierment
    #return print(item_name, 'was bought',  item_count , 'times today.')

    # returns the number of times the word was counted so that we can print it in our C++ side of the code
    return word_count

    # Closes the file
    open_file.close()
    

# Writes the information from our file into a dat file that we will be using to store the information
def Histogram():
    # Opens the file that we will be reading from 
    open_file = open("Input_File.txt", "r")
    # Opens the file that we will be writting at
    item_freq = open("frequency.dat", "w")

    # how we will be storing the data inside a dictionary
    counts = dict()

    # Loops thourgh the file and counts how many times the word is counted
    for line in open_file:
        # Splits the words into lists making it easier to count the word frequency
        words = line.split()

        # Counts the words and adds them to the dictionary function
        for word in words: 
            if word in counts:
                counts[word] += 1
            else:
                counts[word] = 1

    # How we will loop thorugh the information and write it to the file
    # Used this tutorial to figure out on how to do this https://www.geeksforgeeks.org/write-a-dictionary-to-a-file-in-python/
    for key in list (counts.keys()):
        item_freq.write(str(key.capitalize()) + " " + str(counts[key]) + "\n")

    # Closes both files that we had open
    open_file.close()
    item_freq.close()
