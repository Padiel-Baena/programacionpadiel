package tema2;

public class t2e19 {
    public static void main(String[]args){
        System.out.println("Te voy a decir todos los numeros pares del 1 al 1000");
        int num = 1 ;
        while (num <= 1000){ //bucle
            boolean par = num % 2 == 0 ;
            if (par == true) {//mostrar solo los pares
                System.out.println("El numero " + num + " es par");
                num ++ ;
            }else{
                num ++ ;
            }
        }
    }
}
