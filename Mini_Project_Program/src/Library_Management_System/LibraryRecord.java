package Library_Management_System;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LibraryRecord {
public void writeToFile(String data) {
    try {
        FileWriter fw = new FileWriter("Library_Data.txt");
        fw.write(data + "\n               \n");
        fw.close();

    } catch (IOException e) {
        System.out.println("Sorry, something went wrong while saving the data. Please try again or check if the file is accessible. "+e.getMessage());
        throw new RuntimeException(e);

    }

}
public void readToFile(){
    try {
        FileReader fR = new FileReader("Library_Data.txt");
        fR.read();
        fR.close();

    } catch (IOException e) {
        System.out.println("Sorry, something went wrong while saving the data. Please try again or check if the file is accessible. "+e.getMessage());
        throw new RuntimeException(e);

    }
}


}
