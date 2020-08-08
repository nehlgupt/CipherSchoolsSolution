import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int test=0;test<t;test++){
        String str=sc.next();
        Stack<Character> st = new Stack<>();
        int i=0;
        for (i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                
                st.push(ch);
            }
            else if (ch == ')') {
                if (st.size() == 0 || st.peek() != '(') {
                    System.out.println(false);
                    break;
                } else {
                    st.pop();
                }
            }
            else if (ch == '}') {
                if (st.size() == 0 || st.peek() !='{')
                {
                    System.out.println(false);
                    break;
                } else {
                    st.pop();
                }
            } 
            else if (ch == ']') {
                if (st.size() == 0 || st.peek() != '[') {
                    System.out.println(false);
                    break;
                } else {
                    st.pop();
                }
            } 
            
        }

        if (st.size() == 0 && i==str.length() ) {
            System.out.println(true);
        }
        else if(i==str.length()) {
            System.out.println(false);
        }

        }
        
    }
}