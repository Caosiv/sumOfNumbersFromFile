import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfNumbersFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("zadanie1_5.txt");
        Scanner scanner = new Scanner(file);
        List<Integer> numbers = new ArrayList<>();
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            }
            else {
                scanner.next();
            }
        }
        int sumOfFileNumbers = 0;
        for (int number:numbers) {
            sumOfFileNumbers = sumOfFileNumbers + number;
            System.out.println(sumOfFileNumbers);
        }
    }
}