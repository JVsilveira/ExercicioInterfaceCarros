package locacaoCarros.model.entities;

public class Nota {
  private Double valor, taxa;

  public Nota() {
  }

  public Nota(Double valor, Double taxa) {
    this.valor = valor;
    this.taxa = taxa;
  }

  public Double getValor() {
    return valor;
  }

  public void setValor(Double valor) {
    this.valor = valor;
  }

  public Double getTaxa() {
    return taxa;
  }

  public void setTaxa(Double taxa) {
    this.taxa = taxa;
  }

  public Double valorTotal() {
    return getValor() + getTaxa();
  }

}
