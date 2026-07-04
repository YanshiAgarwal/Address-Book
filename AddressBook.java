import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    ArrayList<Contact> contacts = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    // UC2 & UC5
    public void addContact() {

        Contact person = new Contact();

        System.out.print("Enter First Name: ");
        person.firstName = sc.nextLine();

        System.out.print("Enter Last Name: ");
        person.lastName = sc.nextLine();

        System.out.print("Enter Address: ");
        person.address = sc.nextLine();

        System.out.print("Enter City: ");
        person.city = sc.nextLine();

        System.out.print("Enter State: ");
        person.state = sc.nextLine();

        System.out.print("Enter Zip: ");
        person.zip = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        person.phoneNumber = sc.nextLine();

        System.out.print("Enter Email: ");
        person.email = sc.nextLine();

        contacts.add(person);

        System.out.println("\nContact Added Successfully!\n");
    }

    // UC3
    public void editContact() {

        System.out.print("Enter First Name to Edit: ");
        String name = sc.nextLine();

        boolean found = false;

        for (Contact person : contacts) {

            if (person.firstName.equalsIgnoreCase(name)) {

                found = true;

                System.out.print("Enter New Address: ");
                person.address = sc.nextLine();

                System.out.print("Enter New City: ");
                person.city = sc.nextLine();

                System.out.print("Enter New State: ");
                person.state = sc.nextLine();

                System.out.print("Enter New Zip: ");
                person.zip = sc.nextLine();

                System.out.print("Enter New Phone Number: ");
                person.phoneNumber = sc.nextLine();

                System.out.print("Enter New Email: ");
                person.email = sc.nextLine();

                System.out.println("Contact Updated Successfully!");
                break;
            }
        }

        if (!found) {
            System.out.println("Contact Not Found!");
        }
    }

    // UC4
    public void deleteContact() {

        System.out.print("Enter First Name to Delete: ");
        String name = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < contacts.size(); i++) {

            if (contacts.get(i).firstName.equalsIgnoreCase(name)) {

                contacts.remove(i);

                found = true;

                System.out.println("Contact Deleted Successfully!");
                break;
            }
        }

        if (!found) {
            System.out.println("Contact Not Found!");
        }
    }

    // Display all contacts
    public void displayContacts() {

        if (contacts.isEmpty()) {
            System.out.println("Address Book is Empty.");
            return;
        }

        System.out.println("\n===== Contact List =====");

        for (Contact person : contacts) {

            System.out.println("-----------------------------");
            System.out.println("First Name : " + person.firstName);
            System.out.println("Last Name  : " + person.lastName);
            System.out.println("Address    : " + person.address);
            System.out.println("City       : " + person.city);
            System.out.println("State      : " + person.state);
            System.out.println("Zip        : " + person.zip);
            System.out.println("Phone      : " + person.phoneNumber);
            System.out.println("Email      : " + person.email);
        }
    }
}