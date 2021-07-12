
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class chopSeuy {

    public static void main(String[] args) throws IOException {
        double Budget;
        String choice;
        String ingredient[] = {"", "", "", "", "", "", "", "", ""};
        String unit[] = {"", "", "", "", "", "", "", "", ""};
        double[] price;
        price = new double[10];
        double[] weight;
        weight = new double[10];
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Budget Optimizer");
        System.out.println("Input Your Budget");
        Budget = Double.parseDouble(bf.readLine());
        System.out.println(Budget);
        if (Budget >= 200) {
            System.out.println("Choices");
            System.out.println("Chop Seuy");
            int ctr = 0;
            double CCBudget = 200.f;
            String CCname[] = {"Chop Seuy"};
            String CCi[] = {"Cabbage", "Carrot", "Bell Pepper", "Chicken Liver", "Tomato", "Onion", "Garlic", "Brocolli", "Celery"};
            String CCu[] = {"g", "g", "g", "g", "g", "g", "g", "g", "g"};
            double[] CSp;
            CSp = new double[10];
            CSp[0] = 30.f;
            CSp[1] = 10.f;
            CSp[2] = 10.f;
            CSp[3] = 50.f;
            CSp[4] = 5.f;
            CSp[5] = 5.5f;
            CSp[6] = 3.5f;
            CSp[7] = 20.f;
            CSp[8] = 50.f;
            double[] CSw;
            CSw = new double[10];
            CSw[0] = 500.f;
            CSw[1] = 200.f;
            CSw[2] = 10.f;
            CSw[3] = 250.f;
            CSw[4] = 50.f;
            CSw[5] = 50.f;
            CSw[6] = 10.f;
            CSw[7] = 250.f;
            CSw[8] = 50.f;


            while (Budget > CSp[ctr]) {
                //Bibili siya ng isang item
                ingredient[ctr] = CCi[ctr];
                price[ctr] += CSp[ctr];
                weight[ctr] += CSw[ctr];
                unit[ctr] = CCu[ctr];
                Budget = Budget - CSp[ctr];
                ctr++;
                ctr %= 9;// for relooping
            }
            price[ctr] += Budget;
            weight[ctr] += (Budget/CSp[ctr])*CSw[ctr];
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