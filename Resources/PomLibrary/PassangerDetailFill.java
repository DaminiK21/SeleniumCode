package PomLibrary;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PassangerDetailFill {
	
	public WebDriver driver;
	
	
	
	public PassangerDetailFill(WebDriver driver) {
		// TODO Auto-generated constructor stub
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
		 
	}

	

	@FindBy(xpath="//input[@id='ctl00_mainContent_rbtnl_Trip_1']")
	WebElement RoundTrip;
	
	@FindBy(xpath="//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")
	WebElement Source;
	@FindBy(xpath="//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//a[@value='PNQ']")
	WebElement location1;
	
	@FindBy(xpath="//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")
	WebElement Destionation;
	
	@FindBy(xpath="//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='DEL']")
	WebElement location2;
	
	@FindBy(xpath="//a[@class='ui-state-default']")
	List<WebElement>  fromDate;
	
	@FindBy(xpath="//input[@id='ctl00_mainContent_view_date2']")
	WebElement ToDate;
	
	@FindBy(xpath="//a[@class='ui-state-default']")
	List<WebElement>  toDate;
	
	@FindBy(xpath="//div[@id='divpaxinfo']")
	WebElement passanger;
	@FindBy(xpath="//select[@id='ctl00_mainContent_ddl_Adult']")
	WebElement adult;
	@FindBy(xpath="//select[@id='ctl00_mainContent_ddl_Child']")
	WebElement child;
	
	@FindBy(xpath="//select[@id='ctl00_mainContent_DropDownListCurrency']")
	WebElement currency;
	
	public WebElement RoundtripRadioButton()
	{
		RoundTrip.click();
		return RoundTrip;
	}
	
	public WebElement source()
	{
		Source.click();
		
		return Source;
	}
	public WebElement location()
	{
		location1.click();
		return Source;
	}
	public WebElement destionation()
	{
		Destionation.click();
		return Destionation;
	}
	
	public WebElement destlocation()
	{
		location2.click();
		return location2;
	}
	public List<WebElement> fromDate()
	{
		int count =fromDate.size();
		for(int i=0;i<count;i++)
		{
			
			String Date= fromDate.get(i).getText();
			if(Date.equalsIgnoreCase("18"))
			{
				fromDate.get(i).click();
				break;
			}
		}
		return fromDate;
	}
	public WebElement ToDate()
	{
		ToDate.click();
		return ToDate;
	}
	public List<WebElement> toDate()
	{
		int count =fromDate.size();
		for(int i=0;i<count;i++)
		{
			
			String Date= toDate.get(i).getText();
			if(Date.equalsIgnoreCase("26"))
			{
				toDate.get(i).click();
				break;
			}
		}
		return toDate;
	}
	public WebElement passanger()
	{
		passanger.click();
		return passanger;
	}
	public WebElement adult()
	{
		Select s= new Select(adult);
		s.selectByValue("2");
		return adult;
	}
	
	public WebElement Child()
	{
		Select s= new Select(child);
		s.selectByValue("1");
		return child;
	}
	
	public WebElement currency()
	{
		currency.click();
		Select s= new Select(currency);
		s.selectByValue("USD");
		return currency;
	}

}
