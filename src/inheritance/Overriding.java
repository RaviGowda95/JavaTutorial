package inheritance;

class Bank
{
	int getInterestRates() {
		return 0;
		
	}
}

class SBI extends Bank
{
	int getInterestRates() { //overriden
		return 10;
		
	}
}

class ICICI extends Bank
{
	int getInterestRates() { //overriden
		return 11;
		
	}
}

class AXIS extends Bank
{
	int getInterestRates() { //overriden
		return 12;
		
	}
}

public class Overriding {
	
	public static void main(String[] args) {
		
		SBI sbiobj = new SBI();
		System.out.println(sbiobj.getInterestRates());  //10
		
		ICICI icobj = new ICICI();
		System.out.println(icobj.getInterestRates());   //11
		
		AXIS axisobj = new AXIS();
		System.out.println(axisobj.getInterestRates()); //12
		
		
	}
}
