//You are required to find the saddle point of the matrix which is defined as the value which is smallest in it's row but largest in it's column.
//Note - There can be only 1 saddle point or none. Think why?

import java.io.*;
import java.util.*;

public class saddlePoint{

	public static void sadlePoint(int[][] arr){

		for(int i=0; i<arr.length; i++) {
			
			int min = arr[i][0];
			int col =0;

			for(int j=1; j<arr[0].length; j++){
				if(arr[i][j] < min){
					min = arr[i][j];
					col= j;
				}
			}

			for(int r=0; r<arr.length; r++){
				
				if(arr[r][col]>min){
					col=-1;
					break;
				}
			}
			if(col >=0){
				System.out.println(min);
				return;
			}
		}
		System.out.println("Invalid input");
	}
	public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int n= scn.nextInt();
        int[][] arr = new int[n][n];

        for(int i=0; i<arr.length; i++) {
        	for(int j=0; j<arr.length; j++){
        		arr[i][j]= scn.nextInt();
        	}
        }

        sadlePoint(arr);
    }
}