package tema2;

public class t2e21 {
    public static void main(String[]args) {
        int num = 1;
        int s = 1;
        int suma = 0;
        while (num <= 1000) {
            boolean par = num % 2 == 0;
            if (par == true) {
                suma = num + suma;
            }
            num++;
        }
        System.out.println("La suma de todos los numeros pares entre 1 y 1000 es " + suma);
    }
}
