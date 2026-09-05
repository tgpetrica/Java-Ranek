package razvan;

public class Ticket<T> {
    private T information;

    public Ticket(T information) {
        this.information = information;
    }

    public T getInformation() {
        return information;
    }

    public void setInformation(T information) {
        this.information = information;
    }
}
