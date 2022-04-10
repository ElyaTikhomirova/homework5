package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // Задание 1 и 2

        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        System.out.print(a[0] + ", " + a[1] + ", " + a[2]);

        System.out.println();
        double[] b = {1.57, 7.654, 9.986};
        System.out.print(b[0] + ", " + b[1] + ", " + b[2]);


        System.out.println();
        int[] c = {55, 22, 18};
        System.out.print(c[0] + ", " + c[1] + ", " + c[2]);


        // Задание 3

        System.out.println();
        System.out.print(a[2] + ", " + a[1] + ", " + a[0]);
        System.out.println();
        System.out.print(b[2] + ", " + b[1] + ", " + b[0]);
        System.out.println();
        System.out.print(c[2] + ", " + c[1] + ", " + c[0]);

        // Задание 4

        System.out.println();

        int[] e = {1, 2, 3};
        for (int i = 0; i < e.length; i++) {
            if (e[i] % 2 != 0)
                System.out.println(e[i] += 1);
            else {
                System.out.println(e[i]);
            }

        }


    }
}









