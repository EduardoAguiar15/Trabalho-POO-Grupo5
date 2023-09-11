package View;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;

import Data.BancoDeDados;
import Model.Estudante;

public class Menu {

	private BancoDeDados bancoDeDados;
	private static Scanner scanner;

	public Menu() {

		ArrayList<Estudante> estudantes = Estudante.organizarEstudantes(50);
		//Connection conexao = (Connection) BancoDeDados.obterConexao();

		scanner = new Scanner(System.in);
	}

	
	@Override
	public String toString() {
		return "Menu [bancoDeDados=" + bancoDeDados + ", scanner=" + scanner + "]";
	}


	public void exibirMenu() {
		boolean continuar = true;
		

		while (continuar) {
			System.out.println("\nMenu de Opções:");
			System.out.println("1. Adicionar Estudante");
			System.out.println("2. Editar Estudante");
			System.out.println("3. Remover Estudante");
			System.out.println("4. Listar Estudantes");
			System.out.println("5. Sair");
			System.out.print("\nEscolha uma opção: ");

			int escolha = scanner.nextInt();
			scanner.nextLine();

			try {
				switch (escolha) {
				case 1:
					adicionarEstudante();
					break;
				case 2:
					editarEstudante();
					break;
				case 3:
					removerEstudante();
					break;
				case 4:
					listarEstudantes();
					break;
				case 5:
					continuar = false;
					break;
				default:
					System.out.println("Opção inválida.");
				}

			} catch (Exception e) {
				System.out.println("Erro: " + e.getMessage());
				
			}
			
		}
		scanner.close();
	}
		
		private void adicionarEstudante() {
			try {
				System.out.println("Nome: ");
				String nome = scanner.nextLine();
				
				System.out.println("\nCurso: ");
				String curso = scanner.nextLine();
			
				
				System.out.println("Estudante adicionado com sucesso!");
			}catch (Exception e) {
				System.out.println("Erro ao adicionar estudante: " + e.getMessage());
			}
		}
		
		private void editarEstudante() {
			try {
				//if/else?
			}catch (Exception e) {
				System.out.println("Erro ao editar estudante: " + e.getMessage());
				
				
			}
		}
		
		private void removerEstudante() {
			try {
				//lógica
				System.out.println("Estudante removido com sucesso.");
			}catch (Exception e) {
				System.out.println("Erro ao remover estudante: " + e.getMessage());
			}
		}
		
		private void listarEstudantes() {
			try {
				//lógica
				ArrayList<Estudante> estudantes = Estudante.organizarEstudantes(50);
				System.out.println("Lista de estudantes: ");
				for (Estudante e : estudantes) {
					System.out.println(e.getNome() + e.getCurso());
				
				}
			}catch (Exception e) {
				System.out.println("Erro ao listar estudantes: " + e.getMessage());
			}
		}
	
}