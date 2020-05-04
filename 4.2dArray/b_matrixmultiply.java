import java.io.*;
import java.util.*;

public class b_matrixmultiply{
	public static void main(String[] args) throws Exception{
		Sacnner scn = new Scanner(System.in);

		//take matrix 1
		int n1 = scn.nextInt();
		int m1 = scn.nextInt();

		int[][] arr1 = new int[n1][m1];
		//take Input in arr2
		for(int i=0; i<n1; i++){
			for(int j=0; j<m1; j+=){
				arr1[i][j] = scn.nextInt();
			}
		}

		//Matrix 2
		int n2 = scn.nextInt();
		int m2 = scn.nextInt();

		int[][]arr2 = new int[n1][m1];
		//take Input in arr2
		for(int i=0; i<n2; i++){
			for(int j=0; j<m2; j+=){
				arr1[i][j] = scn.nextInt();
			}
		}

		// Check if no of column in arr1 != no of rows in arr2
		if(m1!=m2){ 
			System.out.println("Invalid Input");
			return; //back to main 
		} 

		//Result Matrix prd
		int[][] prd = new int[n1][m2];

		for(int i=0; i<prd.length;i++){
			for(int j=0; j<prd[0].length;j++){

				//work 
				
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