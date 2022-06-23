package o.after;


import s.after.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Applicant> applicants = Arrays.asList(
                new Applicant("William", "Ardianto",EmployeeType.staff),
                new Applicant("Wilson", "Lim", EmployeeType.manager),
                new Applicant("Wesley", "Lim", EmployeeType.executive)
        );

        List<Employee> employees = new ArrayList<>();
        Accounts accountProcessor = new Accounts();

        applicants.forEach(person -> employees.add(accountProcessor.create(accountProcessor,person)));

        for (Employee employee : employees) {
            System.out.println(String.format("%s %s: %s IsManager: %s IsExecutive: %s", employee.getLastName(), employee.getLastName(), employee.getEmail(), employee.getManager(), employee.getExecutive()));
        }
    }
}
