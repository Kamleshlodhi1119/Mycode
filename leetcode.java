import java.util.*;
public class leetcode {
    public static void main(String[] args) {
        String s= "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
 public static int lengthOfLongestSubstring(String s) {
            char c[]=s.toCharArray();
            int count=1;
        int l=c.length;
            int[] k= new int[s.length()];
            for(int i=0;i<l-1;i++){
                for(int j=i+1;j<l;j++){
                    if(c[i]==c[j]){
                    System.out.println(j);   
                    break;}
                      
                }
                k[i++]=count-1;
            }
            Arrays.sort(k);
            //int t=k.length-1;
            return 0;
        }
}
    

