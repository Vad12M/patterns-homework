class Book {
    constructor(builder) {
        this.hardcover = builder.hardcover;
        this.maxOfPages = builder.maxOfPages;
        this.hasIllustrations = builder.hasIllustrations;
        this.glossyPaper = builder.glossyPaper;
    }

    toString() {
        return `Book { hardcover: ${this.hardcover}, maxOfPages: ${this.maxOfPages}, hasIllustrations: ${this.hasIllustrations}, glossyPaper: ${this.glossyPaper} }`;
    }
}

class BookBuilder {
    constructor() {
        this.hardcover = false;
        this.maxOfPages = 0;
        this.hasIllustrations = false;
        this.glossyPaper = false;
    }

    setHardcover(hardcover) {
        this.hardcover = hardcover;
        return this;
    }

    setMaxOfPages(maxOfPages) {
        this.maxOfPages = maxOfPages;
        return this;
    }

    setHasIllustrations(hasIllustrations) {
        this.hasIllustrations = hasIllustrations;
        return this;
    }

    setGlossyPaper(glossyPaper) {
        this.glossyPaper = glossyPaper;
        return this;
    }

    build() {
        return new Book(this);
    }
}

class Director {
    createMagazine(builder) {
        return builder
            .setHardcover(false)
            .setMaxOfPages(50)
            .setHasIllustrations(true)
            .setGlossyPaper(true)
            .build();
    }

    createManualBook(builder) {
        return builder
            .setHardcover(false)
            .setMaxOfPages(300)
            .setHasIllustrations(true)
            .setGlossyPaper(false)
            .build();
    }
}

// Usage
const builder = new BookBuilder();
const director = new Director();

const magazine = director.createMagazine(builder);
const manualBook = director.createManualBook(builder);

console.log(magazine.toString());
console.log(manualBook.toString());