package richard.cnab240.modelo.registro.detalhe.segmento;

import richard.cnab240.modelo.enums.TipoRegistro;
import richard.cnab240.modelo.pojo.Controle;
import richard.cnab240.modelo.pojo.DadosDoSacado;
import richard.cnab240.modelo.pojo.Servico6;
import richard.cnab240.modelo.registro.detalhe.RegistroDeDetalhe;
import richard.cnab240.util.ArquivoUtils;

public class BloquetoEletronicoSegmentoY03 extends RegistroDeDetalhe {
	private Controle controle;
	private Servico6 servico;
	private int codigoMovimento;
	private int codigoRegistroOpcional;
	private DadosDoSacado sacado;
	private String campoExclusivoCNAB;

	public BloquetoEletronicoSegmentoY03() {
		setControle(new Controle());
		getControle().setTipoRegistro(TipoRegistro.DETALHE);
		setServico(new Servico6());
		getServico().setCodigoSegmento("Y");
		setCodigoMovimento(1);
		setCodigoRegistroOpcional(3);
	}
	
	public Controle getControle() {
		return controle;
	}

	public void setControle(Controle controle) {
		this.controle = controle;
	}

	public Servico6 getServico() {
		return servico;
	}

	public void setServico(Servico6 servico) {
		this.servico = servico;
	}

	public int getCodigoMovimento() {
		return codigoMovimento;
	}

	public void setCodigoMovimento(int codigoMovimento) {
		this.codigoMovimento = codigoMovimento;
	}

	public int getCodigoRegistroOpcional() {
		return codigoRegistroOpcional;
	}

	public void setCodigoRegistroOpcional(int codigoRegistroOpcional) {
		this.codigoRegistroOpcional = codigoRegistroOpcional;
	}

	public DadosDoSacado getSacado() {
		return sacado;
	}

	public void setSacado(DadosDoSacado sacado) {
		this.sacado = sacado;
	}

	public String getCampoExclusivoCNAB() {
		return campoExclusivoCNAB;
	}
	
	public void setCampoExclusivoCNAB(String campoExclusivoCNAB) {
		this.campoExclusivoCNAB = campoExclusivoCNAB;
	}

	@Override
	public String getConteudoRegistro() {
		StringBuilder sb = new StringBuilder(TAMANHO_REGISTRO);
		sb.append(getControle().toString());
		sb.append(getServico().toString());
		sb.append(ArquivoUtils.getCampoNumerico(getCodigoMovimento(), 2));
		sb.append(ArquivoUtils.getCampoNumerico(getCodigoRegistroOpcional(), 2));
		sb.append(getSacado().toString());
		sb.append(ArquivoUtils.getCampoAlfaNumerico(getCampoExclusivoCNAB(), 85));
		
		return sb.toString();
	}


}
