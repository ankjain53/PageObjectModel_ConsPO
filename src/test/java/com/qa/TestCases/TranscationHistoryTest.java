package com.qa.TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.BaseClass.ConsumerBaseClass;
import com.qa.TestPages.TranscationHistoryPage;

public class TranscationHistoryTest extends ConsumerBaseClass
{

	TranscationHistoryPage TransHis;
	public TranscationHistoryTest()
	{
		super();

	}

	@BeforeTest
	public void TransHistory()
	{
		TransHis=new TranscationHistoryPage();

	}

	@Test(priority=9,description="Tittle Validation for Dashboard Page of Consumer Portal")
	public void TranscationHistoryTittleValidation() throws InterruptedException 
	{
		logger1 = extent.createTest("Tittle Validation for Dashboard Page of Consumer Portal");
		Thread.sleep(5000);
		String Tittle=TransHis.TransHistoryTittleTest();
		Assert.assertEquals(Tittle, "Transaction history | JioMoney","Tittle of Consumer Portal Transcation history Page Not Matched");
	}

	@Test(priority=10,description="Tittle Validation for Add Card Page on Consumer Portal")
	public void DashBoardPageTittleValidation() 
	{
		logger1 = extent.createTest("Tittle Validation for Add Card Page on Consumer Portal");
		String Tittle=TransHis.TransHistorySecondTittleTest();
		Assert.assertEquals(Tittle, "Transaction history","Second Tittle Validation for Transcation history on Consumer Portal Not Matched");
	}
	
	@Test(priority=11,description="Transcation History Validation")
	public void ClickOnCalender() throws InterruptedException 
	{
		logger1 = extent.createTest("Transcation History Validation");
		TransHis.ClickOnCalender();
		
	}
	
	@Test(priority=12,description="Transcation History Compelte Screen Field Validation")
	public void TransHistoryScreenValidation() 
	{
		logger1 = extent.createTest("Transcation History Compelte Screen Field Validation");
		boolean Text1=TransHis.TransIdValidation();
		Assert.assertTrue(Text1);
		boolean Text2=TransHis.PeriodValidation();
		Assert.assertTrue(Text2);
		boolean Text3=TransHis.DescriptionValidation();
		Assert.assertTrue(Text3);
		boolean Text4=TransHis.AmountValidation();
		Assert.assertTrue(Text4);
		TransHis.MoveToEditProfile();
		
	}






}
