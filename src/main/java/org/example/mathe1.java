package org.example;

public class mathe1 {
    private double n;

    public mathe1(double n) {
        this.n = n;
    }

    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
    }

    public static double sinus(double n) {
        double suma = 0;
        int fac;
        n = n * Math.PI / 180;
        for (int i = 0; i < 10; i++) {
            fac = 1;
            for (int j = 2; j <= 2 * i + 1; j++) {
                fac *= j;
            }
            suma = suma + Math.pow(-1.0, i) * Math.pow(n, 2 * i + 1) / fac;
        }
        return suma;
    }

    public static double faktorijel(double n) {
        int rez = 1;
        for (int i = 1; i < n + 1; i++) {
            rez = rez * i;
        }
        return rez;
    }
}
