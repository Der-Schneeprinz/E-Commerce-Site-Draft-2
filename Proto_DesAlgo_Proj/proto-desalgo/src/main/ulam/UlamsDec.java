package main.ulam;

public class UlamsDec {
    
    public UlamsDec() {
        
        UlamArray[] ulams = new UlamArray[10];

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

    }

}
