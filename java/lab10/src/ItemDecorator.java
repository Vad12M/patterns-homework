public class ItemDecorator implements Item{
    private Item wrappee;

    public ItemDecorator(Item wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void borrow() {
        wrappee.borrow();
    }
}
