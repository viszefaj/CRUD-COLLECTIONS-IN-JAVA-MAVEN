package d.after;



public class Chore {
    private String choreName;
    private Person owner;
    private double hoursWorked;
    private boolean isComplete;

    public Chore(String choreName, Person owner,double hoursWorked,boolean isComplete){
        this.choreName=choreName;
        this.owner=owner;
        this.hoursWorked=hoursWorked;
        this.isComplete=isComplete;

    }

    public Chore() {

    }

    protected void performedWork(double hours){
        hoursWorked += hours;
        Logger log = new Logger();
        log.log(String.format("Performed work on %s", choreName));
    }


    public String getChoreName() {
        return choreName;
    }

    public void setChoreName(String choreName) {
        this.choreName = choreName;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    public void completeChore(Person owner){
        isComplete = true;

        Logger log = new Logger();
        log.log(String.format("Completed %s", choreName));

        Email email = new Email();
        email.sendEmail(owner, String.format("The chore %s is complere", choreName));
    }
}
