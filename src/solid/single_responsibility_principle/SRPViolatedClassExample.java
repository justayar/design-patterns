package solid.single_responsibility_principle;

import java.util.Calendar;
import java.util.List;

public class SRPViolatedClassExample {

    static class Data {
        String name;
        String value;
        Calendar date;

        public Data(String name, String value, Calendar date) {
            this.name = name;
            this.value = value;
            this.date = date;
        }
    }


    static class Report {
        String name;
        List<Data> dataList;
        String preparedBy;
        Calendar date;

        public Report(String name, List<Data> dataList, String preparedBy, Calendar date) {
            this.name = name;
            this.dataList = dataList;
            this.preparedBy = preparedBy;
            this.date = date;
        }

        // Violates single responsibility - Any change on print logic needs to handle on report class
        public void printReport() {
            System.out.println("Report name: " + name);
            System.out.println("Prepared by: " + preparedBy);
            System.out.println("Date: " + date.toString());
        }

        // Violates single responsibility - Any change on save(business) logic needs to handle on report class
        public void exportToFile(String filename) {
            // Creates a file with given name and export the report
        }

    }
}
