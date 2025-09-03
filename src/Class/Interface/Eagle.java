package Interface;

public class Eagle extends Bird {

    public Eagle() {
        super("Kabutar");
    }

    public static void main(String[] args) {
        Eagle e=new Eagle();
        e.fly();
    }
}
