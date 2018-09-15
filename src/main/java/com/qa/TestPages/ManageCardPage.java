package com.qa.TestPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.BaseClass.ConsumerBaseClass;

public class ManageCardPage extends ConsumerBaseClass
{

	@FindBy(xpath="//a[@id='pt1:r1:0:gl1Mng']")
	WebElement AddCreditDebitCard ;

	@FindBy(xpath="//input[@id='pt1:r1:0:sor1:_0']")
	WebElement CreditCardBox ;

	@FindBy(xpath="//input[@id='pt1:r1:0:inputText1::content']")
	WebElement CardNumber ;

	@FindBy(xpath="//input[@id='pt1:r1:0:it009::content']")
	WebElement NameOnCard;

	@FindBy(xpath="//select[@id='pt1:r1:0:selectOneChoice1::content']")
	WebElement ExpiryDateMonth;

	@FindBy(xpath="//select[@id='pt1:r1:0:selectOneChoice2::content']")
	WebElement ExpiryDateYear;

	@FindBy(xpath="//input[@id='pt1:r1:0:it2::content']")
	WebElement CardNickName;

	@FindBy(xpath="//button[@id='pt1:r1:0:cb1']")
	WebElement AddCard;

	@FindBy(xpath="//div[@id='pt1:r1:1:profileBal']")
	WebElement SucessMsg;

	@FindBy(xpath="//a[@id='pt1:r1:1:gl1']")
	WebElement Continue;

	@FindBy(xpath="//div[@id='pt1:pgl0img']//div")
	WebElement Logout;

	@FindBy(xpath="//a[@id='pt1:pt_gl31']")
	WebElement ManageCard;

	@FindBy(xpath="//a[@id='pt1:r1:0:cl2']")
	WebElement EditCard;

	@FindBy(xpath="//input[@id='pt1:r1:0:inputText2::content']")
	WebElement CardHolderName;

	@FindBy(xpath="//button[@id='pt1:r1:0:cb1']")
	WebElement ClickOnSave;

	@FindBy(xpath="//div[@id='pt1:r1:1:profileBal']")
	WebElement UpdateMessage;

	@FindBy(xpath="//a[@id='pt1:r1:0:cl3']")
	WebElement ClickonDelete;

	@FindBy(xpath="//button[@id='pt1:r1:0:dInsta13::ok']")
	WebElement ClickonProceed;

	@FindBy(xpath="//div[@id='dltpt1:dltpgl5']")
	WebElement RemoveSucessMsg;

	@FindBy(xpath="//a[@id='dltpt1:gl1Dlt']")
	WebElement ClickonContinueAfterRemove;

	@FindBy(xpath="//a[@id='pt1:r1:0:gl5']")
	WebElement AddBankAccount;

	@FindBy(xpath="//input[@id='pt1:r1:0:inputText1::content']")
	WebElement BankAccountNumber;

	@FindBy(xpath="//input[@id='pt1:r1:0:it2::content']")
	WebElement AccountHolderName;

	@FindBy(xpath="//input[@id='pt1:r1:0:inputText2::content']")
	WebElement IFSCCode;

	@FindBy(xpath="//input[@id='pt1:r1:0:it1::content']")
	WebElement NickName;

	@FindBy(xpath="//button[@id='pt1:r1:0:cb1']")
	WebElement SaveAccountDetails;

	@FindBy(xpath="//div[@id='pt1:r1:1:profileBal']")
	WebElement AccountSucesfullMsg;

	@FindBy(xpath="//a[@id='pt1:r1:1:gl1']")
	WebElement Cont;

	@FindBy(xpath="//a[@id='pt1:r1:0:cl8']")
	WebElement Delete;

	@FindBy(xpath="//div[@id='dltpt1:dltpgl5']")
	WebElement DeleteAccountSucess;

	@FindBy(xpath="//a[@id='dltpt1:gl1Dlt']")
	WebElement DeleteContinue;

	@FindBy(xpath="//div[@id='pt1:pgl0img']")
	WebElement LogoutIcon;


	@FindBy(xpath="//a[@id='pt1:pt_cl1']")
	WebElement LogoutButton;

	@FindBy(xpath="//button[@id='pt1:dmld3::yes']")
	WebElement LogoutButtonYes;


	public ManageCardPage()
	{
		PageFactory.initElements(driver, this);	
	}

	public String ManageCardTittleTest()
	{
		return driver.getTitle();
	}

	public void AddCard() throws InterruptedException
	{
		AddCreditDebitCard.click();
		Thread.sleep(2000);
		CreditCardBox.click();
		Thread.sleep(2000);
		CardNumber.sendKeys("4614461446144614");
		NameOnCard.sendKeys("Test1");
		Thread.sleep(2000);
		ExpiryDateMonth.sendKeys("S");
		//Thread.sleep(1000);
		ExpiryDateMonth.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		ExpiryDateYear.sendKeys("2022");
		//	Thread.sleep(1000);
		ExpiryDateYear.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		CardNickName.sendKeys("RandomGuy");
		Thread.sleep(2000);
		AddCard.click();
		Thread.sleep(2000);

	}

	public String SucessMessage()
	{
		return SucessMsg.getText();


	}

	public void ClickOnContinue() throws InterruptedException
	{
		Continue.click();
		Thread.sleep(2000);

	}

	public void MovetoManageCard() throws InterruptedException
	{
		Logout.click();
		Thread.sleep(2000);
		ManageCard.click();
		Thread.sleep(2000);

	}

	public String EditCardDetails() throws InterruptedException
	{
		EditCard.click();
		Thread.sleep(2000);
		CardHolderName.clear();
		Thread.sleep(1000);
		CardHolderName.sendKeys("Random");
		Thread.sleep(1000);
		ClickOnSave.click();
		Thread.sleep(3000);
		return UpdateMessage.getText();
	}

	public String DeleteCard() throws InterruptedException
	{
		Thread.sleep(1000);
		ClickonDelete.click();
		Thread.sleep(5000);
		ClickonProceed.click();
		Thread.sleep(1000);
		return RemoveSucessMsg.getText();
	}

	public void DeleteCardContinune() throws InterruptedException
	{
		Thread.sleep(3000);
		ClickonContinueAfterRemove.click();

	}

	public String AddBankAccountDetails() throws InterruptedException
	{
		AddBankAccount.click();
		Thread.sleep(3000);
		BankAccountNumber.sendKeys("1000100010");
		AccountHolderName.sendKeys("Random Account Holder");
		IFSCCode.sendKeys("HDFC0000501");
		NickName.sendKeys("Random NickName");
		Thread.sleep(3000);
		SaveAccountDetails.click();
		Thread.sleep(10000);
		return AccountSucesfullMsg.getText();

	}

	public void DeleteAccountDetails()
	{

		Cont.click();
	}

	public String DeleteAccountDetailsCont() throws InterruptedException
	{

		Delete.click();
		Thread.sleep(3000);
		return DeleteAccountSucess.getText();
	}

	public void DeleteAccountDetailSucessMsg() throws InterruptedException
	{

		DeleteContinue.click();
		LogoutIcon.click();
		Thread.sleep(2000);
		LogoutButton.click();
		Thread.sleep(2000);
		LogoutButtonYes.click();
		Thread.sleep(2000);
	}




}
