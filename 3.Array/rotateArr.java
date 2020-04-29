//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Rotate An Array
import java.io.*;
import java.util.*;

public class rotateArr{

	public static void reverse(int[] a, int i, int j){
		while(i<j){
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		i--; j--;
	}

	public static void rotate(int[]a , int k){
		k = k%a.length;
		if(k<0){
			k = k+a.length;
		}
		reverse (a, a.length-k, a.length -1);
    	reverse (a, 0, a.length -k -1);
    	reverse (a, 0, a.length -1);
    }

	public static void main(String[] args) throws Exception {

		Scanner scn = new Scanner(System.in);

		int s1 = scn.nextInt();

		int[] a = new int[s1];

		for (int i=0; i< s1; i++) {
		
			a[i] = scn.nextInt();
		}

		int k= scn.nextInt();
		int [] ans = rotate(a,b);

		System.out.println(ans[]);
 	}
}