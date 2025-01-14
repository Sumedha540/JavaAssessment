package workshop4;

import java.util.regex.Pattern;

public class NotificationService {

    // Method to send email
    public boolean sendEmail(String email, String message) {
        // Basic email validation
        if (email == null || !email.contains("@") || !email.contains(".")) {
            return false; // Invalid email
        }
        
        // Simulate sending the email (In real-world use, you would use an email sending service)
        System.out.println("Sending email to: " + email);
        System.out.println("Message: " + message);
        
        return true; // Email sent successfully
    }

    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        
        // Example usage
        System.out.println(notificationService.sendEmail("test@example.com", "Hello!"));  // true
        System.out.println(notificationService.sendEmail("invalid-email", "Hello!"));    // false
    }
}
