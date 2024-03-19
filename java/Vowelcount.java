import java.util.Scanner;

public class Vowelcount {
public static void main(String []args) {
try (Scanner sc = new Scanner (System.in)) {
    String kam=sc.nextLine();
    char[] arr= kam.toCharArray();
    char ch[]=new char[kam.length()];
    int b=0;
    // char[] br= new int[l];
    for(int i=0; i<kam.length();i++){
    if (arr[i]=='a'||arr[i]=='e'|| arr[i]=='i'||arr[i]=='o'||arr[i]=='u'){
    ch[b++]=arr[i];
    } } System.out.print(new String (ch));
}
}
}
//Vowel in strin
