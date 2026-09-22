import java.sql.*;

public class AppUpdate {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:postgresql://aws-0-sa-east-1.pooler.supabase.com:5432/postgres?user=postgres.ldjlyxztgvlefjbhdzhn&password=senha";
        Connection conexao = DriverManager.getConnection(url);
        IO.println("Conexão bem-sucedida!");
        String sql = "UPDATE contas SET saldo = ? WHERE nro_conta = ?";
        PreparedStatement ps;
        ps = conexao.prepareStatement(sql);
        ps.setDouble(1, 8765.43);
        ps.setLong(2, 200);
        int retorno = ps.executeUpdate();
        IO.println("Registros alterados: " + retorno);
  
    }
}
