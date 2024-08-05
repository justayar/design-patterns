package solid.interface_segragation_principle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ViolationExample {

    interface FitnessService {
        void enrollCustomer(String userName);
        void recordCustomerEnter(String userName) throws Exception;
        int returnCustomerEnters(String userName) throws Exception;
        boolean getPayment() throws Exception;
    }

    class RegularFitnessService implements FitnessService {

        Map<String, Integer> customers = new HashMap<>();

        @Override
        public void enrollCustomer(String userName) {
            customers.put(userName, 0);
        }

        @Override
        public void recordCustomerEnter(String userName) {
            customers.put(userName, customers.get(userName)+1);
        }

        @Override
        public int returnCustomerEnters(String userName) {
            return customers.get(userName);
        }

        @Override
        public boolean getPayment() {
            return true;
        }
    }

    class PublicFitnessService implements FitnessService {

        List<String> customers = new ArrayList<>();

        @Override
        public void enrollCustomer(String userName) {
            customers.add(userName);
        }

        @Override
        public void recordCustomerEnter(String userName) throws Exception {
            throw new Exception("Public service does not count user enters");
        }

        @Override
        public int returnCustomerEnters(String userName) throws Exception {
            throw new Exception("Public service does not count user enters");
        }

        @Override
        public boolean getPayment() throws Exception {
            throw new Exception("It is free");
        }
    }

}
