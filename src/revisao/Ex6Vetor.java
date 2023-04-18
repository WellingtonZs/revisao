import java.util.Arrays;

package revisao.src.revisao;

public class Ex6Vetor {

    public static void main(String[] args) {
        char [] vetorA = {'A','E','I','O','U'};
        char [] vetorB = new char[5];

        // Laço forEach: Não precisa do contador
        int i = vetorA.length - 1;  // 4
        for(char vogal: vetorA) {
            vetorB[i] = vogal;
            i--;
        }
        System.out.println(Arrays.toString(vetorB));
    }
}
