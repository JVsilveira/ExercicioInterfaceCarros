package locacaoCarros.app;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import locacaoCarros.model.entities.Aluguel;
import locacaoCarros.model.entities.Veiculo;
import locacaoCarros.model.services.ServicoAluguel;
import locacaoCarros.model.services.TaxacaoBrasil;

public class Programa {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    System.out.println("Dados do aluguel: ");
    System.out.print("Qual é o modelo do carro? ");
    String veiculo = sc.nextLine();
    System.out.print("Retirada (dd/mm/aaaa hh:mm): ");
    LocalDateTime inicio = LocalDateTime.parse(sc.nextLine(), dtf);
    System.out.print("Retorno (dd/mm/aaaa hh:mm): ");
    LocalDateTime fim = LocalDateTime.parse(sc.nextLine(), dtf);

    Aluguel aluguel = new Aluguel(inicio, fim, new Veiculo(veiculo));

    System.out.print("Qual é o preço da hora? ");
    double precoHora = sc.nextDouble();
    System.out.print("Qual é o preço por dia? ");
    double precoDia = sc.nextDouble();

    ServicoAluguel servicoAluguel = new ServicoAluguel(precoDia, precoHora, new TaxacaoBrasil());

    servicoAluguel.calculoAluguel(aluguel);

    System.out.println("Fatura: ");
    System.out.println("Valor inicial: " + aluguel.getNota().getValor());
    System.out.println("Valor taxa: " + aluguel.getNota().getTaxa());
    System.out.println("Valor total: " + aluguel.getNota().valorTotal());

    sc.close();

  }
}
