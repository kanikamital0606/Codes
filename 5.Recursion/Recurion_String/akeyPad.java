// //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Get Kpc
// 1. You are given a string str. The string str will contains numbers only, where each number stands for a key pressed on a mobile phone.
// 2. The following list is the key to characters map
// 0 -> .;
// 1 -> abc
// 2 -> def
// 3 -> ghi
// 4 -> jkl
// 5 -> mno
// 6 -> pqrs
// 7 -> tu
// 8 -> vwx
// 9 -> yz
// 3. Complete the body of getKPC function - without changing signature - to get the list of all words that could be produced by the keys in str.
// Use sample input and output to take idea about output.
// Sample Input
// 78
// Sample Output
// [tv, tw, tx, uv, uw, ux]

import java.io.*;
import java.util.*;

public class akeyPad{
	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();

		//array list
		ArrayList<String> ans = getKPC(str);
		System.out.println(ans);
	}

	//globally Static
	static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

	public static ArrayList<String> getKPC(String ques){

		//base case
		if(ques.length() ==0){
			ArrayList<String> baseAns = new ArrayList<>();
			baseAns.add("");  //important line otherwise print [] only
			return baseAns;
		}

		ArrayList<String> recAns = getKPC(ques.substring(1));
		ArrayList<String> myAns = new ArrayList<>();

		int idx = ques.charAt(0) - '0';
		String word = codes[idx];

		for(int i=0; i< word.length(); i++){
			char ch = word.charAt(i);
			for(int j=0; j< recAns.size(); j++){
				myAns.add(ch + recAns.get(j));
			}
		}
		return myAns;
	}
}
