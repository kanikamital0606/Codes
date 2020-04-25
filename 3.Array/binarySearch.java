import java.util.*;

public class binarySearch{

	public static void main(String[] args){

		int[] arr ={ 2,2,2,3,3,5,7,8,912,23,24,25,89,98,56,344,74,58,10};
		
		int low =0;
		int high = arr.length-1;
		int data = 3;

		while(low<=high){
			int mid = (low+high)/2;

			if(arr[mid] == data){
				System.out.println(mid);
				break;
			}
			else if(arr[mid]<data){
				low = mid+1;
			}
			else{
				high = mid-1;
			}
		}
		if(low>high){
			System.out.println(-1);
		}

	}
}