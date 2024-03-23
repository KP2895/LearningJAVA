package TestNG_Demo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Personal_Loan {
	
	@BeforeSuite
	void displayfirst() {
		System.out.println("Suite name:SuiteforParamerised_xml");
		
		
	}
	@BeforeTest
	void displaysecond() {
		System.out.println("Test name:Parametarisation_though_xml");
		
		
	}
	
	
@Parameters({"URL"})
@Test 
	void PLuser1(String URL ) {
	System.out.println("Smoke PL1");
		System.out.println("Personalloan_User1");
		System.out.println(URL);
	}

@Parameters({"URL1"})
@Test (groups ="Regression")
	
	void PLuser2(String url1) {
	System.out.println("Regression PL2");
		System.out.println("Personalloan_User2");
		System.out.println(url1);
	}
}
