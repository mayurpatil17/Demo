package listeners;


import java.io.IOException;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener extends common implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("Test Started");

	}

	public void onTestSuccess(ITestResult result) {
	result.getMethod().getMethodName();
	try {
		takeTheScreenShotOfTheWebPage();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

	public void onTestFailure(ITestResult result) {
		System.out.println("-------------------TEST FAILED--------------------------------");
		



	}

	public void onTestSkipped(ITestResult result) {


	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {


	}

	public void onTestFailedWithTimeout(ITestResult result) {


	}

	public void onStart(ITestContext context) {


	}

	public void onFinish(ITestContext context) {
	


	}




}
