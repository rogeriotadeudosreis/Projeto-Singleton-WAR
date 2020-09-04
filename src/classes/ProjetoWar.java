
package classes;

import classes.*;

public class ProjetoWar {

    public static void main(String[] args) {
        
        Tabuleiro tab = Tabuleiro.getTabuleiro();
        
        Jogador jogador1 = new Jogador("Godofredo das cove",  tab);
        
        Jogador jogador2 = new Jogador ("Orozimbo dos pepinos",  tab);
        
        Tabuleiro tab2 = Tabuleiro.getTabuleiro();
        Jogador jogador3 = new Jogador ("nabuco das rosas",  tab2);
        
        System.out.println(jogador1.getNome() + " e " + jogador2.getNome() + 
        " estão no jogo " + tab2.getIdentificador());
    }
    
}
