import java.io.*;
import java.util.*;
public class s2duplicatesBrackets{
    public static void main(String[] args) throws Exception{
        
        Scanner scn = new Scanner(System.in); //Input

        String str = scn.nextLine(); //Input String str
        
        Stack<Character> st = new Stack <>(); //Declare String 

        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == ')'){

                if(st.peek() == '('){
                    System.out.println(true);
                    return; //trminate code;
                }
                else{
                    while(st.peek() != '('){
                        st.pop();
                    }
                    st.pop(); //extra pop
                }
            }
            else{
                st.push(ch);
            }
        }
        System.out.println(false);
    }
} 
