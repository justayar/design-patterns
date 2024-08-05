package solid.dependency_inversion;

import java.util.List;

public class FixedSolutionExample {

    public interface Message {
        void sendMessage();
    }

    static class Email implements Message {

        @Override
        public void sendMessage() {
            sendEmail();
        }

        private void sendEmail() {
            //Send email
        }
    }

    static class SMS implements Message {

        @Override
        public void sendMessage() {
            sendSms();
        }

        private void sendSms() {
            //Send sms
        }
    }

    static class Notification {

        List<Message> messages;

        void sendNotification() {
            messages.forEach(Message::sendMessage);
        }
    }
}
