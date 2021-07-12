package main;

/**
 * MEMBERS:
 * * ARAMBULO, HANS
 * * BANDOL, JESSIE
 * * DELOS SANTOS, RONS
 * * OLAGUER, MATTHEW
 * * PABALAN, KURT
 * BSCS 2-1N
 * FINAL REQUIREMENT:
 * PROGRAMMING PROBLEM #1
 */

import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.util.Stack;

import main.ulam.*;

import javax.swing.*;
//JFrame, JPanel, JCheckBox, GridLayout

public class Knapsack implements ActionListener, ItemListener {
    
    //History Stack
    Stack<UlamArray> stack = new Stack<UlamArray>();

    //For alignments
    JFrame frame;
    Container cont;
    JPanel panel1;
    JPanel panel2;
    JPanel panel3;
    JPanel panel4;
    JPanel panel5;
    JPanel panel6;

    //Text Fields
    JTextField txtBudget;
    JTextField txtTitle;
    JTextField txtPrice;
    JTextField[] txtIngr;
    JTextField[] txtPrices;
    JTextField[] txtWeight;
    JTextField[] txtUnit;
    
    //Labels
    JLabel lblUlam;
    JLabel lblPrice;

    //Buttons
    JButton btnBudget;
    JButton btnHistory;
    JButton btnSelect;

    //Combobox
    JComboBox<String> cmbSelection;

    //Font Styles
    Font fBold;

    public Knapsack() {
        
        //Declaration of Ulam Object Array
        UlamArray[] ulams = new UlamArray[10];

        //Details of each Ulam Object
        ulams[0] = new UlamArray(
            "Pinakbet",
            80,
            new String[] {
                "String Beans",
                "Okra",
                "Eggplant",
                "Squash",
                "Alamang",
                "Onion",
                "Garlic",
                "Ginger",
                "Green Beans"
            },
            new double[] {
                10,
                10,
                10,
                20,
                10,
                5,
                3,
                10,
                10
            },
            new double[] {
                200,
                200,
                200,
                250,
                50,
                50,
                10,
                50,
                200
            },
            new String[] {
                "g",
                "g",
                "g",
                "g",
                "g",
                "g",
                "g",
                "g",
                "g"
            }
        );
        ulams[1] = new UlamArray(
            "Ginataang Papaya",
            120,
            new String[] {
                "Papaya",
                "Gata",
                "Ginger",
                "Chicken",
                "Long Chili",
                "Onion",
                "Garlic",
                "Black Pepper",
                "Malunggay Leaves"
            },
            new double[] {
                25,
                30,
                5,
                35,
                2,
                5.5,
                3.5,
                2,
                20
            },
            new double[] {
                1000,
                500,
                200,
                250,
                20,
                50,
                10,
                5,
                50
            },
            new String[] {
                "g",
                "mL",
                "g",
                "g",
                "g",
                "g",
                "g",
                "g",
                "g"
            }
        );
        ulams[2] = new UlamArray(
            "Sinigang na Isda",
            130,
            new String[] {
                "Bangus",
                "Kangkong",
                "Sibuyas",
                "Kamatis",
                "Sinigang Sampalok Mix",
                "Sili",
                "Sitaw",
                "Okra",
                "Talong"
            },
            new double[] {
                45,
                12.88,
                19.84,
                15,
                32,
                10,
                20,
                10,
                20,
            },
            new double[] {
                .25,
                300,
                200,
                200,
                22,
                200,
                250,
                200,
                150,
            },
            new String[] {
                "kg",
                "g",
                "g",
                "g",
                "g",
                "g",
                "g",
                "g",
                "g"
            }
        );
        ulams[3] = new UlamArray(
            "Sinigang na Baboy",
            150,
            new String[] {
                "Baboy",
                "Sibuyas",
                "Kamatis",
                "Kangkong",
                "Sinigang Sampalok Mix",
                "Sili",
                "Sitaw",
                "Okra",
                "Talong"
            },
            new double[] {
                55.44,
                19.84,
                15,
                12.88,
                32,
                10,
                20,
                10,
                20,
            },
            new double[] {
                .25,
                200,
                200,
                300,
                22,
                200,
                250,
                200,
                150,
            },
            new String[] {
                "kg",
                "g",
                "g",
                "g",
                "g",
                "g",
                "g",
                "g",
                "g"
            }
        );
        ulams[4] = new UlamArray(
            "Pork Adobo",
            150,
            new String[] {
                "Pork Belly", 
                "Vinegar", 
                "Soy Sauce", 
                "Garlic", 
                "Dried Bay Leaves", 
                "Peppercorn", 
                "Salt", 	
            },
            new double[] {
                87.50,
                8,
                8,
                5,
                5,
                5,
                5,
            },
            new double[] {
                .250,
                150,
                150,
                45,
                1,
                1,
                50
            },
            new String[] {
                "kg",
                "g",
                "g",
                "g",
                "g",
                "g",
                "g"
            }
        );
        ulams[5] = new UlamArray(
            "Sinigang na Hipon",
            180,
            new String[] {
                "Hipon",
                "Sweet potato leave",
                "Sibuyas",
                "Kamatis",
                "Sinigang Sampalok Mix",
                "Sili",
                "Sitaw",
                "Okra",
                "Talong"
            },
            new double[] {
                90,
                20,
                55.44,
                19.84,
                15,
                32,
                10,
                20,
                10,
                20,
            },
            new double[] {
                .25,
                200,
                200,
                200,
                22,
                200,
                250,
                200,
                150,
            },
            new String[] {
                "kg",
                "g",
                "g",
                "g",
                "g",
                "g",
                "g",
                "g",
                "g"
            }
        );
        ulams[6] = new UlamArray(
            "Sinigang na Hipon",
            180,
            new String[] {
                "Hipon",
                "Sweet potato leave",
                "Sibuyas",
                "Kamatis",
                "Sinigang Sampalok Mix",
                "Sili",
                "Sitaw",
                "Okra",
                "Talong"
            },
            new double[] {
                90,
                20,
                55.44,
                19.84,
                15,
                32,
                10,
                20,
                10,
                20,
            },
            new double[] {
                .25,
                200,
                200,
                200,
                22,
                200,
                250,
                200,
                150,
            },
            new String[]{
                "kg",
                "g",
                "g",
                "g",
                "g",
                "g",
                "g",
                "g",
                "g"
            }
        );
        ulams[7] = new UlamArray(
            "Chop Seuy",
            200,
            new String[] {
                "Cabbage", 
                "Carrot", 
                "Bell Pepper", 
                "Chicken Liver", 
                "Tomato", 
                "Onion", 
                "Garlic", 	
                "Brocolli", 
                "Celery"
            },
            new double[] {
                30,
                10,
                10,
                50,
                5,
                5,
                3,
                20,
                50
            },
            new double[] {
                500,
                200,
                10,
                250,
                50,
                50,
                10,
                150,
                50
            },
            new String[] {
                "g",
                "g",
                "g",
                "g",
                "g",
                "g",
                "g",
                "g",
                "g"
            }
        );
        ulams[8] = new UlamArray(
            "Chicken Curry",
            259,
            new String[] {
                "Chicken",
                "Curry Powder",
                "Evaporated Milk",
                "Potatoes",
                "Garlic",
                "Onion",
                "Ginger",
                "Bell Pepper",
                "Carrot"
            },
            new double[] {
                195,
                18,
                15,
                20,
                3,
                5.5,
                2.5,
                20,
                15
            },
            new double[] {
                2.5,
                100,
                140,
                0.25,
                10,
                55,
                100,
                20,
                300
            },
            new String[] {
                "kg",
                "g",
                "ml",
                "kg",
                "g",
                "g",
                "g",
                "g",
                "g"
            }
        );

        //Frame setup
        final int vGap = 4;
        final int hGap = 4;
        frame = new JFrame("Sulit Ulam Solver");
		frame.setDefaultCloseOperation(0x03);
		cont = frame.getContentPane();
		cont.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.PAGE_AXIS));
		panel1 = new JPanel();
        panel2 = new JPanel(new GridLayout(0, 3, hGap, vGap));
        panel3 = new JPanel(new GridLayout(0, 2, hGap, vGap));
        panel4 = new JPanel();
        panel5 = new JPanel(new GridLayout(10, 4, hGap, vGap));
        panel6 = new JPanel();
        panel2.setBorder(BorderFactory.createEmptyBorder(hGap, vGap, hGap, vGap));
        panel3.setBorder(BorderFactory.createEmptyBorder(hGap, vGap, hGap, vGap));
        panel5.setBorder(BorderFactory.createEmptyBorder(hGap, vGap, hGap, vGap));
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);
        frame.add(panel5);
        frame.add(panel6);

        //Panel1
        panel1.add(new JLabel("Knapsack Sulit Ulam Solver"));

        //Panel2
        txtBudget = new JTextField("", 10);
        btnBudget = new JButton("Enter");
        panel2.add(new JLabel("Enter Budget: "));
        panel2.add(txtBudget);
        panel2.add(btnBudget);
        //Function of the Button
        btnBudget.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                //Try catch for catching an error when parsing txtBugdet to int
                try {
                    double budget = Double.parseDouble(txtBudget.getText());
                    cmbSelection.removeAllItems();
                    btnSelect.setEnabled(false);
                    if(budget < 80) {

                        //Clears combo box when entering insufficient 
                        cmbSelection.removeAllItems();
                        cmbSelection.setEnabled(false);
                        JOptionPane.showMessageDialog(null, "Unfortunately, you do not have enough funds in your budget to buy any meal.", "Insufficient Amount", JOptionPane.PLAIN_MESSAGE, null);

                    } else {

                        //When the amount is suffice, the combo box is enabled
                        cmbSelection.setEnabled(true);
                        //Iterates through Ulam Object Array
                        for(int i = 0; i < ulams.length; i++) {
                            //Compares budget to all the minimum prices of the meals
                            if(budget >= ulams[i].getPresyo())
                                //If amount given is sufficient, items obtainable will be added to the combo box
                                cmbSelection.addItem(ulams[i].getTitle());
                        }
                        
                    }
                } catch(Exception e) {
                    e.getStackTrace();
                }
            }
        });

        //Panel3
        cmbSelection = new JComboBox<String>(new String[] {});
        panel3.add(new JLabel("Selections: "));
        panel3.add(cmbSelection);
        cmbSelection.setEnabled(false);
        cmbSelection.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                //Try catch for when the getters return an error
                try {
                    //Sets  to the selected option info into the textboxes
                    txtTitle.setText(ulams[cmbSelection.getSelectedIndex()].getTitle());
                    txtPrice.setText(Double.toString(ulams[cmbSelection.getSelectedIndex()].getPresyo()));
                    btnSelect.setEnabled(true);
                    for(int i = 0; i < ulams[cmbSelection.getSelectedIndex()].getLength(); i++) {
                        txtIngr[i].setText(ulams[cmbSelection.getSelectedIndex()].getIngredients(i));
                        txtPrices[i].setText(Double.toString(ulams[cmbSelection.getSelectedIndex()].getPrices(i)));
                        txtWeight[i].setText(Double.toString(ulams[cmbSelection.getSelectedIndex()].getWeight(i)));
                        txtUnit[i].setText(ulams[cmbSelection.getSelectedIndex()].getUnit(i));
                    }
                } catch(Exception e) {
                    e.getStackTrace();
                }
                
            }
        });

        //Panel4
        txtTitle = new JTextField("", 10);
        txtPrice = new JTextField("", 10);
        panel4.add(new Label("Ulam: "));
        panel4.add(txtTitle);
        panel4.add(new JLabel("Price: "));
        panel4.add(txtPrice);
        txtTitle.setEditable(false);
        txtPrice.setEditable(false);

        //Panel5
        panel5.add(new JLabel("Ingredients"));
        panel5.add(new JLabel("Prices"));
        panel5.add(new JLabel("Weight"));
        panel5.add(new JLabel("Unit"));
        txtIngr = new JTextField[9];
        txtPrices = new JTextField[9];
        txtWeight = new JTextField[9];
        txtUnit = new JTextField[9];
        //This automates adding textfields to the display
        for(int i = 0; i < 9; i++) {
            txtIngr[i] = new JTextField("", 10);
            txtPrices[i] = new JTextField("", 5);
            txtWeight[i] = new JTextField("", 5);
            txtUnit[i] = new JTextField("", 5);
            panel5.add(txtIngr[i]);
            panel5.add(txtPrices[i]);
            panel5.add(txtWeight[i]);
            panel5.add(txtUnit[i]);
            txtIngr[i].setEditable(false);
            txtPrices[i].setEditable(false);
            txtWeight[i].setEditable(false);
            txtUnit[i].setEditable(false);
        }

        //Panel6
        btnSelect = new JButton("Select");
        btnHistory = new JButton("History");
        panel6.add(btnSelect);
        panel6.add(btnHistory);
        btnHistory.setEnabled(false);
        btnSelect.setEnabled(false);
        btnSelect.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                //This pushes the optimized answer to the stack
                stack.push(KnapsackAlgo(ulams[cmbSelection.getSelectedIndex()], Double.parseDouble(txtBudget.getText())));
                
                UlamArray meal = new UlamArray(stack.peek().getTitle(), stack.peek().getPresyo(), stack.peek().getAllIngredients(), stack.peek().getAllPrices(), stack.peek().getAllWeight(), stack.peek().getAllUnit());
                String ingr = new String("");
                String prices = new String("");
                String weight = new String("");
                for(int i = 0; i < meal.getLength(); i++) {
                    ingr = meal.getIngredients(i);
                    prices = Double.toString(meal.getPrices(i));
                    weight = meal.getWeight(i) + meal.getUnit(i);
                }

                JOptionPane.showMessageDialog(null,
                                                "Meal: " + meal.getTitle() +
                                                "\nPrice: " + meal.getPresyo() +
                                                "\nIngredients: " + Arrays.toString(ulams[cmbSelection.getSelectedIndex()].getAllIngredients()) +
                                                "\nPrices: " + Arrays.toString(ulams[cmbSelection.getSelectedIndex()].getAllPrices()) +
                                                "\nWeight: " + Arrays.toString(ulams[cmbSelection.getSelectedIndex()].getAllWeight()),
                                                "Selection", JOptionPane.PLAIN_MESSAGE
                                            );

            }
        });
        
        frame.pack();
		frame.setVisible(true);
    }


    public static void main(String[] args) throws Exception {
        new Knapsack();
    }

    public static UlamArray KnapsackAlgo(UlamArray ulam, double budget) {
        String[] ingredient = new String[10];
        String[] unit = new String[10];
        double[] price =  new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,};
        double[] weight = new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,};
        double totPrice = 0;
        int i = 0;
        //Knapsack Solver
        while(budget > ulam.getPrices(i)) {
            ingredient[i] = ulam.getIngredients(i);
            price[i] += ulam.getPrices(i);
            weight[i] += ulam.getWeight(i);
            unit[i] = ulam.getUnit(i);
            budget = budget - ulam.getPrices(i);
            i++;
            i %= 9;// for relooping
        }
        price[i] += budget;
        weight[i] += (budget / ulam.getPrices(i)) * ulam.getWeight(i);
        ingredient[i]= ulam.getIngredients(i);
        unit[i] = ulam.getUnit(i);
        for(int j = 0; j < ingredient.length; j++)
            totPrice += price[i];

        UlamArray newUlam = new UlamArray(ulam.getTitle(), totPrice, ingredient, price, weight, unit);
        return newUlam;
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
