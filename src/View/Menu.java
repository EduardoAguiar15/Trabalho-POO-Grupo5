package View;

import java.util.Scanner;

public class Menu {
	
	
	public static void Opcao() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a opção desejada: \n1 - Adicionar estudante "
+ "\n2 - Editar estudante \n3 - Remover estudante \n4 - Listar estudantes \n5 - Sair");
		 int opcao = entrada.nextInt();
		 
		 switch(opcao) {
		 case 1:
		 case 2:
		 case 3:
		 case 4:
		 case 5:
		 default:
			 
		 }
	
	 entrada.close();
	}
}
