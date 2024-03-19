//Inheritance - Java classes can have a parent-child
//(superclass-subclass) relationship
//-the child/subclass extends the parent/superclass
//-the child class inherits (has access) all public functionalities
//of the parent class (methods and variables)

//Classes with an inheritance structure have an IS-A relationship
//ex: a Cat is an Animal


public class Cat extends Animal {

    private int lives;

    public Cat(int lives) {
        //a child class constructor MUST call the parent class constructor
        //as the first line

        //super() calls the parent class constructor and we need pass
        //whatever arguments to match the defined constructor in the parent class
        super("Cat");

        this.lives = lives;
    }

    public void climb() {
        System.out.println("cat climbed a tree");
    }


    //overriding the sleep method from Animal
    //-redefining a new functionality for sleep()
    //when it's called from a Cat
    public void sleep() {
        //when a cat sleeps, its energy doubles

        //since energy is a private variable, need to use
        //set and get
        //energy = energy * 2;

        //super.energy = super.energy * 2;

        int oldEnergy = getEnergy();
        setEnergy(oldEnergy*2);

        System.out.println(getName() + " is a cat and " +
                "slept and has " + getEnergy() + " energy");
    }


}
