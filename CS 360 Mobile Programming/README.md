# Read me file for CS 360 Mobile Architect & Programming 
+ This is the read me file for my portfolio coursework in CS 360 where we were tasked to create an Android Application using Android Studio with Java and SQLite for the database.

# Briefly summarize the requirements and goals of the app you developed. What user needs was this app designed to address?
+ The application that I selected was to create an inventory management application in which the user is first able to login or create an account and then they should be able to add, edit, and delete items from the inventory application that we created, and if an item reaches zero it should send a text notification to the user informing them they ran out of that item.
+ When the user tries to log into the application, we should check to ensure that they are an actual user and to ensure that they have input information into the username and password field.
+ When the user tries to create an account, we want to ensure they can create a unique username and if that username is used already to let them know that username exists and if they used it to sign in with that existing username, we also ensure that the user has input information in all required fields.

# Reflection
+ This was an interesting final project for the class since I had not used Java or Android Studio in a while so it was a nice refresher course on the subject but if I go back to this project there are a few things I would Like to change since I had to create this project and get everything working within 2 weeks I'm honestly proud of what I accomplished within 2 weeks to get this application running and working but it is indeed more of a proof of concept than anything else.
1. I would fix up the UI since it looks unprofessional and bad in areas
2. I would fix the connection to the user id to items since the current implementation the user id can be anything when it should automatically be attached to the item on creation and increments up by 1. By doing this I can ensure everything is going down the list in an incremented manner as it increases.
3. I would fix the create user setup since I forgot to have it check to make sure that an email is in there instead of any type of input such as Test which would work and go to the database.

   



# Sign In Page
+ The user is prompted to sign in and if they input the correct information that matches the database, they will move onto the inventory page.
+ ![Test](https://github.com/AhmadEOmar/ComputerScience2022-Portfolio/assets/31226496/aba8837c-41bc-443c-bede-0381608da74b)


# Create Account
+ If the user is new to the inventory software, they can create an account by clicking on the create an account text that will direct them to the account creation page.
+ The user will be asked to provide an email and password to sign into the inventory application but if they use an email that already exists, they will get a prompt informing them of this.
+ ![Create Account Page 2](https://github.com/AhmadEOmar/ComputerScience2022-Portfolio/assets/31226496/e7ce185b-5f3f-4e35-b53f-0e2f28e80a4b)


# Inventory App Main Page
+ After Signing in the user is now able to use the inventory application and are directed to the main page in which they can
   - Sign out back to the login page
   - Request SMS notification for when an item reaches 0 inventory
   - Add a new item
   - Delete an item
+ ![Inventory Page 2](https://github.com/AhmadEOmar/ComputerScience2022-Portfolio/assets/31226496/16079e7f-de6a-4185-8d38-cdb7d51092da)

# SMS Notification
+ The user can request SMS notification by clicking the SMS button and when doing so it sends a request for the phone to allow the SMS notification.
+ ![SMS Permission Needed 2](https://github.com/AhmadEOmar/ComputerScience2022-Portfolio/assets/31226496/df1da31f-7e38-4eb7-bfd6-2fb385c81abe)
+ ![Permission Request 2](https://github.com/AhmadEOmar/ComputerScience2022-Portfolio/assets/31226496/d1f42f44-4e17-42ae-aefe-8714d45c433d)

# Add Edit and Delete Inventory
+ The user can add, edit, and delete items in the inventory by clicking on the add item icon, the delete icon, and the edit icon when the item get's added.
+ ![Add Item 2](https://github.com/AhmadEOmar/ComputerScience2022-Portfolio/assets/31226496/86258d80-3096-4d9e-973c-507614e46278)
+ ![Inventory Updated 2](https://github.com/AhmadEOmar/ComputerScience2022-Portfolio/assets/31226496/13c145f1-ce0c-493c-a72a-91c85f8e0dfd)
+ ![Edit Item Page 2](https://github.com/AhmadEOmar/ComputerScience2022-Portfolio/assets/31226496/090960d9-736a-4b22-a5cf-eac6e9c0fb23)
+ ![Edit Item Updated Inventory Page 2](https://github.com/AhmadEOmar/ComputerScience2022-Portfolio/assets/31226496/3c7d877b-4ad0-4419-9bc5-0cccab138a1a)
+ ![Delete Item Page 2](https://github.com/AhmadEOmar/ComputerScience2022-Portfolio/assets/31226496/9a258558-ef95-4565-b2a6-37229c1d05e2)












# What screens and features were necessary to support user needs and produce a user-centered UI for the app? How did your UI designs keep users in mind? Why were your designs successful?
+ There were quite a few screens that were needed to create this application.
+ Login Screen - where we checked to ensure that the information used to login matches what our database has and if it's correct allow the user to login.
+ Create Account - Where we asked the user to create an account with a username and password.
+ Inventory Page - Where the user can add, edit, delete items which will update in the database and show in the user’s inventory page. There is also an SMS button to get permission to send text notifications to the user, as well as a logout button to send the user back to the sign in page.
+ Add Item Page - Add's items to the database which will be display in the inventory page.
+ Edit Item Page - Allows the user to edit the item's name and amount they have of that item which will update in the database and update in the inventory page.
+ Delete Item Page - Allows the user to delete the item from the database which removes the item from the inventory page.
+ I created a design document that I used to ensure that I had everything planned before creating any of these pages and features to ensure that I don't forget anything but that I also make sure that I am able to navigate the application easily and everything is easy to use while making sense to the user. 


# How did you approach the process of coding your app? What techniques or strategies did you use? How could those be applied in the future?
+ I broke everything down into the features that I needed and then did research on how I can implement those features before I started coding. By doing this I ensured that I stayed within scope of my program while also having general knowledge on how to code this application, and the reason I went with this approach is that I have not touched Java in a while so I was very rusty with its features and on how to do things so I had to use Google, StackOverflow, and YouTube to read up and watch tutorials on how to get my application working. 

# How did you test to ensure your code was functional? Why is this process important and what did it reveal?
+ I ensured to test my application every time I added something to it where I tested a feature before moving onto another feature to ensure that I fixed anything wrong before moving on. This helped ensure that my application was working as intended but also helped me to ensure that any bugs or issues that I had were fixed before doing anything else, this process is always important to do since not testing an application can led to bugs that could lead to data breaches or lowering your reputation since your application is a buggy mess. 


# Considering the full app design and development process, from initial planning to finalization, where did you have to innovate to overcome a challenge?
+ I ran into a lot of issues with Android Studio since this was my first time using it and as I stated above it's been a while since I have even touched Java, so I had to keep reading documentation or looking into StackOverflow posts or YouTube videos to understand how to do things in Android Studio and Java.
+ Another issue that I ran into was me creating the design of the application, I know that I'm not an artistically inclined person so I ran into a lot of issues with a design and the design I did go with feels a bit cheap and generic which could cause issues with users thinking my application is a cheap or not as good as other applications that are designed by professionals. 


# In what specific component from your mobile app were you particularly successful in demonstrating your knowledge, skills, and experience?
+ Honestly, I feel like everything since I had never used Android Studio and have not touched Java in about 6-7 years so being able to create an actual functional application felt like an accomplishment. By also being able to create an application I showed that I can use new technologies and within a few weeks I am able to create a functional application.
