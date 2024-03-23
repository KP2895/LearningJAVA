package TestNG_Demo;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Mobile_Loan {
	
	
	@BeforeTest
	void display()
	{
		
		System.out.println("Test name=Parametarisation_though_xmlpart2");
	}
	@Test
	void MBuser1() {
		
		System.out.println("MobileLoanuser1");
		
	}
	
	@Parameters ({"URL"})
	@Test
	void MBuser2(String URL) {
		
		System.out.println("MobileLoanuser2");
		System.out.println(URL);
		
	}
	
	@Test
	void MBuser3() {
		
		System.out.println("MobileLoanuser3");
		
	}
		
	
	
	
	
	

}
