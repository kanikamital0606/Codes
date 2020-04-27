import java.io.*;
import java.util.*;

public class a_spanOfarr{

	public static void main(String[] args) throws Exception{

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt(); //no of elements in aaray;

		int[] arr = new int[n]; //Define Array 

		//Take input for array
		for (int i=0; i<arr.length; i++){
			arr[i]=scn.nextInt();
		}

		int max = arr[0];
		int min = arr[0];

		//check max;
		for (int i=1; i<arr.length; i++){
			if(arr[i]> max){
				max=arr[i];
			}
			if(arr[i]<min){
				min =arr[i];
			}
		}

		int span = max-min;
		System.out.println(span);
	}



}

// Sample Input: 6 15 30 40 4 11 9
//Sample Output :40-4 = 36
