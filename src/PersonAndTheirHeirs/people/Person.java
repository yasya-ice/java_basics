package PersonAndTheirHeirs.people;

public class Person {
    private final String name;
    private final String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n  Address: " + address;
    }
}
