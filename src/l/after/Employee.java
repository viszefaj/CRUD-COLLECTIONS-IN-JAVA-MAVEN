package l.after;

public class Employee {
    private String firstName;
    private String lastName;
    protected Employee manager;
    private double salary;

    public Employee(String firstName,String lastName,Employee manager,double salary) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.manager=manager;
        this.salary=salary;
    }

    public Employee() {

    }

    public void assignManager(Employee manager){
        this.manager = manager;
    }

    public void calculatePerHourRate(int rank){
        double baseAmount = 12.50;
        salary = baseAmount + (rank * 2);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
