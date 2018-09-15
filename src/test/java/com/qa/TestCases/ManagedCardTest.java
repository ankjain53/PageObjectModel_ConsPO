package com.qa.TestCases;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.BaseClass.ConsumerBaseClass;
import com.qa.TestPages.ManageCardPage;

public class ManagedCardTest extends ConsumerBaseClass
{
	ManageCardPage Manage;
	public ManagedCardTest()
	{
		super();
	}

	@BeforeTest
	public void ManagedCardStart()
	{
		Manage=new ManageCardPage();

	}

	@Test(priority=16,description="Tittle Validation for Add Card Page on Consumer Portal")
	public void EditProfileTittleValidation() throws InterruptedException 
	{
		logger1 = extent.createTest("Tittle Validation for Add Card Page on Consumer Portal");
		Thread.sleep(5000);
		String Tittle=Manage.ManageCardTittleTest();
		Assert.assertEquals(Tittle, "Add cards/ bank accounts | JioMoney");
		logger.info("Tittle Sucesfully validated for Add card Page");

	}

	@Test(priority=17,description="Add Credit/Debit Card on Consumer Portal")
	public void AddCard() throws InterruptedException 
	{
		logger1 = extent.createTest("Add Credit/Debit Card on Consumer Portal");
		Manage.AddCard();
		String Tittle=Manage.SucessMessage();
		assertTrue(Tittle.contains("successfully added to your JioMoney Wallet"));
		logger.info("Credit/Debit Card Sucesfully Added to JioMoney Account");
		Thread.sleep(5000);
		Manage.ClickOnContinue();
		Manage.MovetoManageCard();

	}

	@Test(priority=18,description="Edit Card on Consumer Portal")
	public void EditCardDetails() throws InterruptedException 
	{
		logger1 = extent.createTest("Edit Card on Consumer Portal");
		String Tittle=Manage.EditCardDetails();
		assertTrue(Tittle.contains("successfully updated to your JioMoney A/c as per your instructions"));
		logger.info("Credit/Debit Card Sucesfully Updated in JioMoney Account");
		Thread.sleep(5000);
		Manage.MovetoManageCard();

	}

	@Test(priority=19,description="Delete Card Details from Consumer Portal")
	public void DeleteCardDetails() throws InterruptedException 
	{
		logger1 = extent.createTest("Delete Card Details from Consumer Portal");
		//	Manage.EditCardDetails();
		String Tittle=Manage.DeleteCard();
		System.out.println("Message of delete card is"+Tittle);
		assertTrue(Tittle.contains("Successfully removed card"));
		logger.info("Credit/Debit Card Sucesfully Added to JioMoney Account");
		Thread.sleep(3000);
		Manage.DeleteCardContinune();
		Thread.sleep(2000);
		Manage.MovetoManageCard();

	}
	
	@Test(priority=20,description="Additon of Bank Details on Consumer Portal")
	public void AddBankAccDetails() throws InterruptedException 
	{
		logger1 = extent.createTest("Additon of Bank Details on Consumer Portal");
		String Tittle=Manage.AddBankAccountDetails();
		assertTrue(Tittle.contains("successfully added to your JioMoney Wallet"));
		logger.info("Credit/Debit Card Sucesfully Added to JioMoney Account");
		Thread.sleep(5000);
		Manage.DeleteAccountDetails();
		Thread.sleep(5000);
		Manage.MovetoManageCard();
		//Thread.sleep(7000);
		String Tittle2=Manage.DeleteAccountDetailsCont();
		assertTrue(Tittle2.contains("successfully removed from your JioMoney Wallet"));
		logger.info("Credit/Debit Card Sucesfully Removed From JioMoney Account");
		Manage.DeleteAccountDetailSucessMsg();
		logger.info("Sucesfully Logout from Consumer Portal");

	}





}
