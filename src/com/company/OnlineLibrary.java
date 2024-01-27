package com.company;
class Library{
    String[] books;
    int no_of_books;
    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book){
        this.books[no_of_books] = book;
        this.no_of_books++;
        System.out.println(book + "has been added!");
    }
    void showAvailableBooks(){
        System.out.println("Available books in library");
        for (String book:this.books){
            if(book == null){
                continue;
            }
            System.out.println("*"+book);
        }
    }
    void issueBook(String book){
        for (int i=0; i<=this.books.length;i++){
            if(this.books[i] == book){
                System.out.println("book has been issued");
                this.books[i]=null;
                return;
            }
        }
        System.out.println("Oops, Book "+book+" is not available in the library");
    }
    void returnBook(String book){
        addBook(book);
    }
}
public class OnlineLibrary {
    public static void main(String[] args) {
        Library lb = new Library();
        lb.addBook("Think and grow Rich");
        lb.addBook("C++");
        lb.showAvailableBooks();
        lb.issueBook("C++");
        lb.showAvailableBooks();
        lb.returnBook("C++");
        lb.showAvailableBooks();
    }
}
