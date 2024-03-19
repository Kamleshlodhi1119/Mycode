 
import java.util.Scanner;
public class Newcode
{
public static void main (String[]args)
{
    Scanner sc = new Scanner (System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
int flag=0;
    for(int i=0;i<a.length;i++){
      a[i]=sc.nextInt();
    }
    sc.close();
   
    for(int i=0;i<a.length;i++){
      if(i==0){
        if(a[i]>a[i+1])
        System.out.print(a[i]);
        else flag=1;
      }else  if(i==a.length-1){
        if(a[i]>a[i-1])
        System.out.print(a[i]);
        else flag=1;
      } else {
        if(a[i]>a[i+1] && a[i]>a[i-1])
        System.out.print(a[i]);
        else flag=1;
      }
        
    }if(flag!=1)
    System.out.print(" hello kamlesh ");
     
}
}