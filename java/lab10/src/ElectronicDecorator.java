public class ElectronicDecorator extends ItemDecorator{

    public ElectronicDecorator(Item item) {
        super(item);
    }

    @Override
    public void borrow() {
        System.out.println("Ebook is borrowed");
    }
}
