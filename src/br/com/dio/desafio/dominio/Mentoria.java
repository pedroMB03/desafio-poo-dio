package br.com.dio.desafio.dominio;
import java.time.LocalDate;

// HERANÇA: Mentoria herda de Conteudo
public class Mentoria extends Conteudo {

    private LocalDate data;

    // POLIMORFISMO: sobrescreve calcularXp com regra específica da Mentoria
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }

    @Override
    public String toString() {
        return "Mentoria{" + super.toString() + ", data=" + data + "}";
    }
}