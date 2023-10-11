package ro.scoalainformala.model;

public abstract class Organism {
    private String name;
    private double age;

    public Organism(String name, double age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract String growingEnvironment();

    public abstract String reproductionMode();

    public abstract String feedingMode();

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Organism organism = (Organism) obj;
        return age == organism.age && name.equals(organism.name);
    }
}
