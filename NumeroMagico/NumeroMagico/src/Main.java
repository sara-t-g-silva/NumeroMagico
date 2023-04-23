import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int numeroAleatorio = new Random().nextInt(5);
        Scanner scanner = new Scanner(System.in);
        int numeroTentativas=0;
        int tentativasRestantes=4;


        while(numeroTentativas<5){
            int numeroDigitado = scanner.nextInt();
            if(numeroDigitado == numeroAleatorio){
                System.out.println("Parabéns!!! Acertou");
                break;
            }else if (numeroDigitado<numeroAleatorio){
                System.out.println("errou! o numero mágico é maior, você possui agora " + tentativasRestantes + " tentativas restantes");
                tentativasRestantes--;
            }else if(numeroDigitado>numeroAleatorio){
                System.out.println("errou! o numero mágico é menor, você possui agora " + tentativasRestantes + " tentativas restantes");
                tentativasRestantes--;
            }


            numeroTentativas++;
        }

        if(numeroTentativas==5){
            System.out.println("Não foi dessa vez, o número mágico é "+ numeroAleatorio);
        }





    }
}