public class Inkey{
    
    public Inkey(String a){
     
     System.out.println(a);  
    }
    
    public Inkey(String p,String q,String r){
     
     System.out.println(p + " " + r);  
     System.out.println(r + " " + q);  
     System.out.println(p + " " + r + " " +q);  
    }
    
    public static void main(String[] args){
     String blinkey="Pinkey";  
     String rinkey="Monkey"; 
     String pinkey="Donkey";  
     
     Inkey ponkey=new Inkey(pinkey); 
     
     Inkey ponkey2=new Inkey(blinkey,rinkey,pinkey); 
    }
    
    
   }