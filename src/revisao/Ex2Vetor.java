import java.util.Arrays;

package revisao.src.revisao;

public class Ex2Vetor {
    public static void main(String[]args){
        int [] matrizA = new int[8];
        matrizA[0] = 15;
        matrizA[1] = 55;
        matrizA[2] = 34;
        matrizA[3] = 14;
        matrizA[4] =  4;
        matrizA[5] =  9;
        matrizA[6] = 48;
        matrizA[7] = 39;

        int [] matrizB = new int[8];

        // matrizB[0] = martrizA[0] * 3;
        // matrizB[1] = martrizA[1] * 3;
        // Utilize um laço de repetição
        for(int i =0; i < matrizA.length; i++) {
            matrizB[i] = matrizA[i] * 3;
        }
        // Exibindo o vetor B formatado em texto

        System.out.println(Arrays.toString(matrizB));




    }
}
