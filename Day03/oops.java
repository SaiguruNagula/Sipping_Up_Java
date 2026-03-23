public class oops {
    private String name;
    private int age;

    public oops(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        oops student = new oops("Amit", 22);
        student.show();

        // Inheritance example
        Teacher teacher = new Teacher("Rita", 35, "Math");
        teacher.show();
    }
}

class Person {
    String name;
    public Person(String name) { this.name = name; }
    public void show() { System.out.println("Person: " + name); }
}

class Teacher extends oops {
    private String subject;
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    @Override
    public void show() {
        super.show();
        System.out.println("Subject: " + subject);
    }
}
