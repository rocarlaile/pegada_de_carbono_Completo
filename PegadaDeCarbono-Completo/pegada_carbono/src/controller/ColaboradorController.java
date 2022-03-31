package controller;

import java.util.List;

import dao.ColaboradorDao;
import model.Colaborador;

public class ColaboradorController {
		
		public void salvar(Colaborador colaborador) throws Exception {
			if(colaborador.getNome() == null || colaborador.getNome().length() <= 3) {
				throw new Exception("Nome inv�lido!");
			}
			ColaboradorDao.getInstance().salvar(colaborador);
		}
		
		public void atualizar(Colaborador colaborador) throws Exception {
			if(colaborador.getNome() == null || colaborador.getNome().length() <= 3) {
				throw new Exception("Nome inv�lido!");
			}
			ColaboradorDao.getInstance().atualizar(colaborador);
		}
		
		public void excluir(int idColaborador) throws Exception {
			if(idColaborador == 0) {
				throw new Exception("Nenhum colaborador foi selecionado. Por favor, digitar um id v�lido!");
			}
			ColaboradorDao.getInstance().excluir(idColaborador);
		}
		
		public List<Colaborador> listar(){
			return ColaboradorDao.getInstance().listar();
		}
}

