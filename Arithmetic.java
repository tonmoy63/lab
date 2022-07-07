package javaprogram;

public class Arithmetic {
	 public int add(int a, int b){
	        int sum = a + b; 
	        return sum;
	    }
	}

	class Adder extends Arithmetic{  
	    public int callAdd(int a, int b){
	        return add(a, b);
	    }
	}
	 class Sum {
		
	    public static void main(String []args){
	        Adder a = new Adder();
	        
	       
	        System.out.print(a.add(10,32));
	     }
	
}


	