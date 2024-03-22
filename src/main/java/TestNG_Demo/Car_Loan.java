package TestNG_Demo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Car_Loan {

	@BeforeSuite
	void beforeSuite() {
		System.out.println("Beforesuite");
	}

	@AfterTest
	void Aftertest() {

		System.out.println("AfterTestCL");
	}

	@BeforeTest
	void beforetest() {

		System.out.println("BeforeTestCL");
	}

	@Test(groups ={"Smoke","Regression"})

	void CLuser1() {
		System.out.println("Smoke & RegressionCL1");
		System.out.println("Carloan_User1");
	}

	@Test(groups ="Regression")

	void CLuser2() {
System.out.println("RegressionCL2");
		System.out.println("Carloan_User2");
	}

	@Test

	void CLuser3() {

		System.out.println("Carloan_User3");
	}

	@AfterSuite
	void aftersuit() {
		System.out.println("AfterSuitePL");

	}

}
