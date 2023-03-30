package Biblioteca;

import Biblioteca.models.CardCliente;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        bibliotecaEXE();

    }

    public static void bibliotecaEXE() {
        Scanner input = new Scanner(System.in);
        boolean running = true;
        while (running) {

            System.out.println("Benvenuto, hai già una Tessera Clienti?");
            System.out.println("1. Si");
            System.out.println("2. No");
            int scelta = input.nextInt();
            switch (scelta) {
                case 1:
                    break;
                case 2:

            }

        }
    }

    public static CardCliente generaCard(Scanner input) {

        return null;
    }
}
