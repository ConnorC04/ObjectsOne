package object1;

import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
//        Logger logger=Logger.getLogger(Main.class.getName());
//        logger.info("This is a module-using Hello World!");


            // Declare and initialize an object
            Person person1 = new Person("John", 30, 72);

            /* Now you can use the Object `person1` */
        System.out.println(person1.name);

    }
}
