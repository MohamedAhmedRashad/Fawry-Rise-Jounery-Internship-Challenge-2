public class BookStoreTest {
    public static void main(String[] args) throws Exception {
        Bookstore bookstore = new Bookstore();

        PaperBook pb1 = new PaperBook("9780134685991", "Effective Java", 2018, 45.99, 10);
        PaperBook pb2 = new PaperBook("9780132350884", "Clean Code", 2008, 42.00, 5);
        PaperBook pb3 = new PaperBook("9780596009205", "Head First Design Patterns", 2004, 55.95, 7);
        EBook eb1 = new EBook("9781617294945", "Spring in Action", 2018, 49.99, "PDF");
        EBook eb2 = new EBook("9781491950357", "Clean Architecture", 2017, 37.50, "EPUB");
        EBook eb3 = new EBook("9780134685991", "Effective Java", 2018, 45.99, "MOBI");
        DemoBook db1 = new DemoBook("9780321356680", "Test-Driven Development", 2005, 0.00, "PDF");
        DemoBook db2 = new DemoBook("9780131177055", "Agile Software Development", 2002, 0.00, "EPUB");
        DemoBook db3 = new DemoBook("9780201616224", "The Pragmatic Programmer", 1999, 0.00, "MOBI");
         

        bookstore.addBook(pb1);
        bookstore.addBook(pb2);
        bookstore.addBook(pb3);
        bookstore.addBook(db1);

        //bookstore.print();


        // bookstore.removeBook(pb1);
        // bookstore.print();

        // try{
        //     bookstore.buyBook("9781617294945", 2, "mody", "zayed");
        // }
        // catch(Exception e){
        //     System.out.println("Quantum book store - Error: " + e.getMessage());
        // }  
        
        //  System.out.println(bookstore.buyBook("9780596009205", 2,  "mody", "zayed"));
        //  bookstore.print();

        // try{
        //     System.out.println(bookstore.buyBook("9780321356680", 2,  "mody", "zayed"));
        // }
        // catch(Exception e){
        //     System.out.println("Quantum book store - Error: " + e.getMessage());
        // }


        // System.out.println(bookstore.removeOutdatedBooks(2025,10));

    }
    
}
