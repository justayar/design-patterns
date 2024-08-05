package solid.interface_segragation_principle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface FixedSolutionExample {

    interface FitnessService {
    }

    interface CustomerEnrollmentService extends FitnessService {
        void enrollCustomer(String userName);
    }

    interface CustomerAnalyticsService extends FitnessService {
        void recordCustomerEnter(String userName);
        int returnCustomerEnters(String userName);    }

    interface CustomerPaymentService extends FitnessService {
        boolean getPayment();
    }


    class RegularFitnessService implements CustomerEnrollmentService, CustomerAnalyticsService, CustomerPaymentService {

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

    class PublicFitnessService implements CustomerEnrollmentService {

        List<String> customers = new ArrayList<>();

        @Override
        public void enrollCustomer(String userName) {
            customers.add(userName);
        }
    }

}