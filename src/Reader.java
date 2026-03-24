public class Reader {
    private String firstName;
    private String lastName;
    private String cardNumber;
    private int borrowedCount;

    public Reader(String firstName, String lastName, String cardNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cardNumber = cardNumber;
        this.borrowedCount = 0;
    }

    public void printData() {
        System.out.println(firstName + " " + lastName + " (" + cardNumber + ")");
        System.out.println("Borrowed books: " + borrowedCount);
        System.out.println();
    }

    public void increaseBorrowedCount() {
        borrowedCount++;
    }

    public void decreaseBorrowedCount() {
        if (borrowedCount > 0) {
            borrowedCount--;
        }
    }

    public String getFirstName() {
        return firstName;
    }
}