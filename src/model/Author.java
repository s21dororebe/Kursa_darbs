package model;

import java.time.LocalDate;
import java.util.ArrayList;


public class Author {
	private long generatedId;
	private static long idCounter = 0;
	private String name;
	private String surname;
	private LocalDate dateofbirth;
	private LocalDate dateofdeath;
	private ArrayList<Book> books;
	
	
	// Constructors
	public Author(String name, String surname, LocalDate dateofbirth, LocalDate dateofdeath, ArrayList<Book> books) {
        setName(name);
        setSurname(surname);
        setDateofBirth(dateofbirth);
        setDateofDeath(dateofdeath);
        setBooks(books);
    }
	
	
	// Setters and Getters
	
	public long getGeneratedId() {
		return generatedId;
	}

	public void setGeneratedId() {
		this.generatedId = idCounter++;
	}
	
	
	public String getname() {
        return name;
    }
    public void setName(String name) {
    	if (name != null) {
            this.name = name;
        }
    }
    
    
    public String getsurname() {
        return name;
    }
    public void setSurname(String surname) {
    	if (surname != null) {
            this.surname = surname;
        }
    }
    
    
    public LocalDate getdateofbirth() {
        return dateofbirth;
    }
    public void setDateofBirth(LocalDate dateofbirth) {
    	LocalDate today = LocalDate.now();
        if (dateofbirth != null && !dateofbirth.isAfter(today)) {
            this.dateofbirth = dateofbirth;
        }
    }
    

    public LocalDate getdateofdeath() {
        return dateofdeath;
    }
    public void setDateofDeath(LocalDate dateofdeath) {
    	LocalDate today = LocalDate.now();
        if (dateofdeath != null && !dateofdeath.isAfter(today)) {
            this.dateofdeath = dateofdeath;
        }
    }

    
    public ArrayList<Book> getbooks() {
        return books;
    }
    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    
    @Override
    public String toString() {
        return "Author{" +
                " name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateofbirth=" + dateofbirth +
                ", dateofdeath=" + dateofdeath +
                ", books=" + books +
                '}';
    }
    
}
