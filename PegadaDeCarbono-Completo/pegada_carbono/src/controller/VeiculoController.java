package controller;

import java.util.List;

import dao.VeiculoDao;
import model.Veiculo;

public class VeiculoController {

	public void salvar(Veiculo veiculo) throws Exception {
		if (veiculo.getPlaca() == null || veiculo.getPlaca().length() != 7 ) {
			throw new Exception("Descri��o da placa do ve�culo inv�lida. Por favor, digite uma placa v�lida!");
		}
		VeiculoDao.getInstance().salvar(veiculo);
	}

	public void atualizar(Veiculo veiculo) throws Exception {
		if (veiculo.getPlaca() == null || veiculo.getPlaca().length() != 7 ) {
			throw new Exception("Descri��o da placa do ve�culo inv�lida. Por favor, digite uma placa v�lida!");
		}
		VeiculoDao.getInstance().atualizar(veiculo);
	}

	public void excluir(int idVeiculo) throws Exception {
		if (idVeiculo == 0) {
			throw new Exception("Nenhum ve�culo foi selecionado.");
		}
		VeiculoDao.getInstance().excluir(idVeiculo);
	}

	public List<Veiculo> listar(){
		return VeiculoDao.getInstance().listar();
	}

}
