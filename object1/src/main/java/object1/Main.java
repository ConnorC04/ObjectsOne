package object1;

import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
//      Logger logger=Logger.getLogger(Main.class.getName());
//      logger.info("This is a module-using Hello World!");

        Person[] people = new Person[10];

        // Declare and initialize an object
        Person person1 = new Person("Alice", 25, 68);
        Person person2 = new Person("Bob", 30, 72);

        people[0] = person1;
        people[1] = person2;

        /* Now you can use the Object `person1` */
        Person person = people[0];
        System.out.println(person);

    }
}
