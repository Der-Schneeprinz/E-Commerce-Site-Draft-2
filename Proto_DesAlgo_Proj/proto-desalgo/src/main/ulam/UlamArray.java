package main.ulam;

public class UlamArray extends UlamAbstract {

    int ctr;

    public UlamArray(String title, double presyo, String[] ingredients, double[] prices, double[] weight, String[] units) {
        
        //Super Class of Ulam Abstract
        super(title, presyo, ingredients, prices, weight, units);

    }

    public UlamArray(UlamArray ulam) {

        super(ulam);

    }
}
