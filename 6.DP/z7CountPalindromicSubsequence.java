/*//////////////////////////////////Count Palindromic Subsequences
1. You are given a string str.
2. You are required to print the count of palindromic subsequences in string str.
                               
Input Format:	A string str
Output Format:	A number representing the count of palindromic subsequences in string str.
Sample Input:	ccbbgd
Sample Output:	8
*/

import java.io.*;
import java.util.*;

public class z7CountPalindromicSubsequence{

    public static void main(String[] args) throws Exception {
    	Scanner scn = new Scanner(System.in);
    	String str = scn.nextLine();

    	int[][] dp = new int[str.length()][str.length()];

    	for(int gap=0 ; gap<str.length(); gap++){ 
    		for( int i=0, j=gap; j<dp[0].length; i++, j++ ){
    			if( gap==0){ 
    				dp[i][j] = 1;
    			}
    			else if( gap == 1){
    				if( str.charAt( i ) == str.charAt(j)){ 
    					dp[i][j] = 3;
    				}
    				else{
    					dp[i][j] = 2;
    				}
    			}
    			else{
    				if(str.charAt(i) == str.charAt(j)){
    					dp[i][j] = dp[i][j-1] + dp[i+1][j] +1;
    				}
    				else{
    					dp[i][j] = dp[i][j-1] + dp[i+1][j] -dp[i+1][j-1];
    				}
    			}
    		}
    	}
    	System.out.println(dp[0][dp[0].length-1]);
    }

}
