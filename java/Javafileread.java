import java.io.*;
import java.util.Scanner;
class Javafileread {
   public static void main(String[] args) throws FileNotFoundException {
		File file = new File(
			"C:\\Users\\hp\\Desktop\\Attendence.txt");
		Scanner sc=new Scanner(file);
    
		while (sc.hasNextLine())
     	System.out.println(sc.nextLine());

		sc.close();
	}
}

