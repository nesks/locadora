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
public class Cd extends Midias{
    
    private String grupo;
    private int numeroDeMusicas;
      private double preco=0;
    private String tipoPreco;

    public Cd( String grupo, int numeroDeMusicas, int numero, int censura, String titulo, int quantidade, String x) {
        super(numero, censura, titulo, quantidade);
        this.grupo = grupo;
        this.numeroDeMusicas = numeroDeMusicas;
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

    public String getGrupo() {
        return grupo;
    }

    public int getNumeroDeMusicas() {
        return numeroDeMusicas;
    }

    public String getTipoPreco() {
        return tipoPreco;
    }

    public double getPreco() {
        return preco;
    }

}
