package revisao;

import javax.swing.JOptionPane;

public class TiposDado {
	
	
	public static void main (String[] args) {
		
		String nome;
		Integer numero;   //Integer (class)
		float nota;       //Float   (class) 4 bytes
		double salario;   //Double  (class) 8 bytes
		boolean matriculado; // true | false
		char situaçao;    // Apenas 1 caracter
		
		// Atribuição dos dados
		
		nome = "Leandro Niches";
		numero = 10;
		nota =  9.8f;
		salario = 6549.21;
		matriculado = true;
		situaçao = 'A';
		
		// Mostrando os dados
		System.out.println("nome: " + nome);
		
		JOptionPane.showMessageDialog(null,"nome: " + nome);
		
		
		
	}

}
