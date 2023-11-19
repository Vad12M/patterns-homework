class Library {
    constructor() {
        this.observers = [];
        this.books = [];
    }

    addObserver(observer) {
        this.observers.push(observer);
    }

    removeObserver(observer) {
        this.observers = this.observers.filter(obs => obs !== observer);
    }

    notifyObservers(bookTitle) {
        this.observers.forEach(observer => observer.update(bookTitle));
    }

    addBook(bookTitle) {
        this.books.push(bookTitle);
        this.notifyObservers(bookTitle);
    }

    getBooks() {
        return [...this.books];
    }
}


class LibraryObserver {
    constructor(name) {
        this.name = name;
    }

    update(bookTitle) {
        console.log(`Library member ${this.name} received a notification: New book added - ${bookTitle}`);
    }
}


const library = new Library();

const member1 = new LibraryObserver("Alice");
const member2 = new LibraryObserver("Bob");

library.addObserver(member1);
library.addObserver(member2);

library.addBook("The Great Gatsby");
library.addBook("To Kill a Mockingbird");
