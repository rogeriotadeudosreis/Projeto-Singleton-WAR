package classes;

public class Jogador {

    private String nome = "";
    private Tabuleiro tabuleiro = null;

    public Jogador(String nome, Tabuleiro jogo) {
        this.nome = nome;
        tabuleiro = jogo;
    }
    public String getNome(){
        return nome;
    }
    public Tabuleiro getTabuleiro(){
        return tabuleiro;
    }
    

}
