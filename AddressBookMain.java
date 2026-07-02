public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program in Java");
    
        Contact person = new Contact();

        person.firstName = "Yanshi";
        person.lastName = "Agarwal";
        person.address = "Mathura Road";
        person.city = "Mathura";
        person.state = "Uttar Pradesh";
        person.zip = "281001";
        person.phoneNumber = "9876543210";
        person.email = "yanshi@gmail.com";

        System.out.println("First Name : " + person.firstName);
        System.out.println("Last Name : " + person.lastName);
        System.out.println("Address : " + person.address);
        System.out.println("City : " + person.city);
        System.out.println("State : " + person.state);
        System.out.println("Zip : " + person.zip);
        System.out.println("Phone Number : " + person.phoneNumber);
        System.out.println("Email : " + person.email);
    }

}