public class AnimalClient {
    public static void main(String [] main) {

        Animal a = new Animal("bob");
        System.out.println(a.getEnergy());
        System.out.println(a.getName());

        a.sleep();
        a.eat();
        a.run();

        System.out.println(a);

        System.out.println();

        Cat c1 = new Cat(9);
        c1.climb();

        //public parent class methods can be called from a child
        //class object
        //-eat() and run() were defined in Animal
        c1.eat();
        c1.run();

        //Animals don't have a climb() method - defined in Cat
        //not every Animal object is a Cat object
        //a.climb();

        //this calls the sleep() method that was overridden in Cat
        c1.sleep();
    }
}
