public class PublicationApprovalHandler implements ApprovalHandler{
    @Override
    public void setNextHandler(ApprovalHandler handler) {
    }

    @Override
    public void processRequest(Book book) {
        System.out.println("Publication Approved for: " + book.getTitle());
    }
}
