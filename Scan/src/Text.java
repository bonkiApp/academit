import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Text {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream("Scan/src/text.txt"))) {
            ArrayList<String> list = new ArrayList<>();
            int i=0;
            while (scanner.hasNext()) {
//                String number = scanner.nextLine();
//                System.out.println(number);
                String line = scanner.nextLine();
                list.add(line);
//                System.out.println(line);


            }
            scanner.close();
            System.out.print(list);
        }
    }
}
