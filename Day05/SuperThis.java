package Day05;

class A{
    
    public A(){                       // default constructor 
      System.out.println("In class A");        
    }

    public A(int a){
        
        System.out.println("In class A with parameter: " + a);
    }
     
} 
class B extends A{
         
    public B(){       // Default constructor
        super();  // by default there is super in every constructor
        System.out.println("in Class B");
    }

    public B(int b){
        super(b);
        System.out.println("in class B with parameter: " + b);
    }
}

public class SuperThis {

    public static void main(String args[]){

        B obj = new B();
    } 
    
}
