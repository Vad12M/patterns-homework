public class Main {
    public static void main(String[] args) {
        ApprovalHandler purchaseHandler = new PurchaseApprovalHandler();
        ApprovalHandler catalogingHandler = new CatalogingApprovalHandler();
        ApprovalHandler publicationHandler = new PublicationApprovalHandler();

        purchaseHandler.setNextHandler(catalogingHandler);
        catalogingHandler.setNextHandler(publicationHandler);

        Book book1 = new Book("Patterns", 90.0);
        Book book2 = new Book("Ira", 150.0);
        Book book3 = new Book("Java", 250.0);

        purchaseHandler.processRequest(book1);
        purchaseHandler.processRequest(book2);
        purchaseHandler.processRequest(book3);

    }
}