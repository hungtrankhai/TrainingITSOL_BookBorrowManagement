package management;

import entity.Book;
import entity.Reader;

import java.util.Scanner;

public class BookManagement {

    //
    public void setupManagementBookTable(Reader r, Book b){
        System.out.printf(" %-10d| %-10d|",r.getReaderID(), b.getBookID());
      }

      public void showManagementBookTable(Book[] arrbooks, Reader[] arrReaders){
          System.out.printf("%-20s| %-30s| \n", "Mã bạn đọc", "Mã sách");
          for (int i=0; i<arrReaders.length;i++){
              setupManagementBookTable(arrReaders[i], arrbooks[i]);
              System.out.println("");
          }
      }

      public void borrowBook(){
          Scanner scanner = new Scanner(System.in);
//          BookManagement[] listBorrowReader = new BookManagement[];



      }


    /* sort theo readerName
       compare so sanh vi tri cua ki tu dau voi 0.
       so sanh a[i] va a[j] voi 0
   */




    // sort theo quantity desc



}
