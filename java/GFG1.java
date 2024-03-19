 
import java.util.*;
//import java.io.*;

public class GFG1 {

    public static void main(String[] args) throws Exception {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int tc = Integer.parseInt(br.readLine().trim());
        // while (tc-- > 0) {
        //     String[] inputLine;
        //     int n = Integer.parseInt(br.readLine().trim());
        //     int[] arr = new int[n];
        //     inputLine = br.readLine().trim().split(" ");
        //     for (int i = 0; i < n; i++) {
        //         arr[i] = Integer.parseInt(inputLine[i]);
        //     }
int arr[]={12,35,35,10,4,1};int n=6;
            int ans = new Solution().print2largest(arr, n);
            System.out.println(ans);
       // }
    }
}
 

class Solution {
    int print2largest(int a[], int n) {
        int k=-1;
        Arrays.sort(a);
        //int p=a[a.length-1];
       // System.out.println(p);
      //  for(int i=n-1;i>=0; i--){
      //  System.out.print(a[i]+" ");}
        for(int i=n-2;i>=0;i--){
            if(a[i]!=a[n-1]){
          k=a[i];
          break;
            }
        }
        
       
       return  k;
    }
}