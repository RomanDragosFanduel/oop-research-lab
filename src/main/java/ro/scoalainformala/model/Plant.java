package ro.scoalainformala.model;

public class Plant extends Organism {
    private String type;

    public Plant(String name, int age, String type) {
        super(name, age);
        this.type = type;
    }

    public String growingEnvironment() {
        return "Growing environment of plants - soil";
    }

    public String reproductionMode() {
        return "Reproduction mode of plants - photosynthesis";
    }

    public String feedingMode() {
        return "Feeding mode of plants - mixotrophic, autotrophic and heterotrophic";
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
