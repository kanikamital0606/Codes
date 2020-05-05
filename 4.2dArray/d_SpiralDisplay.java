import java.io.*;
import java.util.*;

public class d_SpiralDisplay{

	public static void spiralDis(int[][] arr){

		//declare 4 variables
		int rmin=0, cmin =0;
		int rmax = arr.length-1, cmax = arr[0].length-1; 
		int totalNoOfElements = arr.length*arr[0].length;
		int currElement = 0;


		//while(?)   condition print till no of elemntes all get printed
		while(currElement < totalNoOfElements){
			//left wall
			for(int i=rmin; i<=rmax && currElement<totalNoOfElements; i++){
				System.out.println(arr[i][cmin]);
				currElement++;
			}
			cmin++;
			
			//bottom wall
			for(int i=cmin; i<=cmax && currElement < totalNoOfElements; i++){
				System.out.println(arr[rmax][i]);	
				currElement++;
			}
			rmax--;
			
			//right wall
			for(int i=rmax; i>=rmin && currElement < totalNoOfElements; i--){ //i--going upward
				System.out.println(arr[i][cmax]);		
				currElement++;
			}
			cmax--;

			//TOP WALL
			for(int i=cmax; i>=cmin && currElement < totalNoOfElements; i--){
				System.out.println(arr[rmin][i]);		
				currElement++;
			}
			rmin++; 
		}
	}

	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int m = scn.nextInt();

		int[][] arr = new int[n][m];
		for(int i=0; i<arr.length;i++){
			for(int j=0; j<arr[0].length;j++){
				arr[i][j] = scn.nextInt();
			}
		}
		spiralDis(arr);
	}
}