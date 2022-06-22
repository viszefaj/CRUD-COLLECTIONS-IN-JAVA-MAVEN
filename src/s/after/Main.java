package s.after;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Welcome to my application");

        s.after.PersonExists person = new PersonExists();

        System.out.println("What is your first name: ");
        person.setFirstName(reader.next());

        System.out.println("What is your last name: ");
        person.setLastName(reader.next());

        person.Personexist(person);

        System.out.println(String.format("Your username is %s %s", person.getFirstName(), person.getLastName()));

        System.out.println("End of application");
    }
}
