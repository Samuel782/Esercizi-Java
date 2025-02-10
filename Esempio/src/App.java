import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        leggiFile("testo.txt");


    }

    public static void leggiFile(String path) {
        try {
            File myObj = new File(path);
            Scanner fileReader = new Scanner(myObj);

            System.out.println(fileReader.nextLine());

            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    public static void scriviFile(String path) {
        try {
            FileWriter myObj = new FileWriter(path);
            myObj.write("CIAO");
            myObj.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        
    }

}
