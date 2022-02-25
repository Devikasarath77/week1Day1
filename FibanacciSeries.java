package week1.day2;

public class FibanacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 1 1 2 3 5 8 .... adding 1+1 2 2+1 3
		
		int range=8,firstNum=0,secNum=1;
		
		System.out.println(firstNum);
		
		for(int i=0;i<range;i++) {
			
			
			
			// add first and second number assign to sum

			// Assign second number to the first number

			// Assign sum to the second number
			
			// print sum
			int sum=firstNum+secNum;
			
			firstNum=secNum;
			
		secNum=sum;
			
			System.out.println(firstNum);
		}

	}

}
