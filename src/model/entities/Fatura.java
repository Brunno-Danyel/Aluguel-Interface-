package model.entities;

public class Fatura {

	private Double pagamento_basico;
	private Double imposto;
	
	public Fatura() {
		
	}

	public Fatura(Double pagamento_basico, Double imposto) {
		
		this.pagamento_basico = pagamento_basico;
		this.imposto = imposto;
	}

	public Double getPagamento_basico() {
		return pagamento_basico;
	}

	public void setPagamento_basico(Double pagamento_basico) {
		this.pagamento_basico = pagamento_basico;
	}

	public Double getImposto() {
		return imposto;
	}

	public void setImposto(Double imposto) {
		this.imposto = imposto;
	}
	
	public Double getTotalPagamento() {
		return getPagamento_basico() + getImposto();
	}
	
}
