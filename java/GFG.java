import java.util.Scanner;
public class GFG {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("hello");
        int T=1;//sc.nextInt();
while(T>0){
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    a[i]=sc.nextInt();
    Kam k=new Kam();
    System.out.println(k.maxL(a,n));
    T--;

}
sc.close();
    }
    
}

class Kam   {
    int maxL(int[] a,int n){
        int sum=0;
        int l=0;
        for (int i = 0; i < a.length-1; i++) {
            sum+=a[i];
            for (int j = 1; j < a.length; j++) {
                
                 if(sum==0 && sum>l)
                 l=i;
                
            }
            
        }

  return l+1;  }
}
