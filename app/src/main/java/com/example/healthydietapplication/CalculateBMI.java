package com.example.healthydietapplication;

public class CalculateBMI {
    //Calculation: [weight (kg)/height (cm)/height (cm)]x10,000

    /*
    BMI Categories:
    Underweight = <18.5
    Normal weight = 18.5–24.9
    Overweight = 25–29.9
    Obesity = BMI of 30 or greater
    */

    double weight=0;
    double height=0;
    double underweight = 18.5;
    double normal = 24.9;
    double overweight = 29.9;
    int obesity = 30;
    double calculatedBMI=0.0;


    public CalculateBMI(double weight, double height){
        this.weight=weight;
        this.height=height;
    }

    public double calculate(double weight, double height){
        calculatedBMI = (weight/height/height)*10000;
        return calculatedBMI;
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
