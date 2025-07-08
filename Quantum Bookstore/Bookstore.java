import java.util.ArrayList;
import java.util.Iterator;

public class Bookstore {
    ArrayList<Book> inventory=new ArrayList<>();

    public void addBook(Book book){
        inventory.add(book);
    }


    public void removeBook(Book book){
        inventory.remove(book);
    }

    public ArrayList<Book> removeOutdatedBooks(int currentYear,int yearsOfExpired){
        ArrayList<Book> removedBooks=new ArrayList<>();

        Iterator<Book> iterator = inventory.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.isOutdated(currentYear, yearsOfExpired)) {
                removedBooks.add(book);
                iterator.remove(); 
            }
        
    }
        System.out.println(inventory);    
        System.out.println("------------------");    
        return removedBooks;
    }
    public int findBookIndexByIsbn(String isbn) throws Exception {
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).getIsbn().equals(isbn)) {
                return i;
            }
        }
        throw new Exception("Book with ISBN " + isbn + " not found in inventory.");
    }


    public double buyBook(String isbn,int quantity,String email, String address) throws Exception{
        Book book=inventory.get(findBookIndexByIsbn(isbn));
        if(!book.isForSale())
            throw new Exception("Book is not for sale");
        return book.buy(quantity, email, address, book.price) ;   
    }

    public void print(){
        for(Book book: inventory){
            System.out.println(book);
        }
    }

}
