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