package summary2.fruits;

public class Fruit {
    private String[] vitamins;
    private Double sugar;

    public Fruit(String[] vitamins, Double sugar) {
        this.vitamins = vitamins;
        this.sugar = sugar;
    }

    public String[] getVitamins() {
        return vitamins;
    }

    public void setVitamins(String[] vitamins) {
        this.vitamins = vitamins;
    }

    public Double getSugar() {
        return sugar;
    }

    public void setSugar(Double sugar) {
        this.sugar = sugar;
    }

    public void displayInfo(){}
}