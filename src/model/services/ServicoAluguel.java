package model.services;

import model.entities.AluguelCarro;
import model.entities.Fatura;

public class ServicoAluguel {
 
	private Double preco_hora;
	private Double preco_dia;
	
	private TaxaServico taxa_servico;
	
	

	public ServicoAluguel(Double preco_hora, Double preco_dia, TaxaServico taxa_servico) {
		
		this.preco_hora = preco_hora;
		this.preco_dia = preco_dia;
		this.taxa_servico = taxa_servico;
	}
	
	public void processoFatura(AluguelCarro aluguel_carro) {
		long t1 = aluguel_carro.getEntrada().getTime();
		long t2 = aluguel_carro.getSaida().getTime();
	    double hora = (double) (t2 -t1) / 100 / 60 / 60;
	    
	    double pagamento_basico;
	    if(hora <= 12.0) {
	    	pagamento_basico = preco_hora * Math.ceil(hora);
	    }
	    else {
	    	pagamento_basico = preco_dia * Math.ceil(hora /24);
	    }
	    
	    double tax = taxa_servico.tax(pagamento_basico);
	    
	    
	    aluguel_carro.setFatura(new Fatura(pagamento_basico, tax));
	}

	
	
	
	
	
}
