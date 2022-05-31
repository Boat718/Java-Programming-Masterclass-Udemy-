public class Main {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("12345");
        Contact contact = new Contact("A","123456");
        Contact contact1 = new Contact("B","4567");
        Contact contact2 = new Contact("C","789");
        Contact newcontact = new Contact("A","112345");
        mobilePhone.addNewContact(contact);
        mobilePhone.addNewContact(contact1);
        mobilePhone.addNewContact(contact2);
        mobilePhone.updateContact(contact,newcontact);
        mobilePhone.removeContact(contact1);
        mobilePhone.printContacts();
    }
}
