package swp.basics.tests;

import swp.basics.factory.products.Report;
import swp.basics.factory.products.impl.ReportType;
import swp.basics.factory.simple.ReportFactory;

public class FactorySimpleClient {
    public static void main(String[] args) {
        ReportFactory factory = new ReportFactory();
        Report report;
        report = factory.createReport(ReportType.PDF);
        report.export();
        report = factory.createReport(ReportType.HTML);
        report.export();

    }
}
