import java.util.Arrays;
import java.util.Scanner;

package revisao.src.revisao;

public class Ex7Vetor {

    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[20];
        Scanner tcl = new Scanner(System.in);
        // Montando o vetor A
        for (int i = 0; i < 10; i++)
            System.out.println("Digite um número qualquer" + " para o vetor A.\nSó é aceito" + "múltiplos e 2 'e' 3: ");
        int valor = tcl.nextInt();
        if (valor % 2 == 0 && valor % 3 == 0) {
            vetorA[i] = valor;
        } else {
            i--;
        }

        // Montando o vetor B
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número qualquer " + "para o vetor B.\n" + "Só é aceitável múltiplos de 5: ");
            int valor = tcl.nextInt();
            if (valor % 5 == 0) {
                vetorB[i] = valor;
            } else {
                i--;
            }
        }
        int y = 0;
        for (int i = 0; i < vetorC.length; i++) {
            if (i < vetorA.length) {
                vetorC[i] = vetorA[i];
            } else {
                vetorC[i] = vetorB[y];
                y++;
            }
        }
        tcl.close();
        System.out.println(Arrays.toString(vetorC));
    }
}