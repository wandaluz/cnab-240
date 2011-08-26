package richard.cnab240.modelo.pojo;

import richard.cnab240.util.ArquivoUtils;

public class DadosDoSacado {
	private static final int TAMANHO_DADOS_SACADO = 136;
	private Inscricao2 inscricao;
	private String nome;
	private String endereco;
	private String bairro;
	private String cep;
	private String sufixoCEP;
	private String cidade;
	private String uf;

	public Inscricao2 getInscricao() {
		return inscricao;
	}

	public void setInscricao(Inscricao2 inscricao) {
		this.inscricao = inscricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getSufixoCEP() {
		return sufixoCEP;
	}

	public void setSufixoCEP(String sufixoCEP) {
		this.sufixoCEP = sufixoCEP;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(TAMANHO_DADOS_SACADO);
		sb.append(getInscricao().toString());
		sb.append(ArquivoUtils.getCampoAlfaNumerico(getNome(), 40));
		sb.append(ArquivoUtils.getCampoAlfaNumerico(getEndereco(), 40));
		sb.append(ArquivoUtils.getCampoAlfaNumerico(getBairro(), 15));
		sb.append(ArquivoUtils.getCampoNumerico(getCep(), 5));
		sb.append(ArquivoUtils.getCampoNumerico(getSufixoCEP(), 3));
		sb.append(ArquivoUtils.getCampoAlfaNumerico(getCidade(), 15));
		sb.append(ArquivoUtils.getCampoAlfaNumerico(getUf(), 2));
		
		return sb.toString();
	}
}
