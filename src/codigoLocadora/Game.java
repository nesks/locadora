/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigoLocadora;

/**
 *
 * @author ind
 */
public class Game extends Midias{
    private String nomeDoConsole;
        private double preco;
    private String tipoPreco;

    public Game(String nomeDoConsole, int numero, int censura, String titulo, int quantidade,String x) {
        super(numero, censura, titulo, quantidade);
        this.nomeDoConsole = nomeDoConsole;
          tipoPreco=x;
        DefinirPreco();
    }
       public void DefinirPreco(){
    if(tipoPreco=="Lançamento"){
    preco=Preco.getLancamentoDVD();
    }else if(tipoPreco=="Acervo"){
    preco=Preco.getAcervoDVD();
    }else{
    preco=Preco.getComumDVD();
    }
    }

    public String getNomeDoConsole() {
        return nomeDoConsole;
    }

    public double getPreco() {
        return preco;
    }
    
}
