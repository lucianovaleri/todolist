package br.com.teste.infra.view.bean;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.com.teste.infra.view.dao.TarefaDAO;
import br.com.teste.infra.view.vo.Config;

@Named
@SessionScoped
public class ConfigBean implements Serializable {
	
private static final long serialVersionUID = -6663659948453061860L;
	
	//O objeto config contem as variaveis de configuracoes do sistema.
	private Config config;
	
	private String skinTheme;
	
	public void setConfiguracoes(){
		
		/* Aqui carregando parametros defalt, a titulo de demonstracao.
		 * Esses dados serao obtidos de um arquivo de configuracoes. */
			
		config = new Config();
		
		/* TIPOS DE MENU: 
		 * - menuBar ----------HORIZONTAL (default)
		 * - tiered ---------— VERTICAL
		 * - slide ----------- VERTICAL
		 * - panelMenu ------- VERTICAL */	
		config.setMenuType("menuBar"); //O menu default eh menuBar (horizontal).	

		//Setando os diversos parametros de skin para o aplicativo.
		config.setSkinAnimatedTop("F"); //..........................Topo default "nao-animado".
		config.setSkinLogo("T"); //.................................Topo - logotipo da empresa.
		config.setSkinTextLogo("TESTE | TODOLIST"); //...............Texto abaixo do logotipo.
		config.setSkinColorTextLogo("d3d3d3"); //...................A cor do texto do logotipo;	
		config.setSkinAnimatedHtml("blankapp_topo_anime.xhtml"); //.O Html5 animado.

		//Isto eh o que serah escrito no rodapeh da pagina.
		config.setSkinFooter("TESTE | TODOLIST");
				
		skinTheme="aristo";	
		config.setSkinTheme("primefaces-" + skinTheme); 
			
	}
	
	/*---------
	 * get/set
	 ---------*/	
	public Config getConfig() {
		if(config == null){
			this.setConfiguracoes();
		}

		return config;
	}
	
	@EJB
	private TarefaDAO livroDao;
	
	public void setConfig(Config config) {
		this.config = config;
	}		

	public String getSkinTheme() {
		return skinTheme;
	}

	public void setSkinTheme(String skinTheme) {
		this.skinTheme = skinTheme;
	}	

}

