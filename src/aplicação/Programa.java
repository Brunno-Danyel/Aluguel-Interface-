package aplicação;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.AluguelCarro;
import model.entities.Veiculo;
import model.services.ServicoAluguel;
import model.services.TaxaBrasil;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

		System.out.println("Insira os dados do aluguel: ");
		System.out.printf("Informe o modelo do carro: ");
		String modelo = sc.nextLine();
		System.out.println("Retirada do veiculo (dd/MM/yyyy HH:mm): ");
		Date entrada = sdf.parse(sc.nextLine());
		System.out.println("Entrega do veiculo (dd/MM/yyyy HH:mm)");
		Date saida = sdf.parse(sc.nextLine());

		AluguelCarro car_aluguel = new AluguelCarro(entrada, saida, new Veiculo(modelo));

		System.out.printf("Informe o preço por hora: R$");
		double preco_hora = sc.nextDouble();
		System.out.printf("Informe o preço por dia: R$");
		double preco_dia = sc.nextDouble();

		ServicoAluguel aluguel = new ServicoAluguel(preco_hora, preco_dia, new TaxaBrasil());

		aluguel.processoFatura(car_aluguel);

		System.out.println("FATURA!");
		System.out.println("Pagamento Basico: " + String.format("%.2f", car_aluguel.getFatura().getPagamento_basico()));
		System.out.println("Taxa: " + String.format("%.2f", car_aluguel.getFatura().getImposto()));
		System.out.println("Pagamento Total: " + String.format("%.2f", car_aluguel.getFatura().getTotalPagamento()));
		

		sc.close();
	}

}
