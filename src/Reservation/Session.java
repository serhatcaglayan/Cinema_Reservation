
package Reservation;


public class Session {
    
    public Movie movie;
    public Hall hall;
    public String day;
    public String time;
    
    
    public Session(){
        
    }
    
    
    public Session(Movie movie, Hall hall, String day ,String time) {
        this.movie = movie;
        this.hall = hall;
        this.day=day;
        this.time = time;
    }

    
    
    
   
    
    
    
    
    
    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Movie getMovie() {
        return movie;
    }

    public Hall getHall() {
        return hall;
    }

    public String getDay() {
        return day;
    }

    public String getTime() {
        return time;
    }
}

