package services;

//testing exemplar

import model.Author;
import model.Book;
import model.Category;
import model.Exemplar;

import java.time.LocalDate;

public class ExemplarService {
    public static void main(String[] args) {
        Book b1 = new Book(123456789, "Title", "description", new Author("Name", "Surname"),
                Category.category1, 2, LocalDate.of(1955, 5, 5));
        Exemplar e1 = new Exemplar(b1, LocalDate.of(2012, 7, 17));
        Exemplar e2 = new Exemplar(5256365, "Exemplar", "description",
                new Author("Alex", "Pushkin"), Category.category2, 20,
                LocalDate.of(1987, 9, 9), LocalDate.of(2015, 5, 5));
        System.out.println(e1);
        System.out.println(e2);

    }
}
