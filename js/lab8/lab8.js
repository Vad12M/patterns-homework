class BookGenre {
    constructor(storageSystem) {
        this.storageSystem = storageSystem;
    }

    addBook(title) {
        console.log(`Added a book of genre ${this.getGenre()}: ${title}`);
        this.storageSystem.storeBook(title);
    }

    removeBook(title) {
        console.log(`Removed a book of genre ${this.getGenre()}: ${title}`);
        this.storageSystem.removeBook(title);
    }

    getGenre() {
        return "Uncategorized";
    }
}


class StorageSystem {
    storeBook(title) {
        console.log(`Stored the book: ${title}`);
    }

    removeBook(title) {
        console.log(`Removed the book: ${title}`);
    }
}

class PhysicalStorage extends StorageSystem {
    storeBook(title) {
        console.log(`Stored a physical book: ${title}`);
    }

    removeBook(title) {
        console.log(`Removed a physical book: ${title}`);
    }
}

class DigitalStorage extends StorageSystem {
    storeBook(title) {
        console.log(`Stored a digital book: ${title}`);
    }

    removeBook(title) {
        console.log(`Removed a digital book: ${title}`);
    }
}


class FictionGenre extends BookGenre {
    getGenre() {
        return "Fiction";
    }
}

class NonFictionGenre extends BookGenre {
    getGenre() {
        return "Non-Fiction";
    }
}


const physicalStorage = new PhysicalStorage();
const digitalStorage = new DigitalStorage();

const fiction = new FictionGenre(physicalStorage);
const nonFiction = new NonFictionGenre(digitalStorage);

fiction.addBook("The Great Gatsby");
fiction.removeBook("The Great Gatsby");

nonFiction.addBook("Math");
nonFiction.removeBook("Math");