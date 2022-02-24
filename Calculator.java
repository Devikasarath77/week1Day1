package week1.day2;

public class Calculator {
	
	//add
	
public int add()
{
	int a=1;
	int b =2;
	int c=6;
	int sum =a+b+c;
	
//	 while using return type either we can print using the object creation or 
//	the below print statement can be used 
	System.out.println(sum);
	return(sum);
	
	
	
}

//sub

public int sub() {
	int a = 7 ;
	int b = 8 ;
				int sub = a - b  ;
				System.out.println(sub);			
 return sub;
	}

//mult with double

public double mul() {
	double a = 4.0089809;
	double b = 2.00456004;
	double multi = a *b;
	System.out.println(multi);
			return multi;

}


//divi float
public float div() {
	float a = 4.0000f;
	float b = 2.0000f;
	float divi = a/b;
	System.out.println(divi);
		return divi;
		
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Calculator obj =new Calculator();
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();
		
//		System.out.println(obj.add());
//		System.out.println(obj.sub());
//		System.out.println(obj.mul());
//		System.out.println(obj.div());
}

}
