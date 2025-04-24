package LMS;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;

public class Library_Record {

    public void writeBookToFile(String data) {
        try {
            FileWriter fw = new FileWriter("Book_Data.txt");
            fw.write(data + "\n               \n");
            fw.close();
        } catch (IOException e) {
            System.out.println( " " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
    public void writeStudentToFile(String data) {
        try {
            FileWriter fw = new FileWriter("Student_Data.txt");
            fw.write(data + "\n               \n");
            fw.close();
        } catch (IOException e) {
            System.out.println( " " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public void readBookToFile() {
        try {
            FileReader fR = new FileReader("Library_Data.txt");
            int character;
            while ((character = fR.read()) != -1) {
                System.out.print((char) character); // prints each character as it's read
            }
            fR.close();
        } catch (IOException e) {
            System.out.println("Sorry,   " + e.getMessage());
            throw new RuntimeException(e);
        }
    }


    public void loadBooksFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("books.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("Loaded Book: " + line);
            }
        } catch (IOException e) {
            System.out.println("Error loading books from file: " + e.getMessage());
        }
    }

    // Method to load students from file
    public void loadStudentsFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("students.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("Loaded Student: " + line);  // You can store these lines in a list or print them
            }
        } catch (IOException e) {
            System.out.println("Error loading students from file: " + e.getMessage());
        }
    }


}

   /* public static void main(String[] args) {
        LibraryRecord record = new LibraryRecord();

        // Example usage
        record.writeToFile("Book1, Author1");
        record.readToFile();

        // Loading books and students from file
        record.loadBooksFromFile();
        record.loadStudentsFromFile();
    }
    */

