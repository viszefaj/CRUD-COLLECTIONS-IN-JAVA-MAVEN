package d.after;



public class Main {

    public static void main(String[] args) {
        Person owner = new Person();
        owner.setFirstName("William");
        owner.setLastName("Ardianto");
        owner.setPhone("+60189662679");
        owner.setEmail("william.ardianto@gmail.com");

        Chore chore = new Chore();
        chore.setChoreName("Take out the trash");
        chore.setOwner(chore.getOwner());

        chore.performedWork(4);
        chore.performedWork(1.5);
        chore.completeChore(owner);
    }
}
