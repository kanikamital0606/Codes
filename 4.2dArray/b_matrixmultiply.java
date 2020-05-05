import java.io.*;
import java.util.*;
public class b_matrixmultiply{
	
	public static void main(String[] args) throws Exception{
		
		Scanner scn = new Scanner(System.in);

		//take matrix 1
		int n1 = scn.nextInt(); //No of rows'
		int m1 = scn.nextInt(); //no of coloumn
		int[][] arr1 = new int[n1][m1]; //declaration arr1
		
		
		for(int i=0; i < arr1.length; i++){   //input loop for arr1
			for(int j=0; j< arr1[0].length; j++){
				arr1[i][j] = scn.nextInt();
			}
		}

		//Matrix 2
		int n2 = scn.nextInt();  //No of rows'
		int m2 = scn.nextInt();  //no of coloumn

		int[][]arr2 = new int[n2][m2];  //declaration arr2
		
		for(int i=0; i<arr2.length; i++){  //take Input in arr2
			for(int j=0; j<arr2[0].length; j++){
				arr2[i][j] = scn.nextInt();
			}
		}

		// Check if no of column in arr1 != no of rows in arr2
		if(m1!=n2){ 
			System.out.println("Invalid Input");
			return; //back to main 
		} 

		//Result Matrix prd
		int[][] prd = new int[n1][m2];

		for(int i=0; i<prd.length;i++){
			for(int j=0; j<prd[0].length;j++){

				//work 
				for(int k=0; k<arr2.length; k++){

								 // arr1-> row fixed; arr2-> coloumn fixed
								 //arr1[i][?]*arr2[?][j];
					prd[i][j] += arr1[i][k]*arr2[k][j];
				}
			}
		}

		//Display result array
		for(int i=0; i<prd.length;i++){
			for(int j=0; j<prd[0].length;j++){
				System.out.print(prd[i][j]+" ");
			}
			System.out.println();
		}
	}
}