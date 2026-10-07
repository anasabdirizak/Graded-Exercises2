/**
 * BMI Class - Exercise 2.1
 * Represents a person with name, age, weight, and height.
 * Calculates BMI and determines BMI status category.
 */
public class BMI {
    private String name;
    private int age;
    private double weight; // in pounds
    private double height; // in inches
    public static final double KILOGRAMS_PER_POUND = 0.45359237;
    public static final double METERS_PER_INCH = 0.0254;

    // Default constructor
    public BMI() {
        this("Unknown", 20, 150, 70);
    }

    // Constructor with name, age, weight, height
    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    // Constructor with name, weight, height (age defaults to 20)
    public BMI(String name, double weight, double height) {
        this(name, 20, weight, height);
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for weight
    public double getWeight() {
        return weight;
    }

    // Setter for weight
    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Setter for height
    public void setHeight(double height) {
        this.height = height;
    }

    // Calculate BMI
    public double getBMI() {
        double bmi = weight * KILOGRAMS_PER_POUND / 
                     ((height * METERS_PER_INCH) * (height * METERS_PER_INCH));
        // Round to two decimal places
        return Math.round(bmi * 100) / 100.0;
    }

    // Get BMI status category
    public String getStatus() {
        double bmi = getBMI();
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
