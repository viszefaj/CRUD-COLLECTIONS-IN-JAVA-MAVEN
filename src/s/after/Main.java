package s.after;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        s.after.PersonExists person = new PersonExists();

        person.AddPerson(person);

        person.Personexist(person);

        System.out.println(String.format("Your username is %s %s", person.getFirstName(), person.getLastName()));

        System.out.println("End of application");
    }
}
