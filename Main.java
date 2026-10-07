/**
 * Main Class - Test program to demonstrate all three exercises
 * Exercise 2.0: Loan Class
 * Exercise 2.1: BMI Class
 * Exercise 2.2: Course Class
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Graded Exercises 2 ===");
        System.out.println("Student: Anas Abdirizak Mohamed");
        System.out.println();
        
        // Test Exercise 2.0 - Loan Class
        System.out.println("Exercise 2.0: Loan Class");
        System.out.println("--------------------------");
        Loan loan1 = new Loan(2.5, 5, 10000.0);
        System.out.printf("Loan Amount: $%.2f\n", loan1.getLoanAmount());
        System.out.printf("Annual Interest Rate: %.2f%%\n", loan1.getAnnualInterestRate());
        System.out.printf("Number of Years: %d\n", loan1.getNumberOfYears());
        System.out.printf("Monthly Payment: $%.2f\n", loan1.getMonthlyPayment());
        System.out.printf("Total Payment: $%.2f\n", loan1.getTotalPayment());
        System.out.println("Loan Date: " + loan1.getLoanDate());
        System.out.println();
        
        // Test with default constructor
        Loan loan2 = new Loan();
        System.out.println("Default Loan:");
        System.out.printf("Monthly Payment: $%.2f\n", loan2.getMonthlyPayment());
        System.out.printf("Total Payment: $%.2f\n", loan2.getTotalPayment());
        System.out.println();
        
        // Test Exercise 2.1 - BMI Class
        System.out.println("Exercise 2.1: BMI Class");
        System.out.println("-------------------------");
        BMI bmi1 = new BMI("John Doe", 25, 180, 72);
        System.out.println("Name: " + bmi1.getName());
        System.out.println("Age: " + bmi1.getAge());
        System.out.println("Weight: " + bmi1.getWeight() + " pounds");
        System.out.println("Height: " + bmi1.getHeight() + " inches");
        System.out.println("BMI: " + bmi1.getBMI());
        System.out.println("Status: " + bmi1.getStatus());
        System.out.println();
        
        BMI bmi2 = new BMI("Jane Smith", 30, 140, 65);
        System.out.println("Name: " + bmi2.getName());
        System.out.println("BMI: " + bmi2.getBMI());
        System.out.println("Status: " + bmi2.getStatus());
        System.out.println();
        
        // Test constructor with default age
        BMI bmi3 = new BMI("Bob", 160, 70);
        System.out.println("Name: " + bmi3.getName() + " (default age 20)");
        System.out.println("BMI: " + bmi3.getBMI());
        System.out.println("Status: " + bmi3.getStatus());
        System.out.println();
        
        // Test Exercise 2.2 - Course Class
        System.out.println("Exercise 2.2: Course Class");
        System.out.println("---------------------------");
        Course course = new Course("Java Programming", 3);
        course.addStudent("Alice");
        course.addStudent("Bob");
        course.addStudent("Charlie");
        System.out.println();
        course.printCourseInfo();
        System.out.println();
        
        // Try to add when course is full
        course.addStudent("David");
        System.out.println();
        course.printCourseInfo();
        System.out.println();
        
        // Drop a student
        course.dropStudent("Bob");
        System.out.println();
        course.printCourseInfo();
        System.out.println();
        
        System.out.println("=== All exercises tested successfully! ===");
    }
}
