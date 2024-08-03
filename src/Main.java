import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombreUsuario = sc.next();
        Usuario usuario = new Usuario(nombreUsuario);

        while (true) {
            System.out.println("Que accion desea realizar? : " +
                    "\n1. Comenzar una partida de BlackJack" +
                    "\n2. Revisar estadistica de Victorias/Perdidas" +
                    "\n3. Salir" +
                    "\n ");
            int opc = sc.nextInt();

            switch (opc) {
                case 1:
                    //Juego juego = new juego();


                    break;

                case 2:
                    System.out.println("**************************************************"
                            + "\nEstadisticas del Usuario: "
                            + "\nNombre: " + usuario.getNombUs()
                            + "\nVictorias: " + usuario.getWins()
                            + "\nPerdidas: " + usuario.getLose()
                            + "\nEmpate: " + usuario.getTie()
                            + "\n***************************************************");
                    break;

                case 3:
                    sc.close();
                    return;

                default:
                    System.out.println("Ingrese una opción válida");
                    break;
            }
        }
    }
}