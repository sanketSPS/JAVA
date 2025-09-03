
class Book {
    static int totalBooks;//static variable declaration
    String title,author,isbn;
    boolean isBorrowed;

    static {//static variable initialization
        totalBooks=0;
    }

    {
        totalBooks++;
    }

    Book(String title,String author, String isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }

    Book(String isbn){
        this("unknown", "unknown", isbn);
    }
    void borrowBook(){
        if (isBorrowed){
            System.out.println("Book is not available");
        }
        else {
        this.isBorrowed=true;
        System.out.println("Book is available");
        }
    }
    void returnBook(){
        if(isBorrowed) {
            this.isBorrowed = false;
            System.out.println("Thanks for returning");
        }
        else {
            System.out.println("Book is in Library Already");
        }
    }

    static int getTotalBooks(){
        System.out.println("This is static block");
        return totalBooks;
    }

    public static void main(String[] args) {
        Book java=new Book("JAVA","James","ABC");
        Book b1=new Book("123");
        System.out.println(Book.getTotalBooks());
        java.borrowBook();
        java.borrowBook();
        java.returnBook();
        b1.returnBook();
    }
}
