public abstract class Book {
    String isbn;
    String title;
    int year;
    double price;

    public Book(String isbn, String title, int year, double price) {
        this.isbn = isbn;
        this.title = title;
        this.year = year;
        this.price = price;
    }


    public String getIsbn() {
        return isbn;
    }
    

    public int getYear() {
        return year;
    }

    


    @Override
    public String toString() {
        return "Book [isbn=" + isbn + ", title=" + title + ", year=" + year + ", price=" + price + "]";
    }


    public abstract boolean isForSale();
    public abstract double buy(int quantity, String email, String address , double price) throws Exception;
    
    public boolean isOutdated(int currentYear ,int yearsOfExpired ){
         return (currentYear-getYear())>yearsOfExpired;
    }



}