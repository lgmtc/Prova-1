package prova1;

import prova1.classes.Torneio;
import prova1.classes.Lutador;
import prova1.classes.Combate;


public class Principal {

    public static void main(String[] args) {
        Lutador ursosome = new Lutador("Zyon", "Ursarin", "Ganhar campeonatos");
        ursosome.StatusLutador();
        ursosome.FichaLutador(4.0, 7.0, 3.0, 5.0);
        ursosome.StatusLutador();
        Lutador choquinho = new Lutador("Keriu", "ElectroViajant", "Derrotar seus maiores inimigos");
        choquinho.FichaLutador(7.0, 4.0, 4.0, 4.0);
        choquinho.StatusLutador();
        Torneio poderosos = new Torneio("Lutadores alfa", "Japão", "Só os poderosos", 15);
        poderosos.FecharInscricao(2);
        poderosos.AbrirInscricao("14/06/2021", "29/07/2021", 59.90);
        poderosos.FecharInscricao(42);
        Combate luta1 = new Combate("Keriu", "Zyon", "Argentina");
        luta1.ResultadoLuta();
        luta1.PrepararLuta("20/08/2021", 448.0, 420.0);
        luta1.ResultadoLuta();


    }
    
    
}
