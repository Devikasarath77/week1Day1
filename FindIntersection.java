package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values = {3,2,11,4,6,7};
		int [] values1 = {1,2,8,4,9,7};
		
		for (int i = 0; i < values.length; i++) 
		{
			for (int j = 0; j < values1.length; j++)
			{
			
				if (values[i]==values1[j])
				{
					System.out.println(values[i]);
					
					// printing the matching inputs from the array list given 
				}
			}
		}
	}

}
