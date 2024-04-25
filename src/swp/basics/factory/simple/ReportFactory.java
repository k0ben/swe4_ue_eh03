package swp.basics.factory.simple;

import swp.basics.factory.products.Report;
import swp.basics.factory.products.impl.HTML_Report;
import swp.basics.factory.products.impl.PDF_Report;
import swp.basics.factory.products.impl.ReportType;

public class ReportFactory {

    public Report createReport(ReportType reportType){
        return switch (reportType){
            case PDF -> new PDF_Report();
            case HTML -> new HTML_Report();
        };
    }
}
