package solid.dependency_inversion;

public class ViolationExample {

    static class Email {
        void sendEmail() {
            System.out.println("Email sent");
        }
    }

    static class SMS {
        void sendSms() {
            System.out.println("SMS sent");
        }
    }

    static class Notification {
        Email email = new Email();
        SMS sms = new SMS();

        void sendNotification() {
            email.sendEmail();
            sms.sendSms();
        }
    }
}
