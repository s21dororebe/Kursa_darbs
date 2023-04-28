package model;

import java.time.LocalDateTime;
import Enum.BookGenre;

public class Book {
	private long generatedId;
	private static long idCounter = 0;
	private String title;
	private Author author;
	private BookGenre genre;
	private String description;
	private int quantity = 0;
	private LocalDateTime publicationDate;
	
	// Constructors
	public Book(String title, Author author, BookGenre genre, String description, int quantity, LocalDateTime publicationDate) throws Exception {
        setGeneratedId();
		setTitle(title);
		setAuthor(author);
		setGenre(genre);
		setDescription(description);
		setQuantity(quantity);
		setPublicationDate(publicationDate);
    }
	// Setters and Getters
	
	public long getGeneratedId() {
		return generatedId;
	}
	public void setGeneratedId() {
		this.generatedId = idCounter++;
	}

	public String getTitle() {
        return title;
    }
    public void setTitle(String title) throws Exception {
        if(title.length() > 0 && title.length() < 100){
            this.title = title;
        } else throw new Exception("Title cannot be empty");
    }
    
    public Author getAuthor() {
    	return author;
    }
    public void setAuthor(Author author) throws Exception {
        if(author != null)
            this.author = author;
        else throw new Exception("Invalid input author");
    }
    
    public BookGenre getGenre() {
        return genre;
    }
    public void setGenre(BookGenre genre) throws Exception {
        if(genre != null)
            this.genre = genre;
        else throw new Exception("Invalid input genre");
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) throws Exception {
        if(description.length() > 0 && description.length() < 1000){
            this.description = description;
        } else throw new Exception("Description cannot be empty");
    }
    
    public int getQuantity() {
    	return quantity;
    }
    public void setQuantity(int quantity) throws Exception {
    	if (quantity <= 99 && quantity > 0) {
            this.quantity = quantity;
        } else {
            throw new Exception("Invalid input quantity (it can be from 1 to 99)");
        }
    }

    public LocalDateTime getPublicationDate() {
        return publicationDate;
    }
    public void setPublicationDate(LocalDateTime publicationDate) throws Exception {
    	if (publicationDate.isAfter(LocalDateTime.now())) {
            throw new Exception("Publication date cannot be in the future");
        }
        this.publicationDate = publicationDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                " title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre=" + genre +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                ", publicationdate=" + publicationDate +
                '}';
    }
    
    
}
