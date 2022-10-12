package Birds;
public class Eagle extends Birds {
    public Eagle() {
    
    }

    public Eagle(double height, double weight, String animalType, String bloodType, boolean feathers, boolean canFly) {
        super(height, weight, animalType, bloodType, feathers, canFly);
    }
    

    public String showInfo() {
        return "Eagle info - [height: " + super.getHeight() + ", weight: " + super.getWeight() + ", animalType: " + super.getAnimalType() + ", bloodType: " + super.getBloodType() + ", feathers: " + super.getFeathers() + ", canFly: " + super.getCanFly() + "]"; 
    }

}
