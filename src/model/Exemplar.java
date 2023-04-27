package model;

import java.time.LocalDate;
import java.util.Random;

import static com.sun.tools.javac.util.Constants.format;

public class Exemplar extends Book {
    //unique book exemplar id
    private String exID = "exemplarID";
    private long idCounter = 0;
    private LocalDate publicationDate = LocalDate.of(1900, 1, 1);

    public Exemplar(long id, String title, String description, Author author, Category category, int quantityInLibrary, LocalDate writingYear, LocalDate publicationDate) {
        super(id, title, description, author, category, quantityInLibrary, writingYear);
        setPublicationDate(publicationDate);
        setExID();
    }
    public Exemplar(Book book, LocalDate publicationDate) {
        super(book.getId(), book.getTitle(), book.getDescription(), book.getAuthor(), book.getCategory(), book.getQuantityInLibrary(), book.getWritingYear());
        setPublicationDate(publicationDate);
        setExID();
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }
    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getExID() {
        return exID;
    }
    public void setExID() {
        //1990AP2005121ABC5
        exID = format(getWritingYear()) + getAuthor().getName().charAt(1)
                + getAuthor().getSurname().charAt(1) + getPublicationDate()
                + randomLetter() + randomLetter() + randomLetter() + idCounter;
        idCounter++;
    }

    Random r = new Random();
    private char randomLetter(){
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        return alphabet.charAt(r.nextInt(alphabet.length()));
    }

}
