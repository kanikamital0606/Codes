////////////////////////////>>>>>>>>>>>>>>>>>>>>>>>Wave Traversal
// Question
// 1. You are given a number n, representing the number of rows.
// 2. You are given a number m, representing the number of columns.
// 3. You are given n*m numbers, representing elements of 2d array a.
// 4. You are required to traverse and print the contents of the 2d array in form of a wave - down the first column then up the second column and so on.

import java.io.*;
import java.util.*;

public class c_WaveTraversal{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();

		int[][] arr = new int[n][m];

		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[0].length; j++){
				arr[i][j] = scn.nextInt();
			}
		}

		//Wave print
		for(int j=0; j<arr[0].length; j++){

			//check if coloumn(j) == odd or even
			if(j%2==0){
				for(int i=0; i<arr.length; i++){
					System.out.println(arr[i][j]);
				}
			}

			else{
				for(int i=arr.length-1; i>=0; i--){
					System.out.println(arr[i][j]);
				}
			}
		}
	}
}