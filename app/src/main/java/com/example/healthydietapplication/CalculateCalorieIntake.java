package com.example.healthydietapplication;

public class CalculateCalorieIntake {
    /*
    BMR * 1.375 = kcal | little or no activity
    BMR * 1.55 = kcal | 1-3 times a week physically active
    BMR * 1.725 = kcal | more than 3 times a week physically active

    125%kcal = gain weight
    100%kcal = maintain weight
    75%kcal = lose weight
    */

    public static boolean noActivity = PhysicallyActiveActivity.noActivity;
    public static boolean onceAWeek = PhysicallyActiveActivity.onceAWeek;
    public static boolean oneToThreeTimesAWeek = PhysicallyActiveActivity.oneToThreeTimesAWeek;
    public static boolean loseWeight = ChooseYourGoalActivity.loseWeight;
    public static boolean maintainWeight = ChooseYourGoalActivity.maintainWeight;
    public static boolean gainWeight = ChooseYourGoalActivity.gainWeight;
    public static double bmr = CalculateBMR.calculateBMR();

    public static double maxCalories;

    public static int calculateMaxCalories(){
        if(noActivity || onceAWeek){
            maxCalories = bmr * 1.375;
            return (int) goal(maxCalories);
        }
        else if(oneToThreeTimesAWeek){
            maxCalories = bmr * 1.55;
            return (int) goal(maxCalories);
        }
        else{
            maxCalories = bmr * 1.725;
            return (int) goal(maxCalories);
        }
    }

    public static double goal(double maxCalories){
        if(maintainWeight){
            maxCalories = maxCalories * 1;
        }
        else if(loseWeight){
            maxCalories = maxCalories * 0.75;
        }
        else if(gainWeight){
            maxCalories = maxCalories * 1.25;
        }
        return maxCalories;
    }
}
