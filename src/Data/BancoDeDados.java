package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BancoDeDados {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		obterConexao();
	}

	public static Connection obterConexao() {

		String url 		= "jdbc:postgresql://localhost:5432/estudante";
		String usuario 	= "postgres";
		String senha 	= "";

		Connection conexao = null;

		try {
			conexao = DriverManager.getConnection(url, usuario, senha);
			System.out.println("Conexão com o banco de dados estabelecida com sucesso!");
		} catch (SQLException e) {
			System.out.println("Não foi possível obter a conexão com o banco de dados!");
		}

		return conexao;
	}
}

