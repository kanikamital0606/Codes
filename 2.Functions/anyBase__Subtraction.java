//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Any Base Subtraction
/*
	1. You are given a base b.
  	2. You are given two numbers n1 and n2 of base b.
  	3. You are required to subtract n1 from n2 and print the value.

Input Format: A base b
  			  A number n1
			  A number n2
Output Format: A number of base b equal in value to n2 - n1.

Sample Input:> 8
  			   1
  			   100
Sample Output: > 77;
*/

import java.util.*;

public class anyBase__Subtraction{

	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int b = scn.nextInt();
      	int n1 = scn.nextInt();
      	int n2 = scn.nextInt();

      	int d = getDifference(b, n1, n2);
      	System.out.println(d);
	}

	public static int getDifference(int b, int n1, int n2){
		int ans=0; 
		int pow = 1;
		int borrow =0;

		while(n2>0){
			int d1 = n1%10; n1=n1/10;
      		int d2 = n2%10; n2=n2/10;

      		d2= d2-borrow;
      		borrow=0;

      		if(d2<d1){
      			d2=d2+b;
      			borrow=1;
      		}
      		ans = ans+(d2-d1)*pow; //update ans;
      		pow = pow*10; //update ans;
      	}
      	return ans; 
    }
}