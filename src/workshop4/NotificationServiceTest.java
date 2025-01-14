package workshop4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NotificationServiceTest {

    private final NotificationService notificationService = new NotificationService();

    @Test
    void testSendEmailValid() {
        // Test valid email
        assertTrue(notificationService.sendEmail("test@example.com", "Hello!"));
    }

    @Test
    void testSendEmailInvalid() {
        // Test invalid email
        assertFalse(notificationService.sendEmail("invalid-email", "Hello!"));
    }

    @Test
    void testSendEmailNull() {
        // Test null email
        assertFalse(notificationService.sendEmail(null, "Hello!"));
    }

    @Test
    void testSendEmailEmpty() {
        // Test empty email
        assertFalse(notificationService.sendEmail("", "Hello!"));
    }
}
