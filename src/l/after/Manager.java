package l.after;

public class Manager extends Employee{

    public Manager(String firstName, String lastName, Employee manager, double salary) {
        super(firstName, lastName, manager, salary);
    }

    @Override
    public void calculatePerHourRate(int rank) {
        double baseAmount = 19.75;

        setSalary(baseAmount + (rank * 4));
    }
}
