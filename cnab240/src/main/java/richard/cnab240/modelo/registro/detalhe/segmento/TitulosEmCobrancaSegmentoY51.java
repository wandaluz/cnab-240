package richard.cnab240.modelo.registro.detalhe.segmento;

import richard.cnab240.modelo.enums.TipoRegistro;
import richard.cnab240.modelo.pojo.Controle;
import richard.cnab240.modelo.pojo.NotaFiscal;
import richard.cnab240.modelo.pojo.Servico4;
import richard.cnab240.modelo.registro.detalhe.RegistroDeDetalhe;
import richard.cnab240.util.ArquivoUtils;

public class TitulosEmCobrancaSegmentoY51 extends RegistroDeDetalhe {
	private Controle controle;
	private Servico4 servico;
	private int codigoRegistroOpcional;
	private NotaFiscal[] notasFiscais;
	private String campoExclusivoCNAB;

	public TitulosEmCobrancaSegmentoY51() {
		setControle(new Controle());
		getControle().setTipoRegistro(TipoRegistro.DETALHE);
		setServico(new Servico4());
		getServico().setCodigoSegmento("Y");
		setCodigoRegistroOpcional(51);
		setNotasFiscais(new NotaFiscal[5]);
		setCampoExclusivoCNAB(ArquivoUtils.BRANCO);
	}

	public Controle getControle() {
		return controle;
	}

	public void setControle(Controle controle) {
		this.controle = controle;
	}

	public Servico4 getServico() {
		return servico;
	}

	public void setServico(Servico4 servico) {
		this.servico = servico;
	}

	public int getCodigoRegistroOpcional() {
		return codigoRegistroOpcional;
	}

	public void setCodigoRegistroOpcional(int codigoRegistroOpcional) {
		this.codigoRegistroOpcional = codigoRegistroOpcional;
	}

	public NotaFiscal[] getNotasFiscais() {
		return notasFiscais;
	}

	public void setNotasFiscais(NotaFiscal[] notasFiscais) {
		this.notasFiscais = notasFiscais;
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
		sb.append(ArquivoUtils.getCampoNumerico(getCodigoRegistroOpcional(), 2));
		for(NotaFiscal notaFiscal : notasFiscais){
			sb.append(notaFiscal.toString());
		}
		sb.append(ArquivoUtils.getCampoAlfaNumerico(getCampoExclusivoCNAB(), 31));
		
		return sb.toString();
	}

}