package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Veiculo;
import util.ConnectionUtil;

public class VeiculoDao {

	private static VeiculoDao instance;
	private List<Veiculo> listaVeiculos = new ArrayList<>();
	private Connection con = ConnectionUtil.getConnection();

	public static VeiculoDao getInstance() {
		if (instance == null) {
			instance = new VeiculoDao();
		}
		return instance;
	}

	public void salvar(Veiculo veiculo) {
		try {
			String sql = "insert into veiculo (id, placa, modelo, ano, consumoKm, veiculoDisponivel) values (?, ?, ?, ?, ?, ?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,  veiculo.getId());
			pstmt.setString(2, veiculo.getPlaca());
			pstmt.setString(3, veiculo.getModelo());
			pstmt.setInt(4, veiculo.getAno());
			pstmt.setDouble(5, veiculo.getConsumoKm());
			pstmt.setString(6, veiculo.getVeiculoDisponivel());
		} catch (SQLException e) {
				e.printStackTrace();
			
		}
	}

	public void atualizar(Veiculo veiculo) {
		try {
			String sql = "update veiculo set placa = ?, modelo = ?, ano = ?, consumoKm = ?, veiculoDisponivel = ? where id = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, veiculo.getPlaca());
			pstmt.setString(2, veiculo.getModelo());
			pstmt.setInt(3, veiculo.getAno());
			pstmt.setDouble(4, veiculo.getConsumoKm());
			pstmt.setString(5, veiculo.getVeiculoDisponivel());
			pstmt.setInt(6, veiculo.getId());
			pstmt.execute();
		} catch (SQLException e) {
				e.printStackTrace();
			
		}
	}

	public void excluir(int idVeiculo) {
		try {
			String sql = "delete from veiculo where id = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, idVeiculo);
			pstmt.execute();
		} catch (SQLException e) {
				e.printStackTrace();
			
		}
	}

	public List<Veiculo> listar(){
		List<Veiculo> listaVeiculos = new ArrayList<>();
		try {
				String sql = "select * from veiculo";
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				while (rs.next()) {
						Veiculo v = new Veiculo();
						v.setId(rs.getInt("id"));
						v.setPlaca(rs.getString("placa"));
						v.setModelo(rs.getString("modelo"));
						v.setAno(rs.getInt("ano"));
						v.setConsumoKm(rs.getFloat("consumoKm"));
						v.setVeiculoDisponivel(rs.getString("veiculo disponível"));
						listaVeiculos.add(v);
				}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaVeiculos;
	}
	

}