package com.company;

import java.util.ArrayList;

class Book{
    public String name,author;
    Book(String name, String author){
        this.name = name;
        this.author=author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
class MyLibrary{

    public ArrayList<Book> books;
    public MyLibrary(ArrayList books){
        this.books = books;
    }
    public void addBook(Book book){
        this.books = books;
    }
    public void issueBook(Book book){
        System.out.println("This book has been issued");
       this.books.remove(book);
    }
    public void returnBook(Book books){
        System.out.println("This book has been returned");

        this.books.add(books);
    }
}
public class LibraryManagement {
    public static void main(String[] args) {
        ArrayList<Book> bk= new ArrayList<>();
        Book b1 = new Book("Algo","Vikas");
        bk.add(b1);

        Book b2 = new Book("Algorithms2", "CLRS2");
        bk.add(b2);

        Book b3 = new Book("Algorithms3", "CLRS3");
        bk.add(b3);

        Book b4 = new Book("Algorithms4", "CLRS4");
        bk.add(b4);

        MyLibrary lb = new MyLibrary(bk);
        System.out.println(lb.books);

        lb.issueBook(b3);

    }
}
