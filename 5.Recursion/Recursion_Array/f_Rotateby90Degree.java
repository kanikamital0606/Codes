///////////////////////////////Rotate By 90 Degree
/*
 1. You are given a number n, representing the number of rows and number of columns.
2. You are given n*n numbers, representing elements of 2d array a.
3. You are required to rotate the matrix by 90 degree clockwise and then display the contents using display function.
*Note - you are required to do it in-place i.e. no extra space should be used to achieve it*

Sample Input				Sample Output

4
11 12 13 14 				41 31 21 11
21 22 23 24					42 32 22 12
31 32 33 34					43 33 23 13
41 42 43 44					44 34 24 14

*/
import java.io.*;
import java.util.*;
public class f_Rotateby90Degree{

	public static void rotate90(int[][] arr){

	}

	public static void display(int[][] arr){
		for(int i = 0; i < arr.length; i++){
			for(int j =0; j<arr[0].length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[][] arr = new int[n][n];

		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				arr[n][n] = scn.nextInt();
			}
		}

		rotate90(arr);
		display(arr);
	}
}