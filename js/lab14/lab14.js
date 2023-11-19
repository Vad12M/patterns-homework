class Book {
    constructor(title, price) {
      this.title = title;
      this.price = price;
    }
  }
  
  class ApprovalHandler {
    setNextHandler(handler) {}
    processRequest(book) {}
  }
  
  class PurchaseApprovalHandler extends ApprovalHandler {
    setNextHandler(handler) {
      this.nextHandler = handler;
    }
  
    processRequest(book) {
      if (book.price <= 100) {
        console.log(`Purchase Approved for: ${book.title}`);
      } else if (this.nextHandler) {
        this.nextHandler.processRequest(book);
      } else {
        console.log(`All approvals denied for: ${book.title}`);
      }
    }
  }
  
  class CatalogingApprovalHandler extends ApprovalHandler {
    setNextHandler(handler) {
      this.nextHandler = handler;
    }
  
    processRequest(book) {
      if (book.price <= 200) {
        console.log(`Cataloging Approved for: ${book.title}`);
      } else if (this.nextHandler) {
        this.nextHandler.processRequest(book);
      } else {
        console.log(`All approvals denied for: ${book.title}`);
      }
    }
  }
  
  class PublicationApprovalHandler extends ApprovalHandler {
    setNextHandler(handler) {}
    processRequest(book) {
      console.log(`Publication Approved for: ${book.title}`);
    }
  }
  
  const purchaseHandler = new PurchaseApprovalHandler();
  const catalogingHandler = new CatalogingApprovalHandler();
  const publicationHandler = new PublicationApprovalHandler();
  
  purchaseHandler.setNextHandler(catalogingHandler);
  catalogingHandler.setNextHandler(publicationHandler);
  
  const book1 = new Book("Patterns", 90.0);
  const book2 = new Book("dtukmu", 150.0);
  const book3 = new Book("Java", 250.0);
  
  purchaseHandler.processRequest(book1);
  purchaseHandler.processRequest(book2);
  purchaseHandler.processRequest(book3);