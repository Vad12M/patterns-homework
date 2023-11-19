class DatabaseLibrary {
    constructor() {
      if (DatabaseLibrary.instance) {
        return DatabaseLibrary.instance;
      }
  
      this.books = [];
      this.authors = [];
      this.readers = [];
  
      DatabaseLibrary.instance = this;
    }
  
    addBook(book) {
      this.books.push(book);
    }
  
    addAuthor(author) {
      this.authors.push(author);
    }
  
    addReader(reader) {
      this.readers.push(reader);
    }
  
    getBooks() {
      return this.books;
    }
  
    getAuthors() {
      return this.authors;
    }
  
    getReaders() {
      return this.readers;
    }
  }
  
  
  const database1 = new DatabaseLibrary();
  const database2 = new DatabaseLibrary();
  
  console.log(database1 === database2); 
  