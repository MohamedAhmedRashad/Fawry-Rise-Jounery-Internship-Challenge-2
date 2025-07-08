public class PaperBook extends Book {
    int stock;
    
    public PaperBook(String isbn, String title, int year, double price, int stock) {
        super(isbn, title, year, price);
        this.stock = stock;
    }

    @Override
    public double buy(int quantity, String email, String address, double price) throws Exception {
        if(quantity>this.stock)    
            throw new Exception("Not enough stock available");
        stock-=quantity;    
        System.out.println("Sending paper book to shipping service with address: " + address);
        return price*quantity;
    }

    @Override
    public boolean isForSale() {
        return stock>0;
    }

    @Override
    public String toString() {
        return "PaperBook [isbn=" + isbn + ", stock=" + stock + ", title=" + title + ", year=" + year + ", price="
                + price + "]";
    }


    
    
}
