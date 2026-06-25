package Assignemnt_Java;

public class Typecasting_Assignment {

	public static void main(String[] args) {
		
		double value1= (double) 10.75f;
		int value2=(int) value1;
		
		System.out.println("The Value1:"+value1); //Widening Casting.
		System.out.println("The Value2:"+value2); //Narrowing Casting.During narrowing casting, the decimal part is removed.
	}

}
