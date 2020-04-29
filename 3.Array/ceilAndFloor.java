//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Ceil And Floor
import java.util.*;

public class ceilAndFloor{

	public static void findCAF(int[] arr, int data){

		int lo =0 ;
		int high = arr.length-1;

		while(lo<=high){
			if(arr[mid]==data){
				System.out.println(data); //ceil;
				System.out.println(data); //floor
				return;
			}
			else if(arr[mid]<data){
				lo = mid+1;
			}
			else{
				high = mid-1;
			}	

	}

	public static void main(String[] args) throws Exception{

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int[] arr= new int[n];
		for(int i=0; i<arr.length; i++){
			 arr[i] = scn.nextInt();
		}

		int data = scn.nextInt();

		if(data < arr[0]){
			System.out.println(arr[0]);
			System.out.println(-1);
		}
		else if(data > arr[n-1]){
			System.out.println(-1);
			System.out.println(arr[n-1]);
		}
		else{
			findCAF(int[] arr, int data);
		}
	}
} 