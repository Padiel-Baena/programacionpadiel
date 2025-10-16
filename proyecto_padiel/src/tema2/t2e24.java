package tema2;

import java.util.Scanner;

public class t2e24 {
    public static void main(String[] args) {
        System.out.println("Programa para introducir notas. Para terminar, introduce -1.");
        Scanner valor = new Scanner(System.in);
        int suspendidos = 0;
        int alumnos = 0;
        System.out.println("Introduce una nota");
        double nota = valor.nextDouble();
        while (nota != -1) {
            if (nota >= 0 && nota <= 10) {
                alumnos++;
                if (nota < 5) {
                    suspendidos++;
                }
            } else {
                System.out.println("Nota no válida. Debe estar entre 0 y 10.");
            }
            System.out.println("Introduce otra nota (o -1 para terminar)");
            nota = valor.nextDouble();
        }
        System.out.println("De " + alumnos + " alumnos, " + suspendidos + " están suspendidos.");
        valor.close();
    }
}