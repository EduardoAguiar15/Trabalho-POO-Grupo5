package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BancoDeDados {
	// TODO Auto-generated method stub

	public static String sqlTabela() {
		return "CREATE TABLE IF NOT EXISTS estudante( id serial primary key, nome varchar not null, curso varchar not null)";
	}
	public static Connection obterConexao() {

		String url = "jdbc:postgresql://localhost:5432/escola";
		String usuario = "postgres";
		String senha = "";

		Connection conexao = null;

		try {

			conexao = DriverManager.getConnection(url, usuario, senha);
			System.out.println("Conexão com o banco de dados estabelecida com sucesso!");
		} catch (SQLException e) {
			System.out.println("Não foi possível obter a conexão com o banco de dados!");
			e.printStackTrace();
		}

		return conexao;
	}
}
