package Day04;

public class encapsulation {
    // Example 1: Basic encapsulation with private variables and public getters/setters
    class Student {
        private String name;
        private int age;
        private double gpa;
        
        public Student(String name, int age, double gpa) {
            this.name = name;
            this.age = age;
            this.gpa = gpa;
        }
        
        public String getName() {
            return name;
        }
        
        public void setName(String name) {
            if (name != null && !name.isEmpty()) {
                this.name = name;
            }
        }
        
        public int getAge() {
            return age;
        }
        
        public void setAge(int age) {
            if (age > 0 && age < 100) {
                this.age = age;
            }
        }
        
        public double getGpa() {
            return gpa;
        }
        
        public void setGpa(double gpa) {
            if (gpa >= 0.0 && gpa <= 4.0) {
                this.gpa = gpa;
            }
        }
    }

    // Example 2: Encapsulation with validation
    class BankAccount {
        private String accountNumber;
        private double balance;
        
        public BankAccount(String accountNumber, double initialBalance) {
            this.accountNumber = accountNumber;
            this.balance = initialBalance;
        }
        
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            }
        }
        
        public boolean withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                return true;
            }
            return false;
        }
        
        public double getBalance() {
            return balance;
        }
    }

    // Example 3: Read-only property
    class Circle {
        private double radius;
        
        public Circle(double radius) {
            this.radius = radius;
        }
        
        public double getArea() {
            return Math.PI * radius * radius;
        }
    }
}
