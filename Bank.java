package Hd1;

public class Bank {
	float getRateOfInterest(){return 0;}  
	}  
	class SBI extends Bank{  
	float getRateOfInterest(){return 8;}  
	}   
	class ICICI extends Bank{  
	float getRateOfInterest(){return 7;}  
	}  
	class AXIS extends Bank{  
	float getRateOfInterest(){return 9;}  
	}  
	class Test{  
	public static void main(String args[]){  
	SBI s=new SBI();  
	ICICI i=new ICICI();  
	AXIS a=new AXIS();  
	System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());  
	System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());  
	System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());  
	}  
	}  


