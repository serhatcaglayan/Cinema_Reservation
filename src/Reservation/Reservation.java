
package Reservation;


import java.util.Scanner;


public class Reservation {
    
    Session session;
    Client client;
    double cost;
    int ticketPrice ;
    int numOfTickets;
    int[] seatsBooked;
    Hall seats[];
    Hall capacity;
    
    
    public Reservation(){
        
    }   

   
    
    
    public Reservation(Session session ,Client client , int numOfTickets ){
        
        this.client=client;
        this.session=session;
        this.numOfTickets=numOfTickets;
        this.seatsBooked = new int[session.hall.capacity]; 
        this.ticketPrice=100;
                
    }
    
    
    public Reservation bookASeatRandom(Reservation reservation , int numOfBookedTickets){
     System.out.println("Loading Random Seats number");
        System.out.println( "Enter number of tickets that you wanna booke : ");  
        Scanner scan = new Scanner(System.in);
        numOfBookedTickets = scan.nextInt();
       
        
         
        for (int i = 0; i <  numOfBookedTickets; i++) {
            
            int randNum = (int) (Math.random()*session.hall.capacity);
            
             seatsBooked[randNum]='B';
             
             System.out.println(" Seat Number : " +randNum);
           
          
        
    }
          return reservation;
    }
    
    
    public Reservation bookASeatBySeatNumber(Reservation reservation, int numOfBookedTickets){
        
        System.out.println( "Enter number of tickets that you wanna booke : ");  
        Scanner scan = new Scanner(System.in);
        numOfBookedTickets = scan.nextInt();
       
        System.out.println("Enter the seat number between 0 to 20");
        for (int i = 0; i <  numOfBookedTickets; i++) {
           int num = scan.nextInt();
           seatsBooked[num] = 'B';
       
        
            
       
    }
         return reservation;
    }
   
    
    
    
    public void crateReservation(Reservation reservation){
        
        if (client.checkMembership(client.member_id)== true) {
            
            bookASeatBySeatNumber(reservation, numOfTickets);
              System.out.println("Crated Reservation");
            
              
              
        }
        else{
        
            bookASeatRandom(reservation, numOfTickets);
        System.out.println("Crated Reservation");
        
        }
    }
            
    
       
    
  
    
    public double calculateCost(Reservation reservation){
       double cost = numOfTickets*100;
       
        if (client.checkMembership(client.member_id)) {
            
             return cost - (cost*0.2);
        
        }
        else if(client.getAge()<18 && client.checkMembership(client.member_id)==false ){
            
            return cost  - (cost*0.05);
        }
        
        
            return cost;
        }
            
      
    

    
    }
    

