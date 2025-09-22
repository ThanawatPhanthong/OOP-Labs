
class BookDemo {
    public static void main(String[] args) {
        Book book = new Book("Developing Java Software", "Russel Winderand", 79.75);

        // System.out.println(book.getTitle() + " with authors" + book.getAuthor() + " price " + book.getPrice() + ".");
        
        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
    }
}