import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)>=97 && s.charAt(i)<=122) {
                stack.push(s.charAt(i));
            }
            else {
                stack.pop();
            }
        }
        String res = "";
        while(!stack.isEmpty()) {
            res += stack.pop();
        }
        StringBuilder str = new StringBuilder(res);
        System.out.println(str.reverse().toString());
    }
}
