public class Main {
    public static void main(String[] args) {
        BookPool bookPool = new BookPool();


        for (int i = 0; i < 5; i++) {
            Book book = bookPool.borrowBook();
            System.out.println("Borrowed: " + book.getTitle() + " by " + book.getAuthor());


            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            bookPool.returnBook(book);
            System.out.println("Returned: " + book.getTitle() + " by " + book.getAuthor());
        }
    }
}