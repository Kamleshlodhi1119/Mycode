import java.util.Scanner;
public class Sameinput
{
public static void main (String[]args)
{
Scanner sc = new Scanner (System.in);
 
String s = sc.nextLine().toLowerCase();
if (!check(s)){
System.out.println("false");
sc.close();}
}
public static boolean check(String c ){
    
String k = "kamlesh";
String v = "vineet";
String m = "mayank";
String r = "rohit";

if(!(k.equals(c))){
System.out.println("lodhi");
return true;}
else if(!(v.equals(c))){
System.out.println(" saini");
return true;
}
else if(!(m.equals(c))){
    System.out.println("sahu");
    return true; }
    else if(!(r.equals(c))){
    System.out.println("kushwaha");
    return true;}
    else return false;
    }
    }
    