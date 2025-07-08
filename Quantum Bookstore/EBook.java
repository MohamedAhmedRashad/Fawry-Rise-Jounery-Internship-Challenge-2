public class EBook extends Book{
    String fileType;

    
    public EBook(String isbn, String title, int year, double price, String fileType) {
        super(isbn, title, year, price);
        this.fileType = fileType;
    }

    @Override
    public double buy(int quantity, String email, String address, double price) throws Exception {
        System.out.println("Sending ebook to " + email);
        return quantity*price;
    }

    @Override
    public boolean isForSale() {
        return true;
    }

    @Override
    public String toString() {
        return "EBook [isbn=" + isbn + ", fileType=" + fileType + ", title=" + title + ", year=" + year + ", price="
                + price + "]";
    }

    


    


    
}
