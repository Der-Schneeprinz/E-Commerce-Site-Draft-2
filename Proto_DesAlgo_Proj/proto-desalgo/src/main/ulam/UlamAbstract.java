package main.ulam;

public abstract class UlamAbstract {

    protected String title;
    protected String[] ingredients;
    protected double[] prices;
    protected double[] weight;
    protected double presyo;
    protected String[] units;
    protected UlamAbstract ulam;


    public UlamAbstract(String title, double presyo, String[] ingredients, double[] prices, double[] weight, String[] units) {
        
        this.title = title;
        this.presyo = presyo;
        this.ingredients = ingredients;
        this.prices = prices;
        this.weight = weight;
        this.units = units;

    }

    public UlamAbstract(UlamAbstract ulam) {

        this.ulam = ulam;

    }

    public String getTitle() {
        return title;
    }

    public double getPresyo() {
        return presyo;
    }

    public String getIngredients(int i) {
        return ingredients[i];
    }

    public String[] getAllIngredients() {
        return ingredients;
    }

    public double getPrices(int i) {
        return prices[i];
    }
    
    public double[] getAllPrices() {
        return prices;
    }

    public double getWeight(int i) {
        return weight[i];
    }

    public double[] getAllWeight() {
        return weight;
    }

    public String getUnit(int i) {
        return units[i];
    }

    public String[] getAllUnit() {
        return units;
    }

    public int getLength() {
        return ingredients.length;
    }

}
