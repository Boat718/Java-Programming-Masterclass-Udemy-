public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("fullname = " + person.getFirstName());
        System.out.println("teen =" + person.isTeen());
        person.setFirstName("Boat");
        person.setAge(18);
        System.out.println("fullname = " + person.getFirstName());
        System.out.println("teen =" + person.isTeen());
    }
}
