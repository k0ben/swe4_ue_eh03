package swp.basics.factory.method;

import swp.basics.factory.products.Report;
import swp.basics.factory.products.impl.PDF_Report;

public class PDFReportFactory implements ReportFactory{
    @Override
    public Report createReport() {
        return new PDF_Report();
    }
}
