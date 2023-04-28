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
	private LocalDateTime publicationdate;
	
	
	// Constructors
	
	
	public Book(String title, Author author, BookGenre genre, String description, int quantity, LocalDateTime publicationdate) throws Exception {
		setTitle(title);
		setAuthor(author);
		setGenre(genre);
		setDescription(description);
		setQuantity(quantity);
		setPublicationDate(publicationdate);
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
    	if (title == null) {
            throw new Exception("Title cannot be empty");
        }
        this.title = title;
    }
    
    public Author getAuthor() {
    	return author;
    }
    public void setAuthor(Author author) {
    	this.author = author;
    }
    
    
    public BookGenre getGenre() {
        return genre;
    }
    public void setGenre(BookGenre genre) {
        this.genre = genre;
    }
    
    
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) throws Exception {
    	if (description == null) {
            throw new Exception("Description cannot be empty");
        }
        this.description = description;
    }
    
    
    public int getQuantity() {
    	return quantity;
    }
    public void setQuantity(int quantity) throws Exception {
    	if (quantity <= 99 && quantity > 0) {
            this.quantity = quantity;
        } else {
            throw new Exception("Too much books");
        }
    }
    
    
    public LocalDateTime getPublicationDate() {
        return publicationdate;
    }
    public void setPublicationDate(LocalDateTime publicationdate) throws Exception {
    	if (publicationdate.isAfter(LocalDateTime.now())) {
            throw new Exception("Publication date cannot be in the future");
        }
        this.publicationdate = publicationdate;
    }
    
    
    @Override
    public String toString() {
        return "Book{" +
                " title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre=" + genre +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                ", publicationdate=" + publicationdate +
                '}';
    }
    
    
}
