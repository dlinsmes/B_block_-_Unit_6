public class Polymorphism {

    public static void main (String [] args) {
        Animal a = new Animal("grayson");
        Cat c = new Cat(3);

        //toString() was overridden in Animal
        //-it was originally defined in Java's Object class
        //-every class that's written has a parent class of Object
        System.out.println(a);

        //-call toString() that was overridden in Cat
        System.out.println(c);

        //won't work - to use super, it needs to be within
        //the child class definition, not the client class
        //System.out.println(a.super.toString());

        //once a method is overridden, the client class
        //is no longer able to access the original version

        System.out.println(c.getMemLoc());

        //polymorphism - objects can have different behaviors bc they
        // can have a different declared type vs actual type
        //objects can have different declared vs actual types
        //Animal is the declared type
        //Cat is the actual type
        Animal a2 = new Cat(5);

        //a2 only has access to the declared type's methods
        a2.run();
        a2.eat();

        //sleep() can be called bc it was defined in the declared type (Animal)
        //but the overridden Cat version of sleep() will execute
        a2.sleep();

        //climb() was not a method in the declared type (Animal)
        //so it's not available to call from a2
        //a2.climb();

        //to call a Cat method from a2, cast it as a Cat first, then call the method
        Cat c2 = (Cat) a2;
        c2.climb();

        //same but without saving to another Cat object
        ((Cat)a2).climb();


        //a's actual type was Animal
        //doesn't work - actual type was not Cat
//        Cat c3 = (Cat) a;

        //use an if statement with instanceof to check the actual type
        //before casting to avoid class cast exception errors
        if (a instanceof Cat) {
            Cat c4 = (Cat) a;
            System.out.println("a is a Cat");
        }
        else {
            System.out.println("a is not a Cat");
        }


        if (a2 instanceof Cat) {
            Cat c4 = (Cat) a2;
            System.out.println("a2 is a Cat");
        }

        System.out.println(c);

        Cat c5 = new Cat(3);
        System.out.println(c5);

        //c and c5 have the same values

        System.out.println(c.equals(c5));

        //c and c6 refer to the same object
        Cat c6 = c;

        //equals() as defined by Object returns whether
        //the objects have the same memory location
        // (are the same object)
        System.out.println(c.equals(c6));

        //== checks memory location and can't be overridden
        System.out.println(c == c5);
        System.out.println(c == c6);
    }
}
