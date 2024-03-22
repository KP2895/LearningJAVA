package TestNG_Demo;

import org.testng.annotations.Test;

public class Home_Loan {

	@Test (groups ="Smoke")
	
	void HLuser1() {
		System.out.println("Smoke HL1");
		System.out.println("Homeloan_User1");
	}
	
@Test 
	
	void HLuser2() {
		
		System.out.println("Homeloan_User2");
	}
@Test 

void HLuser3() {
	
	System.out.println("Homeloan_User3");
}
	
	
	
}



