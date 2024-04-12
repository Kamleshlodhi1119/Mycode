import java.util.Scanner;
public class Tcscode
{
public static void main (String[]args)
{
    Scanner   sc = new Scanner (System.in);
int n =7;//sc.nextInt(); 
int count =1;  //r1 g1 y2 r
// code  is sy that print frist odd word  whos is accour in  
char arr[] = {'r','b','b','z','g','y','y'};   
char oc ='A' ;
int flag=0;
sc.close();   
    for(int i = 0; i < n; i++) {  
        for(int j = i + 1; j <n; j++) {  
            if(arr[i] == arr[j])  {
                count++;
             arr[j]='0';
               }}  
               if(arr[i]!='0'){
               System.out.print(arr[i]);   
                    System.out.println(count);
               }

        if(count%2==1&& flag==0){
            oc =arr[i];
            flag=1;
        }
        count=1;    
}
    if(flag==1){
        System.out.println(oc);
    }
    else {
        System.out.println("not found");

    }
}

}