class Book {
    printInfo() {
        console.log("");
    }
}

class PaperBook {
    printInfo() {
        console.log("This is paper book");
    }
}


class EBook extends Book {
    printInfo() {
        console.log("This is ebook");
    }
}


class BookFactory {
    createBook() {
        return new Book();
    }
}


class PhysicalFactory extends BookFactory {
    createBook() {
        return new PaperBook();
    }
}


class EFactory extends BookFactory {
    createBook() {
        return new EBook();
    }
}



let factory;


const selection = 2; // hardcode :3

if (selection === 1) {
    factory = new PhysicalFactory();
} else {
    factory = new EFactory();
}

factory.createBook().printInfo();


