public class Animal {

    private String name;
    private int energy;

    public Animal(String name) {
        this.name = name;
        energy = 10;
    }
    public String getName() {
        return name;
    }
    public int getEnergy() {
        return energy;
    }
    public void setEnergy(int newEnergy) {
        energy = newEnergy;
    }
    public void eat() {
        energy += 2;
        System.out.println(name + " ate a snack and has " + energy + " energy");
    }
    //sleep() +5 and run() -1

    public void sleep() {
        energy += 5;
        System.out.println(name + " took a nap and has " + energy + " energy");
    }

    public void run() {
        energy -= 1;
        System.out.println(name + " went for a run and has " + energy + " energy");
    }

    public String toString() {
        return name + " has " + energy + " energy";
    }

    //if you need the original functionality of a
    //parent class method but it gets overridden:
    public String getMemLoc() {
        return super.toString();
    }

    //override the default behavior of equals so that
    //if two animal objects have the same name and same energy
    //they are considered equal
    public boolean equals(Object o) {

        //doesn't work bc the declared type (Object) ]
        // doesn't have name or energy variables
        //if (o.name.equals(name))

        if (o instanceof Animal) {
            Animal other = (Animal) o;
            if (other.name.equals(this.name) && other.energy == this.energy) {
                return true;
            }
        }
        //if o is the wrong actual type OR the name or energy don't match, return false
        return false;
    }
}
