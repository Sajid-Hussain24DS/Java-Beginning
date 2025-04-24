package LMS;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

 public class LibraryManagementSystem {
     ArrayList<Book> books = new ArrayList<>();
     ArrayList<Student> students = new ArrayList<>();
     Scanner scanner = new Scanner(System.in);
     {
         File bookFile = new File("Book_Data.txt");
         File studentFile = new File("Student_Data.txt");
         try {
             bookFile.createNewFile();
             studentFile.createNewFile();
             System.out.println("File Created Successfully!");
         } catch (IOException e) {
             throw new RuntimeException(e);
         }
     }


    public LibraryManagementSystem() {
        books.add(new Book("Java", 56, "james", 30, 14));
        books.add(new Book("CPP", 32, "Deen", 25, 89));
       books.add(new Book("DotNet", 77, "Jame", 20, 21));
        books.add(new Book("Python", 58, "Alice", 15, 41));
       books.add(new Book("C#", 65, "John", 10, 99));
   }


     public void menu() {
        while (true) {
            System.out.println("Welcome to the Library System");
            System.out.println("1- Add Book into Library");
            System.out.println("2- Issue Book to Student");
            System.out.println("3- Return Book from Student");
            System.out.println("4- Show all Books");
            System.out.println("5- Show all Students");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();


            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    issueBook();
                    break;
                case 3:
                    returnBook();
                    break;
                case 4:
                    showAllBooks();
                    break;
                case 5:
                    showAllStudents();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public void addBook() {
        System.out.print("Enter name of book: ");
        String bookName = scanner.nextLine();

        System.out.print("Enter book ID: ");
        int bookId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter book ISBIAN: ");
        int isbian = scanner.nextInt();

        System.out.print("Enter author name: ");
        String author = scanner.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        books.add(new Book(bookName, isbian, author, bookId, quantity));

        String data = "Book Added:\nName: " + bookName + "\nID: " + bookId + "\nISBN: " + isbian + "\nAuthor: " + author + "\nQuantity: " + quantity;
        new Library_Record().writeBookToFile(data);



        System.out.println("Book added successfully");

    }

    public void issueBook() {
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter student ID: ");
        int studentId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter student roll number: ");
        String rollNumber = scanner.nextLine();

        System.out.print("Enter book ISBIAN you want to issue: ");
        String isbian = scanner.nextLine();
        scanner.nextLine();

        Book book = findBookByIban(isbian);
        if (book == null) {
            System.out.println("Invalid ISBAN Number");
            return;
        }
        if (book.getBookQuantity() > 0) {
            students.add(new Student( studentName, studentId, rollNumber,String.valueOf(isbian)));
            book.setBookQuantity(book.getBookQuantity() - 1);
            System.out.println("Book issued successfully");

            String data = "Book Issued:\nISBN: " + isbian + "\nTo: " + studentName + ", ID: " + studentId + ", Roll: " + rollNumber;
            new Library_Record().writeStudentToFile(data);
        } else {
            System.out.println("Book not available");
        }
    }


    public void returnBook() {
        System.out.print("Enter student ID: ");
        int studentId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter book ISBAN you want to return: ");
        String  isbian = scanner.nextLine();
        scanner.nextLine();

        Book book = findBookByIban(isbian);
        if (book == null) {
            System.out.println("Invalid ISBAN number Entered");
            return;
        }

        Student student = findStudentById(studentId);
        if (student != null) {
            students.remove(student);
            book.setBookQuantity(book.getBookQuantity() + 1);
            System.out.println("Book returned successfully!");

            String data = "Book Returned:\nISBN: " + isbian + "\nBy Student ID: " + studentId;
            new Library_Record().writeStudentToFile(data);
        } else {
            System.out.println("Student ID not found");
        }
    }


    public void showAllBooks() {
        System.out.println("Books in Library");
        System.out.println("Book Name   ISBAN     Author   Quantity  Book  ID");
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            String bookName = book.bookName +                     "       ";
            String isban = book.bookIsbn   +              "       ";
            String author = book.bookAuthor +              "       ";
            String quantity = (book.bookQuantity) +    "       ";
            String bookId = (book.bookId) +     "       ";
            System.out.println(bookName + isban + author + quantity + bookId);
        }
    }


    public void showAllStudents() {
        System.out.println("Students with Issued Books");
        System.out.println("Student ID   Student Name   Roll Number   ISBAN");
        for (int i = 0; i < students.size(); i++) {
            students.get(i).showStudentData();
        }
    }

    public Book findBookByIban(String isbian) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).bookIsbn==Integer.parseInt(isbian)){
                return books.get(i);
            }
        }

        return null;
    }

    public Student findStudentById(int studentId) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).studentId == studentId) {
                return students.get(i);
            }
        }
        return null;
    }}


