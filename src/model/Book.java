package model;

import java.time.LocalDateTime;

import Enum.BookGenre;

public class Book {
	private int ID = 0;
	private String Title;
	private String Author;
	private BookGenre Genre;
	private String Description;
	private int Quantity;
	private LocalDateTime PublicationDate;
	
	
	// Constructors
	
	
	public Book(int ID, String Title, String Author, BookGenre Genre, String Description, int Quantity, LocalDateTime PublicationDate) {
        this.ID = ID;
        this.Title = Title;
        this.Author = Author;
        this.Genre = Genre;
        this.Description = Description;
        this.Quantity = Quantity;
        this.PublicationDate = PublicationDate;
    }
	
	
	// Setters and Getters
	
	public int getId() {
        return ID;
    }
    public void setId(int ID) {
        this.ID = ID++;
    }
        
        
	public String getTitle() {
        return Title;
    }
    public void setTitle(String Title) throws Exception {
    	if (Title == null) {
            throw new Exception("Title cannot be empty");
        }
        this.Title = Title;
    }
    
    
    public BookGenre getGenre() {
        return Genre;
    }
    public void setGenre(BookGenre Genre) {
        this.Genre = Genre;
    }
    
    
    public String getDescription() {
        return Description;
    }
    public void setDescription(String Description) throws Exception {
    	if (Description == null) {
            throw new Exception("Description cannot be empty");
        }
        this.Description = Description;
    }
    
    
    public int getQuantity() {
    	return Quantity;
    }
    public void setQuantity(int Quantity) throws Exception {
    	if (Quantity == 0) {
            System.out.println("There are no books in the library available");
        }
        else if (Quantity <= 99) {
            this.Quantity = Quantity;
        } else {
            throw new Exception("Too much books");
        }
    }
    
    
    public LocalDateTime getPublicationDate() {
        return PublicationDate;
    }
    public void setPublicationDate(LocalDateTime PublicationDate) {
    	if (PublicationDate.isAfter(LocalDateTime.now())) {
            throw new IllegalArgumentException("Publication date cannot be in the future");
        }
        this.PublicationDate = PublicationDate;
    }
    
    
    @Override
    public String toString() {
        return "Book{" +
                "id=" + ID +
                ", title='" + Title + '\'' +
                ", author='" + Author + '\'' +
                ", genre=" + Genre +
                ", description='" + Description + '\'' +
                ", quantity=" + Quantity +
                ", publicationDate=" + PublicationDate +
                '}';
    }
    
    
}
