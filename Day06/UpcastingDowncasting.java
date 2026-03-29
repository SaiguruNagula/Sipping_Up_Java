package Day06;


class A{
    public void show(){
        System.out.println("In class A");
    }

}
class B extends A{
    public void show1(){
        System.out.println("override / upcasting");
    }

    public void show(){
        System.out.println("Downcasting ");
    }
}

public class UpcastingDowncasting {
    public static void main(String args[]){
    
        A obj = new B();   // upcasting >> can also be writen as A obj = (A)new B()
        obj.show();         // can override the method of class A  
        
        // error: obj.show1(); // This would cause a compile-time error because obj is of type A, 
        // which doesn't have show1() method , B is not visible to A, so we cannot call show1() method using obj reference
   


        // Downcasting= so we use downcasting to call the show1() method of class B using obj reference
        B obj1 = (B) obj;  // downcasting >> we need to explicitly cast the obj reference to type B, 
        // because obj is of type A and we want to treat it as an instance of B
        obj1.show1();      // now we can call show1() method using obj1 reference
    }
}
