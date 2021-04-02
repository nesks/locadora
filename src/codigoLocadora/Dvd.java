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
public class Dvd extends Midias{
    private String genero;
    private String idioma;
    private double preco;
    private String tipoPreco;
    
    public Dvd(String genero, String idioma, int numero, int censura, String titulo, int quantidade, String x) {
        super(numero, censura, titulo, quantidade);
        this.genero = genero;
        this.idioma = idioma;
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

    public double getPreco() {
        return preco;
    }

    public String getGenero() {
        return genero;
    }

    public String getIdioma() {
        return idioma;
    }


    
    
}
