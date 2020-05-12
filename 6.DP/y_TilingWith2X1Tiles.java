//////////////////////////////////////////////////////////////Tiling With 2 * 1 Tiles
/*
1. Number n = length of a floor space which is 2m wide. It's a 2 * n board.
2. You've an infinite supply of 2 * 1 tiles.
3. You are required to calculate and print the number of ways floor can be tiled using tiles.

Input Format : number n
Output Format: number representing the number of ways in which the number of ways floor can be tiled using tiles.
Sample Input: 8
Sample Output:34
*/

import java.io.*;
import java.util.*;

public class y_TilingWith2X1Tiles{
	public static void main(String[] args) throws Exception{

		Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt(); //take n;

		//create dp
		int[] dp = new int[n+1];

		//base case
		dp[1] = 1;
        dp[2] = 2;

		for(int i=3; i<=n; i++){
            dp[i] = dp[i-1]+dp[i-2];
            
        }

        System.out.println(dp[n]);
    }
}


