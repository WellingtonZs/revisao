import javax.swing.JOptionPane;

package revisao.src.revisao;

public class AtividadePag175 {
    public static void main(String[] args) {

        int valor;
        // do while -> Laço invertido: Executa no mínimo 1 vez, o teste é feito no final
        do {
            valor = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número" + "entre 0 e 38"));
        } while (valor >= 0 && valor <= 38);


    }
}
