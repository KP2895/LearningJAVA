package TestNG_Demo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Personal_Loan {
	
	
@Parameters({"URL"})
@Test 
	void PLuser1(String url ) {
	System.out.println("Smoke PL1");
		System.out.println("Personalloan_User1");
		System.out.println(url);
	}

//@Parameters({"URL1"})
@Test (groups ="Regression")
	
	void PLuser2() {
	System.out.println("Regression PL2");
		System.out.println("Personalloan_User2");
		//System.out.println(url1name);
	}
}
