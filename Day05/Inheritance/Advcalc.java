package Day05.Inheritance;

public class Advcalc extends calc {
    public int mul(int a , int b){
        return a*b; 
    }

    public int div(int a , int b){
        if(b != 0){
            return a/b; 
        } else {
            System.out.println("Division by zero is not allowed.");
            return 0; // or throw an exception
        }
    }
    
}
