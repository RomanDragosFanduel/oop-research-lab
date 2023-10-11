package ro.scoalainformala.model;

public class Animal extends Organism {
    private String species;

    public Animal(String name, int age, String species) {
        super(name, age);
        this.species = species;
    }

    public String growingEnvironment() {
        return "Growing environment of animal - surrounding environment";
    }

    public String reproductionMode() {
        return "Reproduction mode of animal - sexual";
    }

    public String feedingMode() {
        return "Feeding mode of animal - herbivorous, carnivorous and omnivorous";
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return super.toString() + ", Species: " + species;
    }
}
