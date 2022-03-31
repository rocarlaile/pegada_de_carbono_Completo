package controller;

import dao.ChamadoDao;
import model.Chamado;

public class ChamadoController {

	public void registrarChamado(Chamado chamado) throws Exception {
		if (chamado.getDataChamado() == null) {
			throw new Exception("Data Inv�lida!");
		}
		if (chamado.getMotorista().getNome() == null) {
			throw new Exception("Colaborador Inv�lido!");
		}
		ChamadoDao.getInstance().registrarChamado(chamado);
	}
}