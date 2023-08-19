
package Reservation;


public class Main {

    public static void main(String[] args) {
       
    Client[] clients = new Client[3];
        
          clients[0] = new Client (1115487,"Serhat",25);
          clients[1] = new Client (1015487,"Murat",18);
          clients[2] = new Client (5421515,"Afran",17);
         
    Movie[] movies = new Movie[3];
        
          movies[0]  = new Movie ("Dark","Lee Chang",2018,148);
          movies[1]  = new Movie ("1984","Hayao Miya",2001,125);
          movies[2]  = new Movie ("The Lost of Us","Wong Kar",2011,157);
     
    Hall[] halls = new Hall[3]  ;
      
         halls[0]   = new Hall (1,50);
         halls[1]   = new Hall (2,20);
         halls[2]   = new Hall (3,100);
         
        Session session1 = new Session(movies[0],halls[0],"Monday","12.00");
        Session session2 = new Session(movies[1],halls[1],"Monday","15.00");
        Session session3 = new Session(movies[2],halls[2],"Friday","17.00");
        
        Reservation reservation1 = new Reservation(session1,clients[0],2);
        Reservation reservation2 = new Reservation(session2,clients[1],2);
        Reservation reservation3 = new Reservation(session3,clients[2],2);
        
    
       
        
        reservation1.crateReservation(reservation1);
        reservation2.crateReservation(reservation2);
        reservation3.crateReservation(reservation3);
        
   
        System.out.println("Colculate Cost : /n");
        System.out.println("Reservation 1 : " + reservation1.calculateCost(reservation1)+" TL");
        System.out.println("Reservation 2 : " + reservation2.calculateCost(reservation2)+" TL");
        System.out.println("Reservation 3 : " + reservation3.calculateCost(reservation3)+" TL");
    
     
     
 
    }
    
}
