package com.example.healthydietapplication;

import java.text.DecimalFormat;

public class CalculateBMI {
    //Calculation: [weight (kg)/height (cm)/height (cm)]x10,000

    /*
    BMI Categories:
    Underweight = <18.5
    Normal weight = 18.5–24.9
    Overweight = 25–29.9
    Obesity = BMI of 30 or greater
    */

    static double weight=EnterWeightActivity.w;
    static double height=EnterHeightActivity.h;
    static double underweight = 18.5;
    static double normal = 24.9;
    static double overweight = 29.9;
    static int obesity = 30;
    static double calculatedBMI=0.0;
    private static DecimalFormat df2 = new DecimalFormat("#.##");

    public static double calculate(){
        calculatedBMI = (weight/height/height)*10000;
        return Double.parseDouble(df2.format(calculatedBMI));
        //return calculatedBMI;
    }

    public String BMIcategory(){
        String s;
        if(calculatedBMI<underweight){
            s="Underweight";
            return s;
        }
        else if (calculatedBMI>=underweight && calculatedBMI<normal){
            s="Normal";
            return s;
        }
        else if (calculatedBMI>=normal && calculatedBMI<overweight){
            s="Overweight";
            return s;
        }
        else if (calculatedBMI>=obesity){
            s="Obesity";
            return s;
        }
        else{
            s="Not a valid value!";
            return s;
        }
    }
}
