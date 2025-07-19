import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

/**
 * @author (Alicia) 
 */
public class DemoUsosDoWhile
{
    Scanner scanner = new Scanner (System.in);
    Random random = new Random();
    public void adivinaNumero ()
    {
        System.out.println("¡Bienvenido al juego del bingo! Adivina el número entre 1 y 5.");
        int numeroGanador = random.nextInt(5) + 1;
        int numero;
        do {
            System.out.println ("Introduce un número del 1 al 5");
            numero = scanner.nextInt();
            switch (numero) {
                case 1, 2, 3, 4, 5:
                    if (numero == numeroGanador) {
                        System.out.println ("El número " + numero + " ha sido premiado");
                    }
                    else {
                        System.out.println ("El número " + numero + " no ha sido premiado");

                    }
                    break;

                default:
                    System.out.println ("El número está fuera del rango permitido.");
                    scanner.nextInt();
                    break;
            }
        }
        while (numero != numeroGanador);
    }
}
