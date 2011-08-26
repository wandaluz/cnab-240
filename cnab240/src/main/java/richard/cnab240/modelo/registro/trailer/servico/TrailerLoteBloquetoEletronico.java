package richard.cnab240.modelo.registro.trailer.servico;

import richard.cnab240.modelo.enums.TipoRegistro;
import richard.cnab240.modelo.pojo.Controle;
import richard.cnab240.modelo.pojo.Totais2;
import richard.cnab240.modelo.registro.trailer.TrailerLote;
import richard.cnab240.util.ArquivoUtils;

public class TrailerLoteBloquetoEletronico extends TrailerLote {
	private Controle controle;
	private String campoExclusivoCNAB1;
	private Totais2 totais;
	private String campoExclusivoCNAB2;

	public TrailerLoteBloquetoEletronico() {
		setControle(new Controle());
		getControle().setTipoRegistro(TipoRegistro.TRAILER_DE_LOTE);
		setCampoExclusivoCNAB1(ArquivoUtils.BRANCO);
		setTotais(new Totais2());
		setCampoExclusivoCNAB2(ArquivoUtils.BRANCO);
	}

	public Controle getControle() {
		return controle;
	}

	public void setControle(Controle controle) {
		this.controle = controle;
	}

	public String getCampoExclusivoCNAB1() {
		return campoExclusivoCNAB1;
	}

	public void setCampoExclusivoCNAB1(String campoExclusivoCNAB1) {
		this.campoExclusivoCNAB1 = campoExclusivoCNAB1;
	}

	public Totais2 getTotais() {
		return totais;
	}

	public void setTotais(Totais2 totais) {
		this.totais = totais;
	}

	public String getCampoExclusivoCNAB2() {
		return campoExclusivoCNAB2;
	}

	public void setCampoExclusivoCNAB2(String campoExclusivoCNAB2) {
		this.campoExclusivoCNAB2 = campoExclusivoCNAB2;
	}

	@Override
	public String getConteudoRegistro() {
		StringBuilder sb = new StringBuilder(TAMANHO_REGISTRO);
		sb.append(getControle().toString());
		sb.append(ArquivoUtils.getCampoAlfaNumerico(getCampoExclusivoCNAB1(), 9));
		sb.append(getTotais().toString());
		sb.append(ArquivoUtils.getCampoAlfaNumerico(getCampoExclusivoCNAB2(), 181));
		
		return sb.toString();
	}

}
