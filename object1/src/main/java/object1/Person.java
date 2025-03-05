package object1;

class Person {
        // Define Instance Variables
        // different for each object!
        String name;
        int age = 0;
        int height = 0; // centimeters is the unit

        // Constructor
        public Person(String name, int age, int height) {
                this.name = name;
                this.age = age;
                this.height = height;
        }

}