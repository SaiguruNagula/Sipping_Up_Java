package Day05;

class A{
    
    public A(){
      System.out.println("In class A");        
    }
     
}

class B extends A{
         
    public B(){
        System.out.println("in Class B");
    }
}

public class SuperThis {

    public static void main(String args[]){

        B obj = new B();
    } 
    
}
