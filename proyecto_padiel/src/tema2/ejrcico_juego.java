package tema2;

import java.util.Random;
import java.util.Scanner;

public class ejrcico_juego {
    public static void main(String[] args) {
        System.out.println("Este es un juego por turnos, voy a necesitar uqe me digas los atributos de cada personaje.\nLos atributos no pueden sumar mas de 500 entre todos, y cada atibuto minimo tiene que tener 1 y no puede superar los 200.\nMe tienes que decir PS(PUNTOS DE VIDA), Ataque, Defensa y Velocidad");
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el nombre del jugador 1");
        String nombre1 = sc.nextLine();
        System.out.println("Dime el nombre del jugador 2");
        String nombre2 = sc.nextLine();

        Random random = new Random();
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
        System.out.println("Elige si quieres poner tu las caracteristicas o las elige el programa de forma aleatoria, 1 es para elegirlo tu, 2 para que lo elija el programa");
        int personajes = sc.nextInt();
        //variables
        while (personajes != 1 && personajes != 2) {
            System.out.println("Tienes que elegir el numero 1 o numero 2");
            personajes = sc.nextInt();
        }
        //comprobacion de que se ha elegido bien los numeros para el switch
        switch (personajes) {
            case 1: {
                System.out.println("Dime las caracteristicas de " + nombre1);
                Ps = sc.nextInt();
                ataque = sc.nextInt();
                defensa = sc.nextInt();
                velocidad = sc.nextInt();
                total = Ps + ataque + defensa + velocidad;
                while ((0 >= Ps || Ps > 200) || (0 >= ataque || ataque > 200) || (0 >= defensa || defensa > 200) || (0 >= velocidad || velocidad > 200) || (total > 500)) {
                    System.out.println("Ha habido algun atributo erroneo, vuelve a ingresarlos todos");
                    Ps = sc.nextInt();
                    ataque = sc.nextInt();
                    defensa = sc.nextInt();
                    velocidad = sc.nextInt();
                    total = Ps + ataque + defensa + velocidad;
                }
                //comprobacion estadisticas
                System.out.println("Dime las caracteristicas de " + nombre2);
                Ps1 = sc.nextInt();
                ataque1 = sc.nextInt();
                defensa1 = sc.nextInt();
                velocidad1 = sc.nextInt();
                total1 = Ps1 + ataque1 + defensa1 + velocidad1;
                while ((0 >= Ps1 || Ps1 > 200) || (0 >= ataque1 || ataque1 > 200) || (0 >= defensa1 || defensa1 > 200) || (0 >= velocidad1 || velocidad1 > 200) || (total1 > 500)) {
                    System.out.println("Ha habido algun atributo erroneo, vuelve a ingresarlos todos");
                    Ps1 = sc.nextInt();
                    ataque1 = sc.nextInt();
                    defensa1 = sc.nextInt();
                    velocidad1 = sc.nextInt();
                    total1 = Ps1 + ataque1 + defensa1 + velocidad1;
                }
                System.out.println("Las caracteristicas de " + nombre1 + " son :\nPs: " + Ps + "\nAtaque: " + ataque + "\nDefensa: " + defensa + "\nVelocidad: " + velocidad + "\nLas caracteristicas de " + nombre2 + " son :\nPs: " + Ps1 + "\nAtaque: " + ataque1 + "\nDefensa: " + defensa1 + "\nVelocidad: " + velocidad1);
            }
            //comprobacion estadisticas
            case 2: {
                do {
                Ps = random.nextInt(200);
                ataque = random.nextInt(200);
                defensa = random.nextInt(200);
                velocidad = random.nextInt(200);
                total = Ps + ataque + defensa + velocidad;
                //estadisticas random
            }while (((0 < Ps && Ps >= 200) || (0 < ataque && ataque >= 200) || (0 < defensa && defensa >= 200) || (0 < velocidad && velocidad >= 200)) && (total < 500)) ;

                //comprobacion estadisticas
                do {
                Ps1 = random.nextInt(200);
                ataque1 = random.nextInt(200);
                defensa1 = random.nextInt(200);
                velocidad1 = random.nextInt(200);
                total1 = Ps1 + ataque1 + defensa1 + velocidad1;
            }while (((0 < Ps1 && Ps1 >= 200) || (0 < ataque1 && ataque1 >= 200) || (0 < defensa1 && defensa1 >= 200) || (0 < velocidad1 && velocidad1 >= 200)) && (total1 < 500)) ;
                //comprobacion estadisticas
                System.out.println("Las caracteristicas de " + nombre1 + " son :\nPs: " + Ps + "\nAtaque: " + ataque + "\nDefensa: " + defensa + "\nVelocidad: " + velocidad + "\nEl total es " + total +"\nLas caracteristicas de " + nombre2 + " son :\nPs: " + Ps1 + "\nAtaque: " + ataque1 + "\nDefensa: " + defensa1 + "\nVelocidad: " + velocidad1 +"\nEl total es " + total1);
            }
        }
    }
}