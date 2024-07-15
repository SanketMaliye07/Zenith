package com.listeners;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.util.JiraPolicy;
import com.util.JiraServiceProvider;

public class TestJiraListeners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
	}

	@Override
	public void onTestFailure(ITestResult result) {

		JiraPolicy JiraPolicy=result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(JiraPolicy.class);
		boolean isTicketReady = JiraPolicy.logTicketReady();
		
		if(isTicketReady)
		{        //rise jira ticket
			System.out.println("is ticket ready for jira:"+isTicketReady);		
		}
		
		JiraServiceProvider jiraSp=new JiraServiceProvider("https://vervali-digambarkarande.atlassian.net", "digambar.karande@vervali.com", "ATATT3xFfGF0Q92ETR9PeM5v7YLRTpxXZiWl7qfE5KfTCGHcox-tCK1N_QqllhABNJ-8K2oRcRBAwDUoCD8yKs3X4kJC_W1wpBHVkBhCGT4eEARRUBBWpuvCeiLP1yMOKbqCzuZtCtDpQgLm-FOBeBmcsecz7KOOIHjBJIi2wWug1vRu8M9vpuE=BB46CB3D", "ZEN");
		
		String issueSummary=result.getMethod().getConstructorOrMethod().getMethod().getName()+"got failed du to some assertion or exception";
        String issueDescription=result.getThrowable().getMessage()+ "\n";
        issueDescription.concat(ExceptionUtils.getFullStackTrace(result.getThrowable()));
        
        jiraSp.creatJiraTicket("Task", issueSummary, issueDescription, "Digambar");
        
        
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

	

}
