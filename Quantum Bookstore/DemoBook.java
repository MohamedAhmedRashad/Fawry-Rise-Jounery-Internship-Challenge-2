public class DemoBook extends Book {

    public DemoBook(String isbn, String title, int year, double price, String fileType){
        super(isbn, title, year, price);
    }

    @Override
    public double buy(int quantity, String email, String address, double price) throws Exception {
        throw new Exception("Demo books is not for sale");
    }
    
    @Override
    public boolean isForSale() {
       return false;
    }


    

    
    
}
