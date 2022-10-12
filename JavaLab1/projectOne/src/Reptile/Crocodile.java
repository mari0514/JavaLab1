package Reptile;
public class Crocodile extends Reptile {
    public boolean hasHardShelledEggs;
    
    public Crocodile() {
        super();
    }

    public Crocodile(double height, double weight, String animalType, String bloodType, boolean drySkin, boolean backbone, boolean softShell, boolean hardShell) {
        super(height, weight, animalType, bloodType, drySkin, backbone, softShell);
        this.hasHardShelledEggs = hardShell;
    }


    // getters/setters
    public boolean getHardShell() {
        return this.hasHardShelledEggs;
    }

    public void setHardShell(boolean hardShell) {
        this.hasHardShelledEggs = hardShell;
    }


    public String showInfo() {
        return "Crocodile info - [height: " + super.getHeight() + ", weight: " + super.getWeight() + ", animalType: " + super.getAnimalType() + ", bloodType: " + super.getBloodType() + ", drySkin: " + super.getDrySkin() + ", backbone: " + super.getBackbone() + ", softShell: " + super.getSoftShell() + ", hardShell: " + getHardShell() + "]"; 
    }
}
