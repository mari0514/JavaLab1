package Reptile;

import Animal.Animal;


public class Reptile extends Animal {
    public boolean drySkin;
    public boolean hasBackbone;
    public boolean hasSoftShelledEggs;
    
    // default constructor
    public Reptile() {
        super();
    }

    public Reptile(double height, double weight, String animalType, String bloodType, boolean drySkin, boolean backbone, boolean softShell) {
        super(height, weight, animalType, bloodType);
        this.drySkin = drySkin;
        this.hasBackbone = backbone;
        this.hasSoftShelledEggs = softShell;
    }


    // getters/setters
    public boolean getDrySkin() {
        return this.drySkin;
    }

    public void setDrySkin(boolean drySkin) {
        this.drySkin = drySkin;
    }

    public boolean getBackbone() {
        return this.hasBackbone;
    }

    public void setBackbone(boolean backbone) {
        this.hasBackbone = backbone;
    }

    public boolean getSoftShell() {
        return this.hasSoftShelledEggs;
    }

    public void setSoftShell(boolean softShell) {
        this.hasSoftShelledEggs = softShell;
    }

}
