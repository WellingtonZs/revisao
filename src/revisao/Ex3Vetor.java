import java.util.Arrays;

package revisao.src.revisao;

public class Ex3Vetor {
    public static void main(String[] args) {
        int [] matrizA = new int[10];
        matrizA[0] = 15;
        matrizA[1] = 55;
        matrizA[2] = 34;
        matrizA[3] = 14;
        matrizA[4] = 4;
        matrizA[5] = 9;
        matrizA[6] = 48;
        matrizA[7] = 39;
        matrizA[8] = 5;
        matrizA[9] = 4;
        int [] matrizB = new int[10];

        // Utilize um laço de repetição
        for(int i = 0; i < matrizA.length; i++) {
            matrizB[i] = (int) Math.pow(matrizA[i], 2);
        }
        // Exibindo o vetor B formatado em texto
        System.out.println(Arrays.toString(matrizB));
    }
}
