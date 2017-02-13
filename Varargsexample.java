
public class Varargsexample {
    
   static  public void display(int num, String... values){
        System.out.println("The number :"+ num);
        for (String value : values) {
            System.out.println(value);
        }
    }
    
    public static void main(String[] args) {
        
        display(500,"Hellow");
       
     
        display(1000,"Badrul","Islam", "Khan");
    }
}

