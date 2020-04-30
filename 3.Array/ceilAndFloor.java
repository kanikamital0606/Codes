//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Ceil And Floor
import java.util.*;

public class ceilAndFloor{

	public static void findCAF(int[] arr, int data){
		
		if(data < arr[0]){
			System.out.println(arr[0]);
			System.out.println(-1);
			return;
		}
		else if (data > arr[arr.length-1]){
			System.out.println(-1);
			System.out.println(arr[arr.length-1]);
			return;
		}
		
		int lo =0 ;
		int high = arr.length-1;

		while(lo<=high){
			int mid = (lo+high)/2;

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
		System.out.println(arr[lo]);
		System.out.println(arr[high]);

	}
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int[] arr= new int[n];

		for(int i=0; i<arr.length; i++){
			 arr[i] = scn.nextInt();
		}

		int data = scn.nextInt();
		findCAF(arr,data);
	}
} 