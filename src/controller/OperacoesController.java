package controller;

public class OperacoesController {

	public OperacoesController() {
		super();
	}
	
	public double Fat(int n) {
		if(n==1) {// Condição de parada quando N for = 1 retorna 1
			return 1;
		}
		else {
			return n*Fat(n-1); // Chamada da função com N multiplicando a função com parametro de N-1
		}
	}
		
		public double Soma(int n) {
			if(n==1) { // Condição de parada quando N for = 1 retorna 1.0
				return 1.0;
			} else {
				return 1.0/Fat(n) + Soma(n-1); //Chamada daf função com 1.0 dividido pela função recursiva de Fat(n)
											  // somado a função de soma com parametro de N-1
			}
}


}
