public class Sort {
    public static void main(String[] args) {
        int k=0;
        int v=0;
     int a[]={5,-3,4,3,-100,20,-40,40,100};
     for(int i= 0;i<a.length;i++){
        for(int j= i+1;j<a.length;j++)
        {
           if(a[i]>0)
           k=a[i]*-1;
          else
          k=a[i];
          if(a[j]>0)
          v=a[j]*-1;
         else
         v=a[j];
    
    if(k<v){
    int temp=a[i];
    a[i]=a[j];
    a[j]=temp;
     }
    }
}
     for(int i=0;i<a.length;i++)
     System.out.print(a[i]+" ");
       }

}
