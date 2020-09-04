
package classes;

public class Tabuleiro {

    //Atributo da classe normal privado
    private String identificador = "WAR BÁSICO";
    
    //Atributo objeto privado estático da própria classe, ou seja, do tipo Tabuleiro
    //Inicializado com null
    private static Tabuleiro tabuleiro = null;

    //Construtor privado (normalmente construtores são públicos)
    private Tabuleiro() {
    }
    
    //Método de acesso get do identificador
    String getIdentificador() {
        return identificador;
    }

    //Método de acesso get, publico, estático, com uma verificação se foi ou não instanciado um objeto da classe
    public static Tabuleiro getTabuleiro() {
        if (tabuleiro == null) {
            tabuleiro = new Tabuleiro();
        }
        return tabuleiro;
    }
}
