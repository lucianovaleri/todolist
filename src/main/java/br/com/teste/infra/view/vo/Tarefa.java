package br.com.teste.infra.view.vo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tarefa implements Serializable{
	
	@Id
	private int codTarefa;
	
	private static final long serialVersionUID = 1L;

	private String descTarefa;
	private String respons�vel;
	private String dataEntrega;
	private boolean entregue;
	
	public boolean isEntregue() {
		return entregue;
	}
	public void setEntregue(boolean entregue) {
		this.entregue = entregue;
	}
	public int getCodTarefa() {
		return codTarefa;
	}
	public void setCodTarefa(int codTarefa) {
		this.codTarefa = codTarefa;
	}
	public String getDescTarefa() {
		return descTarefa;
	}
	public void setDescTarefa(String descTarefa) {
		this.descTarefa = descTarefa;
	}
	public String getRespons�vel() {
		return respons�vel;
	}
	public void setRespons�vel(String respons�vel) {
		this.respons�vel = respons�vel;
	}
	public String getDataEntrega() {
		return dataEntrega;
	}
	public void setDataEntrega(String dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
	
	
}
