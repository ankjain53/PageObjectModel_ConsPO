package com.qa.TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.BaseClass.ConsumerBaseClass;

public class TranscationHistoryPage extends ConsumerBaseClass
{

	@FindBy(xpath="//div[contains(text(),'Transaction history')]")
	WebElement TransHistoryText;

	@FindBy(xpath="//a[@id='pt1:r1:0:id1::glyph']")
	WebElement CalendorIcon;

	@FindBy(xpath="//a[@id='pt1:r1:0:id1::pop::cd::ys::decrement']")
	WebElement Decrement;

	@FindBy(xpath="//tr[@class='af_chooseDate_days-row p_AFFirst']//td[@class='af_chooseDate_regular-day'][contains(text(),'1')]")
	WebElement Date1;

	@FindBy(xpath="//button[@id='pt1:r1:0:cb1']")
	WebElement Submitbutton;

	@FindBy(xpath="//span[contains(text(),'Transaction ID')]")
	WebElement TransId;

	@FindBy(xpath="//span[contains(text(),'Period')]")
	WebElement Period;

	@FindBy(xpath="//span[contains(text(),'Description')]")
	WebElement Description;

	@FindBy(xpath="//span[contains(text(),'Amount Rs.')]")
	WebElement Amount;

	@FindBy(xpath="//div[@id='pt1:pgl0img']//div")
	WebElement Logout;

	@FindBy(xpath="//a[@id='pt1:pt_gl30']")
	WebElement EditProfile;


	public TranscationHistoryPage()
	{
		PageFactory.initElements(driver, this);	
	}

	public String TransHistoryTittleTest()
	{

		return driver.getTitle();

	}

	public String TransHistorySecondTittleTest()
	{

		return TransHistoryText.getText();
	}
	public void ClickOnCalender() throws InterruptedException
	{
		CalendorIcon.click();
		Thread.sleep(2000);
		Decrement.click();
		Thread.sleep(2000);
		Date1.click();
		Thread.sleep(1000);
		Submitbutton.click();
		Thread.sleep(4000);

	}

	public boolean TransIdValidation()
	{
		return TransId.isDisplayed();

	}

	public boolean PeriodValidation()
	{
		return Period.isDisplayed();

	}

	public boolean DescriptionValidation()
	{
		return Description.isDisplayed();

	}

	public boolean AmountValidation()
	{
		return Amount.isDisplayed();

	}

	public EditProfilePage MoveToEditProfile()
	{
		Logout.click();
		EditProfile.click();
		return new EditProfilePage();

	}
	
	

}
