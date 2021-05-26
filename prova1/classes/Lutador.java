package prova1.classes;

public class Lutador {
    private String nome;
    private String raca;
    private String objetivo;
    private String categoria = "Não listada";
    private Double poder = 0.0;
    private Double inteligencia = 0.0;
    private Double forca = 0.0;
    private Double destreza = 0.0;
    private Double energia = 0.0;
    private Double fisico = 0.0;
    private Double magico = 0.0;
    private String estilo;

    public Lutador(String nome, String raca, String objetivo){
        this.nome = nome;
        this.raca = raca;
        this.objetivo = objetivo;
        System.out.println("Lutador cadastrado!");
    }

    public void FichaLutador(Double inteligencia, Double forca, Double destreza, Double energia){
        this.inteligencia = inteligencia;
        this.forca = forca;
        this.destreza = destreza;
        this.energia = energia;
        DerterminaCategoria();
        System.out.println("\nFicha de Lutador\nNome:" + nome + "\nRaça:" + raca +"\nCategoria:" + categoria + "\nObjetivo:" + objetivo);
    }

    public void StatusLutador(){
        if(poder != 0.0 & inteligencia != 0.0 & forca != 0.0 & destreza != 0.0 & energia != 0.0){
            System.out.println("\nNome: "+ nome +"\nRaça: "+ raca +"\nEstilo de luta: "+ estilo +"\nForça: "+ forca +"\nDestreza: "+ destreza +"\nInteligencia: "+ inteligencia +"\nEnergia: "+ energia +"\nPoder Total: "+ poder);
        }
        else{
            System.out.println("\nFicha incompleta!");
        }
    }

    private void DerterminaCategoria(){
        setPoder((forca*destreza)*(inteligencia*energia));
        setFisico(forca*destreza);
        setMagico(inteligencia*energia);
        if(poder <= 100){
           setCategoria("iniciante");
        }
        else if(poder <= 300){
            setCategoria("Em treinamento");
        }
        else if(poder <= 700){
            setCategoria("Pano de chão");
        }
        else if(poder <= 1000){
            setCategoria("Punho quebrado");
        }
        else if(poder <= 1500){
            setCategoria("Pele dura");
        }
        else if(poder <= 5000){
            setCategoria("Sobrevivente");
        }
        else if(poder <= 10000){
            setCategoria("Bem equilibrado");
        }
        else if(poder <= 25000){
            setCategoria("deasafiante");
        }
        else if(poder <= 50000){
            setCategoria("Comandante");
        }
        else if(poder <= 100000){
            setCategoria("Sanguinario");
        }
        else if(poder > 100000){
            setCategoria("Dominador");
        }
        else{
            System.out.println("Erro!!");
        }
        
        if(fisico>magico){
            setEstilo("Lutador corpo-a-corpo");
        }
        else if(magico>fisico){
            setEstilo("Mago de combate");
        }
        else if(magico==fisico){
            setEstilo("Equilibrado");
        }
        else{
            System.out.println("Erro!!");
        }

    }

    public String getNome() {
        return nome;
    }
     
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }
     
    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getPoder() {
        return poder;
    }

    public void setPoder(Double poder) {
        this.poder = poder;
    }

    public Double getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(Double inteligencia) {
        this.inteligencia = inteligencia;
    }

    public Double getForca() {
        return forca;
    }

    public void setForca(Double forca) {
        this.forca = forca;
    }

    public Double getDestreza() {
        return destreza;
    }

    public void setDestreza(Double destreza) {
        this.destreza = destreza;
    }

    public Double getEnergia() {
        return energia;
    }

    public void setEnergia(Double energia) {
        this.energia = energia;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public Double getFisico() {
        return fisico;
    }

    public void setFisico(Double fisico) {
        this.fisico = fisico;
    }

    public Double getMagico() {
        return magico;
    }

    public void setMagico(Double magico) {
        this.magico = magico;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

}