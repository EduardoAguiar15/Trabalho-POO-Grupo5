package Model;

import java.util.ArrayList;
import java.util.Random;

public class Estudante {

	private int id;
	private String nome;
	private String curso;

	public Estudante(int id, String nome, String curso) {
		super();
		this.id = id;
		this.nome = nome;
		this.curso = curso;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public static ArrayList<Estudante> organizarEstudantes(Integer qtEstudantes) {
		ArrayList<Estudante> estudantes = new ArrayList<>();

		String[] nomes = { "Ana", "Luís", "Maria", "João", "Mariana", "Carlos", "Isabel", "Rafael", "Sofia", "Pedro",
				"Clara", "António", "Lara", "Tiago", "Beatriz", "Gustavo", "Lúcia", "Rui", "Laura", "Miguel", "Teresa",
				"André", "Catarina", "Fernando", "Inês", "Manuel", "Rita", "Paulo", "Camila", "Joaquim", "Carolina",
				"Vasco", "Marta", "Ricardo", "Diana", "Daniel", "Bianca", "Hugo", "Raquel", "Francisco", "Vitória",
				"Leonardo", "Eva", "Gilberto", "Cláudia", "Simão", "Gabriela", "Hélder", "Amanda", "Guilherme" };
		String[] cursos = { "Administração de Empresas", "Engenharia Civil", "Psicologia", "Medicina",
				"Arquitetura e Urbanismo", "Direito", "Ciências da Computação", "Enfermagem", "Marketing",
				"Contabilidade", "Design Gráfico", "Economia", "Educação Física", "Nutrição", "Jornalismo", "Biologia",
				"Matemática", "Física", "Química", "História", "Geografia", "Letras", "Ciências Sociais", "Filosofia",
				"Sociologia", "Pedagogia", "Engenharia Elétrica", "Engenharia Mecânica", "Engenharia de Produção",
				"Administração Pública", "Gestão de Recursos Humanos", "Farmácia", "Odontologia",
				"Ciências da Comunicação", "Ciências Ambientais", "Artes Cênicas", "Música", "Dança",
				"Gestão de Projetos", "Fotografia", "Ciência Política", "Relações Internacionais", "Teatro",
				"Design de Moda", "Engenharia Química", "Medicina Veterinária", "Gestão de Marketing Digital",
				"Gastronomia", "Hotelaria e Turismo", "Engenharia de Software" };

		Random r = new Random();

		for (int i = 0; i < qtEstudantes; i++) {
			estudantes.add(new Estudante(i + 1, nomes[r.nextInt(nomes.length)], cursos[r.nextInt(cursos.length)]));
		}

		return estudantes;
	}

	@Override
	public String toString() {
		return "Estudante [id=" + id + ", nome=" + nome + ", curso=" + curso + "]";
	}
	

}
