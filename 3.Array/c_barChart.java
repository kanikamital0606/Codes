import java.io.*;
import java.util.*;

public class c_barChart{
	public static void main(String[] args) throws Exception{

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		//Declare array
		int[] arr =  new int[n];

		//take input
		for (int i=0; i<arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		//find max
		int max = 0;
		for(int i=1; i<arr.length; i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
		//System.out.print(max);
		//now make a loop for floor in which each building is anlysed
		for(int floor= max; floor>=1; floor --){

			//make a loop for bilding 
			for (int i=0; i<arr.length; i++){
				//now check if each building id taller then floor;
				if(arr[i]>=floor){
					System.out.print("*\t");
				}
				else{
					System.out.print("\t");
				}
			}
			System.out.println();
		}

	}
		
}