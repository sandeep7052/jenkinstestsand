package reusablecomp;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.Status;
import baseDriver.objectRepo;


public class listenersclass extends objectRepo implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		test=extent.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Testcase: "+result.getMethod().getMethodName()+" is passed.");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		extent = reportExtent.setupExtentReport();
	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
		}
	
	
}
