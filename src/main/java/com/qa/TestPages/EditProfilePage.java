package com.qa.TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.BaseClass.ConsumerBaseClass;

public class EditProfilePage extends ConsumerBaseClass
{

	@FindBy(xpath="//div[@id='pt1:r1:0:pgl5']")
	WebElement Namevalidation;
	
	@FindBy(xpath="//div[@id='pt1:r1:0:pgl6']")
	WebElement DOB;
	
	@FindBy(xpath="//a[@id='pt1:r1:0:gl1']")
	WebElement EditButton;
	
	@FindBy(xpath="//input[@id='pt1:r1:0:s1:it1::content']")
	WebElement Email;
	
	@FindBy(xpath="//button[@id='pt1:r1:0:s1:cb1']")
	WebElement Save;
	
	@FindBy(xpath="//button[@id='pt1:r1:1:cb1']")
	WebElement ContinueButton;
	
	@FindBy(xpath="//div[@id='pt1:pgl0img']//div")
	WebElement Logout;
	
	@FindBy(xpath="//a[@id='pt1:pt_gl31']")
	WebElement ManageCard;
	
	public EditProfilePage()
	{
		PageFactory.initElements(driver,this);
		
	}
	
	public String EditProfileTitteValidation()
	{
		return driver.getTitle();
		
	}
	
	public String EditProfileNameValidation()
	{
		return Namevalidation.getText();
		
	}
	

	public String EditProfileDOBValidation()
	{
		return DOB.getText();
		
	}
	
	public ManageCardPage EditProfile() throws InterruptedException
	{
		EditButton.click();
		Email.sendKeys("test@test.com");
		Save.click();
		ContinueButton.click();
		Thread.sleep(5000);
		Logout.click();
		Thread.sleep(2000);
		ManageCard.click();
		
		return new ManageCardPage();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
