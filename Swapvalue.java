 import java.util.*;
    public class Swapvalue {
public static void main(String[] args){
Scanner k= new Scanner(System.in);
k.close();

int n=k.nextInt();
int []a= new int[n];
for ( int i=0;i<n;i++)
a[i]= k.nextInt();
int key=k.nextInt();
key=key%n;
System.out.print(a[key-1]);
for (int i=0;i<n;i++)
if(i!=(key-1))
System.out.print(a[i]+" ");
}

}
