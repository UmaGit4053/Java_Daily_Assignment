package Assignemnt_Java;

import java.util.Scanner;

public class StudentGradeCal_Assignment {

	public static void main(String[] args) {
		
		Scanner  sc =new Scanner (System.in);

		
		System.out.print("Enter Your Name :");
		String name=sc.nextLine();
		
		System.out.print("Enter Your mark :");
		int mark=sc.nextInt();
		
        
        if(mark>=90 && mark<=100)
        {
          //  System.out.println(name+ " , Your Grade is A" );
        	System.out.println("Name :" +name);
        	System.out.println("Mark :" +mark);
        	System.out.println("Your Grade is A");
        	
        }
        else if (mark>=75 && mark<=89)
        {
            System.out.println(name+ " , Your Grade is B");
        }
        else if (mark>=60 && mark<=74)
        {
            System.out.println(name+ " , Your Grade is C");
        }
        else if (mark>=40 && mark<=59)
        {
            System.out.println(name+ " , Your Grade is D");
        }
        else
        {
            System.out.println(name+ " , You are faill");
        }

	}

}
