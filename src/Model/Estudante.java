package Model;

import java.util.UUID;

public class Estudante {
<<<<<<< HEAD
private final UUID uuid = UUID.randomUUID();
=======
	private final UUID uuid = UUID.randomUUID();
>>>>>>> 927b67a175b68cf2bed79c1cf6aae2401b82a124
	private String nome;
	private Integer id;
	private String curso;
	public Estudante(String nome, Integer id, String curso) {
		super();
		this.nome = nome;
		this.id = id;
		this.curso = curso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
}
