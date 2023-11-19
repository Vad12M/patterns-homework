const bookPrototype = {
    title: "",
    author: "",
  
    clone: function () {
      const clonedBook = Object.create(this);
      return clonedBook;
    },
  
    toString: function () {
      return `Title: ${this.title}, Author: ${this.author}`;
    },
};
  
const library = {
    bookPrototypes: {},

    addBookPrototype: function (key, book) {
        this.bookPrototypes[key] = book;
    },

    checkoutBook: function (key) {
        const bookPrototype = this.bookPrototypes[key];
        if (bookPrototype) {
        return bookPrototype.clone();
        }
        return null;
    },
};
  
  const book1 = Object.create(bookPrototype);
  book1.title = "1";
  book1.author = "Author 1";
  
  const book2 = Object.create(bookPrototype);
  book2.title = "2";
  book2.author = "Author 2";
  
  library.addBookPrototype("key1", book1);
  library.addBookPrototype("key2", book2);

  const clonedBook1 = library.checkoutBook("key1");
  const clonedBook2 = library.checkoutBook("key2");
  
  if (clonedBook1) {
    console.log("Cloned Book 1:", clonedBook1.toString());
  } else {
    console.log("Book 1 prototype not found.");
  }
  
  if (clonedBook2) {
    console.log("Cloned Book 2:", clonedBook2.toString());
  } else {
    console.log("Book 2 prototype not found.");
  }