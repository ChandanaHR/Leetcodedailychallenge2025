import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int zero=0,one=0;
        for(int i=0;i<n;i++) {
            if(s.charAt(i)=='0') {
                zero++;
            }
            if(s.charAt(i)=='1') {
                one++;
            }
        }
        int pz=0,po=0;
        int res = -1;
        for(int i=0;i<n-1;i++) {
            int z=0,o=0;
            if(s.charAt(i)=='0') {
                z++;
            }
            if(s.charAt(i)=='1') {
                o++;
            }
            if(z!=0) {
                zero = zero-z;
            }
            if(o!=0) {
                one  = one-o;
            }
            pz = z+pz;
            po = o+po;
            res = Math.max(res,pz+one);
        }
        System.out.println(res);
    }
}
