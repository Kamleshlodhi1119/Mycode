//import java.util.*;
//code for conversion binary to decimal no
public class BinaryTodecimal {
      
            public static void main(String args[]){
                java.util.Scanner sc=new java.util.Scanner(System.in);
                long bn=sc.nextInt();
                sc.close();
                // code by kamlesh
                long dn = 0;
                int power = 0;
                while(bn > 0){
                    long t =bn%10;
                     
                    dn += t*Math.pow(2, power);
                   
                   bn =bn/10;
              
                    power++;
                }
                System.out.println("Decimal value is: "+dn);

             
            }
        }
    
