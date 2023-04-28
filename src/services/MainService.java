package services;

import enumerators.BookGenre;
import model.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class MainService {

    public static ArrayList<Author> allAuthors = new ArrayList<>();
    public static ArrayList<Book> allBooks = new ArrayList<>();
    public static ArrayList<Exemplar> allExemplars = new ArrayList<>();
    public static ArrayList<ExemplarIssue> allExemplarIssue = new ArrayList<>();
    public static ArrayList<User> allUsers = new ArrayList<>();
    public static ArrayList<Librarian> allLibrarians = new ArrayList<>();

    public static void main(String[] args) {

    }
    public static ArrayList<Book> listBooksByCategory(BookGenre genre){
        ArrayList<Book> bookList = new ArrayList<>();
        for(Book temp : allBooks){
            if(temp.getGenre() == (genre)){
                bookList.add(temp);
            }
        }
        return bookList;
    }
    public static ArrayList<Book> listBooksByAuthor(Author author){
        ArrayList<Book> bookList = new ArrayList<>();
        for(Book temp : allBooks){
            if(temp.getAuthor().equals(author)){
                bookList.add(temp);
            }
        }
        return bookList;
    }

    public static ArrayList<Book> searchBooksByPublicationDate(LocalDate dateFrom, LocalDate dateTo){
        ArrayList<Book> bookList = new ArrayList<>();
        for(Book temp : allBooks){
            if(temp.getWritingYear().isAfter(dateFrom) && temp.getWritingYear().isBefore(dateTo)){
                bookList.add(temp);
            }
        }
        return bookList;
    }
    public static Book searchBookByTitle(String title) throws Exception {
        for(Book temp : allBooks){
            if(temp.getTitle().equals(title)){
                return temp;
            }
        } throw new Exception("Book with this title is not found");
    }

    //TODO maybe there are some inbuilt frontend functions to sort
    /*public static ArrayList<Book> sortBooksByAuthorsNameInAlphabetOrder(Author author){}
    public static ArrayList<Book> sortBooksByPublicationDate(LocalDate date){}*/
    //TODO that function needs to be done according to frontend
//    SendNotificationToUserAboutExpiringDate

}
