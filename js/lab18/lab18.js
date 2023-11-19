class Library {
    constructor() {
        this.books = [];
    }

    addBook(bookTitle) {
        this.books.push(bookTitle);
    }

    displayBooks() {
        console.log("Library's Book Collection:");
        this.books.forEach((book) => {
            console.log(book);
        });
    }

    saveToMemento() {
        return new LibraryMemento([...this.books]);
    }

    restoreFromMemento(memento) {
        this.books = [...memento.getSavedState()];
    }
}

class LibraryMemento {
    constructor(books) {
        this.savedBooks = [...books];
    }

    getSavedState() {
        return this.savedBooks;
    }
}

class LibraryCaretaker {
    saveMemento(memento) {
        this.memento = memento;
    }

    retrieveMemento() {
        return this.memento;
    }
}

const library = new Library();
const caretaker = new LibraryCaretaker();


library.addBook("Book 1");
library.addBook("Book 2");
library.displayBooks();


caretaker.saveMemento(library.saveToMemento());


library.addBook("Book 3");
library.displayBooks();


library.restoreFromMemento(caretaker.retrieveMemento());
library.displayBooks();
