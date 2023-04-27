package model;

import java.time.LocalDate;

public class Book {
    private long id;
    private String title;
    private String description;
    private Author author;
    private Category category;
    private int quantityInLibrary;
    private LocalDate writingYear = LocalDate.of(1850, 1, 1);

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getQuantityInLibrary() {
        return quantityInLibrary;
    }

    public void setQuantityInLibrary(int quantityInLibrary) {
        this.quantityInLibrary = quantityInLibrary;
    }

    public LocalDate getWritingYear() {
        return writingYear;
    }

    public void setWritingYear(LocalDate writingYear) {
        this.writingYear = writingYear;
    }


    public Book(long id, String title, String description, Author author, Category category, int quantityInLibrary, LocalDate writingYear) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.author = author;
        this.category = category;
        this.quantityInLibrary = quantityInLibrary;
        this.writingYear = writingYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", author='" + author + '\'' +
                ", category=" + category +
                ", quantityInLibrary=" + quantityInLibrary +
                ", writingYear=" + writingYear +
                '}';
    }
}
