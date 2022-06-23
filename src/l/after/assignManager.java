package l.after;

public abstract class assignManager extends Employee{

    public assignManager(String firstName,String lastName,Employee manager,double salary){
        super(firstName, lastName, manager, salary);
    }

    public void assignManager(assignManager manager){
        this.manager = manager;
    }

    public abstract void assignManager(l.before.Employee manager);
}
