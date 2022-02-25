package week1.day2;

import java.util.Arrays;

public class FindTheHighestValue {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		// array program
		
		int[] values ={10,20,30,70,50,90,40};
		
		// to find how many data are there values.length(its a property)
/*System.out.println(values.length);
	//Array.sort is the method to print the number ascending order 
		
		System.out.println(values[4]);
		
		//toget last item in the above output
		System.out.println(values[values.length-1]);*/
		Arrays.sort(values);
		//< less than value used to print 0,1,2,3,4,5,6
//		for(int i=0;i<values.length;i++)
//		{
//		System.out.println(values[i]);	
//      
//	}

	int indexOfSecondHgest =values.length-2;
	System.out.println(values[indexOfSecondHgest]);
		
}
	}
