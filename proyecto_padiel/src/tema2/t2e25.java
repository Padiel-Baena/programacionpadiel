package tema2;

import java.util.Scanner;

public class t2e25 {
    public static void main(String[] args){
        System.out.println("Dime un numero y yo te calculare el factorial");
        Scanner valor = new Scanner(System.in);
        int var = valor.nextInt();
        int prod = 1;
        if (var >= 0){
            while(var != 0){
                prod = prod * var ;
                var -- ;
            }
            System.out.println("El factorial del numero que me has dicho es " + prod);
        }else {
            System.out.println("No hay factorial de un numero negativo");
        }
        valor.close();
    }
}
