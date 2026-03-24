public class Book {
    private String title;
    private String author;
    private int pageCount;
    private boolean available;

    public Book(String title, String author, int pageCount, boolean available){

        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.available = available;
    }

    public void printInfo() {
        System.out.println("Title: " +title);
        System.out.println("Author of the book: " +author);
        System.out.println("Number of pages: " + pageCount);
        System.out.println("Is the book available" +available);
    }

    public void borrow(){

        if(!available){

            System.out.println("book " + title+ "is already rented");
            return;
        } else {
            System.out.println("book " + title+ "is available");
        }
    }

    public void returnBook(){
        available = true;
        System.out.println("book " +title+ "is available");
    }

    public String getTitle(){
        return title;
    }

    public boolean isAvailable() {
        return available;
    }

}
