
class Person {
    constructor() {
        this.printInfo = function() {
            console.log("This is a person.");
        };
    }
}

class Reader extends Person {
    constructor() {
        super();
        this.printInfo = function() {
            console.log("This is a reader.");
        };
    }
}


class Librarian extends Person {
    constructor() {
        super();
        this.printInfo = function() {
            console.log("This is a librarian.");
        };
    }
}

class PersonFactory {
    createPerson(personType) {
        switch (personType.toLowerCase()) {
            case "reader":
                return new Reader();
            case "librarian":
                return new Librarian();
            default:
                return null; 
        }
    }
}


const personFactory = new PersonFactory();

const reader = personFactory.createPerson("Reader");
reader.printInfo(); 

const librarian = personFactory.createPerson("Librarian");
librarian.printInfo(); 