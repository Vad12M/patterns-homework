interface Command {
    void execute();
}

class BorrowBookCommand implements Command {
    private Library library;
    public BorrowBookCommand(Library library) {
        this.library = library;
    }
    @Override
    public void execute() {
        library.borrowBook();
    }
}

class ReturnBookCommand implements Command {
    private Library library;
    public ReturnBookCommand(Library library) {
        this.library = library;
    }
    @Override
    public void execute() {
        library.returnBook();
    }
}

class Library {
    private int availableBooks = 5;
    public void borrowBook() {
        if (availableBooks > 0) {
            System.out.println("Borrowing a book. Available books: " + --availableBooks);
        } else {
            System.out.println("No available books to borrow.");
        }
    }
    public void returnBook() {
        if (availableBooks < 5) {
            System.out.println("Returning a book. Available books: " + ++availableBooks);
        } else {
            System.out.println("Library is full. Cannot return more books.");
        }
    }
}

class LibraryInvoker {
    private Command command;
    public void setCommand(Command command) {
        this.command = command;
    }
    public void executeCommand() {
        command.execute();
    }
}

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        LibraryInvoker invoker = new LibraryInvoker();
        Command borrowCommand = new BorrowBookCommand(library);
        Command returnCommand = new ReturnBookCommand(library);
        invoker.setCommand(borrowCommand);
        invoker.executeCommand();
        invoker.setCommand(returnCommand);
        invoker.executeCommand();
    }
}
