package reusablecomp;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import baseDriver.objectRepo;

public class reportExtent extends objectRepo{
	public static ExtentReports setupExtentReport() {
		 SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyy HH-mm-ss");
		 Date date = new Date();
		 String actualDate = format.format(date);
		 String reportPath = System.getProperty("C:\\java\\java demo\\tricentisapp\\Reports"+"executed"+actualDate);
		 ExtentSparkReporter sparkReport = new ExtentSparkReporter(reportPath);
		 ExtentReports extent = new ExtentReports();
		 extent.attachReporter(sparkReport);
		 sparkReport.config().setDocumentTitle("DocumentTitle");
		 sparkReport.config().setTheme(Theme.DARK);
		 sparkReport.config().setReportName("ReportName");
		 return extent;
	 }
}
