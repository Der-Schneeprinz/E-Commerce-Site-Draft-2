
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ginataangPapaya {

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
        if (Budget >= 140) {
            System.out.println("Choices");
            System.out.println("Ginataang Papaya");
            int ctr = 0;
            Float CCBudget = 259.f;
            String GPname[] = {"Ginataang Papaya "};
            String GPi[] = {"Papaya", "Gata", "Ginger", "Chicken", "Long Chili", "Onion", "Garlic", "Black Pepper", "Malunggay Leaves"};
            String GPu[] = {"g", "mL", "g", "g", "g", "g", "g", "g", "g"};
            Float[] GPp;
            GPp = new Float[10];
            GPp[0] = 25.f;
            GPp[1] = 30.f;
            GPp[2] = 5.f;
            GPp[3] = 35.f;
            GPp[4] = 2.f;
            GPp[5] = 5.5f;
            GPp[6] = 3.5f;
            GPp[7] = 2.f;
            GPp[8] = 20.f;
            Float[] GPw;
            GPw = new Float[10];
            GPw[0] = 1000.f;
            GPw[1] = 500.f;
            GPw[2] = 200.f;
            GPw[3] = 250.f;
            GPw[4] = 20.f;
            GPw[5] = 50.f;
            GPw[6] = 10.f;
            GPw[7] = 5.f;
            GPw[8] = 50.f;


            while (Budget > GPp[ctr]) {
                //Bibili siya ng isang item
                ingredient[ctr] = GPi[ctr];
                price[ctr] += GPp[ctr];
                weight[ctr] += GPw[ctr];
                unit[ctr] = GPu[ctr];
                Budget = Budget - GPp[ctr];
                ctr++;
                ctr %= 9;// for relooping
            }
            price[ctr] += Budget;
            weight[ctr] += (Budget/GPp[ctr])*GPw[ctr];
            ingredient[ctr]=GPi[ctr];
            unit[ctr]=GPu[ctr];
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