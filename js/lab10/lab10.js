class Item {
   borrow(){};
}

class Book extends Item{
    constructor(name){
        super();
        this.name = name;
    }

    borrow(){
        console.log("Book is borrowed");
    }
}

class ItemDecorator extends Item{
    constructor(wrappee){
        super();
        this.wrappee = wrappee;
    }

    borrow(){
        this.wrappee.borrow();
    }
}

class ElectronicDecorator extends ItemDecorator{
    constructor(item){
        super(item);
    }

    borrow(){
        console.log("Ebook is borrowed");
    }
}

const book = new Book("1");
const ebook = new ElectronicDecorator(book);
ebook.borrow();