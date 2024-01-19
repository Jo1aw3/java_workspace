package exm;

import java.util.Scanner;

public class OrdenarNumeros {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // ordenar 3 números en orden ascendente
        int z1;
        int z2;
        int z3;
        int menor = 0;
        int mediano = 0;        
        int mayor = 0;
        
        System.out.println("Introduce número 1: ");
        z1 = input.nextInt();
        System.out.println("Introduce número 2: ");
        z2 = input.nextInt();
        System.out.println("Introduce número 3: ");
        z3 = input.nextInt();
        if (z1 < z2 && z1 < z3) {
            menor = z1;
            if (z2 < z3) {
                mediano = z2;
                mayor = z3;
            }
        } else {
            if (z2 < z1 && z2 < z3) {
                if (z1 < z3) {
                    mediano = z1;
                    mayor = z3;
                }
            } else {
                if (z3 < z1 && z3 < z2) {
                    if (z2 < z1) {
                        mediano = z2;
                        mayor = z1;
                    }
                }
            }
        }
        System.out.println("Ordenados: " + menor + "-" + mediano + "-" + mayor);
    }
}
