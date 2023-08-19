
package Reservation;


public class Movie {
    public String name;
    public String director;
    public int year;
    public int duration;

    public Movie() {
        
    }

    public Movie(String name, String director, int year, int duration) {
        this.name = name;
        this.director = director;
        this.year = year;
        this.duration = duration;
    }

    
    
    
    
    
    
    
    
    public String getName() {
        return name;
    }

    public String getDirector() {
        return director;
    }

    public int getYear() {
        return year;
    }

    public int getDuration() {
        return duration;
    }


    
    
}
