/*//////////////////////////////////////////////Longest Common Subsequence
1. You are given a string str1.
2. You are given another string str2.
3. You are required to print the length of longest common subsequence of two strings.

Input Format: A string str1; A string str2
Output Format: length of longest common subsequence of two strings.
Sample Input: 	abcd,aebd
Sample Output:  3
*/
import java.io.*;
import java.util.*;
public class z3LongestCommonSubsequence {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
    	String a = scn.nextLine();
    	String b = scn.nextLine();
    	
    	if(a.length()==0 || b.length()==0){
    	    System.out.println(0);
    	    return;
    	}
        
        int[][] dp = new int[a.length() + 1][b.length() + 1];
        for(int i = dp.length - 2; i >= 0; i--){
            for(int j = dp[0].length - 2; j >= 0; j--){
                if(a.charAt(i) == b.charAt(j)){
                    dp[i][j] = 1 + dp[i + 1][j + 1];
                } else {
                    int max = Math.max(dp[i][j + 1], dp[i+1][j]);
                    dp[i][j] = max;
                }
            }
        }
        System.out.println(dp[0][0]);
    }
}