package o.after;

public class Employee extends Applicant {
    private String email;
    private boolean isManager = false;
    private boolean isExecutive = false;

    public Employee(String firstName, String lastName, EmployeeType typeOfEmployee,boolean isManager,boolean isExecutive) {
        super(firstName, lastName, typeOfEmployee);
        this.isManager=isManager;
        this.isExecutive=isExecutive;
    }

    public Employee() {
        super();
    }


    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }


    public boolean getManager() {
        return isManager;
    }

    public void setManager(boolean manager) {
        isManager = manager;
    }

    public boolean getExecutive() {
        return isExecutive;
    }

    public void setExecutive(boolean executive) {
        isExecutive = executive;
    }


}

