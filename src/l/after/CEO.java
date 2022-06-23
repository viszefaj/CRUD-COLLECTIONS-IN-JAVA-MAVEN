package l.after;

import l.before.Employee;

public class CEO extends assignManager  {

    public CEO(String firstName, String lastName, l.after.Employee manager, double salary) {
        super(firstName, lastName, manager, salary);
    }

    @Override
    public void calculatePerHourRate(int rank) {
        double baseAmount = 150;

        setSalary(baseAmount * rank);
    }

    @Override
    public void assignManager(Employee manager) {
        throw new UnsupportedOperationException("This CEO has no manager");
    }

    public void fireSomeone() {
        System.out.println("You're Fired!");
    }
}
