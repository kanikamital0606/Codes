/*//////////////////////Longest Palindromic Substring
1. string str.
2. print length of longest of palindromic substrings in string str.
Input Format:A string str
Output Format:length of longest of palindromic substrings in string str.
Sample Input:abccbc
Sample Output:4
*/

import java.io.*;
import java.util.*;
public class z8LongestPalindromicSubstr{
    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);
    	String str = scn.nextLine();

    	boolean[][] dp = new boolean[str.length()][str.length()];
    	int len=0;
    	for(int gap=0 ; gap<str.length(); gap++){ 
    		for( int i=0, j=gap; j<dp[0].length; j++, i++ ){
    			if( gap==0){ 
    				dp[i][j] = true;
    			}
    			else if( gap == 1){
    				if( str.charAt( i ) == str.charAt(j)){ 
    					dp[i][j] = true;
    				}
    			}
    			else{
    				if(str.charAt(i) == str.charAt(j) && dp[i+1][j-1] == true){
    					dp[i][j] = true;
    				}
    			}
    			if(dp[i][j] ==true){
    			    len = gap+1;
    			}
    		}
    	}
    	System.out.println(len);
    }
}
