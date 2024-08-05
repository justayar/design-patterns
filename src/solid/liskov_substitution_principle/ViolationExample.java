package solid.liskov_substitution_principle;

public class ViolationExample {

    static class UserOperations {

        void saveUser() {

        }

        boolean updateBirthDate() {
            return true;
        }

        void sendEmail(String email) {

        }
    }

    static class DatabaseUserOperations extends UserOperations {

        @Override
        public void saveUser() {
            // save user to database
        }

        @Override
        public boolean updateBirthDate() {
            // update user birthdate and return true if it is done successfully.
            return false;
        }

        @Override
        public void sendEmail(String email) {
            throw new UnsupportedOperationException("Not supported.");
        }
    }

    public static void main(String[] args) {
        UserOperations userOperations = new UserOperations();
        userOperations.saveUser();
        userOperations.sendEmail("test@test.com");

        UserOperations userOperations1 = new DatabaseUserOperations();
        userOperations1.saveUser();
        userOperations1.sendEmail("test@test.com"); // throw exception, because it does not support supper class method
    }
}
