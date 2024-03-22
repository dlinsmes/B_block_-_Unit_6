public class InheritanceCollections {
    public static void main(String [] args) {
        //write and test an equals() method for Cat
        Cat c1 = new Cat (5);
        Cat c2 = new Cat(7);
        Cat c3 = new Cat(5);

        System.out.println("c1 and c2 are equal: " + c1.equals(c2));
        System.out.println("c1 and c3 are equal: " + c1.equals(c3));

        c1.setEnergy(5);
        System.out.println("c1 and c3 are equal: " + c1.equals(c3));


        Dog d1 = new Dog("lola");
        Dog d2 = new Dog("lola");
        Dog d3 = new Dog("Cory");
        System.out.println("d1 and d2 are equal: " + d1.equals(d2));
        System.out.println("d1 and d3 are equal: " + d1.equals(d3));

        System.out.println();

        Animal a = new Cat(3);

        a.eat();

        //the overridden version of sleep will run
        a.sleep();

        //climb() was not defined in the declared type
        //a.climb();
        Cat casted = (Cat)a;
        casted.climb();

        ((Cat)a).climb();

        Animal a2 = new Animal("Cat");

        //the behavior of equals() depends on the type
        //of the object you're calling equals from()

        //equals is called from a Cat object
        //-checks if the arg is a Cat, name, energy, lives
        System.out.println(c2.equals(a2));

        //equals is called from an Animal object
        //-checks if the arg is an Animal, name, energy
        System.out.println(a2.equals(c2));

        System.out.println();

        String s = "fdasfgasd";
        int [] nums = {1,2, 3};
        //since the param for equals is always an Object,
        //any kind of object can be passed as an argument
        System.out.println(a2.equals(s));
        System.out.println(a2.equals(nums));


        Animal [] zoo = new Animal [5];
        zoo[0] = new Animal("radley");
        zoo[1] = new Cat(12);
        zoo[2] = new Dog("fluffy");
        if (Math.random() > .5) {
            zoo[3] = new Cat(123);
        }
        else {
            zoo[3] = new Dog("woofy");
        }
        zoo[4] = new Animal("cow");

        System.out.println();
        for (int i = 0; i < zoo.length; i++) {
            zoo[i].eat();
            zoo[i].sleep();

            //call climb() from the Cat objects in zoo
            if (zoo[i] instanceof Cat) {
                ((Cat)zoo[i]).climb();
            }

            if (zoo[i] instanceof Dog) {
                Dog other = (Dog)zoo[i];
                other.woof();
            }


            System.out.println();
        }
    }
}
