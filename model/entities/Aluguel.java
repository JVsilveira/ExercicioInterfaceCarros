package locacaoCarros.model.entities;

import java.time.LocalDateTime;

public class Aluguel {
  private LocalDateTime inicio, fim;

  private Veiculo veiculo;
  private Nota nota;

  public Aluguel() {
  }

  public Aluguel(LocalDateTime inicio, LocalDateTime fim, Veiculo veiculo) {
    this.inicio = inicio;
    this.fim = fim;
    this.veiculo = veiculo;
  }

  public LocalDateTime getInicio() {
    return inicio;
  }

  public void setInicio(LocalDateTime inicio) {
    this.inicio = inicio;
  }

  public LocalDateTime getFim() {
    return fim;
  }

  public void setFim(LocalDateTime fim) {
    this.fim = fim;
  }

  public Veiculo getVeiculo() {
    return veiculo;
  }

  public void setVeiculo(Veiculo veiculo) {
    this.veiculo = veiculo;
  }

  public Nota getNota() {
    return nota;
  }

  public void setNota(Nota nota) {
    this.nota = nota;
  }

}
