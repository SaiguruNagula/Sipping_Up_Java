package Day07;

interface Ex{
    void show();
    void config();
}

interface C{
    void display();
}

interface D extends Ex,C{
    void print();
}

class B implements D{
    @Override
    public void show(){
        System.out.println("in show");
    }
    /**
     * Configures the system settings and initializes necessary components.
     * This method is called to set up the configuration state of the implementing class.
     * 
     * @override This method overrides the parent class or interface definition.
     * 
     * Example output:
     * in config
     */
    @Override
    public void config(){
        System.out.println("in config");
    }
    @Override
    public void display(){
        System.out.println("in display");
    }
    @Override
    public void print(){
        System.out.println("in print");
    }
}


public class Interface {
    public static void main(String args[]){

    }
}
