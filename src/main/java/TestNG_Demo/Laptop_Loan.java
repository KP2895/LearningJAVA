package TestNG_Demo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Laptop_Loan {
	
	
	
	@Test
	void LPuser1() {
		
		System.out.println("LaptopLoanuser1");
		
	}
	//data from testng.xml
	
	@Test
	void LPuser2(String URL) {
		
		System.out.println("LaptopLoanuser2");
		System.out.println(URL);
		
		
	}
	
	
	//data from dataprovider
	
	@Test (dataProvider= "getdata")
	void LPuser3(String username ,String Pass) {
		
		System.out.println("LaptopLoanuser3");
		System.out.println(username +":"+ Pass);
		
	}

	
	@DataProvider
	
	public Object [][] getdata(){
		
		Object [][] data =new Object [3][2];
		
		//3 time execution with testdata inputs with 2 parameters
		
		
		//1st set
		 data [0][0]="Firstusername";
		 data [0][1]="FirstPass";
		 //2nd set
		 data [1][0]="Secondusername";
		 data [1][1]="Secondpass";
		 
		 //3rd set
		 data [2][0]="Thirdusername";
		 data [2][1]="Thirdpass";
		return data;
			
			
			
		}
					
	}
	
	
	
		
		

		
	
	
	
	
	


