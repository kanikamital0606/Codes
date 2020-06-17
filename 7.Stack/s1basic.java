// //Sysntax
// Stack<type>name = new Stack<>();

import java.util.*;
public class s1basic{
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        // st.pop(10);
        System.out.println("element on top of Stack => " + st.peek() + ", Stack size => " + st.size());
        st.push(40);
        st.push(50);
        System.out.println("Stack = "+st);
        System.out.println("element on top of Stack  => " + st.peek() + ", Stack size => " + st.size());
    }
}