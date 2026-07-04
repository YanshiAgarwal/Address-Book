public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book System");

        AddressBook addressBook = new AddressBook();

        System.out.print("How many contacts do you want to add? ");
        int n = addressBook.sc.nextInt();
        addressBook.sc.nextLine();

        for (int i = 0; i < n; i++) {
            addressBook.addContact();
        }

        addressBook.displayContacts();
    }
}