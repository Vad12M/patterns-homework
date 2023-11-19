class Command {
    constructor(library) {
        this.library = library;
    }
    execute() {
    }
}

class BorrowBookCommand extends Command {
    execute() {
        this.library.borrowBook();
    }
}

class ReturnBookCommand extends Command {
    execute() {
        this.library.returnBook();
    }
}

class Library {
    constructor() {
        this.availableBooks = 5;
    }
    borrowBook() {
        if (this.availableBooks > 0) {
            console.log("Borrowing a book. Available books: " + --this.availableBooks);
        } else {
            console.log("No available books to borrow.");
        }
    }
    returnBook() {
        if (this.availableBooks < 5) {
            console.log("Returning a book. Available books: " + ++this.availableBooks);
        } else {
            console.log("Library is full. Cannot return more books.");
        }
    }
}

class LibraryInvoker {
    constructor() {
        this.command = null;
    }
    setCommand(command) {
        this.command = command;
    }
    executeCommand() {
        if (this.command) {
            this.command.execute();
        }
    }
}

const library = new Library();
const invoker = new LibraryInvoker();

const borrowCommand = new BorrowBookCommand(library);
const returnCommand = new ReturnBookCommand(library);

invoker.setCommand(borrowCommand);
invoker.executeCommand();

invoker.setCommand(returnCommand);
invoker.executeCommand();
