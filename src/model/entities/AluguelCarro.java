package model.entities;

import java.util.Date;

public class AluguelCarro {
    
	private Date entrada;
	private Date saida;
	
	private Veiculo veiculo;
	private Fatura fatura;
	
	public AluguelCarro() {
		
	}
	
	public AluguelCarro(Date entrada, Date saida, Veiculo veiculo) {
		
		this.entrada = entrada;
		this.saida = saida;
		this.veiculo = veiculo;
	}

	public Date getEntrada() {
		return entrada;
	}

	public void setEntrada(Date entrada) {
		this.entrada = entrada;
	}

	public Date getSaida() {
		return saida;
	}

	public void setSaida(Date saida) {
		this.saida = saida;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Fatura getFatura() {
		return fatura;
	}

	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}
	
	
	
}
