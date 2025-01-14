package workshop4;

import java.util.HashSet;
import java.util.Set;

public class EnrollmentService {

    // Set to store the enrolled students in a course (in this case, storing in a simple Set for simplicity)
    private Set<String> enrolledStudents = new HashSet<>();

    // Method to enroll a student in a course
    public boolean enrollStudent(String studentUsername, String courseName) {
        // Create a unique identifier for each student-course combination
        String enrollmentKey = studentUsername + ":" + courseName;

        // If the student is already enrolled in the course, return false
        if (enrolledStudents.contains(enrollmentKey)) {
            return false;
        }

        // Otherwise, enroll the student
        enrolledStudents.add(enrollmentKey);
        return true;
    }

    public static void main(String[] args) {
        // Example usage
        EnrollmentService enrollmentService = new EnrollmentService();

        // Enroll student in a course
        System.out.println(enrollmentService.enrollStudent("student1", "Math101"));  // true
        System.out.println(enrollmentService.enrollStudent("student1", "Math101"));  // false (already enrolled)
    }
}
