package Assignemnt_Java;

public class LargestNum_Assignment {

	public static void main(String[] args) {
		
		int num = 59371;
		int largest=0;
		
		for (;num>0;) {
			
			num=num/10; // this is for iteration
		int digit=num%10; // this is for separate the last digit
			
			if(digit>largest) 
			{
				largest=digit;
			}
		}
		System.out.println("The Largest num is : " + largest);

}
}
