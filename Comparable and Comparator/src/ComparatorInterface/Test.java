package ComparatorInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        Book b1 = new Book();
        b1.setAuthor("Sajid");
        b1.setTitle("JungleBook");
        b1.setPrice(1330.00d);
        Book b2 = new Book();
        b2.setAuthor("Habib");
        b2.setTitle("Poor Dad");
        b2.setPrice(1230.00d);
        Book b3 = new Book();
        b3.setAuthor("Muzafar");
        b3.setTitle("Rich Dad");
        b3.setPrice(1000.00d);

        books.add(b1);
        books.add(b2);
        books.add(b3);

        Collections.sort(books, new BookPriceSorter());
        System.out.println(books);


        List<Song> songs = new ArrayList<>();
        Song s1 = new Song();
        s1.setTitle("Blinding Light");
        s1.setArtist("The Weekend");
        s1.setDuration(2.0);

        Song s2 = new Song();
        s2.setTitle("Shape of you");
        s2.setArtist("Ed Sheeran");
        s2.setDuration(4.0);


        Song s3 = new Song();
        s3.setTitle("Bohemia");
        s3.setArtist("Queen");
        s3.setDuration(4.3);

        songs.add(s1);
        songs.add(s2);
        songs.add(s3);

        System.out.println("Songs List>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(songs);

        System.out.println("Songs Sorter Artist List>>>>>>>>>>>>>>>>>>>>>>>");
        Collections.sort(songs, new SongArtistSorter());
        System.out.println(songs);


        List<Laptop> laptops = new ArrayList<>();
        Laptop l1 = new Laptop();
        l1.setModel("HP");
        l1.setPrice(98000);
        l1.setRam(10);

        Laptop l2 = new Laptop();
        l2.setModel("Dell");
        l2.setPrice(50000);
        l2.setRam(8);

        Laptop l3 = new Laptop();
        l3.setModel("Apple");
        l3.setPrice(56000);
        l3.setRam(4);


        Laptop l4 = new Laptop();
        l4.setModel("Lenovo");
        l4.setPrice(200000);
        l4.setRam(16);


        laptops.add(l1);
        laptops.add(l2);
        laptops.add(l3);
        laptops.add(l4);

        System.out.println("Laptops List>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(laptops);

        System.out.println("Laptop Sorter Price List>>>>>>>>>>>>>>>>>>>>>>>");
        Collections.sort(laptops, new LaptopPriceSorter());
        System.out.println(laptops);




    }
}
