//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Get Subsequence
// 1. You are given a string str.
// 2. Complete the body of getSS function - without changing signature - to calculate all subsequences of str.
// Use sample input and output to take idea about subsequences.
//												SAMPLE INPUT: 		abc
// 												SAMPLE OUTPUT:		[, c, b, bc, a, ac, ab, abc]
import java.io.*;
import java.util.*;

public class getSubsequence{

	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		ArrayList<String> ans = gss(str);
		System.out.println(ans);

		 
		
		
	}
	public static ArrayList<String> gss(String str){
		
		if(str.length()==0){
			ArrayList<String>baseAns = new ArrayList<>();
			baseAns.add("");
			return baseAns;
		}
		ArrayList<String> recAns = gss(str.substring(1));
		char ch = str.charAt(0);

		ArrayList<String> myAns = new ArrayList<>();

		for(int i=0; i<recAns.size(); i++){
			myAns.add(recAns.get(i));
		}
		for(int i=0; i<recAns.size(); i++){
			myAns.add(ch + recAns.get(i));
		}

		return myAns;
	}
}