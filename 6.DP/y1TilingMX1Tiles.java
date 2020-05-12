/*////////////////////////////////////////////////////////////Tiling With M * 1 Tiles
1.Number n and m  the length and breadth of a n * m floor.
2. You've an infinite supply of m * 1 tiles.
3. You are required to calculate and print the number of ways floor can be tiled using tiles.

Input Format: 	A number n, m
Output Format:	number of ways in which the number of ways floor can be tiled using tiles.
Sample Input:	39,	16
Sample Output	:61
*/

import java.io.*;
import java.util.*;

public class y1TilingMX1Tiles{
    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); //take n;\\
        int m = scn.nextInt();

        //create dp
        int[] dp = new int[n + 1];
		
        for(int i=1; i<=n; i++){

            if (i < m) {
		        dp[i] = 1;
            }
            
		    else if(i==m){
		        dp[i] = 2;
		    }
		    else{
                dp[i] = dp[i-1]+dp[i-m];
		    }
        }
        System.out.println(dp[n]);
        
    }
}