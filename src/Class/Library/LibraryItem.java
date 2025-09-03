package Library;

public class LibraryItem {
    private String itemID;
    private String title;
    private String author;

    public void checkOut(){
        System.out.println("Checkout");
    }

    public void returnItem(){
        System.out.println("Return");
    }
}
