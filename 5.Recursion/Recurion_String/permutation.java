import java.io.*;
import java.util.*;

public class permutation{
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printPermutations(str, "");
    }

    public static void printPermutations(String ques, String ans){
        //base case 
        if(ques.length()== 0){
            System.out.println(ans); //all over hence chars return
            return; //move to next choice;
        }

        for(int i = 0; i < ques.length(); i++){
            char ch = ques.charAt(i); //add in ans 
            String roq = ques.substring(0, i) + ques.substring(i + 1); //0to i chrcter nikalo then i ke baad wale 
            printPermutations(roq, ans + ch);
        }
    }
}