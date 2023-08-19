
package Reservation;


public class Hall  {
    
  int hall_id;
  public int capacity;
  char[] seats  ;
    
    
 public  Hall(int hall_id,int capacity){
    
     this.hall_id=hall_id;
     this.capacity=capacity;
     this.seats = new char[this.capacity];
     
   }

    public int getHall_id() {
        return hall_id;
    }

    public int getCapacity() {
        return capacity;
    }

    public char[] getSeats() {
        return seats;
    }
 
 
 
 
       

 
 
 
 
 
 public void fillHallUnbooked(char[] seats){
     
  for (int i = 0; i < this.capacity; i++) {
    
        seats[i]='U';
        
       
     }
     
    
 }




}
