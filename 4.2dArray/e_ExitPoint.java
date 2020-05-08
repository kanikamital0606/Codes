//////////////////////////////////////Exit Point Of A Matrix
/*
1. You are given a number n, representing the number of rows.
2. You are given a number m, representing the number of columns.
3. You are given n*m numbers (1's and 0's), representing elements of 2d array a.
4. Consider this array a maze and a player enters from top-left corner in east direction.
5. The player moves in the same direction as long as he meets '0'. On seeing a 1, he takes a 90 deg right turn.
6. You are required to print the indices in (row, col) format of the point from where you exit the matrix.

						4 4
						0 0 1 0
						1 0 0 0
						0 0 0 0
						1 0 1 0

						output = [1][3]
*/
import java.io.*;
import java.util.*;
public class e_ExitPoint{

	public static void exitPoint(int[][] arr){
		//declare row ; coloumn = 0
		//initial start
		int row=0, col=0, dir=0;

		//while true
		while(true){
			dir+= arr[row][col];
			dir = dir % 4; 
			
			if(dir==0){  //dir towards x axis || right direction
				col++;
			}

			else if(dir==1){ //dir towards -y axis || downwards direction
				row++;
			}

			else if(dir==2){ //dir towards -x axis || left direction
				col--;
			}

			else{
				row --;
			}

			//check condition if row is length then 0 or coloumn <0 then break bcz it will move out of array
			if(row<0 || row == arr.length || col<0 || col == arr[0].length){
				break;
			}
		}
		if(row<0){
			row++;
		}
		else if(col<0){
			col++;
		}
		else if(row == arr.length){
			row--;
		}
		else if(col == arr[0].length) {
			col--;
		}

		System.out.println(row);
		System.out.println(col);

	}
	public static void main(String[] args)throws Exception{
		Scanner scn = new Scanner(System.in);

		int m = scn.nextInt();
		int n = scn.nextInt();

		int[][] arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
            	arr[i][j] = scn.nextInt();
            }
        }

        exitPoint(arr);
    }
}
