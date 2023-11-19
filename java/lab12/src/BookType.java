public class BookType {
    private String name;
    private String coverType;
    private String paperType;

    public BookType(String name, String coverType, String paperType) {
        this.name = name;
        this.coverType = coverType;
        this.paperType = paperType;
    }

    public void getInfo(){
        System.out.println("The cover is " + coverType +
                                "\nThe type of paper is " + paperType);
    }
}
