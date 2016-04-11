package pucpr.bsi.prog4.models;

import java.sql.DriverManager;

import javax.management.RuntimeErrorException;

import org.springframework.stereotype.Component;

import com.mysql.jdbc.Connection;

@Component
public class ConexaoBD {
	
	private final static  String CONNECTION_STRING = "jdbc:mysql://localhost/lojajdbc?user=root&password=root";
	
	static{
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		}catch(InstantiationException | IllegalAccessException | ClassNotFoundException e){
			throw new RuntimeException("Nao foi possivel carregar o driver MYSQL" + e.getMessage());
			
		}
	}
	
	public Connection obterConexao(){
		
		try{
			return (Connection) DriverManager.getConnection(CONNECTION_STRING);
		}catch(Exception e){
			throw new RuntimeException("Nao foi possivel conectar com o MYSQL" + e.getMessage());
		}
		
	}

}
