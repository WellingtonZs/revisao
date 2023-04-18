package revisao;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class EntradaDado {
	
	public static void main (String[] args) {
		
		Scanner tcd = new Scanner(System.in);
		String nome;
		int nota1 = 00;
		int nota2 = 00;
		int nota3 = 00;
		int media = 00;
		
		nome = JOptionPane.showInputDialog(null, "Digite seu Nome:");
		System.out.println("Digite a primeira nota: ");
		nota1 = tcd.nextInt();
		System.out.println("Digite a segunda nota:");
		nota2 = tcd.nextInt();
		System.out.println("Digite a terceira nota:");
		nota3 = tcd.nextInt();
		media = (nota1+nota2+nota3) / 3;
		System.out.println("Sua média é " + media);
		if (media < 5) {
			System.out.println("Reprovado");
		}
		else if (media >= 5 && media <=7) {
			System.out.println("Recuperação");
		}
		if (media > 7) {
			System.out.println("Aprovado");
		}
	}

}
