package Lab7;
// TONMOY HALDER
public class TaxCalculator {
	public double calculateTax(String empName, boolean isIndian, double empSal) {
		double taxAmount=0;
		try {
			if(isIndian!=true) {
	throw new Exception("The employee should be an Indian citizen for calculating tax");
			}
			if(empName==null) {
				throw new Exception("The employee name cannot be empty");
				}
			else if (empSal>50000 && empSal<100000 && isIndian==true) {
				return taxAmount=empSal*6/100;//logic
			}
			else if (empSal>30000 &&  empSal<50000 && isIndian==true) {
				return taxAmount=empSal*5/100;
		}	
			else if (empSal>10000 && empSal<30000 && isIndian==true) {
				return taxAmount=empSal*4/100;
	}
			else {
				throw new Exception("The employee does not need to pay tax");
			}}
		catch (Exception e) { //catch block
			System.out.println(e);
		}
		return taxAmount;

	}
}
class CalculatorSimulator{
	public static void main(String[] args) {
	TaxCalculator hd=new TaxCalculator ();
	System.out.println("Tax amount is"+ hd.calculateTax("Ron", false,34000));//method calling and printing
	System.out.println("Tax amount is"+ hd.calculateTax("Tim", true,1000));
	System.out.println("Tax amount is"+ hd.calculateTax("Jack", true,55000));
	System.out.println("Tax amount is"+ hd.calculateTax("null", true,30000));
	
	}}
