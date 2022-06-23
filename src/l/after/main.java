package l.after;

import l.before.Employee;
import l.before.Manager;

public class main {
    public static void main(String[] args) {
        l.before.Manager accountingVP = new Manager();

        accountingVP.firstName = "William";
        accountingVP.lastName = "Ardianto";
        accountingVP.calculatePerHourRate(4);

        l.before.Employee employee = new Employee();

        employee.firstName = "Wilson";
        employee.lastName = "Lim";
        employee.assignManager(accountingVP);
        employee.calculatePerHourRate(2);

        System.out.println(String.format("%s salary is %s/hour", employee.firstName, employee.salary));
    }
}
