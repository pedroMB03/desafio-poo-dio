package br.com.dio.desafio.dominio;

public class Bootcamp {

    private String nome;
    private String descricao;
    private final LocalDate dataInicio = LocalDate.now();
    private final LocalDate dataFim = dataInicio.plusMonths(3);
    private Set<Conteudo> conteudos = new LinkedHashSet<>();
    private Set<Dev> devsInscritos = new LinkedHashSet<>();

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public LocalDate getDataInicio() { return dataInicio; }
    public LocalDate getDataFim() { return dataFim; }

    public Set<Conteudo> getConteudos() { return conteudos; }
    public void setConteudos(Set<Conteudo> conteudos) { this.conteudos = conteudos; }

    public Set<Dev> getDevsInscritos() { return devsInscritos; }
    public void setDevsInscritos(Set<Dev> devsInscritos) { this.devsInscritos = devsInscritos; }

    @Override
    public String toString() {
        return "Bootcamp{nome='" + nome + "', dataInicio=" + dataInicio + ", dataFim=" + dataFim + "}";
    }
}