
        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class chickenCurry {

    public static void main(String[] args) throws IOException {
        Float Budget;
        String choice;
        String ingredient[] = {"", "", "", "", "", "", "", "", ""};
        String unit[] = {"", "", "", "", "", "", "", "", ""};
        Float[] price;
        price = new Float[10];
        price[0] = 0.f;
        price[1] = 0.f;
        price[2] = 0.f;
        price[3] = 0.f;
        price[4] = 0.f;
        price[5] = 0.f;
        price[6] = 0.f;
        price[7] = 0.f;
        price[8] = 0.f;
        Float[] weight;
        weight = new Float[10];
        weight[0] = 0.f;
        weight[1] = 0.f;
        weight[2] = 0.f;
        weight[3] = 0.f;
        weight[4] = 0.f;
        weight[5] = 0.f;
        weight[6] = 0.f;
        weight[7] = 0.f;
        weight[8] = 0.f;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Budget Optimizer");
        System.out.println("Input Your Budget");
        Budget = Float.parseFloat(bf.readLine());
        System.out.println(Budget);
        if (Budget >= 259) {
            System.out.println("Choices");
            System.out.println("Chicken Curry");
            int ctr = 0;
            Float CCBudget = 259.f;
            String CCname[] = {"Chicken Curry"};
            String CCi[] = {"Chicken", "Curry", "Evaporated Milk", "Potatoes", "Garlic", "Onion", "Ginger", "Bellpepper", "Carrot"};
            String CCu[] = {"kg", "g", "ml", "kg", "g", "g", "g", "g", "g"};
            Float[] CCp;
            CCp = new Float[10];
            CCp[0] = 195.f;
            CCp[1] = 18.f;
            CCp[2] = 15.f;
            CCp[3] = 20.f;
            CCp[4] = 3.f;
            CCp[5] = 5.5f;
            CCp[6] = 2.5f;
            CCp[7] = 20.f;
            CCp[8] = 15.f;
            Float[] CCw;
            CCw = new Float[10];
            CCw[0] = 2.5f;
            CCw[1] = 100f;
            CCw[2] = 140f;
            CCw[3] = 0.25f;
            CCw[4] = 10.f;
            CCw[5] = 55.f;
            CCw[6] = 100.f;
            CCw[7] = 20.f;
            CCw[8] = 300.f;


            while (Budget > CCp[ctr]) {
                //Bibili siya ng isang item
                ingredient[ctr] = CCi[ctr];
                price[ctr] += CCp[ctr];
                weight[ctr] += CCw[ctr];
                unit[ctr] = CCu[ctr];
                Budget = Budget - CCp[ctr];
                ctr++;
                ctr %= 9;// for relooping
            }
            price[ctr] += Budget;
            weight[ctr] += (Budget/CCp[ctr])*CCw[ctr];
            ingredient[ctr]=CCi[ctr];
            unit[ctr]=CCu[ctr];
            for (int i = 0; 0 < 9; i++) {
            	if(price[i]>0) {  // to not print ingredients that are not placed in the knapsack
                System.out.println(ingredient[i]);
                System.out.println(weight[i]);
                System.out.println(unit[i]);
                System.out.println(price[i]);
            	}

            }
        }
    }
}