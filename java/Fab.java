import java.util.Scanner; //This package for reading input
public class Fab{ 
    
      public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the number of terms: ");
        int n = in.nextInt();
        int cpp=0;
        in.close();
        int a = 0, b = 1, c=2;
        //System.out.print(a + " " + b);
        for (int i = 2; i < n; i++) {
          c = a + b;
          if(c>=n){
          cpp++;System.out.println(cpp);}
          a = b;
          b = c;
        }
        System.out.println(cpp);
      }
    }