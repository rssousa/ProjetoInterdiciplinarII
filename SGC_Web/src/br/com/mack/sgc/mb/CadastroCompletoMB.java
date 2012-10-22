package br.com.mack.sgc.mb;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//import br.com.mack.sgc.entidade.Curriculo;
//import br.com.mack.sgc.entidade.DadosPessoais;
import br.com.mack.sgc.entidade.Dicionario;
//import br.com.mack.sgc.entidade.Endereco;
//import br.com.mack.sgc.entidade.Escolaridade;
//import br.com.mack.sgc.entidade.Qualificacao;
//import br.com.mack.sgc.entidade.Usuario;
//import br.com.mack.sgc.manager.Manager;
//import br.com.mack.sgc.repositorio.CurriculoRepository;
//import br.com.mack.sgc.repositorio.DicionarioRepository;
//import br.com.mack.sgc.view.AreaInteresseLinhaView;
//import br.com.mack.sgc.view.EnderecoLinhaView;
//import br.com.mack.sgc.view.FormacaoAcademicaLinhaView;
import br.com.mack.sgc.repository.IDicionarioRepository;
import br.com.mack.sgc.view.CadastroCompletoView;
//import br.com.mack.sgc.view.QualificacaoLinhaView;

@ManagedBean
@ViewScoped
public class CadastroCompletoMB {

	private CadastroCompletoView cadastroCurriculo;

//	private List<FormacaoAcademicaLinhaView> escolaridades;
//	private List<QualificacaoLinhaView> qualificacoes;	
//	private List<AreaInteresseLinhaView> interesses;
	
	private List<Dicionario> comboUf;
	private List<Dicionario> comboAreaInterresses;	
	private List<Dicionario> comboQualificacao;
	private List<Dicionario> comboIntituicoes;

	@EJB
	private IDicionarioRepository dicionarioRepository;
	

	public CadastroCompletoMB() {
		super();

		
		cadastroCurriculo = new CadastroCompletoView();
		
//		escolaridades = new ArrayList<FormacaoAcademicaLinhaView>();
//		qualificacoes = new ArrayList<QualificacaoLinhaView>();		
//		interesses = new ArrayList<AreaInteresseLinhaView>();
		
	
	}
	
	@SuppressWarnings("unused")
	@PostConstruct
	private void carregarCombos(){
		
		comboUf = dicionarioRepository.buscaPorDescricacao("UF");		
		comboAreaInterresses = dicionarioRepository.buscaPorDescricacao("AREA_INTERESSE");		
		comboQualificacao =dicionarioRepository.buscaPorDescricacao("QUALIFICACAO");
		comboIntituicoes = dicionarioRepository.buscaPorDescricacao("INSTITUICAO");
	}

	
	
	
	
	public String cadastrarFormacoes() {
		comboUf = dicionarioRepository.buscaPorDescricacao("UF");
		
		
//		FormacaoAcademicaLinhaView formacaoLinhaView = new FormacaoAcademicaLinhaView();
//
//		formacaoLinhaView.setNivel(cadastroCurriculo.getNivel());
//		formacaoLinhaView.setInstituicao(cadastroCurriculo.getInstituicao());
//		formacaoLinhaView.setCurso(cadastroCurriculo.getCurso());
//		formacaoLinhaView.setDtInicio(cadastroCurriculo.getInicio());
//		formacaoLinhaView.setDtFim(cadastroCurriculo.getFim());
//
//		escolaridades.add(formacaoLinhaView);

		return null;
	}

	public String cadastrarAreaDeInteresse() {

//		AreaInteresseLinhaView areaInteresseView = new AreaInteresseLinhaView();
//		
//		areaInteresseView.setAreaInteresse(cadastroCurriculo.getDsAreaDeInteresse());
//		
//		interesses.add(areaInteresseView);
		
		return null;
	}

	public String cadastrarQualificacao() {

//		QualificacaoLinhaView qualificacaoLinhaView = new QualificacaoLinhaView();
//
//		qualificacaoLinhaView.setDsQualificacao(cadastroCurriculo.getDsQualificacao());
//		qualificacaoLinhaView.setNivelQualificacao(cadastroCurriculo.getNivelQualificacao());
//
//		qualificacoes.add(qualificacaoLinhaView);

		return null;
	}

	public String cadastrar() {
		

//        EntityManager manager = Manager.createManager();
//		
//		CurriculoRepository curriculoRepository = new CurriculoRepository(Manager.createManager());
//		
//		DicionarioRepository dicionarioRepository = new DicionarioRepository(manager);
//		
//		Curriculo curriculo = new Curriculo();
//
//		DadosPessoais dadosPessoais = new DadosPessoais();
//		
//		dadosPessoais.setNmCandidato(cadastroCurriculo.getNome());
//		dadosPessoais.setDtNascimento(cadastroCurriculo.getDtNascimento());
//		dadosPessoais.setDsEstadoCivil(cadastroCurriculo.getEstadoCivil());
//		dadosPessoais.setVrEmail(cadastroCurriculo.geteMail());
//		dadosPessoais.setVrTelefone1(cadastroCurriculo.getTelefoneResidencial());
//		dadosPessoais.setVrTelefone2(cadastroCurriculo.getTelefoneAlternativo());
//		dadosPessoais.setVrCelular(cadastroCurriculo.getCelular());
//		dadosPessoais.setVrCPF(cadastroCurriculo.getCpf());
//		
//		Endereco endereco = new Endereco();
//		
//		endereco.setDsLogradouro(cadastroCurriculo.getLogradouro());
//		endereco.setDsBairro(cadastroCurriculo.getBairro());
//		endereco.setUF(manager.find(Dicionario.class, 8L));
//		endereco.setDsCidade(cadastroCurriculo.getCidade());
//		endereco.setVrCEP(cadastroCurriculo.getCep());
//		
//		Escolaridade escolaridade = null;
//		
//		for(FormacaoAcademicaLinhaView escolaridadeLinhaView:escolaridades){
//			
//			escolaridade = new Escolaridade();
//			
//			escolaridade.setTipoCurso(manager.find(Dicionario.class,7L));
//			escolaridade.setInstituicao(manager.find(Dicionario.class,18L));
//			escolaridade.setNmCurso(cadastroCurriculo.getCurso());
//			escolaridade.setDtInicio(escolaridadeLinhaView.getDtInicio());
//			escolaridade.setDtFim(escolaridadeLinhaView.getDtFim());
//			
//			curriculo.getEscolaridades().add(escolaridade);
//		}
//		
//		
//		for(AreaInteresseLinhaView areaInteresseLinhaView:interesses){
//			
//			curriculo.getInteresses().add(manager.find(Dicionario.class,1L));
//		}
//		
//		Qualificacao qualificacao = null;
//		
//		for(QualificacaoLinhaView qualificacaoLinhaView:qualificacoes){
//			
//			qualificacao = new Qualificacao();
//			qualificacao.setConhecimento(manager.find(Dicionario.class, 12L));
//			qualificacao.setDsNivel(qualificacaoLinhaView.getNivelQualificacao());
//			
//			curriculo.getQualificacoes().add(qualificacao);
//		}
//		
//		curriculo.setDadosPessoais(dadosPessoais);
//		curriculo.setEndereco(endereco);
//		
//		curriculoRepository.inserir(curriculo);
//				
//        
//		
//		manager.getTransaction().begin();
//		manager.getTransaction().commit();
		
		return null;
	}

	public CadastroCompletoView getCadastroCurriculo() {
		return cadastroCurriculo;
	}

	public void setCadastroCurriculo(CadastroCompletoView cadastroCurriculo) {
		this.cadastroCurriculo = cadastroCurriculo;
	}

//	public List<FormacaoAcademicaLinhaView> getEscolaridades() {
//		return escolaridades;
//	}
//
//	public void setEscolaridades(List<FormacaoAcademicaLinhaView> escolaridades) {
//		this.escolaridades = escolaridades;
//	}
//
//	public List<QualificacaoLinhaView> getQualificacoes() {
//		return qualificacoes;
//	}
//
//	public void setQualificacoes(List<QualificacaoLinhaView> qualificacoes) {
//		this.qualificacoes = qualificacoes;
//	}

//	public List<EnderecoLinhaView> getEnderecos() {
//		return enderecos;
//	}
//
//	public void setEnderecos(List<EnderecoLinhaView> enderecos) {
//		this.enderecos = enderecos;
//	}

//	public List<AreaInteresseLinhaView> getInteresses() {
//		return interesses;
//	}

	public List<Dicionario> getComboUf() {
		return comboUf;
	}

	public void setComboUf(List<Dicionario> comboUf) {
		this.comboUf = comboUf;
	}

//	public void setInteresses(List<AreaInteresseLinhaView> interesses) {
//		this.interesses = interesses;
//	}

	public List<Dicionario> getComboAreaInterresses() {
		return comboAreaInterresses;
	}

	public void setComboAreaInterresses(List<Dicionario> comboAreaInterresses) {
		this.comboAreaInterresses = comboAreaInterresses;
	}

	public List<Dicionario> getComboQualificacao() {
		return comboQualificacao;
	}

	public void setComboQualificacao(List<Dicionario> comboQualificacao) {
		this.comboQualificacao = comboQualificacao;
	}

	public List<Dicionario> getComboIntituicoes() {
		return comboIntituicoes;
	}

	public void setComboIntituicoes(List<Dicionario> comboIntituicoes) {
		this.comboIntituicoes = comboIntituicoes;
	}

	

}
