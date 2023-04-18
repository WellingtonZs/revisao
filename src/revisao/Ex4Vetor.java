import java.util.Arrays;

package revisao.src.revisao;

public class Ex4Vetor {
    public static void main(String[] args) {

        String [] vetorA = { "n", "p", "v", "u", "q"};
        String [] vetorB = { "z", "a", "s", "e", "w"};
        String [] vetorC = new String[10];

        int ii = 0;
        for(int i=0; i < vetorC.length;i++) {
            if (i < vetorA.length) {
                vetorC[i] = vetorA[i];
            } else {
                vetorC[i] = vetorB[ii];
                ii++;
            }
        }
        System.out.println(Arrays.toString(vetorC));
    }
}
