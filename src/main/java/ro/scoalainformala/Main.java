package ro.scoalainformala;

import ro.scoalainformala.model.Organism;
import ro.scoalainformala.model.Algae;
import ro.scoalainformala.model.Animal;
import ro.scoalainformala.model.Bacteria;
import ro.scoalainformala.model.Plant;

public class Main {
    public static void main(String[] args) {
        Organism[] organisms = new Organism[5];
        organisms[0] = new Algae("Chlorophyta", 0.2, "Green Algae");
        organisms[1] = new Animal("Bear", 6, "Brown Bear");
        organisms[2] = new Animal("Human", 38, "Homo Naledi");
        organisms[3] = new Bacteria("Salmonella", 0.4, "Salmonella Typhi");
        organisms[4] = new Plant("Maple", 97, "Sugar Maple");

        // Iterate over the array and call common methods
        for (Organism organism : organisms) {
            System.out.println(organism);
            System.out.println(organism.feedingMode());
            System.out.println(organism.growingEnvironment());
            System.out.println(organism.reproductionMode());
        }

        // Example of using equals method
        Organism algae = new Algae("Chlorophyta", 0.2, "Green Algae");
        Organism human1 = new Animal("Viorel", 36, "Homo Naledi");
        Organism human2 = new Animal("Relu", 5, "Homo Naledi");
        Organism human3 = new Animal("Relu", 5, "Homo Naledi");
        Organism bear = new Animal("Bear", 6, "Brown Bear");
        Organism bacteria = new Bacteria("Salmonella", 0.4, "Salmonella Typhi");
        Organism plant = new Plant("Maple", 97, "Sugar Maple");
        System.out.println("Are human1 and human2 equal? " + human1.equals(human2));
        System.out.println("Are human2 and human3 equal? " + human2.equals(human3));
        System.out.println("Are algae and bear equal? " + algae.equals(bear));
        System.out.println("Are bacteria and plant equal? " + bacteria.equals(plant));

    }
}
