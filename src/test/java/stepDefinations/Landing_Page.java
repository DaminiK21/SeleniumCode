package stepDefinations;

import PomLibrary.PassangerDetailFill;
import SpiceJet.CucumberSpiceJet.BaseClass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Landing_Page extends BaseClass{
	
	 @Given("^launch SpiceJet website$")
	    public void launch_spicejet_website() throws Throwable {
		 driver=initilizer();
		 driver.get(prop.getProperty("Url"));
	    }

	    @Then("^All details should be select successfully$")
	    public void all_details_should_be_select_successfully() throws Throwable {
	    	System.out.println("login success..");	
	    	System.out.println("done");
	    	System.out.println("done");
	    }

	    @And("^Select trip \"([^\"]*)\" radio button$")
	    public void select_trip_something_radio_button(String strArg1) throws Throwable {
	    	PassangerDetailFill obj= new PassangerDetailFill(driver);
	    	obj.RoundtripRadioButton();
	        
	    }

	    @And("^Select from \"([^\"]*)\"$")
	    public void select_from_something(String strArg1) throws Throwable {
	    	PassangerDetailFill obj= new PassangerDetailFill(driver);
	    	obj.source();
			obj.location();
	    	
	       
	    }

	    @And("^Select To \"([^\"]*)\"$")
	    public void select_to_something(String strArg1) throws Throwable {
	    	PassangerDetailFill obj= new PassangerDetailFill(driver);
	    	obj.destionation();
			obj.destlocation();
	    	
	    }
	        

	    @And("^Select departure date as \"([^\"]*)\"$")
	    public void select_departure_date_as_something(String strArg1) throws Throwable {
	    	
	    	PassangerDetailFill obj= new PassangerDetailFill(driver);
	    	obj.fromDate();
	    	obj.ToDate();
			obj.toDate();
	        
	    }

	    @And("^Select Passenger \"([^\"]*)\" and  \"([^\"]*)\"$")
	    public void select_passenger_something_and_something(String strArg1, String strArg2) throws Throwable {
	    	PassangerDetailFill obj= new PassangerDetailFill(driver);
	    	obj.passanger();
	    	obj.adult();
			obj.Child();  
	    }

	    @And("^Select currency as \"([^\"]*)\"$")
	    public void select_currency_as_something(String strArg1) throws Throwable {
	    	PassangerDetailFill obj= new PassangerDetailFill(driver);
	    	obj.currency();
	    }
	    @Then("^Close window$")
	    public void close_window() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	        driver.close();
	    }
}
