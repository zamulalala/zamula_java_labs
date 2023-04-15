package Lab5;

import lab3.Complex;

public class Lab5_1_8 {
    public static void main(String[] args) {
        int n = 5;
        Complex[] vector01 =  new Complex[n];
        Complex[] vector02 =  new Complex[n];

        try {
            for (int i = 0; i < n; i++) {
                vector01[i] = new Complex(i,i+1);
                vector02[i] = new Complex(i + 1, i);
            }
        } catch (Exception e) {
            System.err.println("Not enough memory!");
            e.printStackTrace();
        }
        Complex[] result = new Complex[n];
        for (int i = 0; i < n; i++) {
            result[i] = vector01[i].addition(vector02[i]);
        }
        System.out.println("Vector 01: ");
        for (int i = 0; i < n; i++) {
            System.out.println(vector01[i].toString());
        }
        System.out.println("Vector 02: ");
        for (int i = 0; i < n; i++) {
            System.out.println(vector02[i].toString());
        }
        System.out.println("Result: ");
        for (int i = 0; i < n; i++) {
            System.out.println(result[i].toString());
        }
    }
}
