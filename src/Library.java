public class Library {
    private Book[] books;
    private int bookCount;

    public Library(int capacity) {
        books = new Book[capacity];
        bookCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    public void printAvailableBooks() {
        System.out.println("Available books:");
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isAvailable()) {
                books[i].printInfo();
            }
        }
        System.out.println();
    }

    public Book findBookByTitle(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }

    public int countAvailableBooks() {
        int count = 0;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isAvailable()) {
                count++;
            }
        }
        return count;
    }

    public void borrowBook(String title, Reader reader) {
        Book book = findBookByTitle(title);

        if (book == null) {
            System.out.println("Book with title \"" + title + "\" was not found.");
            return;
        }

        if (book.isAvailable()) {
            book.borrow();
            reader.increaseBorrowedCount();
            System.out.println(reader.getFirstName() + " borrowed: " + book.getTitle());
        } else {
            System.out.println("Book \"" + title + "\" is not available.");
        }
    }

    public void returnBook(String title, Reader reader) {
        Book book = findBookByTitle(title);

        if (book == null) {
            System.out.println("Book with title \"" + title + "\" was not found.");
            return;
        }

        if (!book.isAvailable()) {
            book.returnBook();
            reader.decreaseBorrowedCount();
            System.out.println(reader.getFirstName() + " returned: " + book.getTitle());
        } else {
            System.out.println("Book \"" + title + "\" is already in the library.");
        }
    }
}