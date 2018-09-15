package com.qa.TestCases;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.BaseClass.ConsumerBaseClass;
import com.qa.TestPages.EditProfilePage;

public class EditProfilePageTest extends ConsumerBaseClass
{
	EditProfilePage Edit;
	public EditProfilePageTest()
	{
		super();
	}

	@BeforeTest
	public void TranscationHistoryTest()
	{

		Edit=new EditProfilePage();

	}

	@Test(priority=13,description="Tittle Validation for Edit Profile on Consumer Portal")
	public void EditProfileTittleValidation() throws InterruptedException 
	{
		logger1 = extent.createTest("Tittle Validation for Edit Profile on Consumer Portal");
		Thread.sleep(5000);
		String Tittle=Edit.EditProfileTitteValidation();
		Assert.assertEquals(Tittle, "Edit profile | JioMoney");
		logger.info("Tittle Sucesfully validated for Edit profile Page");

	}

	@Test(priority=14,description="Edit Profile Name and DOB Validation")
	public void EditProfileDetailsValidation() 
	{
		logger1 = extent.createTest("Edit Profile Name and DOB Validation");
		String Name=Edit.EditProfileNameValidation();
		assertTrue(Name.contains("ANKUR JAIN"));

		String DOB=Edit.EditProfileDOBValidation();
		
		assertTrue(DOB.contains("10-10-85"));
		logger.info("Edit Profile Name and DOB Validated Sucesfully");

	}

	@Test(priority=15,description="Edit Profile Validation Check")
	public void EditProfile() throws InterruptedException 
	{
		logger1 = extent.createTest("Edit Profile Validation Check");
		Edit.EditProfile();
		Thread.sleep(5000);
	}




}
