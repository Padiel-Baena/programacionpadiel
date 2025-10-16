package tema2;

import java.util.Scanner;

public class t2e26 {
    public static void main(String[] args){
        System.out.println("Dime un numero entero, y yo te dire si es primo o no");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        if (num < 0 ){
            System.out.println("El numero que me has dicho es negativo, los negativos no se consideran primos");
        } else {
            boolean oper = num % 3 == 0 ;
            boolean oper1 = num % 2 == 0 ;
            boolean oper2 = num % 5 == 0 ;
            if ((oper == true) || (oper1 == true) || (oper2 == true)){
                System.out.println("El numero que me has dicho no es primo");
            } else {
                System.out.println("El numero que me has dicho es primo");
            }
        }
    }
}
