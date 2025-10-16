package tema2;
// Haz un programa que encuentre e imprima por consola los 20 primeros
//números primos.
public class t2e27 {
    public static void main(String[] args){
        System.out.println("Te voy a decir los 20 primeros numeros primos");
        int num = 1 ;
        int cont = 0 ;
        boolean oper = num % 3 == 0 ;
        boolean oper1 = num % 2 == 0 ;
        boolean oper2 = num % 5 == 0 ;
        while (cont < 20){
            if ((oper == true) || (oper1 == true) || (oper2 == true)){
                System.out.println(num + "no es primo");
            }else {
                System.out.println(num + " es primo");
                cont ++;
            }
                num ++ ;
        }
    }
}
