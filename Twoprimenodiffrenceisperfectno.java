    import java.util.Scanner;
    public class Twoprimenodiffrenceisperfectno {
    public static void main (String[] args){
    Scanner sc= new Scanner (System.in);
    int n= sc.nextInt();
    int m= sc.nextInt();
    sc.close();
    if ( !prim(n)&& !prim(m))
    {
    int d;
    if(m>n)
    d=m-n;
    else
    d=n-m;
    if (!perf(d))
    System .out.println ( "yes");
    else
    System.out.println("no");
    } }
    public static boolean perf(int n){
    int s=0;
    for (int i = 1;i<n/2;i++)
    if (n%i==0)
    s=s+i;
    if (s==n)
    return true;
    else
    return false ;
    }
    public static boolean prim(int n){
    boolean c=false;
    for (int i=2;i<n/2;i++){
    if (n%i==0){
    c=true; break;
    }
    }
    return c;
    }
    }
    //two prime no diffrence is perfect no. means if prime 13 and 29 the diff 
    
