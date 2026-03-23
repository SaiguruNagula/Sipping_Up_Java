
// class design 
class Calc{
    int a;
    int b;

    public void setValues(int x, int y){
        a = x;
        b = y;
    }

    public int add(){
        return a + b;
    }
}

public class classobj {
    public static void main(String agrs[]){
           Calc c = new Calc();   // creating an object of class Calc
            c.setValues(10, 20);
            int sum = c.add();
            System.out.println("Sum: " + sum);      
    }
}
