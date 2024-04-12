import java.math.BigDecimal;
import  java.math.*;
 
public class FloatingPoint {
    public static void main(String[] args) {
        java.util.Scanner sc= new java.util.Scanner(System.in);
        BigDecimal k=sc.nextBigDecimal();
        int r=k.precision()-k.scale();
        int m=k.scale();
        System.out.println(m+" "+r);
        sc.close();
        BigDecimal s=k.setScale(0,RoundingMode.DOWN);
        System.out.println(s);
        
        BigDecimal  f=k.subtract(s);
       // System.out.println(f);
       BigDecimal p=(BigDecimal.TEN.pow(r)).setScale(0,RoundingMode.DOWN);
       System.out.println(p);
        m=m*10;
        System.out.println(r+" "+m);
        BigDecimal result=f.multiply(new BigDecimal(m)).add(s.divide( new BigDecimal(r)));
        System.out.println(result);
        
       
    }
    
}
