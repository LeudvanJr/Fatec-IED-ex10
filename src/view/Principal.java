package view;

import controller.OperacoesController;

public class Principal {

	public static void main(String[] args) {

		OperacoesController opController = new OperacoesController();
		int x = 20, y = 24;
		
		System.out.println(opController.mdc(25, 15));
	}

}
