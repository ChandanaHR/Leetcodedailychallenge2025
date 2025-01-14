import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i=0;i<n;i++) {
            A[i] = sc.nextInt();
        }
        int[] B = new int[n];
        for(int i=0;i<n;i++) {
            B[i] = sc.nextInt();
        }
        int[] freq = new int[n+1];
        int res[] = new int[n];
        int count = 0;
        for(int i=0;i<n;i++) {
            freq[A[i]]++;
            if(freq[A[i]] > 1) {
                count++;
            }
            freq[B[i]]++;
            if(freq[B[i]] > 1) {
                count++;
            }
            res[i] = count;
        }
        for(int i=0;i<n+1;i++) {
            System.out.print(freq[i]+" ");
        }
        for(int i=0;i<n;i++) {
            System.out.print(res[i]+" ");
        }
    }
}
