
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        String path = "teste.txt";
        FileReader fileReader = null;
        BufferedReader buffer = null;

        try{
            fileReader = new FileReader(path);
            buffer = new BufferedReader(fileReader);

            String line = buffer.readLine();

            while(line != null){
                System.out.println(line);
                line = buffer.readLine();
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        finally{
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
                if (buffer != null) {
                    buffer.close();
                }
            }  
            catch(IOException e){
                e.fillInStackTrace();
            }  
        }
    }

}
