# Graded Exercises 2

## Student Name
Anas Abdirizak Mohamed

## Short Description
This project contains three Java programming exercises: Loan Class, BMI Class, and Course Class. Each class is implemented according to the specifications, with appropriate constructors, getters, setters, and methods. A Main class is included to demonstrate the functionality of all three classes.

## List of the Three Exercises

1. **Exercise 2.0 - Loan Class**
   - Represents a loan with annual interest rate, number of years, and loan amount
   - Calculates monthly payment and total payment using standard loan formulas
   - Tracks the loan date
   - Includes constructors, getters, and setters

2. **Exercise 2.1 - BMI Class**
   - Represents a person with name, age, weight (pounds), and height (inches)
   - Calculates BMI using the formula: BMI = weight (kg) / (height (m))^2
   - Determines BMI status: Underweight, Normal, Overweight, or Obese
   - Includes multiple constructors, getters, and setters

3. **Exercise 2.2 - Course Class**
   - Represents a course with course name, list of students, and maximum capacity
   - Allows adding and dropping students
   - Displays course information including enrolled students
   - Manages enrollment based on maximum student limit

## How to Compile and Run the Java Program

### Prerequisites
- Java Development Kit (JDK) installed on your system

### Compilation
Navigate to the `src` directory and compile all Java files:
```bash
cd src
javac Loan.java BMI.java Course.java Main.java
```

### Running
From the `src` directory, run the Main class:
```bash
java Main
```

Alternatively, compile and run from the project root (if using Java 11+ with classpath):
```bash
javac -d src src/*.java 2>/dev/null; cd src && java Main
```
