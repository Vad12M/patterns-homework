class LibraryIterator {
    constructor(collection) {
        this.collection = collection;
        this.index = 0;
    }

    hasNext() {
        return this.index < this.collection.length;
    }

    next() {
        if (this.hasNext()) {
            return this.collection[this.index++];
        }
        return null;
    }
}


class BookIterator extends LibraryIterator {
    constructor(books) {
        super(books);
    }
}

class LibraryCollection {
    createIterator() {}
}

class LibraryBooks extends LibraryCollection {
    constructor() {
        super();
        this.books = [];
    }

    addBook(book) {
        this.books.push(book);
    }

    createIterator(){
        return new BookIterator(this.books)
    }
}

const library = new LibraryBooks();
library.addBook("1");
library.addBook("2");
library.addBook("3");

const iterator = library.createIterator();

while (iterator.hasNext()) {
    console.log("Book: " + iterator.next());
}