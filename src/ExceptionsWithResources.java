import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExceptionsWithResources {
    public static void main(String[] args) {
        try(PrintWriter writer = new PrintWriter("output.txt");){
            // FileInputStream fileInputStream = new FileInputStream("file.txt");
            // Scanner readline = new Scanner(fileInputStream);
// two lines of code above can be replaced with the below line of code which is more efficient and cleaner
            Scanner readLine = new Scanner(new FileInputStream("file.txt"));
            System.out.println("Enter a number: ");
            int n = readLine.nextInt();
            int m = readLine.nextInt();

            System.out.println("You entered: " + n +"and"+ m);

            
            writer.println("The sum is " + (n + m));

        } catch (FileNotFoundException e){
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
