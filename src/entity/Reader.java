package entity;


import java.util.Scanner;

public class Reader extends Person{
    private int readerID;
    private String typeReader;



    public Reader(){

}
    public  Reader(int readerID, String readerName, String address, String phoneNumber, String typeReader) {
        super(readerName, address, phoneNumber);
        this.readerID = readerID;
        this.typeReader = typeReader;

    }

    // __________________________________________________________________________

    public Reader inputInfoReader(int id){
        Scanner sc = new Scanner(System.in);
        int readerID = id+10000;

        System.out.println("Nhập tên: ");
        String readerName = sc.nextLine();

        System.out.println("Nhập địa chỉ: ");
        String address = sc.nextLine();

        System.out.println("Nhập sdt: ");
        String phoneNumber = sc.nextLine();

        System.out.println("Nhập loại bạn đọc: ");
        String typeReader = sc.nextLine();

        // references to r. when return r se thu dc object r
        Reader r = new Reader(readerID, readerName, address, phoneNumber, typeReader);
        return r;
    }


    // __________________________________________________________________________
    // __________________________________________________________________________
    // __________________________________________________________________________

    public void getReaderField(Reader r){
        System.out.printf("%5d \t %16s \t %16s \t %16s\t %16s ",r.getReaderID(), r.getName(), r.getAddress(), r.getPhoneNumber(), r.getTypeReader());
    }

    public void showReaderTable(Reader[] readers) {
        System.out.printf("%5s \t %16s\t %16s\t %16s\t %16s \n", "ID", "Reader Name", "Address", "Phone Number", "Type");
        for (int i = 0; i < readers.length; i++) {
            getReaderField(readers[i]);
            System.out.println("");
        }
    }

    // ____________________________________________________________________________
    // __________________________________________________________________________
    // __________________________________________________________________________

    public int getReaderID() {
        return readerID;
    }


    public void setId(int id) {
        this.readerID = readerID;
    }

    public String getTypeReader() {
        return typeReader;
    }

    public void setTypeReader(String typeReader) {
        this.typeReader = typeReader;
    }

    @Override
    public String toString() {
        super.toString();
        return "Reader{" +
                "id=" + readerID +
                ", typeReader='" + typeReader + '\'' +
                '}';
    }

//    public  Reader[] inputReaderToList(){
//        Reader[] arrLists = new Reader[100];
//        for(int i=0; i<arrLists.length; i++){
//            arrLists[i] = inputInfoReader();
//        }
//        return arrLists;
//    }

    public String getReaderList(Reader[] arrLists){
        return arrLists.toString();
    }
}
