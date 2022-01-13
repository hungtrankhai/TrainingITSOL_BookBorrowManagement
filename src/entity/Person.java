package entity;

public class Person {
    private String readerName;
    private String address;
    private String phoneNumber;

    public Person(){

    }

    public Person(String name, String address, String phoneNumber) {
        this.readerName = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return readerName;
    }

    public void setName(String name) {
        this.readerName = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + readerName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
