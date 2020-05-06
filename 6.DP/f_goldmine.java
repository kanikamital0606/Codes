/*// //////////////////////>>>>>>>>>>>>>>>>>>>>>>>>>>Goldmine
// 1. You are given a number n, representing the number of rows.
// 2. You are given a number m, representing the number of columns.
// 3. You are given n*m numbers, representing elements of 2d array a, which represents a gold mine.
// 4. You are standing in front of left wall and are supposed to dig to the right wall. You can start from any row in the left wall.
// 5. You are allowed to move 1 cell right-up (d1), 1 cell right (d2) or 1 cell right-down(d3).


//>>>>>>>>>>>>>>>>>>>>>>>>>>SAMPLE INPUT 6
							// 			 6

							// 			 0 1 4 2 8 2	
							// 			 4 3 6 5 0 4
							// 			 1 2 4 1 4 6
							// 	    	 2 0 7 3 2 2
							// 			 3 1 5 9 2 4 
							// 			 2 7 0 8 5 1 
										
						 // SAMPLE OUTPUT : 33
*/
import java.io.*;
import java.util.*;

public class f_goldmine{
	public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] gold = new int[n][m];

        for(int i=0; i<n; i++){
        	for(int j=0; j<m; j++){
        		gold[i][j] = scn.nextInt();
        	}
        }

        int ans = maxGold(gold);
        System.out.println(ans);
    }

    public static int maxGold(int[][] gold){
    	//create dp array
    	int[][] dp = new int[gold.length][gold[0].length];

    	for(int j=dp[0].length-1; j>=0; j--){
    		for(int i=0; i<dp.length; i++){

    			if(j==dp[0].length-1){
    				dp[i][j] = gold[i][j];
    			}
    			else if(i==0){
    				int max = Math.max(dp[i][j+1],dp[i+1][j+1]);
    				dp[i][j] = gold[i][j]+max;
    			}
    			else if(i==dp.length-1){
    				int max = Math.max(dp[i][j+1], dp[i-1][j+1]);
    				dp[i][j] = gold[i][j]+max;
    			}
    			else{
    				int max = Math.max(dp[i-1][j+1], Math.max(dp[i][j+1], dp[i+1][j+1]));
    				dp[i][j] = gold[i][j]+max;
    			}
    		}
    	}
    	int ans = dp[0][0];
    	for(int i=1; i<dp.length;i++){
    		if(ans<dp[i][0]){
    			ans = dp[i][0];
    		}
    	}
    	return ans;
    }


}