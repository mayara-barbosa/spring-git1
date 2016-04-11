package pucpr.bsi.prog4.models;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

@Repository
public class JDBCClienteRepository implements ClienteRepository {
	
	@Autowired
	private ConexaoBD conexaoBd;

	@Override
	public void inserir(Cliente cliente) {
		Connection conn;
		conn = conexaoBd.obterConexao();
		
		String sql = "INSERT INTO clientes " +
					 "(Nome, CPF, DataNascimento," +
					 "Sexo, Senha, Ofertas)" +
					 "VALUES (?,?,?,?,PASSWORD(?),?)";
		
		PreparedStatement ps;
		
		try{
			ps = (PreparedStatement) conn.prepareStatement(sql);
			ps.setString(1, cliente.getNome());
			ps.setLong(2, cliente.getCpf());
			ps.setDate(3, new java.sql.Date(cliente.getDataNascimento().getTime()));
			ps.setString(4, cliente.getSexo());
			ps.setString(5, cliente.getSenha());
			ps.setBoolean(6, cliente.getReceberOfertaPorEmail());
			ps.executeUpdate();
			
						
		 }catch(SQLException e){
			 throw new RuntimeException("Erro ao cadastrar cliente" 
					 					+ e.getMessage());
			
		}
		
		
	}
	

}
