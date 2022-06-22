package o.after;



public class Applicant {

    private String firstName;
    private String lastName;
    private EmployeeType typeOfEmployee;


    public Applicant(String firstName, String lastName, EmployeeType typeOfEmployee) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.typeOfEmployee = typeOfEmployee;
    }

    public Applicant() {

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

    public EmployeeType getTypeOfEmployee() {
        return typeOfEmployee;
    }

    public void setTypeOfEmployee(EmployeeType typeOfEmployee) {
        this.typeOfEmployee = typeOfEmployee;
    }
}



