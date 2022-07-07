package Hd1;

public class Teacher {
	
		   String designation = "Teacher";
		   String collegeName = "IMPS";
		   void work(){
			System.out.println("Teaching");
		   }
		}

		 class IITTeacher extends Teacher{
	
		   public static void main(String args[]){
			IITTeacher obj = new IITTeacher();
			System.out.println(obj.collegeName);
			System.out.println(obj.designation);
			
			obj.work();
		   }
		}

