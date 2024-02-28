# JavaPrograms

**Assignment 1**

Part1: Implement a menu-driven Java program (like fib or factorial) to implement these input methods
in java (command line args, Scanner, BufferedReader, DataInputStream, Console )
Part2: Implement a simple menu driven calculator in java to implement add, sub, mul, div, sqrt, power,
mean, variance. Implement a separate Calculator class to include all related function inside that class.
(mean calculation : program reads numbers from the keyboard, summing them in the process until the
user enters the string "end". It then stops input & displays the avg. of numbers)

**Assignment 2**

Part 1: Write a Java program that declares two arrays named 'even' and 'odd'. Accept numbers from the
user and move them to respective arrays depending on whether they are even or odd.
Part 2: Implement a Java function that finds two neighbouring numbers in an array with the smallest
distance to each. The function should return the index of the 1st number.
Part 3: Write a Java program to convert an array into ArrayList and vice versa.

**Assignment 3**

Write a  menu-driven Java Program to study the concepts of classes, and array of objects/arraylist, instance members, and constructors in Java. Assignment description: Create a Student class describing attributes of a student like prn, name, DoB, marks etc. Create an array of objects of Student class and perform operations like Add students, Display, Search. (by prn, by name, by position), Update/Edit and Delete.

**Assignment 5**
Part 1: Implement the generic Shapes class as an interface s so that we can implement concrete classes like circle, triangle, rectangle class from it.
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

Part 2: Implement Employee as an abstract and derive 2 classes such as NormalEmployee and BonusEmployee from it and perform the salary calculations based on the formulas  as per the excel attachment

- ***Employee***:
   This is an abstract class containing details of an employee such as name, designation, department, bank name, date of joining, employee ID, total working days, loss of pay days, leaves taken, account number, UAN, PF number, ESINo, gross wage, basic wage, hra, conveyance allowance, medical allowance, other allowance, EPF, health insurance amount, PT, loan recovery, total deductions, net salary, total earnings, bonus, and bonus salary. It also contains getter and setter methods for all these fields.
- ***NormalEmployee***:
   This class extends the Employee class and contains the method theMonthly() to calculate the net salary of a normal employee. It calculates basic wage, hra, conveyance allowance, medical allowance, other allowance, total earnings, EPF, health insurance amount, PT, loan recovery, and total deductions based on the gross wage, total working days, loss of pay days, and other details provided.
- ***BonusEmployee***: This class also extends the Employee class and contains the method theMonthly() to calculate the net salary of a bonus employee. It calculates basic wage, hra, conveyance allowance, medical allowance, other allowance, total earnings, EPF, health insurance amount, PT, loan recovery, and total deductions based on the gross wage, total working days, loss of pay days, and other details provided. Additionally, it also calculates the bonus salary.
- ***Main***:
   This class contains the main method and takes inputs for gross wage, total working days, loss of pay days, and bonus (if any) from the user. It creates an object of NormalEmployee or BonusEmployee based on the bonus input and calls the theMonthly() method to calculate the net salary. It then prints the payslip with all the details using the printPaySlip() method.
- ***printPaySlip()***: This method prints the payslip for the employee with all the details such as employee name, ID, designation, department, date of joining, bank name, account number, gross wage, total working days, loss of pay days, allowances, deductions, and net salary. It also checks and prints whether the employee is a normal or bonus employee.
