package prova1.classes;


public class Torneio {
    private String nome;
    private String local;
    private String descricao;
    private Double valorPremio;
    private int numeroPatrocinadores;
    private int numeroParticipantes;
    private Double valorTaxa = 0.0;
    private String abertura;
    private String encerramento;
    private boolean abertoInscricao = false;

    public Torneio(String nome, String local, String descricao, int numeroPatrocinadores){
        this.nome = nome;
        this.local = local;
        this.descricao = descricao;
        this.numeroPatrocinadores = numeroPatrocinadores;
        System.out.println("Torneio criado!");
    }

    public void AbrirInscricao(String abertura, String encerramento, Double valortaxa){
        this.abertura = abertura;
        this.encerramento = encerramento;
        this.valorTaxa = valortaxa;
        setAbertoInscricao(true);
        System.out.println("\nInscrições abertas na data: "+ abertura +"\nValor de entrada: "+ valorTaxa +" moedas intergalacticas\nData de encerramento das inscrições: "+ encerramento+".");
    }

    public void FecharInscricao(int numeroInscritos){
        if(abertoInscricao == true){
            this.numeroParticipantes = numeroInscritos;
            CalculoPremio();
            System.out.println("\nInscrições encerradas!\nSerão "+ numeroInscritos +" Competidores e o premio será de "+ valorPremio +" moedas intergalacticas!");
            setAbertoInscricao(false);
        }
        else{
            System.out.println("\nAs inscrições não foram abertas, realize a abertura para depois realizar o fechamento.");
        }
    }

    private void CalculoPremio(){
        this.valorPremio = (valorTaxa*numeroParticipantes*10)+(numeroPatrocinadores*1000);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValorPremio() {
        return valorPremio;
    }

    public void setValorPremio(Double valorPremio) {
        this.valorPremio = valorPremio;
    }

    public int getNumeroPatrocinadores() {
        return numeroPatrocinadores;
    }

    public void setNumeroPatrocinadores(int numeroPatrocinadores) {
        this.numeroPatrocinadores = numeroPatrocinadores;
    }

    public int getNumeroParticipantes() {
        return numeroParticipantes;
    }

    public void setNumeroParticipantes(int numeroParticipantes) {
        this.numeroParticipantes = numeroParticipantes;
    }

    public Double getValorTaxa() {
        return valorTaxa;
    }

    public void setValorTaxa(Double valorTaxa) {
        this.valorTaxa = valorTaxa;
    }

    public String getAbertura() {
        return abertura;
    }

    public void setAbertura(String abertura) {
        this.abertura = abertura;
    }

    public String getEncerramento() {
        return encerramento;
    }

    public void setEncerramento(String encerramento) {
        this.encerramento = encerramento;
    }

    public boolean isAbertoInscricao() {
        return abertoInscricao;
    }

    public void setAbertoInscricao(boolean abertoInscricao) {
        this.abertoInscricao = abertoInscricao;
    }

}
