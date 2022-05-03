package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(rating(-20, 45));
        System.out.println(rating(0, 15));
        System.out.println(rating(30, 25));
        System.out.println(rating(15, 35));
        System.out.println(rating(9, 40));
        System.out.println(RandomAge()+rating(RandomAge(),10));
    }

    public static String rating(int temperature, int ageOfAPerson) {
        if (ageOfAPerson > 20 && ageOfAPerson < 45 && temperature > -20 && temperature < 30) {
            return "Можно идти гулять";

        } else if (ageOfAPerson < 20 && temperature > 0 && temperature < 28) {
            return "Можно идти гулять";
        } else {
            return "Нельзя идти гулять";
        }
    }
public static int RandomAge(){
    Random random=new Random();
    int figure=random.nextInt();
    return figure;
}}