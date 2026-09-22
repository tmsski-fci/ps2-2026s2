import java.sql.*;

public class AppCreate {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:postgresql://aws-0-sa-east-1.pooler.supabase.com:5432/postgres?user=postgres.ldjlyxztgvlefjbhdzhn&password=senha";
        Connection conexao = DriverManager.getConnection(url);
        IO.println("Conexão bem-sucedida!");
        String sql = "INSERT INTO contas VALUES (?,?)";
        PreparedStatement ps;
        ps = conexao.prepareStatement(sql);
        ps.setLong(1, 200);
        ps.setDouble(2, 2222.34);
        int retorno = ps.executeUpdate();
        IO.println("Registros inseridos: " + retorno);
  
    }
}
