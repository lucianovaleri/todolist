package br.com.teste.infra.view.service;

import java.util.List;

import br.com.teste.infra.view.dao.TarefaDAO;
import br.com.teste.infra.view.vo.Tarefa;

public class TarefaService {

	public TarefaDAO tarefaDAO;
	
	private List<Tarefa> listaTarefas;
	private Tarefa tarefa;
	
	
	public List<Tarefa> buscarTarefas(){
		
		//listaTarefas = tarefaDAO.buscarTarefas;
		
		return listaTarefas;
		
	}
	
	public List<Tarefa> getListaTarefas() {
		return listaTarefas;
	}

	public void setListaTarefas(List<Tarefa> listaTarefas) {
		this.listaTarefas = listaTarefas;
	}

	public Tarefa getTarefa() {
		return tarefa;
	}

	public void setTarefa(Tarefa tarefa) {
		this.tarefa = tarefa;
	}
	
	
}
