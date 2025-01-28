//My solution
import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static boolean dfs(int c,int d,boolean visited[],List<List<Integer>> arr ) {
        visited[c] = true;
        if(c==d) {
            return true;
        }
        boolean resu = false;
        for(int item : arr.get(c)) {
            if(!visited[item]) {
               resu =  dfs(item,d,visited,arr);
            }
            if(resu == true) {
                return resu;
            }
        }
        return resu;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCourses = sc.nextInt();
        int prerequisiteslen = (numCourses*(numCourses-1)/2);
        int[][] prerequisites = new int[prerequisiteslen][2];
        for(int i=0;i<prerequisiteslen;i++) {
            for(int j=0;j<2;j++) {
                prerequisites[i][j] = sc.nextInt();
            }
        }
        System.out.println(prerequisiteslen);
        for(int i=0;i<prerequisiteslen;i++) {
            for(int j=0;j<2;j++) {
                System.out.print(prerequisites[i][j]+" ");
            }
            System.out.println();
        }
        int querieslen = sc.nextInt();
        int[][] queries = new int[querieslen][2];
        for(int i=0;i<querieslen;i++) {
            for(int j=0;j<2;j++) {
                queries[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<querieslen;i++) {
            for(int j=0;j<2;j++) {
                System.out.print(queries[i][j]+" ");
            }
            System.out.println();
        }
        List<Boolean> res = new ArrayList<>();
        List<List<Integer>> arr = new ArrayList<>();
        for(int i=0;i<=numCourses;i++) {
            arr.add(new ArrayList<>());
        }
        for(int[] adj : prerequisites) {
            int a = adj[0];
            int b = adj[1];
            arr.get(a).add(b);
        }
        System.out.println(arr);
        for(int i=0;i<querieslen;i++) {
            int c = queries[i][0];
            int d = queries[i][1];
            boolean visited[] = new boolean[numCourses+1];
            boolean result = dfs(c,d,visited,arr);
            res.add(result);
        }
        System.out.println(res);
    }
}
