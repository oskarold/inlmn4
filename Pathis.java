import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Pathis {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        String pathIn = sc.nextLine();

        Path theFile = FileSystems.getDefault().getPath(pathIn);
        if (!Files.exists(theFile)) {
            System.out.println("No such file as : " + theFile);
        }
        for (String fileName : args) {
            File file = new File(pathIn);
             
            String line;
            String replace;
            BufferedReader reader = new BufferedReader(new FileReader(file));
                while ((line = reader.readLine()) != null) {
                    replace = line.replaceAll(" ", "");
                    System.out.println(replace);
                    
                }
          } 
    }
}
