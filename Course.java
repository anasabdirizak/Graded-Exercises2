import java.util.ArrayList;

/**
 * Course Class - Exercise 2.2
 * Represents a course with course name, list of students, and maximum number of students.
 */
public class Course {
    private String courseName;
    private ArrayList<String> students;
    private int maxStudents;

    // Constructor with course name and maximum number of students
    public Course(String courseName, int maxStudents) {
        this.courseName = courseName;
        this.maxStudents = maxStudents;
        this.students = new ArrayList<String>();
    }

    // Getter for course name
    public String getCourseName() {
        return courseName;
    }

    // Getter for students list
    public ArrayList<String> getStudents() {
        return students;
    }

    // Getter for maximum number of students
    public int getMaxStudents() {
        return maxStudents;
    }

    // Add a student to the course
    public void addStudent(String studentName) {
        if (students.size() < maxStudents) {
            students.add(studentName);
        } else {
            System.out.println("Course is full. Cannot add " + studentName);
        }
    }

    // Drop a student from the course
    public void dropStudent(String studentName) {
        if (students.contains(studentName)) {
            students.remove(studentName);
            System.out.println(studentName + " dropped successfully.");
        } else {
            System.out.println(studentName + " is not in this course.");
        }
    }

    // Print course information including course name, students, and number of students
    public void printCourseInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Maximum Students: " + maxStudents);
        System.out.println("Number of Students: " + students.size());
        System.out.print("Students: ");
        if (students.isEmpty()) {
            System.out.println("None");
        } else {
            for (int i = 0; i < students.size(); i++) {
                if (i == students.size() - 1) {
                    System.out.println(students.get(i));
                } else {
                    System.out.print(students.get(i) + ", ");
                }
            }
        }
    }
}
