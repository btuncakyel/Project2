package OOP.Inheritance2;

public class JavaBook extends Book{

    public JavaBook(String title, double price, int pageNumber) {
        super(title, price, pageNumber);
    }

    public JavaBook() {
    }

    public void info(){
        System.out.println("I am in the java book class");
    }


    public static int listen() {
        System.out.println("You are listening the Java book");
        return pageNumber;
       // return super.listen();

    }

    public static void main(String[] args) {

        Book book = new Book("Blue book", 19.99, 500);

        JavaBook javaBook = new JavaBook();
        javaBook.pageNumber = 400;
        System.out.println(javaBook.pageNumber);

        JavaBook javaBook1 = new JavaBook("Java Book", 49.99, 400);
        System.out.println(javaBook1.pageNumber);

        JavaBook javaBook2 = new JavaBook();
        System.out.println(javaBook2.pageNumber);
        book.info();

        // since page number fields is static, and it will reflect to all and it will take last changes

        javaBook2.info();
        //we did not initialize the javaBook2. page number is static and it will take take the last changes

        book.listen();
        javaBook2.listen();  // since we call the same behavior from the class

        javaBook.listen("Java Audio");
        book.listen("Audio");
        Book.listen();


    }

}
