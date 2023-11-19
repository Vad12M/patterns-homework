class Catalog {
    searchBook(bookTitle) {
      console.log(`Searching for book: ${bookTitle}`);
    }
  }
  

  class Borrowers {
    constructor() {
      this.borrowers = new Map();
    }
  
    checkOutBook(borrower, bookTitle) {
      console.log(`${borrower} checked out book: ${bookTitle}`);
      this.borrowers.set(borrower, true);
    }
  
    returnBook(borrower, bookTitle) {
      console.log(`${borrower} returned book: ${bookTitle}`);
      this.borrowers.set(borrower, false);
    }
  }
  
  class Accounting {
    calculateLateFees() {
      console.log("Calculating late fees for borrowers...");
    }
  }
  

  class LibraryFacade {
    constructor() {
      this.catalog = new Catalog();
      this.borrowers = new Borrowers();
      this.accounting = new Accounting();
    }
  
    borrowBook(borrower, bookTitle) {
      this.catalog.searchBook(bookTitle);
      this.borrowers.checkOutBook(borrower, bookTitle);
      this.accounting.calculateLateFees();
    }
  
    returnBook(borrower, bookTitle) {
      this.catalog.searchBook(bookTitle);
      this.borrowers.returnBook(borrower, bookTitle);
      this.accounting.calculateLateFees();
    }
  }
  

  const library = new LibraryFacade();
  
  const borrower1 = "ira";
  const book1 = "Design Patterns";
  
  library.borrowBook(borrower1, book1);
  library.returnBook(borrower1, book1);