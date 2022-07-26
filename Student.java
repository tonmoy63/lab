package com.kogent;
/*
 * author Tonmoy Halder
 */
public class Student {
	int stu_no;
	String stu_name;
	String stu_mail;
	String stu_address;
	double stu_fees;
	
	public  Student(int no,String name,String mail,String address) {
		this.stu_no=no;
		this.stu_name=name;
		this.stu_mail=mail;
		this.stu_address=address;
	}
	public void StudentFees(double fees) {
		
	
	if(fees<=2000) {
		fees+=10*fees/100;
	}this.stu_fees=fees;
	}
	public void display() {
		System.out.println("Student no:" +stu_no+" , Student name:" +stu_name+", Student mail: "+stu_mail+", Student Address:"+stu_address+", Student Fees:" +stu_fees);
	}

}
class Student1{
	  public static void main(String[] args) {
		  Student obj[]=new Student[5];
		  obj[0]=new Student(123,"Tonmoy","tonmoy@gmail","Murshidabad");
		  obj[1]=new Student(124,"Masud","masud@gmail","Murshidabad");
		  obj[2]=new Student(125,"Suvo","suvo@gmail","Malda");
		  obj[3]=new Student(126,"Sahil","sahil@gmail","Nadia");
		  obj[4]=new Student(127,"Shain","shain@gmail","Murshidabad");
		  obj[0].StudentFees(1000);
		  obj[1].StudentFees(2000);
		  obj[2].StudentFees(3000);
		  obj[3].StudentFees(4000);
		  obj[4].StudentFees(5000);
		  for(Student i:obj) {
			  i.display();
		  }
	  }
}
