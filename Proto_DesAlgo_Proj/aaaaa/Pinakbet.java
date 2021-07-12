
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pinakbet {

    public static void main(String[] args) throws IOException {
        double Budget;
        String choice;
        String ingredient[] = {"", "", "", "", "", "", "", "", ""};
        String unit[] = {"", "", "", "", "", "", "", "", ""};
        double[] price;
        price = new double[10];
        weight = new double[10];
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Budget Optimizer");
        System.out.println("Input Your Budget");
        Budget = Double.parseDouble(bf.readLine());
        System.out.println(Budget);
        if (Budget >= 100) {
            System.out.println("Choices");
            System.out.println("Pinakbet");
            int ctr = 0;
            String Pi[] = {"String Beans", "Okra", "Eggplant", "Squash", "Alamang", "Onion", "Garlic", "Ginger", "Green Beans"};
            String Pu[] = {"g", "g", "g", "g", "g", "g", "g", "g", "g"};
            double[] Pp;
            Pp = new double[10];
            Pp[0] = 10.f;
            Pp[1] = 10.f;
            Pp[2] = 10.f;
            Pp[3] = 20.f;
            Pp[4] = 10.f;
            Pp[5] = 5.f;
            Pp[6] = 3.f;
            Pp[7] = 10.f;
            Pp[8] = 10.f;
            double[] Pw;
            Pw = new double[10];
            Pw[0] = 200.f;
            Pw[1] = 200.f;
            Pw[2] = 200.f;
            Pw[3] = 250.f;
            Pw[4] = 50.f;
            Pw[5] = 50.f;
            Pw[6] = 10.f;
            Pw[7] = 50.f;
            Pw[8] = 200.f;


            while (Budget > Pp[ctr]) {
                //Bibili siya ng isang item
                ingredient[ctr] = Pi[ctr];
                price[ctr] += Pp[ctr];
                weight[ctr] += Pw[ctr];
                unit[ctr] = Pu[ctr];
                Budget = Budget - Pp[ctr];
                ctr++;
                ctr %= 9;// for relooping
            }
            price[ctr] += Budget;
            weight[ctr] += (Budget/Pp[ctr])*Pw[ctr];
            ingredient[ctr]=Pi[ctr];
            unit[ctr]=Pu[ctr];
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