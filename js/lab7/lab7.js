
class BookManager {
    constructor(bookType) {
        this.bookType = bookType;
    }

    checkoutBook(title) {
        console.log(`Checked out ${this.bookType} book: ${title}`);
        this.bookType.checkout(title);
    }

    returnBook(title) {
        console.log(`Returned ${this.bookType} book: ${title}`);
        this.bookType.returnBook(title);
    }
}


class PhysicalBookManagement {
    checkout(title) {
        console.log(`Checked out physical book: ${title}`);
    }

    returnBook(title) {
        console.log(`Returned physical book: ${title}`);
    }
}

class EBookManagement {
    checkout(title) {
        console.log(`Downloaded e-book: ${title}`);
    }

    returnBook(title) {
        console.log(`Removed e-book: ${title}`);
    }
}


function main() {
    const physicalBookManager = new BookManager(new PhysicalBookManagement());
    const eBookManager = new BookManager(new EBookManagement());

    physicalBookManager.checkoutBook("The Great Gatsby");
    physicalBookManager.returnBook("The Great Gatsby");

    eBookManager.checkoutBook("1984");
    eBookManager.returnBook("1984");
}

main();