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

Implement a simple menu driven calculator in java to implement add, sub, mul, div, sqrt, power,
mean, variance. Implement a separate Calculator class to include all related function inside that class.
(mean calculation : program reads numbers from the keyboard, summing them in the process until the
user enters the string "end". It then stops input & displays the avg. of numbers)

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
Write a Java program that declares two arrays named 'even' and 'odd'. Accept numbers from the
user and move them to respective arrays depending on whether they are even or odd.

Input: This is a class that has a method to get input from the user. The getInput() method prompts the user to enter the number of elements and the elements themselves. It then creates an array of integers of the specified size and initializes each element with the corresponding user input. Finally, it returns the array of integers.

getInput(): This method is used to read input from the user. It first prompts the user to enter the number of elements they want to enter. After the user enters the number, the method creates an array of integers of that size. Then, for each element in the array, it prompts the user to enter the value for that element. Once all the elements have been initialized, the method returns the array of integers.

Part1: This is a class that has a method to separate the even and odd numbers from the input array. The part1() method creates two arrays, one for even numbers and one for odd numbers, and separates the numbers accordingly. It then prints the original array, the even array, and the odd array. This is useful for separating even and odd numbers, which may be needed for further processing or analysis.

part1(int data[]): This method takes an array of integers as input and separates the even and odd numbers. It initializes two arrays, one for even numbers and one for odd numbers, and two counters for the number of even and odd numbers. It then iterates through the input array and checks if each number is even or odd. If the number is even, it increments the even counter and stores the number in the even array. If the number is odd, it increments the odd counter and stores the number in the odd array. Finally, it prints the original array, the even array, and the odd array.

Main: This is the main class that initializes the Input and Part1 classes and calls their methods. The main() method creates an instance of the Input class and calls its getInput() method to initialize the input array. Then, it creates an instance of the Part1 class and calls its part1() method with the input array as the argument. By doing this, it separates the even and odd numbers and prints the arrays.


**Part 2:**
Implement a Java function that finds two neighbouring numbers in an array with the smallest
distance to each. The function should return the index of the 1st number.

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



***Assignment 5***

**Part 1:** 
Implement the generic Shapes class as an interface s so that we can implement concrete classes like circle, triangle, rectangle class from it.
Implemented three different shapes: Circle, Triangle, and Rectangle. Each shape implements the Shape interface, which contains two methods: area() and perimeter(). These methods are used to calculate the area and perimeter of each shape.

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
