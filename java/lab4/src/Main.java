import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BookFactory factory;

        System.out.println("Choose paper or electronic book(1 or 2):");

        if (in.nextInt()==1){
            factory = new PhysicalFactory();
        }else {
            factory = new EFactory();
        }

        factory.createBook()
                .printInfo();
    }
}