class LibraryMediator {
    constructor() {
        this.members = [];
        this.availableBooks = [];
    }

    registerLibraryMember(member) {
        this.members.push(member);
    }

    borrowBook(member, bookTitle) {
        if (this.availableBooks.includes(bookTitle)) {
            this.availableBooks.splice(this.availableBooks.indexOf(bookTitle), 1);
            console.log(member.getName() + " borrowed: " + bookTitle);
        } else {
            console.log("Sorry, " + member.getName() + ". The book " + bookTitle + " is not available.");
        }
    }

    returnBook(member, bookTitle) {
        this.availableBooks.push(bookTitle);
        console.log(member.getName() + " returned: " + bookTitle);
    }
}

class LibraryMember {
    constructor(mediator, name) {
        this.mediator = mediator;
        this.name = name;
    }

    getName() {
        return this.name;
    }

    borrowBook(bookTitle) {
        this.mediator.borrowBook(this, bookTitle);
    }

    returnBook(bookTitle) {
        this.mediator.returnBook(this, bookTitle);
    }
}

class Student extends LibraryMember {
    constructor(mediator, name) {
        super(mediator, name);
    }
}

const mediator = new LibraryMediator();

const student1 = new Student(mediator, "Alice");
const student2 = new Student(mediator, "Bob");

mediator.registerLibraryMember(student1);
mediator.registerLibraryMember(student2);

mediator.borrowBook(student1, "Book 1");
mediator.borrowBook(student2, "Book 2");

mediator.returnBook(student1, "Book 1");
mediator.borrowBook(student2, "Book 1");
