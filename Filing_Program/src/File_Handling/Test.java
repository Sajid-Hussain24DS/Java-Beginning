package File_Handling;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // File handling
        // java.aio : File,FileReader ,FileWriter ,BufferReader,BufferWriter,Scanner
        // java.nio
        // Permenantly store data
        // txt file,csv file, pdf file etc

        File file = new File("test.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File Created!!");
            }
                FileWriter fw = new FileWriter(file);
                fw.write("This is my first java file\n");
                fw.write("This is our first java class");
                fw.close();

                // for reader
            FileReader fileReader = new FileReader(file);
            int read = fileReader.read();
            //System.out.println(  "File reader "+(char)fileReader.read());
            while (read!=-1){
                char ch = (char)read;
                System.out.print(ch);
                read = fileReader.read();
            }
            System.out.println("\nScanner class using");
            Scanner sc = new Scanner(file);
            while (sc.hasNext()){
                System.out.println(sc.nextLine());
            }
            //System.out.println("Scanner "+sc.nextLine());
            //System.out.println(sc.next());
            //System.out.println(sc.next());


                FileWriter fileWriter = new FileWriter("test1.txt");
                fileWriter.write("hello sir");
        fileWriter.close();
        }
         catch (IOException e) {
            throw new RuntimeException(e);
        }
    }}
