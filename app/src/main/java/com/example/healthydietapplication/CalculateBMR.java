package com.example.healthydietapplication;

public class CalculateBMR {
    /*
    Men: BMR = 88.362 + (13.397 x weight in kg) + (4.799 x height in cm) – (5.677 x age in years)
    Women: BMR = 447.593 + (9.247 x weight in kg) + (3.098 x height in cm) – (4.330 x age in years)
    */

    public static double weight = EnterWeightActivity.w;
    public static double height = EnterHeightActivity.h;
    public static int age = EnterAgeActivity.a;
    public static boolean ifMale = YourGenderActivity.isMale;
    public static double BMR;

    public static double calculateBMR(){
        if(ifMale){
            BMR=88.362 + (13.397 * weight) + (4.799 * height) - (5.677 * age);
        }
        else{
            BMR=447.593 + (9.247 * weight) + (3.098 * height) - (4.330 * age);
        }
        return BMR;
    }
}
