package tema2;

import java.util.Scanner;

public class t2e22 {
    public static void main(String[] args) {
        System.out.println("Dime un numero entero y yo te dire cuantas cifras tiene");
        Scanner valor = new Scanner(System.in);
        int num = valor.nextInt();
        int cont = 1;
        int cifra = 1;
        while (num > cifra) {
                cifra = cifra*10;
                cont++;
        }
        System.out.println("El numero que me has dicho tiene estas cifras " + cont);
    }
}
