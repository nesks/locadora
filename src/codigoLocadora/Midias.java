
package codigoLocadora;

/**
 *
 * @author ind
 */
public class Midias {
    private int numero;
    private int censura;
    private String titulo;
    private int quantidade;
    private int quantidadeA;
 
  
    
    
    public Midias(int numero, int censura, String titulo, int quantidade ) {
        this.numero = numero;
        this.censura = censura;
        this.titulo = titulo;
        this.quantidade = quantidade;
       this.quantidadeA=0;
   
        
    }

   

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCensura() {
        return censura;
    }

    public void setCensura(int censura) {
        this.censura = censura;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade() {
        this.quantidade--;
        this.quantidadeA++;
    }
    public void setQuantidadeA() {
        this.quantidade++;
        this.quantidadeA--;
    }

    public int getQuantidadeA() {
        return quantidadeA;
    }

  
    
            
    
}
