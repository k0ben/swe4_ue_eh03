package swp.basics.factory.method;

import swp.basics.factory.products.Report;
import swp.basics.factory.products.impl.HTML_Report;

public class HTMLReportFactory implements ReportFactory{
    @Override
    public Report createReport() {
        return new HTML_Report();
    }
}
