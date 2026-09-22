import java.sql.*;

public class AppDelete {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:postgresql://aws-0-sa-east-1.pooler.supabase.com:5432/postgres?user=postgres.ldjlyxztgvlefjbhdzhn&password=senha";
        Connection conexao = DriverManager.getConnection(url);
        IO.println("Conexão bem-sucedida!");
        String sql = "DELETE FROM contas WHERE nro_conta = ?";
        PreparedStatement ps;
        ps = conexao.prepareStatement(sql);
        ps.setLong(1, 123);
        int retorno = ps.executeUpdate();
        IO.println("Registros apagados: " + retorno);
  
    }
}
