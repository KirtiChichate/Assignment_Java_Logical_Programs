package programs_30_3_22;

import java.util.Scanner;

public class SumOfDigitsInNumber {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int sum=0;

		while(num>0)
		{
		   sum=sum+num%10;
		   num=num/10;
		}
		System.out.println("sum of the digits in a number is: "+sum);
	}

}
