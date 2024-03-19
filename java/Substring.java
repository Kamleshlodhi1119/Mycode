import java.util.Scanner;
import java.util.Arrays;
public class Substring {
public static void main(String []args) {
Scanner sc=new Scanner (System.in);
sc.close();
String kam=sc.nextLine();
char[] arr= kam.toCharArray();
int j=sc.nextInt();
int l=arr.length;
Arrays.sort(arr);
String s1=new String(arr);
System.out.print(s1.substring(l-j));
}
}
// String last latter print
 
