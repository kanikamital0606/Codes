import java.io.*;
import java.util.*;

public class s3BalancedBrackets{

    public static void main(String[] args) throws Exception{
        
        Scanner scn = new Scanner(System.in); //Input

        String str = scn.nextLine(); //Input String str
        
        Stack<Character> st = new Stack <>(); //Declare String 

        for(int i =0; i<str.length(); i++){
        
            char ch = str.charAt(i);
            
            if(ch == '(' || ch =='{' || ch =='['){
                st.push(ch);
            }
            else if( ch ==')'){
                boolean val = handleClosing(st, '(');
                if(val == false){
                    System.out.println(val);
                    return;
                }
            }

            else if(ch == '}'){
                boolean val = handleClosing(st, '{');
                if(val == false){
                    System.out.println(val);
                    return;
                }
            }
            else if(ch ==']'){
                boolean val= handleClosing(st, '[');
                if(val == false){
                    System.out.println(val);
                    return;
                }
            }
            else{}
        }

        if(st.size() ==0){
            System.out.println(true);
            return;
        }
        else{
            System.out.println(false);
            return;
        }
    }

    public static boolean handleClosing(Stack<Character> st, char corresoCh){ //Corresponding opening character => corresoCh

        if(st.size() == 0){
            return false;
            
        }

        else if(st.peek() != corresoCh){
            return false;
        }

        else{
            st.pop();
            return true;
        }
    }
}
