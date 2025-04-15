package Chain_of_Responsibility;

public abstract class SupportHandler {
    protected SupportHandler next;

    public void set_next(SupportHandler next) {
        this.next = next;
    }

    public abstract void handle(String issue);
}
