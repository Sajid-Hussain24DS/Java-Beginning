package com.test.Encapsulation;

public class Book {
  private  String name;
  private  String author;
  private  String publisher;
  private  String page;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }
    public void Book1(){
        System.out.println(this.getName());
        System.out.println(this.getAuthor());
        System.out.println(this.getPublisher());
        System.out.println(this.getPage());
    }
}
