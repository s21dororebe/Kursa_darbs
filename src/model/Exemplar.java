package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import static com.sun.tools.javac.util.Constants.format;

public class Exemplar extends Book {
    //unique book exemplar id
    private String exID = "exemplarID";
    private static long idCounter = 0;
    private int publicationYear = 1000;
    private boolean isIssued; //eksemplars ir panemts

    public Exemplar(long id, String title, String description, Author author, Category category, int quantityInLibrary, LocalDate writingYear, int inputPublicationYear) {
        super(id, title, description, author, category, quantityInLibrary, writingYear);
        setPublicationYear(inputPublicationYear);
        setExID();
    }
    public Exemplar(Book book, int inputPublicationYear) {
        super(book.getId(), book.getTitle(), book.getDescription(), book.getAuthor(), book.getCategory(), book.getQuantityInLibrary(), book.getWritingYear());
        setPublicationYear(inputPublicationYear);
        setExID();
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    public void setPublicationYear(int inputPublicationYear) {
        if(inputPublicationYear >= 1500 && inputPublicationYear <= LocalDateTime.now().getYear()){
            publicationYear = inputPublicationYear;
        }
    }

    public String getExID() {
        return exID;
    }
    public void setExID() {
        //1990AP2005121ABC5
        String pattern = "yyyy";
        String titleShort = getTitle().substring(0, 3);
        exID = getWritingYear().format(DateTimeFormatter.ofPattern(pattern)) + Character.toUpperCase(getAuthor().getName().charAt(1)) + Character.toUpperCase(getAuthor().getSurname().charAt(1)) + getPublicationYear();
        for(int i = 0; i < 3; i++){
            exID += Character.toUpperCase(titleShort.charAt(i));
        }
        exID += idCounter++;
    }

    public boolean isIssued() {
        return isIssued;
    }
    public void setIssued(boolean issued) {
        isIssued = issued;
    }

    @Override
    public String toString() {
        return super.toString() + "Exemplar{" +
                "exID='" + exID + '\'' +
                ", publicationDate=" + publicationYear +
                '}';
    }

    public void takeExemplar(){
        setIssued(true);
    }
    public void returnExemplar(){
        setIssued(false);
    }
}
