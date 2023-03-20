package br.com.teste.infra.view.bean;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.com.teste.infra.view.dao.TarefaDAO;
import br.com.teste.infra.view.vo.Tarefa;

@Named
@SessionScoped
public class TarefaBean implements Serializable {

	private static final long serialVersionUID = 527125928222917084L;

	@EJB
	private TarefaDAO dao;
	
	private List<Tarefa> tarefas;
    
    private Tarefa tarefa;

    public void salvar() {
    	dao.Salvar(tarefa);
    }

	public List<Tarefa> getTarefas() {
		tarefas = dao.listarTodos();
		return tarefas;
	}

	public void setTarefas(List<Tarefa> tarefas) {
		this.tarefas = tarefas;
	}

	public Tarefa getTarefa() {
		return tarefa;
	}

	public void setTarefa(Tarefa tarefa) {
		this.tarefa = tarefa;
	}
    
    
    
}
	

