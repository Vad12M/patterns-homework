class BookType {
    constructor(name, coverType, paperType) {
      this.name = name;
      this.coverType = coverType;
      this.paperType = paperType;
    }
  
    getInfo() {
      console.log(`The cover is ${this.coverType}\nThe type of paper is ${this.paperType}`);
    }
  }
  
  class Book {
    constructor(title, author, type) {
      this.title = title;
      this.author = author;
      this.type = type;
    }
  
    getInfo() {
      console.log(`Title: ${this.title}\nAuthor: ${this.author}`);
      this.type.getInfo();
    }
  }
  
  class BookStock {
    constructor() {
      this.books = [];
    }
  
    addBook(title, author, name, coverType, paperType) {
      const type = BookFactory.getBookType(name, coverType, paperType);
      const book = new Book(title, author, type);
      this.books.push(book);
    }
  }
  
  class BookFactory {
    static bookTypes = {};
  
    static getBookType(name, coverType, paperType) {
      const key = name + coverType + paperType;
      if (!BookFactory.bookTypes[key]) {
        BookFactory.bookTypes[key] = new BookType(name, coverType, paperType);
      }
      return BookFactory.bookTypes[key];
    }
  }
  
  const bookStock = new BookStock();
  
  bookStock.addBook("sdfba", "afbaebbet", "journal", "soft", "glossy");
  bookStock.addBook("sdfafbjanekbna", "afbaebbet", "journal", "soft", "glossy");
  bookStock.addBook("sdfafbjanbnej", "afbaebbet", "journal", "soft", "glossy");
  bookStock.addBook("kaetkgwrtngkwehnoth;p", "afejvgneangkaal", "ordinary", "hard", "matte");
  bookStock.addBook("kathbjklsp", "kjhb fhegbl", "ordinary", "hard", "matte");
  bookStock.addBook("vnfjelakbp", "dfjnbjejl", "ordinary", "hard", "matte");
  