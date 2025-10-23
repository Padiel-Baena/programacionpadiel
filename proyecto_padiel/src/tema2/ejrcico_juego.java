package tema2;

import java.util.Random;
import java.util.Scanner;
/*
Aunque no hemos dado lo del try catch, he estado investigando y es la unica forma segura de que si el usuario pone una letra en el momento del switch, no falle el programa, y lo mismo ocurre con el IntegerparseInt, ademas de que son complementarios
 */
public class ejrcico_juego {
    public static void main(String[] args) {
        System.out.println("Este es un juego de pelea por turnos, voy a necesitar que me digas los atributos de cada personaje.");
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String nombre1 = ".";
        String nombre2 = ".";
        String basura = ".";

        int contador = 1;
        int Ps = 0;
        int ataque = 0;
        int defensa = 0;
        int velocidad = 0;
        int Ps1 = 0;
        int ataque1 = 0;
        int defensa1 = 0;
        int velocidad1 = 0;
        int total = Ps + ataque + defensa + velocidad;
        int total1 = Ps1 + ataque1 + defensa1 + velocidad1;
        double atJ1 = 1;

        int personajes = 0;
        //variables
        System.out.println("Pulsa 1 si escoges las estadisticas, pulsa 2 si las escoge el sistema");
        personajes = sc.nextInt();
        while (personajes != 1 && personajes != 2) {
            System.out.println("Tienes que elegir el numero 1 o numero 2");
            personajes = sc.nextInt();
        }
        //comprobacion de que se ha elegido bien los numeros para el switch
        basura = sc.nextLine();
        //borron de lo que sobra en el buffer
        switch (personajes) {
            case 1: {
                System.out.println("Dime el nombre del jugador 1");
                nombre1 = sc.nextLine();
                System.out.println("Dime las caracteristicas de " + nombre1 + "\nLos atributos tienen que estar entre 1 y 200, y el total no puede superar los 500");
                while (total <= 0 || total > 500) {
                    System.out.println("Vida(PS):");
                    Ps = sc.nextInt();
                    while (0 >= Ps || Ps > 200) {
                        System.out.println("El atributo de vida no es correcto, vuelve a ponerlo");
                        Ps = sc.nextInt();
                    }
                    System.out.println("Ataque:");
                    ataque = sc.nextInt();
                    while (0 >= ataque || ataque > 200) {
                        System.out.println("El atributo de atque no es correcto, vuelve a ponerlo");
                        ataque = sc.nextInt();
                    }
                    System.out.println("Defensa:");
                    defensa = sc.nextInt();
                    while (0 >= defensa || defensa > 200) {
                        System.out.println("El atributo de defensa no es correcto, vuelve a ponerlo");
                        defensa = sc.nextInt();
                    }
                    System.out.println("Velocidad:");
                    velocidad = sc.nextInt();
                    while (0 >= velocidad || velocidad > 200) {
                        System.out.println("El atributo de velocidad no es correcto, vuelve a ponerlo");
                        velocidad = sc.nextInt();
                    }
                    atJ1 = ((double) (ataque - 1) / (200 - 1)) * 100;
                    total = Ps + ataque + defensa + velocidad;
                    if (total > 500) {
                        System.out.println("El total de las caracteristicas supera el maximo, vuelve a decirmelas de forma que no superen los 500 puntos en total");
                    }
                }
                System.out.println("Las caracteristicas de " + nombre1 + " son :\nPs: " + Ps + "\nAtaque: " + ataque + "\nDefensa: " + defensa + "\nVelocidad: " + velocidad + "\nY el total de atributos es " + total + "\n");
                System.out.println("el ataque porcentual del jugador 1 es " + atJ1);

                //comprobacion estadisticas
                basura = sc.nextLine();
                System.out.println("Dime el nombre del jugador 2");
                nombre2 = sc.nextLine();
                System.out.println("Dime las caracteristicas de " + nombre2);
                while (total1 <= 0 || total1 > 500) {
                    System.out.println("Vida(PS):");
                    Ps1 = sc.nextInt();
                    while (0 >= Ps1 || Ps1 > 200) {
                        System.out.println("El atributo de vida no es correcto, vuelve a ponerlo");
                        Ps1 = sc.nextInt();
                    }
                    System.out.println("Ataque:");
                    ataque1 = sc.nextInt();
                    while (0 >= ataque1 || ataque1 > 200) {
                        System.out.println("El atributo de atque no es correcto, vuelve a ponerlo");
                        ataque1 = sc.nextInt();
                    }
                    System.out.println("Defensa:");
                    defensa1 = sc.nextInt();
                    while (0 >= defensa1 || defensa1 > 200) {
                        System.out.println("El atributo de defensa no es correcto, vuelve a ponerlo");
                        defensa1 = sc.nextInt();
                    }
                    System.out.println("Velocidad:");
                    velocidad1 = sc.nextInt();
                    while (0 >= velocidad1 || velocidad1 > 200) {
                        System.out.println("El atributo de velocidad no es correcto, vuelve a ponerlo");
                        velocidad1 = sc.nextInt();
                    }
                    total1 = Ps1 + ataque1 + defensa1 + velocidad1;
                    if (total1 > 500) {
                        System.out.println("El total de las caracteristicas supera el maximo, vuelve a decirmelas de forma que no superen los 500 puntos en total");
                    }
                }
                System.out.println("Las caracteristicas de " + nombre2 + " son :\nPs: " + Ps1 + "\nAtaque: " + ataque1 + "\nDefensa: " + defensa1 + "\nVelocidad: " + velocidad1 + "\nY el total de atributos es " + total + "\n");
                break;
            }
            //comprobacion estadisticas
            case 2: {
                System.out.println("Dime el nombre del jugador 1");
                nombre1 = sc.nextLine();
                do {
                    Ps = random.nextInt(200);
                    ataque = random.nextInt(200);
                    defensa = random.nextInt(200);
                    velocidad = random.nextInt(200);
                    total = Ps + ataque + defensa + velocidad;
                    //estadisticas random
                } while ((total != 500));
                System.out.println("Las caracteristicas de " + nombre1 + " son :\nPs: " + Ps + "\nAtaque: " + ataque + "\nDefensa: " + defensa + "\nVelocidad: " + velocidad + "\nEl total es " + total);
                System.out.println("Dime el nombre del jugador 2");
                nombre2 = sc.nextLine();
                //comprobacion estadisticas
                do {
                    Ps1 = random.nextInt(200);
                    ataque1 = random.nextInt(200);
                    defensa1 = random.nextInt(200);
                    velocidad1 = random.nextInt(200);
                    total1 = Ps1 + ataque1 + defensa1 + velocidad1;
                } while ((total1 != 500));
                //comprobacion estadisticas
                System.out.println("Las caracteristicas de " + nombre2 + " son :\nPs: " + Ps1 + "\nAtaque: " + ataque1 + "\nDefensa: " + defensa1 + "\nVelocidad: " + velocidad1 + "\nEl total es " + total1);
                break;
            }
        }
        while (Ps > 0 || Ps1 > 0) {
            System.out.println("*");
            System.out.println("Turno " + contador);
            contador++;
            if (velocidad > velocidad1){
                System.out.println(nombre1 + " es mas rapido");

            }else if (velocidad1 > velocidad){
                System.out.println(nombre2 + "es mas rapido");
            }else  {
                System.out.println("Los dos son igual de rapidos");
            }
        }
    }
}