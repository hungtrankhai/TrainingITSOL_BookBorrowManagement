package entity;

import java.util.Scanner;

public class Book {
    private int bookID;
    private String bookName;
    private String author;
    private String bookType;
    private int publishedYear;
    private  int quantity;

    public Book(){

    }
//

    public Book(int bookID, String bookName, String author, String bookType, int publishedYear, int quantity) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.author = author;
        this.bookType = bookType;
        this.publishedYear = publishedYear;
        this.quantity = quantity;
    }

    public Book inputInfoBook(int id){
        Scanner sc = new Scanner(System.in);
        int bookID = id+10000;

        System.out.println("Nhập tên sách: ");
        String bookName = sc.nextLine();
        System.out.println("Nhập tên author: ");
        String author = sc.nextLine();
        System.out.println("Nhập chuyên ngành: ");
        String bookType = sc.nextLine();
        System.out.println("Nhập năm phát hành: ");
        int publishedYear = sc.nextInt();

        int quantity;
        do {
            System.out.println("Nhập số lượng sách này: ");
            quantity = sc.nextInt();
        } while (quantity<=0);
        Book b = new Book(bookID, bookName, author, bookType, publishedYear, quantity);
        return b;
    }

    void printBook(Book b){
        System.out.printf("%5d \t %16s \t %16s \t %16s\t %16d \t %5d",b.getBookID() , b.getBookName(), b.getAuthor(),
                b.getBookType(), b.getPublishedYear(), b.getQuantity());
    }

     public void printBookArray(Book[] books) {
        System.out.printf("%5s \t %16s \t %16s\t %16s\t %16s\t %16s\n", "ID", "Book Name", "Author", "Type", "publishedYear", "quantity");
        for (int i = 0; i < books.length; i++) {
                printBook(books[i]);
                System.out.println("");
        }
    }

//    public void addBookToArray(Book[] arr, int n){
//        for (int i=0;i< n;i++){
//            arr[i] = inputInfoBook();
//        }
//    }
//
//    public void showBookInfo(Book[] arr){
//        System.out.println("_____THÔNG TIN SÁCH_____: ");
//        arr.toString();
//    }

    @Override
    public String toString() {
        return "Book{" +
                "bookID=" + bookID +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", bookType='" + bookType + '\'' +
                ", publishedYear=" + publishedYear +
                '}';
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
