class Book {
    constructor(title, author) {
        this.title = title;
        this.author = author;
    }

    getTitle() {
        return this.title;
    }

    getAuthor() {
        return this.author;
    }
}

class BookPool {
    constructor() {
        this.maxIdleTime = 60000; 
        this.availableBooks = [];
        this.borrowedBooks = [];
    }

    borrowBook() {
        const now = Date.now();
        let book = null;

        if (this.availableBooks.length > 0) {
            book = this.availableBooks.shift();
            this.borrowedBooks.push(book);
        }

        if (book === null || (now - book.idleStartTime) > this.maxIdleTime) {
        
            book = this.createBook();
            this.borrowedBooks.push(book);
        }

        return book;
    }

    returnBook(book) {
        const index = this.borrowedBooks.indexOf(book);
        if (index !== -1) {
            this.borrowedBooks.splice(index, 1);
            book.idleStartTime = Date.now();
            this.availableBooks.push(book);
        }
    }

    createBook() {
    
        const title = "Sample Title";
        const author = "Sample Author";
        return new Book(title, author);
    }
}

function simulateUsage(bookPool) {
    const book = bookPool.borrowBook();
    console.log(`Borrowed: ${book.getTitle()} by ${book.getAuthor()}`);

    setTimeout(() => {
        bookPool.returnBook(book);
        console.log(`Returned: ${book.getTitle()} by ${book.getAuthor()}`);
    }, 2000); 
}

const bookPool = new BookPool();

//чомусь нічого не виводить т_т але здається логіка правильна

for (let i = 0; i < 5; i++) {
    simulateUsage(bookPool);
}