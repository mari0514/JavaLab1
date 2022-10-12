package Fish;
public class Eel extends Fish {
    public boolean electricCharge;
    
    public Eel() {

    }

    public Eel(double height, double weight, String animalType, String bloodType, boolean livesInWater, boolean hasGills, boolean electricCharge) {
        super(height, weight, animalType, bloodType, livesInWater, hasGills);
        this.electricCharge = electricCharge;
    }

    // getters/setters
    public boolean getElectricCharge() {
        return this.electricCharge;
    }

    public void setElectricCharge(boolean electricCharge) {
        this.electricCharge = electricCharge;
    }

    public String showInfo() {
        return "eel info - [height: " + super.getHeight() + ", weight: " + super.getWeight() + ", animalType: " + super.getAnimalType() + ", bloodType: " + super.getBloodType() + ", livesInWater: " + super.getLivesInWater() + ", hasGills: " + super.getGills() + ", electricCharge: " + getElectricCharge() + "]";
    }

}
