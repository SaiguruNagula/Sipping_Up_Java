# Important Java Syntax

## Class and Object

### Class Declaration
```java
[access_modifier] class ClassName {
    // Fields (instance variables)
    [access_modifier] data_type field_name;
    
    // Constructor
    [access_modifier] ClassName(parameters) {
        // initialization code
    }
    
    // Methods
    [access_modifier] return_type method_name(parameters) {
        // method body
    }
}
```

### Object Creation
```java
// Creating an object
ClassName objectName = new ClassName(arguments);

// Example:
Person person1 = new Person("John", 25);
```

### Access Modifiers
- `public`: Accessible from anywhere
- `private`: Accessible only within the same class
- `protected`: Accessible within the same package and subclasses
- `default` (no modifier): Accessible within the same package

### Constructor
```java
// Default constructor
public ClassName() {
    // initialization
}

// Parameterized constructor
public ClassName(data_type param1, data_type param2) {
    this.field1 = param1;
    this.field2 = param2;
}
```

### Methods
```java
// Instance method
public return_type methodName(parameters) {
    // method body
    return value; // if not void
}

// Static method
public static return_type staticMethodName(parameters) {
    // method body
}
```

### Fields
```java
// Instance field
private int age;

// Static field
public static final String CONSTANT = "value";

// Final field
private final String name;
```

### Example Class
```java
public class Person {
    // Fields
    private String name;
    private int age;
    
    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Getter methods
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    // Setter methods
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    // toString method
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
```

### Using the Class
```java
public class Main {
    public static void main(String[] args) {
        // Create objects
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 25);
        
        // Access methods
        System.out.println(person1.getName()); // Alice
        System.out.println(person2.toString()); // Person{name='Bob', age=25}
        
        // Modify object
        person1.setAge(31);
        System.out.println(person1.getAge()); // 31
    }
}
```
