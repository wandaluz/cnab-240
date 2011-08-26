package richard.cnab240.modelo.pojo;

import java.util.Date;

import richard.cnab240.util.ArquivoUtils;

public class Debito {
	private static final int TAMANHO_DEBITO = 83;
	private Date dataVencimento;
	private Double valorDocumento;
	private Double valorAbatimento;
	private Double valorDesconto;
	private Double valorMora;
	private Double valorMulta;
	
	public Debito() {
		// TODO Auto-generated constructor stub
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Double getValorDocumento() {
		return valorDocumento;
	}

	public void setValorDocumento(Double valorDocumento) {
		this.valorDocumento = valorDocumento;
	}

	public Double getValorAbatimento() {
		return valorAbatimento;
	}

	public void setValorAbatimento(Double valorAbatimento) {
		this.valorAbatimento = valorAbatimento;
	}

	public Double getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(Double valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public Double getValorMora() {
		return valorMora;
	}

	public void setValorMora(Double valorMora) {
		this.valorMora = valorMora;
	}

	public Double getValorMulta() {
		return valorMulta;
	}

	public void setValorMulta(Double valorMulta) {
		this.valorMulta = valorMulta;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(TAMANHO_DEBITO);
		sb.append(ArquivoUtils.getCampoDataFormatada(getDataVencimento()));
		sb.append(ArquivoUtils.getCampoDecimal(getValorDocumento(), 13, 2));
		sb.append(ArquivoUtils.getCampoDecimal(getValorAbatimento(), 13, 2));
		sb.append(ArquivoUtils.getCampoDecimal(getValorDesconto(), 13, 2));
		sb.append(ArquivoUtils.getCampoDecimal(getValorMora(), 13, 2));
		sb.append(ArquivoUtils.getCampoDecimal(getValorMulta(), 13, 2));
		
		return sb.toString();
	}
}
