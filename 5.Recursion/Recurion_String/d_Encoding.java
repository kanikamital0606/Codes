import java.io.*;
import java.util.*;

public class d_Encoding{
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printEncodings(str, "");
    }
    public static void printEncodings(String ques, String ans) {
    //Base Case
        if(ques.length()== 0){
            System.out.println(ans); //all over hence chars return
            return; //move to next choice;
        }
        int num0 = ques.charAt(0)-'0';
        
        if(num0== 0){
            return; //0123
        }

        char code0 = (char)(num0 -1+'a');
        printEncodings(ques.substring(1), ans+code0);

        if (ques.length()>1){
            int num1 = ques.charAt(1)-'0';
            int num = num0 * 10 + num1;

            if(num<=26){
                char code1 = (char)(num-1+'a');
                printEncodings(ques.substring(2), ans+code1);
            }
        }
    }
}
/*
Input :123
Output:abc
       aw
       lc
       */
