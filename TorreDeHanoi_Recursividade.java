import java.util.Scanner;

public class TorreDeHanoi_Recursividade {
    //Variavel de contar movimentos dos discos
    static int contador =0;

    // Funcao que executa o calculo total da torre de hanoi
    static void hanoi(int numeroDiscos, int pinoInicial, int pinoFinal, int pinoAuxiliar) {
        if (numeroDiscos > 0) {

            hanoi(numeroDiscos - 1, pinoInicial, pinoAuxiliar, pinoFinal); //pino inicial para pino Auxiliar

            System.out.println(pinoInicial + " -> " + pinoFinal); // Movimento do inicial para final
            contador+=1;                                          //contador de movimentos

            hanoi(numeroDiscos - 1, pinoAuxiliar, pinoFinal, pinoInicial); //pino Auxiliar para o pino Final

        }
    }

    public static void main(String[] args) {
        int numeroDiscos;
        double tempoInicial;

        // Entrada para numero de discos
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o número de discos: ");
        numeroDiscos = entrada.nextInt();

        // executa a funcao da torre de hanoi juntamente com o calculo do tempo decorrido da mesma
        tempoInicial = System.currentTimeMillis();
        hanoi(numeroDiscos, 1, 3, 2);

        // Saida do tempo gasto e da quantidade de movimentos da torre de hanoi
        System.out.println("Tempo gasto: " + (System.currentTimeMillis()-tempoInicial)/1000 + " segundos!");
        System.out.println("Total de " +contador+ " movimentos!");
    }
}