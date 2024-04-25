package swp.basics.tests;

import swp.basics.factory.method.HTMLReportFactory;
import swp.basics.factory.method.PDFReportFactory;
import swp.basics.factory.method.ReportFactory;
import swp.basics.factory.products.Report;

public class FactoryMethodClient {

    public static void main(String[] args) {
        ReportFactory factory;
        Report report = null;
        
        factory = new HTMLReportFactory();
        factory.createReport();
        report.export();
        
        factory = new PDFReportFactory();
        factory.createReport();
        report.export();
    }
   
    
}
