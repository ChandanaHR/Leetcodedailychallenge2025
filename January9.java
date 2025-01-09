import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] words = new String[n];
        for(int i=0;i<n;i++) {
            words[i] = sc.next();
        }
        String pref = sc.next();
        for(int i=0;i<n;i++) {
            System.out.print(words[i]+" ");
        }
        int count = 0;
        for(int i=0;i<n;i++) {
            String str = words[i];
            if(str.length()>=pref.length()) {
                if(str.startsWith(pref)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
