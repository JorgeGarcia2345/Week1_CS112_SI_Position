import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double test = 0.00;
        Scanner keyboard = new Scanner(System.in);
        //test = Double.parseDouble(keyboard.nextLine());
        keyboard.close();


        GameCharacter jorge = new GameCharacter("jorge",1, 100, 100, 100);
        System.out.println(jorge);
        GameCharacter villian = new GameCharacter("MUHAHA", 1, 200, 300, 500);
        System.out.println(villian);




        /*

        Object Orientated Programming

        Classes - blueprint for creating objects, category, a group of things
                - Contacts
                -- FB profiles

        Objects - instance of a class, object is one specific example of the class
                - One SPECIFIC Contact (Class) - Instance
                - Ex: Mom (specific contact)
                -- Mike

        UML - Unified Modeling Language, class Diagram
            - Fields (variables): instance variables, data to store for each object
            -
            - Methods: actions/behaviors of the class
            - what can be done by (or to) each object
            ---- attack/rest/assist
            - constructor: makes a new object, initializes the fields (starting value)

            Scanner keyboard = new Scanner (System.in)

            getters: retrieve a value/access a value
            setters: change the value


            edu.miracosta.cs112

         */


        /**
         * SI Ideas: What OOP example
         *
         * Fields - what makes up the class
         *
         * Methods -
         *
         * Create a class and have them have methods to do something fun
         *
         * Boat, Car, Person (game character, Sims)
         * Chairs
         * Guitarist
         * Dog/Cat
         *
         * Have them build the class together
         * Fields - what makes up the class to have it be whole
         * Methods - What can that class do?
         *  // Bark, Meow, hungry etc :)
         *
         *  Make it fun that we are building it together
         *  Other confirm how that class will work to, methods using the fields
         *
         *
         *  have them explain this vs other and have them use it in the methods
         *  cat bites other cat
         *  dog cuddles other dog
         *  use a random generator
         *
         *
         *
         *
         *
         */


        /**
         * { } block of code
         * Main method - starting point of code
         *
         *
         *
         * Settings -> Editor -> Coding Style -> java m/f (member)
         */

        System.out.println("Hello World!");

    }
}
