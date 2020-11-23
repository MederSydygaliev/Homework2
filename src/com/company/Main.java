package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(goWalk(25, 3));
        System.out.println(goWalk(41, -12));
        System.out.println(goWalk(23, 14));
        System.out.println(goWalk(87, -18));
        System.out.println(goWalk(7, 20));
        System.out.println(goWalkWithRandomAge(15));
        System.out.println(goWalkWithRandomAge(-8));
        System.out.println(goWalkWithRandomAge(-1));
    }

    public static String goWalk(int age, int temp) {

        if (
                (age >= 20 && age <= 40 && temp >= -20 && temp <= 30)
                        || (age < 20 && temp >= 0 && temp <= 28)
                        || (age > 45 && temp >= -10 && temp <= 25)
        ) {
            return "Возраст: " + age + ", Температура: " + temp + " Результат: Можно идти гулять";
        } else {
            return "Возраст: " + age + ", Температура: " + temp + " Результат: Оставайтесь дома";
        }

    }

    public static String goWalkWithRandomAge(int temp) {
        int age = generateRandomAge();
        if (
                (age >= 20 && age <= 40 && temp >= -20 && temp <= 30)
                        || (age < 20 && temp >= 0 && temp <= 28)
                        || (age > 45 && temp >= -10 && temp <= 25)
        ) {
            return "Возраст: " + age + ", Температура: " + temp + " Результат: Можно идти гулять";
        } else {
            return "Возраст: " + age + ", Температура: " + temp + " Результат: Оставайтесь дома";
        }


    }

    public static int generateRandomAge() {
        return (int) (Math.random() * 100);

    }
}
