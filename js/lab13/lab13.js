
class LibraryService {
    borrowBook(bookTitle, borrower) {}
    returnBook(bookTitle, borrower) {}
  }
  

  class LibraryServiceImpl extends LibraryService {
    constructor() {
      super();
      this.books = new Map();
    }
  
    borrowBook(bookTitle, borrower) {
      if (!this.books.has(bookTitle)) {
        console.log(`${bookTitle} is not available.`);
        return;
      }
      if (!this.books.get(bookTitle)) {
        console.log(`${bookTitle} is already borrowed by ${borrower}`);
      } else {
        this.books.set(bookTitle, false);
        console.log(`${borrower} borrowed ${bookTitle}`);
      }
    }
  
    returnBook(bookTitle, borrower) {
      if (!this.books.has(bookTitle)) {
        console.log(`${bookTitle} is not available.`);
        return;
      }
      if (this.books.get(bookTitle)) {
        console.log(`${bookTitle} is not borrowed.`);
      } else {
        this.books.set(bookTitle, true);
        console.log(`${borrower} returned ${bookTitle}`);
      }
    }
  
    addBook(bookTitle) {
      this.books.set(bookTitle, true);
    }
  }
  

  class LibraryServiceProxy extends LibraryService {
    constructor() {
      super();
      this.realLibrary = new LibraryServiceImpl();
    }
  
    borrowBook(bookTitle, borrower) {
      this.realLibrary.borrowBook(bookTitle, borrower);
    }
  
    returnBook(bookTitle, borrower) {
      this.realLibrary.returnBook(bookTitle, borrower);
    }
  }
  
  const library = new LibraryServiceProxy();
  const realLibrary = new LibraryServiceImpl();
  realLibrary.addBook("Design Patterns");
  realLibrary.addBook("Clean Code");
  
  library.borrowBook("Design Patterns", "John");
  library.borrowBook("Clean Code", "Alice");
  library.returnBook("Design Patterns", "John");
  library.borrowBook("Design Patterns", "Bob");