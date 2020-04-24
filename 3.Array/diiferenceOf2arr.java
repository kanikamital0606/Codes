import java.io.*;
import java.util.*;

public class diiferenceOf2arr{

	public static int[] difference(int[] a, int []b){

		int[] ans = new int [b.length];

		int i=a.length-1;
		int j= b.length-1;
		int k = ans.length-1;

		int borrow =0;

		while(k>=0){
			int d2 = b[j];
			d2 = d2-borrow;
			borrow=0;
			int d1 =0;

			if (i>=0) {
				d1 = a[i];
			}
			if(d2<d1){
				borrow =1;
				d2 += 10;
			}
			ans[k] = d2 -d1;
			i--; j--; k--; 
		}
		return ans;
	}
	
	public static void main(String[] args) throws Exception {

		Scanner scn = new Scanner(System.in);
   // write your code here
		int s1 = scn.nextInt();

		int[] a = new int[s1];

		for (int i=0; i< s1; i++) {
		
			a[i] = scn.nextInt();
		}

		//size of b arr;
		int s2 = scn.nextInt();
		int[] b= new int[s2];
	
		for (int i=0; i<s2; i++) {
			b[i] = scn.nextInt();
		}

		int [] ans = difference(a,b);

		int idx =0;

		while(ans[idx] ==0){
			idx++;
		}
		//for(idx)
		for (; idx<ans.length; idx++) {
			System.out.println(ans[idx]);
		}
 	}

}