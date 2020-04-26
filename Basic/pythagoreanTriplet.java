import java.util.*;

public class pythagoreanTriplet{
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();

		// check which is greter in a,b,c
		int max = a;
		if (b>=max){
			max=b;
		}
		if (c>=max){
			max=c;
		}

		if(max==a){
			System.out.println(b*b + c*c);
		}
		else if(max==a){
			System.out.println(a*a + c*c);
		}
		else{
			System.out.println(a*a + b*b);
		}
		/*
		to find boolean terms 
		if(max==a){
			System.out.println((b*b + c*c) == (a*a));
		}
		else if(max==a){
			System.out.println((a*a + c*c) == (b*b));
		}
		else{
			System.out.println((a*a + b*b) == (c*c));
		}
		*/
	}

}
