import entity.Book;
import entity.Reader;
import management.BookManagement;
//import service.ReaderService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = 0;

        BookManagement bookManagement = new BookManagement();

        Reader[] arrReaders = new Reader[100];
        Book[] arrBooks = new Book[100];

        Reader reader = new Reader();
        Book book = new Book();

        while(true) {
            System.out.println("---||||| BẠN CẦN GÌ ||||---");
            System.out.println("1. NHẬP THÔNG TIN SÁCH.");
            System.out.println("2. NHẬP THÔNG TIN BẠN ĐỌC.");
            System.out.println("3.  XEM QUAN LÝ.");
            System.out.println("4.  SẮP XẾP.");
            System.out.println("5. TÌM KIẾM.");

            System.out.println("__Lựa chọn__?: ");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    try{
                        System.out.println("Nhập số lượng đầu sách mới về: ");
                        int n = sc.nextInt();
                        for (int i = 0; i < n; i++) {
                            arrBooks[i] = book.inputInfoBook(i+1);
                        }
                        System.out.println("List sách hiện còn: ");
                        book.printBookArray(arrBooks);
                    } catch (Exception e){
                        System.err.println("Lỗi null poiter");
                    }
//                    for (int i = 0; i < n; i++) {
//                        System.out.println(arrBooks);
//                    }
//                    book.showBookInfo(arrBooks);
                    break;
                case 2:
                    try{
                        System.out.println("Nhập số lượng bạn đọc: ");
                         m = sc.nextInt();
                        for (int i = 0; i < m; i++) {
                            arrReaders[i] = reader.inputInfoReader(i+1);
                        }

                        System.out.println("Danh sách bạn đọc mượn: ");
                        reader.showReaderTable(arrReaders);
                    } catch (Exception ex){
                        System.err.println("Lỗi null poiter");
                    }
                    break;

                case 3:
//                    bookManagement.setupManagementBookTable(reader, book);
//                    bookManagement.showManagementBookTable(arrBooks, arrReaders);
                    BookManagement[] listBorrowReader = new BookManagement[m];
                    for (int i=0;i< arrReaders.length;i++){
                        System.out.println("Thực hiện mượn sách cho: "+arrReaders[i].getName());
                    }
                    System.out.println("Nhập số lượng cần mượn: ");
                    int quantity = sc.nextInt();
                    // 1< quantity < 5   quantity < so lg sach con trong kho
                    while (quantity < 1 || quantity > 5 || quantity > arrBooks.length) {
                        System.out.println("Nhập số lượng đầu sách cần mượn (tối đa 5):  ");
                        quantity = sc.nextInt();
                    }


                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        }
    }
}