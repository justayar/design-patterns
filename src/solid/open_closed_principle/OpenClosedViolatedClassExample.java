package solid.open_closed_principle;

import java.util.Calendar;
import java.util.List;


public class OpenClosedViolatedClassExample {

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
    }

    static class ReportPrinter {
        Report report;

        public ReportPrinter(Report report) {
            this.report = report;
        }

        public void printReport() {
            System.out.println("Report name: " + this.report.name);
            System.out.println("Prepared by: " + this.report.preparedBy);
            System.out.println("Date: " + this.report.date.toString());
        }
    }

    static class ReportExporter {

        Report report;

        public ReportExporter(Report report) {
            this.report = report;
        }

        public void exportToFile(String filename) {
            // Creates a file with given name and export the report
        }

        // Adding new method violates Open/Closed Principle
        public void exportToDatabase() {
            // Creates a database script and export the report to the database
        }
    }

}
