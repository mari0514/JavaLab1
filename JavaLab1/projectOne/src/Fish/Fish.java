package Fish;
import Animal.Animal;

public class Fish extends Animal {
    public boolean livesInWater;
    public boolean hasGills;
    
    public Fish() {

    }

    public Fish(double height, double weight, String animalType, String bloodType, boolean livesInWater, boolean hasGills) {
        super(height, weight, animalType, bloodType);
        this.livesInWater = livesInWater;
        this.hasGills = hasGills;
    }


    // getters/setters
    public boolean getLivesInWater() {
        return this.livesInWater;
    }

    public void setLivesInWater(boolean livesInWater) {
        this.livesInWater = livesInWater;
    }

    public boolean getGills() {
        return this.hasGills;
    }

    public void setGills(boolean hasGills) {
        this.hasGills = hasGills;
    }
}
