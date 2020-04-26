import java.util.*;

public class gcdLcm{
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		int a=scn.nextInt();
		int b=scn.nextInt();

		//make a copy of each 
		int acopy =a;
		int bcopy =b;

		while(acopy%bcopy !=0){

			int rem = acopy%bcopy;
			acopy = bcopy;
			bcopy = rem;
		}

		int lcm = (a*b)/bcopy;
		System.out.println(bcopy);
		System.out.println(lcm);
	}
}