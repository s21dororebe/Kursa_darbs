package services;

//testing exemplar

import model.Author;
import model.Book;
import model.Category;
import model.Exemplar;

import java.time.LocalDate;
import java.util.ArrayList;

public class ExemplarService {
    public static void main(String[] args) {
        ArrayList<Exemplar> allEx = new ArrayList<>();
        Book b1 = new Book(123456789, "Title", "description", new Author("Name", "Surname"),
                Category.category1, 2, LocalDate.of(1955, 5, 5));
        Exemplar e1 = new Exemplar(b1, 2012);
        Exemplar e2 = new Exemplar(5256365, "Exemplar", "description",
                new Author("Alex", "Pushkin"), Category.category2, 20,
                LocalDate.of(1987, 9, 9), 2015);
        System.out.println(e1);
        System.out.println(e2);

        for(int i = 0; i < 1000; i++){
            allEx.add(new Exemplar(b1, 2012));
        }
        for(Exemplar temp : allEx)
            System.out.println(temp.getExID());

    }
}
