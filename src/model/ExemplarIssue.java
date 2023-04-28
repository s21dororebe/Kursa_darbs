package model;

import java.time.LocalDateTime;
import services.MainService;

public class ExemplarIssue {
    private User user;
    private Librarian librarian;
    private Exemplar exemplar;
    private LocalDateTime dateTimeBookIsIssued = LocalDateTime.now();
    private LocalDateTime dateTimeBookReturn = LocalDateTime.now().plusWeeks(2);

    public User getUser() {
        return user;
    }
    public Librarian getLibrarian() {
        return librarian;
    }
    public Exemplar getExemplar() {
        return exemplar;
    }
    public LocalDateTime getDateTimeBookIsIssued() {
        return dateTimeBookIsIssued;
    }
    public LocalDateTime getDateBookReturn() {
        return dateTimeBookReturn;
    }

    public void setUser(User user) throws Exception {
        if(user != null){
            for(User temp : MainService.allUsers){
                if(temp.getUsername().equals(user.getUsername())){
                    this.user = user;
                    break;
                }
            }
            throw new Exception("User not found");
        } else throw new Exception("Invalid input user");
    }
    public void setLibrarian(Librarian librarian) throws Exception {
        if(librarian != null){
            /*for(Librarian temp : MainService.allLibrarians){
                if(temp.getUsername().equals(user.getUsername())){
                    this.user = user;
                    break;
                }
            }
            throw new Exception("User not found");*/
            //TODO find librarian in librarian list
            this.librarian = librarian;
        } else throw new Exception("Invalid input librarian");
    }
    public void setExemplar(Exemplar exemplar) throws Exception {
        if(exemplar != null){
            for(Exemplar temp : MainService.allExemplars){
                if(temp.getExID().equals(exemplar.getExID())){
                    if(!exemplar.isIssued()){
                        this.exemplar = exemplar;
                    } else throw new Exception("This exemplar is taken");
                }
            }
            throw new Exception("Exemplar not found");
        } else throw new Exception("Invalid input exemplar");
    }

    public void setDateTimeBookIsIssued(LocalDateTime dateTimeBookIsIssued) throws Exception {
        if(dateTimeBookIsIssued != null && dateTimeBookIsIssued.isBefore(LocalDateTime.now())){
            this.dateTimeBookIsIssued = dateTimeBookIsIssued;
        } else throw new Exception("Invalid input date and time when book was issued");
    }
    public void setDateTimeBookReturn(LocalDateTime dateTimeBookReturn) throws Exception {
        if(dateTimeBookReturn != null){
            if(dateTimeBookReturn.isAfter(dateTimeBookIsIssued)){
                this.dateTimeBookReturn = dateTimeBookReturn;
            }
        } else throw new Exception("Invalid input date object");
    }

    public ExemplarIssue(User user, Librarian librarian, Exemplar exemplar, LocalDateTime dateTimeBookIsIssued, LocalDateTime dateTimeBookReturn) throws Exception {
        setUser(user);
        setLibrarian(librarian);
        setExemplar(exemplar);
        setDateTimeBookIsIssued(dateTimeBookIsIssued);
        setDateTimeBookReturn(dateTimeBookReturn);
    }
    public ExemplarIssue(User user, Librarian librarian, Exemplar exemplar) throws Exception {
        setUser(user);
        setLibrarian(librarian);
        setExemplar(exemplar);
    }

    @Override
    public String toString() {
        return "ExemplarIssue{" +
                "user=" + user +
                ", librarian=" + librarian +
                ", exemplar=" + exemplar +
                ", dateTimeBookIsIssued=" + dateTimeBookIsIssued +
                ", dateTimeBookReturn=" + dateTimeBookReturn +
                '}';
    }
}
