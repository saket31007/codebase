package Base;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World");
		
		sayHello("Saket Barmate");
	
		tablem(10, 2 );
		
		Start start = new Start();
		
		int sum =start.SumofThreeNum(50, 2, 2);
		System.out.println(sum);

	}
	
	public static String sayHello(String name)
	{
		System.out.println("Hello" +" Mr." + " "+ name.toUpperCase());
		
		return name;
		
		
	} 
	
	public static int tablem(int i, int n) {
		
		int t = i*i;
		
		
		for(int j =1; j <=i; j++) {
		
			System.out.println(n*j);
		}
		
		System.out.println(t);
		
		return t;}
	
	
	public static int SumofThreeNum(int firstNum , int SecondNum , int ThirdNum) {
		
		int sum =  firstNum +  SecondNum +  ThirdNum;
		
		return sum;
		
		
	}

}
