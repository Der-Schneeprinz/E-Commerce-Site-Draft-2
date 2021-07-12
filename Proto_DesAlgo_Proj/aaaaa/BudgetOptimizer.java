package com.activity;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class BudgetOptimizer {

    public static void main(String[] args) throws IOException {
        //User input
        double Budget;
        //Output ingredients
        String ingredient[] = new String[9];
        //Output prices
        String unit[] = new String[9];
        double[] price;
        price = new double[10];
        double[] weight;
        weight = new double[10];
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Budget Optimizer");
        System.out.println("Input Your Budget");
        Budget = Double.parseDouble(bf.readLine());
        System.out.println(Budget);
        if (Budget > 130.00) {
            System.out.println("Choices");
            System.out.println("Sinigang na Isda");
            int ctr = 0;
            //double SNIBudget = 130.00f;
            //String SNIname[] = {"Sinigang na Isda"};
            String SNIi[] = {"Bangus", "Kangkong", "Sibuyas", "Kamatis", "Sinigang Sampalok Mix", "Sili", "Sitaw", "Okra", "Talong"};
            String SNIu[] = {"kg", "g", "g", "g", "g", "g", "g", "g", "g"};
            double[] SNIp;
            SNIp = new double[10];
            SNIp[0] = 45.f;
            SNIp[1] = 12.88f;
            SNIp[2] = 19.84f;
            SNIp[3] = 15.f;
            SNIp[4] = 32.f;
            SNIp[5] = 10.f;
            SNIp[6] = 20.f;
            SNIp[7] = 10.f;
            SNIp[8] = 20.f;
            double[] SNIw;
            SNIw = new double[10];
            SNIw[0] = .25f;
            SNIw[1] = 300f;
            SNIw[2] = 200f;
            SNIw[3] = 200.f;
            SNIw[4] = 22.f;
            SNIw[5] = 200.f;
            SNIw[6] = 250.f;
            SNIw[7] = 200.f;
            SNIw[8] = 150.f;


            for (; Budget > SNIp[ctr]; ctr++) {
                if(ctr >= 9)
                    ctr = 0;
                //Bibili siya ng isang item
                ingredient[ctr] = SNIi[ctr];
                price[ctr] += SNIp[ctr];
                weight[ctr] += SNIw[ctr];
                unit[ctr] = SNIu[ctr];
                Budget -= price[ctr];
                //pipili siya ng iba
                System.out.print(Budget + "\t");
                System.out.println(ingredient[ctr]);
            }
            price[ctr] += Budget;
            weight[ctr] += (Budget/SNIp[ctr])*SNIw[ctr];
            ingredient[ctr]=SNIi[ctr];
            unit[ctr]=SNIu[ctr];
            for (int i = 0; 0 < 9; i++) {
                System.out.println(ingredient[i]);
                System.out.println(weight[i]);
                System.out.println(unit[i]);
                System.out.println(price[i]);

            }
        }
    }
}