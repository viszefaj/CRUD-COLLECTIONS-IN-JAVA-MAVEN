package o.after;

import o.before.Accounts;
import o.before.Applicant;
import o.before.Employee;
import o.before.EmployeeType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<o.before.Applicant> applicants = Arrays.asList(
                new o.before.Applicant("William", "Ardianto", o.before.EmployeeType.staff),
                new o.before.Applicant("Wilson", "Lim", o.before.EmployeeType.manager),
                new Applicant("Wesley", "Lim", EmployeeType.executive)
        );

        List<o.before.Employee> employees = new ArrayList<>();
        o.before.Accounts accountProcessor = new Accounts();

        applicants.forEach(person -> employees.add(accountProcessor.create(person)));


    }

}
