package workshop4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EnrollmentServiceTest {

    private final EnrollmentService enrollmentService = new EnrollmentService();

    @Test
    void testEnrollStudentSuccessfully() {
        // Test that a student can successfully enroll in a course
        assertTrue(enrollmentService.enrollStudent("student1", "Math101"));
    }

    @Test
    void testEnrollStudentAlreadyEnrolled() {
        // Enroll the student first
        enrollmentService.enrollStudent("student1", "Math101");
        
        // Test that the same student cannot enroll again in the same course
        assertFalse(enrollmentService.enrollStudent("student1", "Math101"));
    }

    @Test
    void testEnrollDifferentCourse() {
        // Test that a student can enroll in a different course
        assertTrue(enrollmentService.enrollStudent("student1", "Physics101"));
    }
}

