package ro.scoalainformala.model;

public class Bacteria extends Organism {
    private String type;

    public Bacteria(String name, double age, String type) {
        super(name, age);
        this.type = type;
    }

    public String growingEnvironment() {
        return "Growing environment of bacteria - aerobic and anaerobic";
    }

    public String reproductionMode() {
        return "Reproduction mode of bacteria - sexual and asexual";
    }

    public String feedingMode() {
        return "Feeding mode of bacteria - autotrophic and heterotrophic";
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
