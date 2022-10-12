package Birds;
import Animal.Animal;

public class Birds extends Animal {
    public boolean feathers;
    public boolean canFly;
    
    public Birds() {
        super();
        // this.feathers = true;
        // this.canFly = true;
    }

    public Birds(double height, double weight, String animalType, String bloodType, boolean feathers, boolean canFly) {
        super(height, weight, animalType, bloodType);
        this.feathers = feathers;
        this.canFly = canFly;
    }


    // getters/setters
    public boolean getFeathers() {
        return this.feathers;
    }

    public void setFeathers(boolean feathers) {
        this.feathers = feathers;
    }

    public boolean getCanFly() {
        return this.canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
}
