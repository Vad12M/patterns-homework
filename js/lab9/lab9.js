class CatalogComponent {
    constructor(name) {
        this.name = name;
    }

    displayInfo() {}

    add(component) {}

    getSubComponents() {}
}

class Book extends CatalogComponent {
    constructor(title) {
        super(title);
        this.title = title;
    }

    displayInfo() {
        console.log(`Book: ${this.title}`);
    }

    add(component) {
        throw new Error("Not supported for Book.");
    }

    getSubComponents() {
        return [];
    }
}

class Catalog extends CatalogComponent {
    constructor(name) {
        super(name);
        this.subComponents = [];
    }

    displayInfo() {
        console.log(`Catalog: ${this.name}`);
        for (const component of this.subComponents) {
            component.displayInfo();
        }
    }

    add(component) {
        this.subComponents.push(component);
    }

    getSubComponents() {
        return this.subComponents;
    }
}

const library = new Catalog("Library");

const fictionCatalog = new Catalog("Fiction");
const dramaCatalog = new Catalog("Drama");

const fictionBook1 = new Book("To Kill a Mockingbird");
const dramaBook1 = new Book("Hamlet");

fictionCatalog.add(fictionBook1);
dramaCatalog.add(dramaBook1);

fictionCatalog.add(dramaCatalog);

library.add(fictionCatalog);

library.displayInfo();