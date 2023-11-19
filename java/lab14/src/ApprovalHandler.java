public interface ApprovalHandler {
    void setNextHandler(ApprovalHandler handler);
    void processRequest(Book book);
}
