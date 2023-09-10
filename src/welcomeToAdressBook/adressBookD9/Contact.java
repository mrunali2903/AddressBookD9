package welcomeToAdressBook.adressBookD9;

import java.util.ArrayList;

public class Contact {
    private String firstName;
    private String lastName;
    private String address;
    private int zipNo;
    private int phoneNumber;
    private String email;
    private static ArrayList<Contact> list = new ArrayList<Contact>();


    public Contact(String firstName, String lastName, String address, int zipNo, int phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.zipNo = zipNo;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public static void addContact2(Contact c2) {
    }

    public static addressBookDay9.ArrayList<Contact> getContact() {
    }

    public static void addContact3(Contact c) {
    }

    public static void addContact(Contact c3) {
    }

    public static void removeContact(Contact c3, String shilpa) {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public int getZipNo() {
        return zipNo;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setFirstName(String mrunali) {
    }
}
public class AddressBook {
    public static void main(String[] args) {

    }
}



