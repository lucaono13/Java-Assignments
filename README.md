# Java-Assignments
Assignments completed in Java between January and March 2019.

Assignment Descriptions
* Assignment 1:
  - Create a java class LastnameFirstnameA1.java to take 3 natural numbers as input from the user and check (Triangle Inequality Theorem) whether it is possible to have a triangle with these set of three natural numbers as sides of a triangle.
* Assignment 2
  - Create a java class LastnameFristnameA2.java to create two user inputted integer arrays (Ask the user to define the length of the arrays). Print the two arrays. Check if the arrays are identical, if yes then print “Arrays are equal” . If the arrays are not identical then print “Arrays are not equal”  and calculate and print the sum of integers of each array, compare the sum and print the array whose sum is greater (If the sum is equal then print that the “Sum of both arrays is equal”).
* Assignment 3
  - Check if the first word in string 1 is Santa ? Print your result (true/false).
  - Join string 1 and 2 and store it in new_string . Print the new_string.
  - Count the number of occurrences of the word ‘have’  from string 3.
  - Print the reverse of last line in string 3. Now replace the letter ‘i’ with ‘e’ in it.
  - Capitalize string 3
  - Optional Questions
    * Print the total number of words in new_string
    * Capitalize the first letter of every word in string3
* Assignment 4
  - Create a class LastnameFirstnameA4.java program having a private double data member and a private string data member – ‘balance’ that stores the balance of a bank account and ‘name’ that stores name of the account.
  - Along with the constructor, create member methods for each of the following:
      * Accepting deposits - The deposit amount has to be added to the current balance of the account and print the updated balance of the account. Handle the improper deposit amount values by displaying corresponding error message.
      * Allowing withdrawals - The withdrawal amount has to be deducted from the current balance of the account only if even after deduction, the account maintains the minimum balance of 10 in it. Handle the improper withdrawals amount values by displaying corresponding error message.
      * Showing the details of the account - Display the account name and current account balance
* Assignment 5
  - Create a game of Tic-Tac-Toe
* Assignment 6
  - Create a class ‘Player.java’ that contains private data members - Name (String), Age (int), TotalPoints (int) and two member methods – ‘printInfo()’ to print the information as shown in the output below and ‘isLeading()’ which returns a boolean; to check whether one player is leading the other by some points. 
  - Create two other separate classes- ‘Attacker.java’ and ‘Goalkeeper.java’ that inherit the properties of Player class and have other private data members as follows:
    * Attacker.java: 
      1)	GoalsScored (int) – to keep a record of the number of goals scored [3 points per goal]
      2)	GoalsMissed (int) – number of goals missed (or saved by the goalkeeper) [-1 point per goal missed]
    * Goalkeeper.java:
      1)	GoalsSaved (int) – number of goals saved [1 point per goal saved]
      2)	GoalsConceded (int) – number of goals conceded (not saved) [-1 point per goal]
  - TotalPoints are the combination of the points mentioned in bold as per the type of player.
  - printInfo() is overridden in the two derived classes (Look at the output for clear understanding)
  - The headers of the constructors are as:
  - public Player(String name, int age)
  - public Attacker(String name, int age, int scored, int missed)
  - public Goalkeeper(String name, int age, int saved, int conceded)
  - Create a last java class LastnameFirstnameA6.java in the same package which contains the main method to call the constructors (and other methods, if required) of all the classes defined above.
