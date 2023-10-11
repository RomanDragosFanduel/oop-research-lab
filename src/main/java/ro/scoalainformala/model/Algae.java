package ro.scoalainformala.model;

public class Algae extends Organism {
    private String type;

    public Algae(String name, double age, String type) {
        super(name, age);
        this.type = type;
    }

    public String growingEnvironment() {
        return "Growing environment of algae - water";
    }

    public String reproductionMode() {
        return "Reproduction mode of algae - asexual";
    }

    public String feedingMode() {
        return "Feeding mode of algae - photo-autotrophic and heterotrophic";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + ", Type: " + type;
    }
}
