package PersonAndTheirHeirs.people;

public class Teacher extends Person {
    private final int salary;

    public Teacher(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "  salary " +
                getSalary() +" euros/month";
    }

}
