
import java.util.Scanner;
import java.io.*;

public class OskarJohanssonInl4 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String pathIn = sc.nextLine();

        String strLine;
        String replace;
        try (BufferedReader buff = new BufferedReader(new FileReader(pathIn))) {
            while ((strLine = buff.readLine()) != null) {
                replace = strLine.replaceAll(" ", "");
                char[] listOfChar = replace.toCharArray();

                for (int counter = 0; counter < listOfChar.length; counter++) {
                    char symbol = listOfChar[counter];
                    int count = 0;
                    for (int i = 0; i < listOfChar.length; i++) {
                        if (symbol == listOfChar[i])
                            count++;
                    }
                    boolean flag = false;
                    for (int j = counter - 1; j >= 0; j--) {
                        if (symbol == listOfChar[j])
                            flag = true;
                    }
                    if (!flag) {
                        System.out.println(symbol + "  :  " + count);
                    }
                }
            }
        } catch (FileNotFoundException ex) {
            System.err.println("File does not exist");
        }
    }
}
