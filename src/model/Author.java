package model;

import java.time.LocalDate;
import java.util.ArrayList;


public class Author {
	private int ID = 0;
	private String Name;
	private String Surname;
	private LocalDate DateofBirth;
	private LocalDate DateofDeath;
	private ArrayList<Book> Books;
	
	
	// Constructors
	public Author(int ID, String Name, String Surname, LocalDate DateofBirth, LocalDate DateofDeath, ArrayList<Book> Books) {
        this.ID = ID = 0;
        this.Name = Name;
        this.Surname = Surname;
        this.DateofBirth = DateofBirth;
        this.DateofDeath = DateofDeath;
        this.Books = Books;
    }
	
	
	// Setters and Getters
	
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID++;
	}
	
	
	public String getName() {
        return Name;
    }
    public void setName(String Name) {
    	if (Name != null) {
            this.Name = Name;
        }
    }
    
    
    public String getSurname() {
        return Name;
    }
    public void setSurname(String Surname) {
    	if (Surname != null) {
            this.Surname = Surname;
        }
    }
    
    
    public LocalDate getDateOfBirth() {
        return DateofBirth;
    }
    public void setDateOfBirth(LocalDate DateofBirth) {
    	LocalDate today = LocalDate.now();
        if (DateofBirth != null && !DateofBirth.isAfter(today)) {
            this.DateofBirth = DateofBirth;
        }
    }
    

    public LocalDate getDateOfDeath() {
        return DateofDeath;
    }
    public void setDateOfDeath(LocalDate DateofDeath) {
    	LocalDate today = LocalDate.now();
        if (DateofDeath != null && !DateofDeath.isAfter(today)) {
            this.DateofDeath = DateofDeath;
        }
    }

    
    public ArrayList<Book> getBooks() {
        return Books;
    }
    public void setBooks(ArrayList<Book> Books) {
        this.Books = Books;
    }

    
    @Override
    public String toString() {
        return "Author{" +
                "id=" + ID +
                ", name='" + Name + '\'' +
                ", surname='" + Surname + '\'' +
                ", dateOfBirth=" + DateofBirth +
                ", dateOfDeath=" + DateofDeath +
                ", books=" + Books +
                '}';
    }
    
}
