package View;

import java.util.Scanner;

import controller.OperacoesController;

public class Main {

	public static void main(String[] args) {
		
		OperacoesController OC = new OperacoesController();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		int n = sc.nextInt();
		while(n > 10) {
			System.out.print("Digite um entre 1 e 10: ");
			 n = sc.nextInt();
		}
		sc.close();
		
		double soma = OC.Soma(n);
		
		System.out.println(soma);
		
	}

}
