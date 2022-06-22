package d.after;


public class Email extends Person{

    public Email(String firstName,String lastName,String phone,String email){
        super(firstName,lastName,phone,email);
    }

    public Email() {

    }

    public void sendEmail(Person owner, String message) {
        System.out.println(String.format("Simulating sending an email to %s",owner.getFirstName()));
    }
}
