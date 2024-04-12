import java.util.*;
public class listsort {
    public static void main(String[] args) {
 Scanner sc= new Scanner(System.in) ;
String s=sc.nextLine();
sc.close();
String k="";
char c[]=s.toCharArray();
for (int i=0;i<s.length();i++){
   if(Character.isDigit(s.charAt(i))){
    k+=c[i];
    System.out.println(k);
   }
}
    }
    
}
