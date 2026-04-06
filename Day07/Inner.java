package Day07;

class A{
    
    int a;
    public void show(){
        System.out.println("in a");
    }

    static class B{
        public void config(){
            System.out.println("in config");
          //  System.out.println(error: a); cannot acces non static variable a in static context
        }
    }
   

}


public class Inner {

    // class B{
    //     public void config(){
    //         System.out.println("in config");
    //     }
    //}
      
    public static void main(String[] args){
        //IF  outside public
        // A obj = new A();
        // obj.show();

        // A.B obj1 = obj.new B();
        // obj1.config();


        // IF inside public 
        // B obj = new Inner().new B();
        // obj.config();

        A.B obj = new A.B();   // if static then we can create object of B class without 
                                //                 creating object of A class
         
    }
}
