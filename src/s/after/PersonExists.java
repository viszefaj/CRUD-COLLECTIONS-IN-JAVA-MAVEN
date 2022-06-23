package s.after;

import java.util.Scanner;

public class PersonExists extends Person{

    public void Personexist(Person person){

        if (person.getFirstName() == null || person.getFirstName().isEmpty()) {
            System.out.println("You did not give us a valid first name!");
        }

        if (person.getLastName() == null || person.getLastName().isEmpty()) {
            System.out.println("You did not give us a valid last name!");
        }
    }

    public Person AddPerson(Person person){

        Scanner reader = new Scanner(System.in);

        System.out.println("Welcome to my application");

        Person person1 = new PersonExists();

        System.out.println("What is your first name: ");
        person.setFirstName(reader.next());

        System.out.println("What is your last name: ");
        person.setLastName(reader.next());

        return person;


    }

}
