import Animal.Animal;
import Birds.Birds;
import Birds.Eagle;
import Fish.Eel;
import Fish.Fish;
import Reptile.Crocodile;
import Reptile.Reptile;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Animal tiger = new Animal(154.2, 180.5, "Tiger", "AB");

        System.out.println("the height of tiger: " + tiger.height);


        Reptile gecko = new Reptile(250.5, 250.5, "gecko", "A", true, false, false);
        System.out.println("the height of gecko: " + gecko.height);
        System.out.println("gecko has backbone: " + gecko.hasBackbone);


        Crocodile american = new Crocodile(200.5, 250.8, "american crocodile", null, true, true, false, true);

        System.out.println("===== Info of american crocodile =====");
        System.out.println(american.showInfo());
        
        
        Fish salmon = new Fish();
        salmon.livesInWater = true;
        System.out.println("===== Info of salmon =====");
        if (salmon.livesInWater) {
            System.out.println("Salmon lives in water.");
        } else {
            System.out.println("Salmon doesn't live in water.");
        }
        
        
        Eel eel = new Eel(0, 0, "fish", null, true, true, true);
        eel.livesInWater = true;
        // eel.electricCharge = true;
        
        System.out.println("===== Info of eel =====");
        System.out.println(eel.showInfo());



        Birds hawke = new Birds();
        hawke.canFly = true;
        System.out.println("===== Info of hawke =====");
        System.out.println("Hawke can fly: " + hawke.canFly);


        
        Eagle eagle = new Eagle(32.8, 24.5, "bird", "unknown", true, true);

        System.out.println("===== Info of eagle =====");
        System.out.println(eagle.showInfo());


    }
}
