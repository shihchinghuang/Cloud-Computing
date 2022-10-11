import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GenerateRandomNumbers {
    public static void main(String[] args) {
        System.out.println("Numbers: ");   // 1000000
        Scanner input = new Scanner(System.in);
        int RandomNumCount = input.nextInt();

        System.out.println("Radius: ");   //200
        int radius = input.nextInt();
        int diameter = radius * 2;
        input.close();

        try {

            // create file input
            File file = new File("./PiCalculationInput");
            file.createNewFile();

            // input data 
            FileWriter writer = new FileWriter(file);

            for (int i = 0; i < RandomNumCount; i++) {
                int xvalue = (int) (Math.random() * diameter);
                int yvalue = (int) (Math.random() * diameter);
                writer.write("(" + xvalue + "," + yvalue + ") ");
            }

            // send the data into the file
            writer.flush();

            // closing the write after pushing the data inside the .txt file
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
