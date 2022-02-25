package week1.day2;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//intial num and sum 
		int num=125;
		int sum=0;
		
		
		 //while loop 
		while(num>0)
		{
			
			//Within loop: get the remainder when done by 10 -> Tip: use mod %
			int digit =num%10;
			sum = sum+digit;	
			
			// Within loop: get quotient of that number (tip: quotient should be same variable of loop condition)
			num = num/10;	
		}
		
		
		System.out.println(sum) ;
	}

}
