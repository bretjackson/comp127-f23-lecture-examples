/***
 * Represents a book
 */
public class Book {
    enum Genre {mystery, fantasy, romance}
    
    private String title;
    private String author;
    private int isbn;

    //Using an enum here rather than a String prevents you from
    // making errors, makes the possible options explicit, makes it easier
    // to organize books by specific genres later, etc.
    private Genre genre = Genre.mystery;

    /***
     * Sets the genre for this book
     * @param genre
     */
    public void setGenre(Genre genre){
        this.genre = genre;
    }

    public static void main(String[] args) {
        Book myBook = new Book();
        myBook.setGenre(Genre.fantasy);
    }
}
