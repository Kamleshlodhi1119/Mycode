import java.util.Scanner;
public class Try {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         String s=sc.next();
         char[] c=s.toCharArray();
         sc.close();
         int sum=0;
        if(c.length>6){
            sum+=50;
        }
        else{
            System.out.println("please enter the Size of password atleast in 6 digit");
        }
        for (int i = 0; i < c.length; i++) {
            if((c[i]>32 && c[i]<47) || (c[i]>57 && c[i]<65)||(c[i]>90 && c[i]<97)){
                sum +=20;//check special char
              //code written by kmalesh  thank you for watching
              //  System.out.println(sum+"score");
                break;
            }
        }
        for (int i = 0; i < c.length; i++) {
                if(c[i]>65 && c[i]<91 ){
                    sum +=15;//chech capital Alphabet
                //    System.out.println(sum+"score");
                    break;
                }
            }
         for (int i = 0; i < c.length; i++) {
                    if(c[i]>47 && c[i]<58){
                        sum +=15;//check number is present
                     //   System.out.println(sum+"score");
                        break;
                    } }    
                  
         System.out.println("Your password strong capacity % :"+sum);
        }
    }
    
// Simulated commit for streak: 2024-07-29
// Simulated commit for streak: 2024-07-30
// Simulated commit for streak: 2024-07-31
// Simulated commit for streak: 2024-08-01
// Simulated commit for streak: 2024-08-02
// Simulated commit for streak: 2024-08-03
// Simulated commit for streak: 2024-08-04
// Simulated commit for streak: 2024-08-05
// Simulated commit for streak: 2024-08-06
// Simulated commit for streak: 2024-08-07
// Simulated commit for streak: 2024-08-08
// Simulated commit for streak: 2024-07-29
// Simulated commit for streak: 2024-07-30
