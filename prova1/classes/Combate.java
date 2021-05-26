package prova1.classes;

public class Combate {
    private String nomeLutador1;
    private String nomeLutador2;
    private Double poderLutador1 = 0.0;
    private Double poderLutador2 = 0.0;
    private String localLuta;
    private boolean lutador1Preparado = false;
    private boolean lutador2Preparado = false;
    private boolean localPreparado = false;
    private String dataLuta;
    private String vencedor;

    public Combate(String nomeLutador1, String nomeLutador2, String localLuta){
        this.nomeLutador1 = nomeLutador1;
        this.nomeLutador2 = nomeLutador2;
        this.localLuta = localLuta;
        System.out.println("\nCombate Marcado!");
    }

    public void PrepararLuta(String dataLuta, Double poderLutador1, Double poderLutador2){
        this.poderLutador1 = poderLutador1;
        this.poderLutador2 = poderLutador2;
        System.out.println("\nPreparando tudo...");
        PrepararLocal(dataLuta);
        PrepararLutador1(poderLutador1);
        PrepararLutador2(poderLutador2);
        System.out.println("\nTudo está preparado para a luta em "+ localLuta +" no dia "+ dataLuta +", boa sorte aos competidores!");
    }

    public void ResultadoLuta(){
        if(localPreparado == true & lutador1Preparado == true & lutador2Preparado == true){
            DecideVencedor();
            if(vencedor != "A decidir"){
                System.out.println("\nO vencedor foi: "+ vencedor +", Parabens a ele!");
            }
            else{
                System.out.println("O vencedor não foi decidido");
            }
        }
        else if(localPreparado == false){
            System.out.println("\nA luta não pode ser iniciada, a arena não está pronta");
        }
        else{
            System.out.println("\nA luta não pode ser iniciada, um dos lutadores não está pronto para a luta");
        }
    }

    private void PrepararLocal(String dataLuta){
        this.dataLuta = dataLuta;
        if(poderLutador1 % 2 == 0 & poderLutador2 % 2 == 0){
            System.out.println("\nA arena possuíra obstaculos e armas de combate corpo-a-corpo.");
        }
        else if(poderLutador1 % 2 == 0 & poderLutador2 % 2 != 0){
            System.out.println("\nA arena possuíra escudos anti-magia e armadilhas.");
        }
        else if(poderLutador1 % 2 != 0 & poderLutador2 % 2 == 0){
            System.out.println("\nA arena possuíra criaturas hostis e será permitido o uso de equipametos.");
        }
        else if(poderLutador1 % 2 != 0 & poderLutador2 % 2 != 0){
            System.out.println("\nA arena será limpa e diminuirá com o tempo.");
        }
        setLocalPreparado(true);

    }

    private void PrepararLutador1(Double poderLutador1){
        this.poderLutador1 = poderLutador1;
        if(poderLutador1 % 2 == 0){
            System.out.println("\n"+ nomeLutador1 +" disse: Eu vou esmagar ele!");
            setPoderLutador1(poderLutador1*1.10);
        }
        else if(poderLutador1 % 2 != 0){
            System.out.println("\n"+ nomeLutador1 +" disse: Eu estou no controle dessa partida.");
            setPoderLutador1(poderLutador1*1.13);
        }
        setLutador1Preparado(true);
    }

    private void PrepararLutador2(Double poderLutador2){
        this.poderLutador2 = poderLutador2;
        if(poderLutador2 % 2 == 0){
            System.out.println("\n"+ nomeLutador2 +" disse: Aquele otario não tem chances contra min!");
            setPoderLutador2(poderLutador2*1.11);
        }
        else if(poderLutador2 % 2 != 0){
            System.out.println("\n"+ nomeLutador2 +" disse: Eu treinei muito para está batalha.");
            setPoderLutador2(poderLutador2*1.12);
        }
        setLutador2Preparado(true);

    }

    private void DecideVencedor(){
        setVencedor("A decidir");
        if(poderLutador1 > poderLutador2){
            setVencedor(nomeLutador1);
        }
        else if(poderLutador2 > poderLutador1){
            setVencedor(nomeLutador2);
        }
        else{
            System.out.println("\nEmpate! Outra luta deve ser marcada.");
        }

    }

    public String getNomeLutador1() {
        return nomeLutador1;
    }

    public void setNomeLutador1(String nomeLutador1) {
        this.nomeLutador1 = nomeLutador1;
    }

    public String getNomeLutador2() {
        return nomeLutador2;
    }

    public void setNomeLutador2(String nomeLutador2) {
        this.nomeLutador2 = nomeLutador2;
    }

    public Double getPoderLutador1() {
        return poderLutador1;
    }

    public void setPoderLutador1(Double poderLutador1) {
        this.poderLutador1 = poderLutador1;
    }

    public Double getPoderLutador2() {
        return poderLutador2;
    }

    public void setPoderLutador2(Double poderLutador2) {
        this.poderLutador2 = poderLutador2;
    }

    public String getLocalLuta() {
        return localLuta;
    }

    public void setLocalLuta(String localLuta) {
        this.localLuta = localLuta;
    }

    public boolean isLutador1Preparado() {
        return lutador1Preparado;
    }

    public void setLutador1Preparado(boolean lutador1Preparado) {
        this.lutador1Preparado = lutador1Preparado;
    }

    public boolean isLutador2Preparado() {
        return lutador2Preparado;
    }

    public void setLutador2Preparado(boolean lutador2Preparado) {
        this.lutador2Preparado = lutador2Preparado;
    }

    public boolean isLocalPreparado() {
        return localPreparado;
    }

    public void setLocalPreparado(boolean localPreparado) {
        this.localPreparado = localPreparado;
    }

    public String getDataLuta() {
        return dataLuta;
    }

    public void setDataLuta(String dataLuta) {
        this.dataLuta = dataLuta;
    }

    public String getVencedor() {
        return vencedor;
    }

    public void setVencedor(String vencedor) {
        this.vencedor = vencedor;
    }

}
