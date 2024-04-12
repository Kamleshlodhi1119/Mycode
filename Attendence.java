import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//wronge output
public class Attendence {
    public static void main(String[] args) {
        int totalOccurrences = 0;
        File folder = new File("C:\\Users\\hp\\Desktop\\Attendences2024");
        File[] listOfFiles = folder.listFiles();
        File nameFile = new File("C:\\Users\\hp\\Desktop\\Mycode\\java\\Attendences2024\\Attendence.txt");
        try {
            Scanner nameScanner = new Scanner(nameFile);
            String nameToSearch = nameScanner.nextLine();
            nameScanner.close();
            for (File file : listOfFiles) {
                if (file.isFile() && file.getName().endsWith(".txt")) {
                    try {
                        Scanner scanner = new Scanner(file);
                        while (scanner.hasNextLine()) {
                            String line = scanner.nextLine();
                            String[] words = line.split(" ");
                            for (String word : words) {
                                if (word.equalsIgnoreCase(nameToSearch)) {
                                    totalOccurrences++;
                                }
                            }
                        }
                        scanner.close();
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Name file not found");
        }
        System.out.println("Total occurrences of "+  ": " + totalOccurrences);
    }
}

