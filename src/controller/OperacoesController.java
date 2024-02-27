package controller;

public class OperacoesController {
	public OperacoesController() {
		// TODO Auto-generated constructor stub
	}
	
	public int mdc(int num1, int num2) {
		
		if(num1 == num2)
			return num1;
		
		if(num2 > num1) {
			int aux = num2;
			num2 = num1;
			num1 = aux;
		}
		
		num1 = num1-num2;
		return mdc(num1, num2);
	}
}
