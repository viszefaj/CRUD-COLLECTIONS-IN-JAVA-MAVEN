package o.after;


public class Accounts {

    public Employee create(Employee employee,Applicant person) {
        employee.getFirstName().equals(person.getFirstName());
        employee.getLastName().equals(person.getLastName());
        employee.setEmail(String.format("%s.%s@example.com", person.getFirstName(), person.getLastName()));

        switch (person.getTypeOfEmployee()) {
            case staff:
                break;
            case manager:
                employee.setManager(true);
                break;
            case executive:
                employee.setManager(true);
                employee.setExecutive(true);
                break;
        }

        return employee;
    }


}
