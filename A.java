package Hd1;
//this is multilevel inheritance
public class A {
	 public void print_A()
	    {
	        System.out.println("A");
	    }
	}
	  
	class B extends A {
	    public void print_B() { 
	    	System.out.println("B"); }
	}
	  
	class C extends B {
	    public void print_C()
	    {
	        System.out.println("C");
	    }
	}
 class Ab {
		
	    public static void main(String[] args)
	    {
	        C g = new C();
	        g.print_A();
	        g.print_B();
	        g.print_C();
	    }
	}

