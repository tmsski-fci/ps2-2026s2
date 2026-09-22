import java.sql.*;

public class AppRead {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:postgresql://aws-0-sa-east-1.pooler.supabase.com:5432/postgres?user=postgres.ldjlyxztgvlefjbhdzhn&password=senha";
        Connection conexao = DriverManager.getConnection(url);
        IO.println("Conexão bem-sucedida!");
        String sql = "SELECT * FROM contas";
        PreparedStatement ps;
        ps = conexao.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            long nroConta = rs.getLong("nro_conta");
            double saldo = rs.getDouble("saldo");
            IO.println("Conta " + nroConta + " tem R$ " + saldo);
        }
  
    }
}
