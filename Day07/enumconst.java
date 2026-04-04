package Day07;

enum Color{
        RED, GREEN, BLUE;
    }

public class enumconst {
    
    static void colorInfo(Color c) {
        switch(c) {
            case RED:
                System.out.println("Red is a warm color");
                break;
            case GREEN:
                System.out.println("Green is a cool color");
                break;
            case BLUE:
                System.out.println("Blue is a cool color");
                break;
        }
    }

    public static void main(String[] args) {
        Color c1 = Color.RED;
        System.out.println("Selected color: " + c1);
    }
}
