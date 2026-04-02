package Day07;

class A{
    public void show(){
        System.out.println("in a");
    }
}

public class anonymusClass {
    
   
    public static void main(String args[]){
        A a = new A() {
            @Override
            public void show() {
                System.out.println("in anonymous");
            }
        };
        a.show();
             
        }
    }

