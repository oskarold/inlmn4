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

        Path txtFile = FileSystems.getDefault().getPath(pathIn);
        if (!Files.exists(txtFile)) {
            System.out.println("No such file as : " + txtFile);
        }
        for (String fileName : args) {
            File file = new File(fileName);
            
            String line;
            String replace;
            BufferedReader buff = new BufferedReader(new FileReader(txtFile.toFile()));
                while ((line = buff.readLine()) != null) {
                    replace = line.replaceAll(" ", "");
                    System.out.println(replace);
                }
          } 
    }
}
