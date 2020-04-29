import java.io.*;
import java.util.*;

public class first_And_Last_index{

	public static int firstIndex(int[] arr, int data){

		//do binary search here
		int low=0;
		int high =arr.length-1;
		//int mid = (low+high)/2;

		while (low<=high) {
			int mid = (low+high)/2;

			if(arr[mid]== data){
			
				if(mid>0 && arr[mid-1] == arr[mid]){ //mid and before mid both data is same then
					high = mid-1;
				} 
				else{
					return mid;
				}
			}
			else if(arr[mid] < data){
				low = mid+1;
			}
			else{
				high = mid-1;
			}
		}
		return -1;

	}

	public static int lastIndex(int[] arr, int data){

		int low =0, high = arr.length-1;
		// int mid = (low+high)/2;

		while(low<=high){

			int mid = (low+high)/2;

			if(arr[mid]== data){
				if(mid<arr.length-1 && arr[mid+1] == arr[mid]){ //mid and before mid both data is same then
					low = mid+1;
				}
				else{
					return mid;
				}
			}
			else if(arr[mid]<data){
				low=mid+1;
			}
			else{
				high= mid-1;
			}
		}
		return -1;
	}

	public static void main(String[] args) throws Exception {
    // write your code here
		Scanner scn = new Scanner(System.in);

    	int n = scn.nextInt();

    	int[] arr = new int[n];

    	for(int i=0; i<arr.length; i++){
    		arr[i] = scn.nextInt();
    	}

    	int data = scn.nextInt();

    	System.out.println(firstIndex(arr, data));
    	System.out.println(lastIndex(arr, data));
 	}
}
