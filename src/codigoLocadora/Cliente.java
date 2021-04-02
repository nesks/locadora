
package codigoLocadora;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String cpf;
    private String telefone;
    private ArrayList<String> autorizados;
    
    public Cliente(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.autorizados = new ArrayList<String>(5);
        saldo=0;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getAutorizados(int x) {
        return autorizados.get(x);
    }

   

    public double getSaldo() {
        return saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setAutorizados(ArrayList<String> autorizados) {
        this.autorizados = autorizados;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

  
    private double saldo;

    
      public String getNome() {
        return nome;
    }
      
  public void inserirAutorizado(String n){
		autorizados.add(n);
	}
  
  
}
