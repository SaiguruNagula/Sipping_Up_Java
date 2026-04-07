package Day08;

class A extends Thread {
    public void run() {   // run is the method that will be executed when the thread is started
        for (int i = 0; i < 30; i++) {
            System.out.println("hi");
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i <30; i++) {
            System.out.println("hello");
        }
    }
}

public class multiThreead {
    
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        obj1.start();  // start is the method that will start the thread and call the run method
        obj2.start();
    }


    // Example: Setting thread priority and using sleep

    class C extends Thread {
        public void run() {
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread C: " + i);
                    Thread.sleep(1000); // Sleep for 1 second
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // In main, you can add:
    // C obj3 = new C();
    // obj3.setPriority(Thread.MAX_PRIORITY); // Set priority (1-10, default is 5)
    // obj3.start();
}
