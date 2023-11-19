public class PurchaseApprovalHandler implements ApprovalHandler{
    private ApprovalHandler nextHandler;

    @Override
    public void setNextHandler(ApprovalHandler handler) {
        nextHandler = handler;
    }

    @Override
    public void processRequest(Book book) {
        if (book.getPrice() <= 100) {
            System.out.println("Purchase Approved for: " + book.getTitle());
        } else if (nextHandler != null) {
            nextHandler.processRequest(book);
        } else {
            System.out.println("All approvals denied for: " + book.getTitle());
        }
    }
}

