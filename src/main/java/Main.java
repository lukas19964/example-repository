import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        //scanner
        Scanner scanner = new Scanner(System.in);

        //buffor wprowadzania wartosci
        List<String> list = new LinkedList<>();

        //Pytaj o wartosci
        while (true){
            System.out.println("Enter some string");
            String line = scanner.nextLine();

            if(line.equals("QUIT")) {
                break;

            }else{
                list.add(line);
            }

        }

        //zapis do pliku
        Files.write(
                Paths.get("D:\\LukasG\\output.txt"),
                list,
                Charset.forName("UTF-8"),
                StandardOpenOption.CREATE,
                StandardOpenOption.TRUNCATE_EXISTING
        );

    }

}
