package Day04;

    
    class Human{
       private String name; // static variable 
       private int age;

       public Human(){   // default constructor
        name = "saiguru";
        age=20;
       }

       public Human(String name , int age){ // parameterized construttor
        this.name = name;
        this.age = age; 
       }

         public String getName() {
          return name;
         }

            
         
        public void setName(String name) {
            this.name = name;
            }

    

    public static void main(String[] args){
        Human h1 = new Human();
        System.out.println("Name: " + h1.getName());
        h1.setName("John");
        System.out.println("Updated Name: " + h1.getName());
        
    }
}

