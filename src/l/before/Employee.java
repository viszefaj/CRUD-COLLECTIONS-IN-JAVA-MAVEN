package l.before;

public class Employee extends l.after.Employee {
    public String firstName;
    public String lastName;
    public Employee manager;
    public double salary;

    public Employee(String firstName, String lastName, l.after.Employee manager, double salary) {
        super(firstName, lastName, manager, salary);
    }

    public Employee() {
        super();
    }

    public void assignManager(Employee manager){
        this.manager = manager;
    }

    public void calculatePerHourRate(int rank){
        double baseAmount = 12.50;
        salary = baseAmount + (rank * 2);
    }
}
