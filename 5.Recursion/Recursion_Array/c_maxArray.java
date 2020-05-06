import java.io.*;
import java.util.*;

public class c_maxArray{

	public static void main(String[] args) throws Exception{

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int[]arr = new int[n];

		for(int i=0; i<arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		int maximum = maxOfArray(arr,0);
		System.out.println(maximum);
	}

	public static int maxOfArray(int[] arr, int idx){
		//base case
		if(idx==arr.length-1){
			return arr[idx];
		}

		//int max =0;
		int max = maxOfArray(arr, idx+1);

		//max=Math.max(max,arr[idx])
		if(max >arr[idx]){
			return max;
		}
		else{
			return arr[idx];
		}
    }
}