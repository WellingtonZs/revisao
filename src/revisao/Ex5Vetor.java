import java.util.Arrays;

package revisao.src.revisao;

public class Ex5Vetor {
    public static void main(String[] args) {
        double[] vetorA = {2.6, 6.7, 4.9, 25.4, 87.8};
        double[] vetorB = {6.8, 14.8, 1.7, 18, 94.5, 7.4, 5.1, 7.8, 95.7, 100.2};
        double[] vetorC = new double[15];
        int i = 0;
        int ii = 0;
        while (i < vetorC.length) {
            if (i < vetorA.length) {
                vetorC[i] = vetorA[i];
            } else {
                vetorC[i] = vetorB[ii];
                ii++;
            }
            i++;
        }
        System.out.println(Arrays.toString(vetorC));
    }

    }

