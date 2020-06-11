package src.com.fedasov.fuelCalculation;

import java.util.Scanner;

/*
 * Программа для расчета стоимости топлива.
 * Выберите марку бензина, затем количество литров.
 */

public class FuelCalc {
    public static void main(String[] args) {
        System.out.println("Для расчета стоимости топлива введите марку топлива " +
                "из предложенных вариантов!" + "95-ый - (95), 92-ой - (92), 100-ый - (100):");
        Scanner scan = new Scanner(System.in);
        System.out.println("Ведите марку топлива: ");
        int fuelType = scan.nextInt();
        System.out.println("Вы выбрали: " + fuelType);

        int numLiters;

        switch (fuelType) {
            case 92:
                System.out.println("Введите количество литров: ");
                numLiters = scan.nextInt();
                System.out.println("Вы ввели: " + numLiters + " литров");
                numLiters = numLiters * 42;
                System.out.println("С Вас: " + numLiters + " рубликов, пожалуйста!");
                break;
            case 95:
                System.out.println("Введите количество литров: ");
                numLiters = scan.nextInt();
                System.out.println("Вы ввели: " + numLiters + " литров");
                numLiters = numLiters * 47;
                System.out.println("С Вас: " + numLiters + " рубликов, пожалуйста!");
                break;
            case 100:
                System.out.println("Введите количество литров: ");
                numLiters = scan.nextInt();
                System.out.println("Вы ввели: " + numLiters + " литров");
                numLiters = numLiters * 50;
                System.out.println("С Вас: " + numLiters + " рубликов, пожалуйста!");
                break;
            default:
                System.out.println("Вы ввели неверную марку топлива, попробуйте еще раз:) ");
        }
    }
}
