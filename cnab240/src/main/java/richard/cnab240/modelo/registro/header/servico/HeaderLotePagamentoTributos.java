package richard.cnab240.modelo.registro.header.servico;

import richard.cnab240.modelo.enums.TipoOperacao;
import richard.cnab240.modelo.enums.TipoRegistro;
import richard.cnab240.modelo.pojo.Controle;
import richard.cnab240.modelo.pojo.Empresa;
import richard.cnab240.modelo.pojo.Endereco;
import richard.cnab240.modelo.pojo.Servico2;
import richard.cnab240.modelo.registro.header.HeaderLote;
import richard.cnab240.util.ArquivoUtils;

public class HeaderLotePagamentoTributos extends HeaderLote {
	private Controle controle;
	private Servico2 servico;
	private String campoExclusivoCNAB1;
	/*--------------------------------*/
	private Empresa empresa;
	private String informacao1;
	/*--------------------------------*/
	private Endereco enderecoEmpresa;
	private int indicativoDeFormaDePagamento;
	private String campoExclusivoCNAB2;
	private String ocorrencias;

	public HeaderLotePagamentoTributos(){
		setControle(new Controle());
		getControle().setTipoRegistro(TipoRegistro.HEADER_DE_LOTE);
		setServico(new Servico2());
		getServico().setNumeroVersaoLayoutLote(11);
		getServico().setTipoOperacao(TipoOperacao.LANCAMENTO_A_CREDITO);
		setCampoExclusivoCNAB1(ArquivoUtils.BRANCO);
		setEmpresa(new Empresa());
		setInformacao1(ArquivoUtils.BRANCO);
		setEnderecoEmpresa(new Endereco());
		setIndicativoDeFormaDePagamento(0);
		setCampoExclusivoCNAB2(ArquivoUtils.BRANCO);
		setOcorrencias(ArquivoUtils.BRANCO);
	}
	
	public Controle getControle() {
		return controle;
	}

	public void setControle(Controle controle) {
		this.controle = controle;
	}

	public Servico2 getServico() {
		return servico;
	}

	public void setServico(Servico2 servico) {
		this.servico = servico;
	}

	public String getCampoExclusivoCNAB1() {
		return campoExclusivoCNAB1;
	}

	public void setCampoExclusivoCNAB1(String campoExclusivoCNAB1) {
		this.campoExclusivoCNAB1 = campoExclusivoCNAB1;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public String getInformacao1() {
		return informacao1;
	}

	public void setInformacao1(String informacao1) {
		this.informacao1 = informacao1;
	}

	public Endereco getEnderecoEmpresa() {
		return enderecoEmpresa;
	}

	public void setEnderecoEmpresa(Endereco enderecoEmpresa) {
		this.enderecoEmpresa = enderecoEmpresa;
	}

	public int getIndicativoDeFormaDePagamento() {
		return indicativoDeFormaDePagamento;
	}

	public void setIndicativoDeFormaDePagamento(int indicativoDeFormaDePagamento) {
		this.indicativoDeFormaDePagamento = indicativoDeFormaDePagamento;
	}

	public String getCampoExclusivoCNAB2() {
		return campoExclusivoCNAB2;
	}

	public void setCampoExclusivoCNAB2(String campoExclusivoCNAB2) {
		this.campoExclusivoCNAB2 = campoExclusivoCNAB2;
	}

	public String getOcorrencias() {
		return ocorrencias;
	}

	public void setOcorrencias(String ocorrencias) {
		this.ocorrencias = ocorrencias;
	}

	@Override
	public String getConteudoRegistro() {
		StringBuilder sb = new StringBuilder(TAMANHO_REGISTRO);
		sb.append(getControle().toString());
		sb.append(getServico().toString());
		sb.append(ArquivoUtils.getCampoAlfaNumerico(getCampoExclusivoCNAB1(), 1));
		sb.append(getEmpresa().toString());
		sb.append(ArquivoUtils.getCampoAlfaNumerico(getInformacao1(), 40));
		sb.append(getEnderecoEmpresa().toString());
		sb.append(ArquivoUtils.getCampoNumerico(getIndicativoDeFormaDePagamento(), 2));
		
		return sb.toString();
	}

}