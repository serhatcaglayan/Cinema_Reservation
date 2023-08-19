
package Reservation;

public class Client {
    
    public String name ;
    public int member_id;
    public int age;
    
    
    
 public   Client(){
        
    }
    
  public  Client(int member_id, String name, int age){
        
       this.age=age;
       this.member_id=member_id;
       this.name=name;
        
    }
    
    public boolean checkMembership(int member_id){
        
        
        
       String str_id = Integer.toString(member_id);
       
       if(str_id.substring(0,3).equals("111")){
           
           System.out.println(name + " is membership ");
        
           return true;
    }
        System.out.println(name + " is not membership");
       
    return false;
}

    
    
    
    
    
    
    public String getName() {
        return name;
    }

    public int getMember_id() {
        return member_id;
    }

    public int getAge() {
        return age;
    }

  
}