
public class AddressBookMain {
    public static void main(String[] args) {

        InterFaceOne person1 = new Person();
        person1.createContact();
        person1.addContact();
        person1.editContact();
        person1.deleteContact();
        person1.addToBook();
        person1.searchPerson();
        person1.displayBook();
        person1.viewByCity();
        person1.viewByState();
    }
}
