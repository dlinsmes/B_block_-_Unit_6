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
}
