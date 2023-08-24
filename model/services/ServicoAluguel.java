package locacaoCarros.model.services;

import java.time.Duration;
import locacaoCarros.model.entities.Aluguel;
import locacaoCarros.model.entities.Nota;

public class ServicoAluguel {
  private Double precoDia, precoHora;

  private Taxa taxa;

  public ServicoAluguel(Double precoDia, Double precoHora, Taxa taxa) {
    super();
    this.precoDia = precoDia;
    this.precoHora = precoHora;
    this.taxa = taxa;
  }

  public void calculoAluguel(Aluguel aluguel) {
    double minutos = Duration.between(aluguel.getInicio(), aluguel.getFim()).toMinutes();
    double hora = minutos / 60.0;
    double pagamento;

    if (hora <= 12.0) {
      pagamento = precoHora * Math.ceil(hora);
    } else {
      pagamento = precoDia * Math.ceil(hora / 24);
    }
    double fatura = taxa.taxa(pagamento);

    aluguel.setNota(new Nota(pagamento, fatura));
  }

}
