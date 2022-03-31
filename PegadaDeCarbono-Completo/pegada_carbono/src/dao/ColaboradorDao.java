package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Colaborador;
import util.ConnectionUtil;

public class ColaboradorDao {
	
	private static ColaboradorDao instance;
	private List<Colaborador> listaColaboradores = new ArrayList<>();
	private Connection con = ConnectionUtil.getConnection();
	
	// Singleton
	
	public static ColaboradorDao getInstance(){
		if (instance == null) {
			instance = new ColaboradorDao();
		}
		return instance;
	}
	
	public void salvar(Colaborador colaborador) {
		try {
			String sql = "insert into colaborador (id, nome, endereco, cpf, salario, telefone, cnhb) values (?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, colaborador.getId());
			pstmt.setString(2, colaborador.getNome());
			pstmt.setString(3, colaborador.getEndereco());
			pstmt.setString(4, colaborador.getCpf());
			pstmt.setDouble(5, colaborador.getSalario());
			pstmt.setString(6, colaborador.getTelefone());
			pstmt.setString(7, colaborador.getCnhB());
			pstmt.execute();					
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void atualizar(Colaborador colaborador) {
		try {
			String sql = "update colaborador set nome = ?, endereco= ?, cpf= ?, salario= ?, telefone = ?, cnhb = ? where id = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, colaborador.getNome());
			pstmt.setString(2, colaborador.getEndereco());
			pstmt.setString(3, colaborador.getCpf());
			pstmt.setDouble(4, colaborador.getSalario());
			pstmt.setString(5, colaborador.getTelefone());
			pstmt.setString(6, colaborador.getCnhB());
			pstmt.setInt(7, colaborador.getId());
			pstmt.executeUpdate();					
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void excluir(int idColaborador) {
		try {
			String sql = "delete from colaborador from where id = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, idColaborador);
			pstmt.executeUpdate();					
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<Colaborador> listar(){
		List<Colaborador> listaColaboradores = new ArrayList<>();
		try {
			String sql = "select * from cliente";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Colaborador c = new Colaborador();
				c.setId(rs.getInt("Id"));
				c.setNome(rs.getString("nome"));
				c.setEndereco(rs.getString("endereco"));
				c.setCpf(rs.getString("cpf"));
				c.setSalario(rs.getDouble("salario"));
				c.setTelefone(rs.getString("telefone"));
				c.setCnhB(rs.getString("cnahb"));
				listaColaboradores.add(c);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaColaboradores;
	}
}