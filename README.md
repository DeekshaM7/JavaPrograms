# JavaPrograms

***Assignment 1***



**Part1:** 

Implement a menu-driven Java program (like fib or factorial) to implement these input methods in java (command line args, Scanner, BufferedReader, DataInputStream, Console )

class: This class contains the main logic of the program. It has 4 methods (getDataBufferedReader, getDataScanner, getDataDataInputStream, and getDataConsole) to get the number from the user using different input methods.

getDataBufferedReader method: This method takes the number from the user using BufferedReader. It then calculates the factorial of the number using the Factorial class and displays the result.

getDataScanner method: This method takes the number from the user using Scanner. It then calculates the factorial of the number using the Factorial class and displays the result.

getDataDataInputStream method: This method takes the number from the user using DataInputStream. It then calculates the factorial of the number using the Factorial class and displays the result.

getDataConsole method: This method takes the number from the user using Console. It then calculates the factorial of the number using the Factorial class and displays the result.

main method: This is the main method of the program. It contains a do-while loop that keeps running until the user chooses to exit. Inside the loop, it displays the menu to the user and takes the user's choice as input. Based on the user's choice, it calls the appropriate getData* method to get the number from the user and calculate its factorial.

Factorial class: This class contains the calculateFactorial method that calculates the factorial of a given number. It takes an integer as input and returns the factorial as a long integer.

calculateFactorial method: This method calculates the factorial of a given number. It takes an integer as input and returns the factorial as a long integer. It uses a for loop to iterate from 1 to the number and multiplies the current factorial value with each integer in the range. The final factorial value is returned as the result.



**Part2:**

Implement a simple menu driven calculator in java to implement add, sub, mul, div, sqrt, power, mean, variance. Implement a separate Calculator class to include all related function inside that class.
(mean calculation : program reads numbers from the keyboard, summing them in the process until the user enters the string "end". It then stops input & displays the avg. of numbers)

Calculator Class:

addition(double n1, double n2): This method takes two double values as input and returns their sum as a double value.

subtract(double n1, double n2): This method takes two double values as input and returns their difference as a double value.

multiply(double n1, double n2): This method takes two double values as input and returns their product as a double value. Note: There is a mistake in the method name and implementation, it should return n1 * n2 instead of n1 + n2.

divide(double n1, double n2): This method takes two double values as input and returns their quotient as a double value. If the second value is zero, it prints an error message and returns Double.NaN.

sqrt(double n1): This method takes a double value as input and returns its square root as a double value.

power(double base, double exponent): This method takes two double values as input and returns the first value raised to the power of the second value as a double value**.**

mean(double[] nums): This method takes an array of double values as input, calculates their mean (average), and returns the result as a double value.

variance(double[] nums): This method takes an array of double values as input, calculates their variance (a measure of how spread out the values are), and returns the result as a double value.

Input class:

inputChoice(): This method prompts the user to enter a choice (integer) and returns it as an integer value.

inputNumber(): This method prompts the user to enter a number (double) and returns it as a double value.

inputNumbers(): This method prompts the user to enter two numbers (double) and returns them as an array of two double values.

inputString(): This method prompts the user to enter a series of numbers (double) one by one, until the user types "end". It returns the series as an array of double values.

closeScanner(): This method closes the Scanner object when it's no longer needed.





***Assignment 2***


**Part 1:**
Write a Java program that declares two arrays named 'even' and 'odd'. Accept numbers from the user and move them to respective arrays depending on whether they are even or odd.

Input: This is a class that has a method to get input from the user. The getInput() method prompts the user to enter the number of elements and the elements themselves. It then creates an array of integers of the specified size and initializes each element with the corresponding user input. Finally, it returns the array of integers.

getInput(): This method is used to read input from the user. It first prompts the user to enter the number of elements they want to enter. After the user enters the number, the method creates an array of integers of that size. Then, for each element in the array, it prompts the user to enter the value for that element. Once all the elements have been initialized, the method returns the array of integers.

Part1: This is a class that has a method to separate the even and odd numbers from the input array. The part1() method creates two arrays, one for even numbers and one for odd numbers, and separates the numbers accordingly. It then prints the original array, the even array, and the odd array. This is useful for separating even and odd numbers, which may be needed for further processing or analysis.

part1(int data[]): This method takes an array of integers as input and separates the even and odd numbers. It initializes two arrays, one for even numbers and one for odd numbers, and two counters for the number of even and odd numbers. It then iterates through the input array and checks if each number is even or odd. If the number is even, it increments the even counter and stores the number in the even array. If the number is odd, it increments the odd counter and stores the number in the odd array. Finally, it prints the original array, the even array, and the odd array.

Main: This is the main class that initializes the Input and Part1 classes and calls their methods. The main() method creates an instance of the Input class and calls its getInput() method to initialize the input array. Then, it creates an instance of the Part1 class and calls its part1() method with the input array as the argument. By doing this, it separates the even and odd numbers and prints the arrays.




**Part 2:**
Implement a Java function that finds two neighbouring numbers in an array with the smallest distance to each. The function should return the index of the 1st number.

Input class:

getArrayInput() method:

This method takes no arguments and returns an integer array.
It prompts the user to enter the number of elements in the array and the elements themselves.
It then creates an integer array of the specified size and stores the entered elements in it.
Finally, it returns the created array.

Main class:

main(String[] args) method:

This is the main method of the program.
It calls the getArrayInput() method of the Input class to get an array of integers from the user.
It then calls the findSmallestDistanceNeighbors() method of the Part2 class with the obtained array as an argument.
If the returned index is -1, it means that no two neighboring numbers with the smallest distance to each other were found. In this case, it prints a message to that effect.
Otherwise, it prints the index of the first number in the pair of neighboring numbers with the smallest distance to each other.



Part2 class:

findSmallestDistanceNeighbors(int[] arr) method:

This method takes an integer array as an argument and returns an integer.
It checks if the array is null or has less than 2 elements. If it is, it prints an error message and returns -1.
It then initializes two variables, minDist and minDistIndex, to store the smallest distance found so far and the index of the first number in the pair of neighboring numbers with that distance, respectively.
It then iterates over the elements of the array, excluding the last one. For each pair of neighboring numbers, it calculates their absolute difference and checks if it is smaller than the current smallest distance. If it is, it updates minDist and minDistIndex.
Finally, it returns the index of the first number in the pair of neighboring numbers with the smallest distance to each other. If no such pair was found, it returns -1.



**Part 3:**
Write a Java program to convert an array into ArrayList and vice versa.

Converter class:

arrayToArrayList(String[] array): This method takes an array of strings as input and converts it into an ArrayList. It returns the converted ArrayList.

arrayListToArray(List<String> arrayList): This method takes an ArrayList of strings as input and converts it into an array. It returns the converted array.

Input class:

getArrayInput(Scanner scanner): This method takes a Scanner object as input. It prompts the user to enter the number of elements and the elements themselves. It returns an array of strings containing the user input.

getArrayListInput(Scanner scanner): This method takes a Scanner object as input. It prompts the user to enter the number of elements and the elements themselves. It returns an ArrayList of strings containing the user input.

Main class:

main(String[] args): This is the main method of the program. It creates a Scanner object to read user input. It then displays a menu to the user and prompts them to choose an option. Based on the user's choice, it calls the appropriate method from the Converter or Input class. The program continues to run until the user chooses the "Exit" option.





***Assignment 3***

Write a  menu-driven Java Program to study the concepts of classes, and array of objects/arraylist, instance members, and constructors in Java. Assignment description: Create a Student class describing attributes of a student like prn, name, DoB, marks etc. Create an array of objects of Student class and perform operations like Add students, Display, Search. (by prn, by name, by position), Update/Edit and Delete.

Class Student:

• Constructor: Student(int prn, String name, String dob, float marks) - Initializes a student object.

• Getters: (getPrn, getName, getDob, getMarks) - Access the value of student attributes.

• Setters: (setPrn, setName, setDob, setMarks) - Modify the value of student attributes.

• displayDetails() - Prints formatted details of a student object.

Class StudentDetails:

• Constructor: StudentDetails() - Initializes the studentList.

• addStudent() - Prompts the user for input and adds a new Student object to studentList.

• displayStudents() - Iterates through studentList and displays details of each student.

• searchByPrn(int prn) - Finds and displays a student based on their PRN.

• searchByName(String name) - Finds and displays students matching a given name (case-insensitive).

• searchByPosition(int position) - Retrieves and displays a student at a specific position in studentList.

• updateStudent(int prn) - Finds a student by PRN and allows the user to update their name, date of birth, and marks.

• deleteStudent(int prn) - Deletes a student from studentList based on their PRN.

Class StudentDemo :

• Creates a StudentDetails object.

• Provides a menu-driven interface for the user to interact with the student management system.




***Assignment 6***


**Write a menu-driven Java Program for the following:
1. There are 52 cards in a deck, each of which belongs to one of four suits and one of 13
ranks. Represent a deck of cards as an array of Objects (*you may use the Vector class)
2. Use integers to encode the ranks and suits.
3. Have suitable default & parameterized constructors.
4. All data members to have private access. The class' Card' to have the following
methods: createDeck(), printCard(), printDeck (),sameCard(),compareCard(), sortCard(), findCard() which searches through an array or vector of Cards to see whether it contains a specific card, dealCards() function: to print 5 random cards from the existing deck.**


Methods:

assignment_4 Class

main(String[] args): The main method of the program. It initializes a new deck and calls the createDeck() method of the Deck class to create and manage the deck.


Card Class

Card(int rank, String suit): Constructor for creating a new card with the specified rank and suit.

getRank(): Returns the rank of the card.

getSuit(): Returns the suit of the card.

toString(): Returns a string representation of the card.


Deck Class

Deck(): Constructor for creating a new deck of cards.

createDeck(): Populates the deck with cards and provides a menu-driven interface to interact with the deck.

displayDeck(Vector<Card> deck): Displays the current state of the deck.

shuffleDeck(Vector<Card> deck): Shuffles the cards in the deck.

drawCard(): Draws a card from the deck.

emptyDeck(): Empties the deck.

compareCard(): Compares two randomly drawn cards.

sameCard(): Checks if two randomly drawn cards are the same.

sortCard(): Sorts the deck of cards in ascending order of ranks and suits.

findCard(): Finds a card in the deck based on the given rank and suit.

dealCard(Vector<Card> deck): Deals a hand of cards to the specified number of players.



***Assignment 5***


**Part 1:** 
Implement the generic Shapes class as an interface s so that we can implement concrete classes like circle, triangle, rectangle class from it. Implemented three different shapes: Circle, Triangle, and Rectangle. Each shape implements the Shape interface, which contains two methods: area() and perimeter(). These methods are used to calculate the area and perimeter of each shape.

Circle:

The Circle class has a constructor that takes the radius as a parameter.

The area() method calculates the area of the circle using the formula: area = π * radius * radius.

The perimeter() method calculates the perimeter of the circle using the formula: perimeter = 2 * π * radius.

Rectangle:

The Rectangle class has a constructor that takes the length and width as parameters.

The area() method calculates the area of the rectangle using the formula: area = length * width.

The perimeter() method calculates the perimeter of the rectangle using the formula: perimeter = 2 * (length + width).

Main:

The Main class contains the main() method, which is the entry point of the program.

The main() method prompts the user to select a shape (Circle, Triangle, or Rectangle) and then prompts the user to enter the necessary parameters for that shape.

The main() method then creates an instance of the selected shape and calls the area() and perimeter() methods to calculate and display the area and perimeter of the shape.

The main() method uses a switch statement to determine which shape the user has selected. It then prompts the user to enter the necessary parameters for that shape and creates an instance of the selected shape. Finally, it calls the area() and perimeter() methods to calculate and display the area and perimeter of the shape.



**Part 2:**
Implement Employee as an abstract and derive 2 classes such as NormalEmployee and BonusEmployee from it and perform the salary calculations based on the formulas  as per the excel attachment.

Employee:

   This is an abstract class containing details of an employee such as name, designation, department, bank name, date of joining, employee ID, total working days, loss of pay days, leaves taken, account number, UAN, PF number, ESINo, gross wage, basic wage, hra, conveyance allowance, medical allowance, other allowance, EPF, health insurance amount, PT, loan recovery, total deductions, net salary, total earnings, bonus, and bonus salary. It also contains getter and setter methods for all these fields.
   
NormalEmployee:
   This class extends the Employee class and contains the method theMonthly() to calculate the net salary of a normal employee. It calculates basic wage, hra, conveyance allowance, medical allowance, other allowance, total earnings, EPF, health insurance amount, PT, loan recovery, and total deductions based on the gross wage, total working days, loss of pay days, and other details provided.
BonusEmployee: This class also extends the Employee class and contains the method theMonthly() to calculate the net salary of a bonus employee. It calculates basic wage, hra, conveyance allowance, medical allowance, other allowance, total earnings, EPF, health insurance amount, PT, loan recovery, and total deductions based on the gross wage, total working days, loss of pay days, and other details provided. Additionally, it also calculates the bonus salary.

Main:
   This class contains the main method and takes inputs for gross wage, total working days, loss of pay days, and bonus (if any) from the user. It creates an object of NormalEmployee or BonusEmployee based on the bonus input and calls the theMonthly() method to calculate the net salary. It then prints the payslip with all the details using the printPaySlip() method.
printPaySlip(): This method prints the payslip for the employee with all the details such as employee name, ID, designation, department, date of joining, bank name, account number, gross wage, total working days, loss of pay days, allowances, deductions, and net salary. It also checks and prints whether the employee is a normal or bonus employee.


***Assignment 6***

**Part 1:** Implementation of Fixed and Growable Stack using Interface\_STK

In this code, we have two different implementations of a stack data structure: Fixed\_STK and Growable\_STK. Both implementations follow the Interface\_STK interface, which defines the methods that a stack should have: push, pop, displayStack, isOverflow, and isUnderflow.

The Fixed\_STK implementation uses a fixed-size array to store the elements of the stack. It has the following methods:

1. **push:** This method takes an integer as an argument and adds it to the top of the stack. If the stack is full (i.e., the top index is equal to the last index of the array), it throws an error message and terminates the program.
2. **pop:** This method removes the element at the top of the stack and returns it. If the stack is empty (i.e., the top index is -1), it throws an error message and terminates the program.
3. **displayStack:** This method prints the elements of the stack. If the stack is empty, it prints a message and terminates the program.
4. **isOverflow:** This method checks if the stack is full. It returns true if the top index is equal to the last index of the array, and false otherwise.
5. **isUnderflow:** This method checks if the stack is empty. It returns true if the top index is -1, and false otherwise.

The Growable\_STK implementation uses an ArrayList to store the elements of the stack. It has the same methods as the Fixed\_STK implementation, with the following differences:

1. **push:** This method takes an integer as an argument and adds it to the top of the stack. If the stack is full (i.e., the ArrayList is at its maximum capacity), it automatically increases its capacity.
2. **pop:** This method removes the element at the top of the stack and returns it. If the stack is empty, it throws an error message and terminates the program.
3. **displayStack:** This method prints the elements of the stack. If the stack is empty, it prints a message and terminates the program.
4. **isOverflow:** This method always returns false, because an ArrayList can grow indefinitely.
5. **isUnderflow:** This method checks if the stack is empty. It returns true if the ArrayList is empty, and false otherwise.

In the main method of the StackDemo class, we create instances of both implementations and use them to demonstrate their functionality. We push some elements onto the stacks, display the elements, pop an element, and then display the remaining elements.

The InterfaceDemo class demonstrates the use of an interface. It defines an interface called Interface1 with two methods: method1 and method2. The InterfaceImplementation class implements this interface by providing implementations for both methods. In the main method of the InterfaceDemo class, we create an instance of the InterfaceImplementation class and call both methods.


***Assignment 6***

**Part 2:** Multiple Interface.

This code consists of two classes: Main and Result. The Main class contains the main method, which is the entry point of the program. It takes user input for the student's name, roll number, mark 1, and mark 2. It then creates an object of the Result class, passing the user input as arguments. The Result class extends the Student class and implements the InterfaceExam interface. It has two methods: displayExamDetails and Percent\_cal.

- **displayExamDetails**  **method:** is used to display the student's details, including their name, roll number, mark 1, mark 2, and percentage. It is called after the object of the Result class is created.
- **Percent\_cal**  **method** : calculates the percentage of the student's marks. It takes two arguments: mark1 and mark2. The percentage is calculated by adding the two marks and dividing the sum by 2.
- **Student**  **class:** is a simple class with five fields: name, rollNo, mark1, mark2. It has a constructor that takes four arguments and initializes the fields accordingly.
- **InterfaceExam:** interface contains two methods: displayExamDetails and Percent\_cal. The Result class implements this interface, meaning it must provide implementations for both methods.
- The Scanner object is created in the main method and is used to read the student's name, roll number, mark 1, and mark 2.
- **displayExamDetails**  **method:** is called after the Result object is created. It displays the student's name, roll number, mark 1, mark 2, and percentage.
- **Percent\_cal**  **method:** is called within the displayExamDetails method to calculate the percentage of the student's marks. The percentage is then displayed.




***Assignmnet 7***

**Part 1:** 

**Title:** Rational Number Operations
The Rational Number Operations program implements a RationalNumber class in Java to represent rational numbers. A rational number is a number that can be expressed as the ratio of two integers, a numerator, and a denominator. This program provides methods for performing various arithmetic operations on rational numbers, such as addition, subtraction, multiplication, and division. Additionally, it includes methods for comparing two rational numbers, converting a rational number to a floating-point number, and finding the absolute value of a rational number.

**RationalNumber** **Class**
The RationalNumber class encapsulates a rational number and provides methods to perform arithmetic operations. Here's an overview of the class:

**Constructor**
-Constructs a RationalNumber object with the given numerator and denominator.
-Throws an IllegalArgumentException if the denominator is zero.

**Public** **Methods**
**add(RationalNumber other)**
Performs addition of the current rational number with another rational number (other).
**subtract(RationalNumber other)**
Performs subtraction of the current rational number by another rational number (other).
**multiply(RationalNumber other)**
Performs multiplication of the current rational number with another rational number (other).
**divide(RationalNumber other)**
Performs division of the current rational number by another rational number (other).
Throws an ArithmeticException if the other numerator is zero.
**toDouble()**
Converts the rational number to a floating-point number.
**abs()**
Returns the absolute value of the rational number.

**Private** **Methods**
**gcd(int a, int b)**
Calculates the greatest common divisor (GCD) of two integers a and b.
**simplify()**
Simplifies the rational number by dividing both numerator and denominator by their greatest common divisor.

**Overridden** **Methods**
**toString()**
Returns a string representation of the rational number in the form "numerator/denominator".

**Test** **Class**
The Test class provides a simple console-based interface to interact with the RationalNumber class. It allows users to input two rational numbers and perform various operations on them.



**Part 2:**

**Title:** Write a Java Program to find the factorial of ‘n’ integers (as command line arguments CLA). Write your own exception “FactorialException” to validate integer values to be in certain range. Sample call: java ExceptionDemo 8 –
6 14 abcd 5
1) Static main method invokes another method “factorial()”
2) CLA which are strings but interpreted as integer values.
3) The user-defined exception class
FactorialException should have proper constructors / overridden toString() method to display exception message along with the
wrong input number that had generated the exception.
NumberFormatException (ill-formed CLA)
And
Your Exception class. FactorialException ( n<0 and n>15)

**class FactorialException extends Exception:**

This class defines a custom exception named FactorialException, which extends the built-in Exception class.
It contains a private attribute number to store the number causing the exception.
The constructor FactorialException(int number) initializes the exception with the out-of-range number.
The toString() method overrides the toString() method of the Exception class to provide a custom string representation of the exception, indicating that the number is out of range.

**public class ExceptionDemo:**

This class contains the main method and the factorial method.

**public static void main(String\[\] args):**
The main method takes an array of strings as input arguments.
It iterates through each argument and tries to parse it into an integer.
If parsing succeeds, it checks whether the number is within the range [0, 15]. If not, it throws a FactorialException.
It then calculates the factorial of the number using the factorial method and prints the result.
It catches NumberFormatException if the argument cannot be parsed into an integer and prints an appropriate error message.
It catches FactorialException if the number is out of range and prints the custom exception message.

**public static int factorial(int n):**
This method calculates the factorial of a given integer n.
It is a recursive method that calls itself with n - 1 until n becomes 0.
The base case is when n is 0, in which case it returns 1.
Otherwise, it recursively calculates n * factorial(n - 1) and returns the result.


**Part 3:**

**Title:** Define an exception class called “NOMATCHEXCP” that is thrown when the string from the keyboard is not equal to “India”. Write a Demo program using try-catch block that shows the use of this user-defined exception. Class NOMATCHEXCP should have a parameterized constructor and the exception message generated should show the line number and the erroneous String that was inputted by the user.

**public class Demo:**

This class contains the main method, which serves as the entry point of the program.
It reads input from the user using BufferedReader.
It checks if the input string equals "India" and throws a NoMatchException if it doesn't.
It catches NoMatchException and IOException and prints appropriate error messages.

**public static void main(String\[\] args):**

The main method initializes a BufferedReader to read input from the console.
It prompts the user to enter a string.
It reads the input string using reader.readLine().
If the input string is not equal to "India", it throws a NoMatchException.
It catches NoMatchException and IOException and prints error messages accordingly.

**class NoMatchException extends Exception:**

This class defines a custom exception named NoMatchException, which extends the built-in Exception class.
It contains private attributes lineNumber and erroneousString to store the line number and the erroneous string.
The constructor NoMatchException(int lineNumber, String erroneousString) initializes the exception with the line number and the erroneous string.
The getMessage() method overrides the getMessage() method of the Exception class to provide a custom error message, indicating the line number and the expected string versus the erroneous string.
