package model;

import java.time.LocalDateTime;

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
            //TODO find user in user list
            this.user = user;
        } else throw new Exception("Invalid input user");
    }
    public void setLibrarian(Librarian librarian) throws Exception {
        if(librarian != null){
            //TODO find librarian in librarian list
            this.librarian = librarian;
        } else throw new Exception("Invalid input librarian");
    }
    public void setExemplar(Exemplar exemplar) throws Exception {
        if(exemplar != null){
            //TODO find exemplar in exemplar list
            this.exemplar = exemplar;
        } else throw new Exception("Invalid input exemplar");
    }

    public void setDateTimeBookIsIssued(LocalDateTime dateTimeBookIsIssued) throws Exception {
        if(dateTimeBookIsIssued != null && dateTimeBookIsIssued.isBefore(LocalDateTime.now())){
            this.dateTimeBookIsIssued = dateTimeBookIsIssued;
        } else throw new Exception("Invalid input date and time when book was issued");
    }

   /* public void setDateTimeBookReturn(LocalDateTime dateTimeBookReturn) throws Exception {
        if(dateTimeBookReturn != null){
            if(dateTimeBookReturn >= LocalDateTime.now()){
                this.dateTimeBookReturn = dateTimeBookReturn;
            }
        } else throw new Exception("Invalid input date object");
    }*/
}
