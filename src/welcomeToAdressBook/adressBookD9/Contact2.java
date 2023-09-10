package welcomeToAdressBook.adressBookD9;

import java.util.ArrayList;

public class Contact2 {  private String firstName;
    private String lastName;
    private String address;
    private int zipNo;
    private int phoneNumber;
    private String email;
    private static ArrayList<Contact> list = new ArrayList<Contact>();


    public Contact2(String firstName, String lastName, String address, int zipNo, int phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.zipNo = zipNo;
        this.phoneNumber = phoneNumber;
        this.email = email;
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
    public static void addContact(Contact add){
        list.add(add);
    }

    public static  ArrayList<Contact> getContact(){
        return list;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", zipNo=" + zipNo +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }
}
public class AddressBook {
    public static void main(String[] args) {
        Contact c=new Contact("mrunali","shirsath","dhule",400028,12345,"mrunali@gmail.com");
        Contact c1=new Contact("Kunal","Wnnare","Umerkhed",400016,3546,"kunal@gmail.com");
        Contact c2=new Contact("Avinash","Shende","Darwha",400034,18,"avinash@gmail.com");
        Contact c3=new Contact("Chotey","Khadse","Amravati",400045,45,"kunal@gmail.com");

        Contact.addContact2(c);
        Contact.addContact2(c1);
        Contact.addContact2(c2);
        Contact.addContact(c3);

        addressBookD9.ArrayList<Contact> list=Contact.getContact();
        //System.out.println(Contact.getContact());
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}



    

