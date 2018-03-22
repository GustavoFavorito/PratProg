import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	public static Connection obtemConexao() throws SQLException {
		return DriverManager
		.getConnection("jdbc:mysql://localhost/Ex02?user=root&password=2709");
		}
}
