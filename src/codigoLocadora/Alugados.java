/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigoLocadora;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ind
 */
public class Alugados {
    private String cliente;
    private int numero;
    private String titulo;
    private String clienteDependente ="";
    private Date dataAlugar;
    private Date dataDevolver;
    private double valor;
    
    public Alugados(String cliente, int numero, String titulo, Date dataAlugar, Date dataDevolver, double preco) {
        this.cliente = cliente;
        this.numero = numero;
        this.titulo = titulo;
        this.dataAlugar=dataAlugar;
        this.dataDevolver=dataDevolver;
        this.valor=preco;
    }
     public Alugados(String cliente, int numero, String titulo, String dependente, Date dataAlugar, Date dataDevolver, double preco) {
        this.cliente = cliente;
        this.numero = numero;
        this.titulo = titulo;
        this.clienteDependente=dependente;
        this.dataAlugar=dataAlugar;
        this.dataDevolver=dataDevolver;
        this.valor=preco;
    }

    public String getCliente() {
        return cliente;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getClienteDependente() {
        return clienteDependente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setClienteDependente(String clienteDependente) {
        this.clienteDependente = clienteDependente;
    }

    public double getValor() {
        return valor;
    }
    
    

    
            
}
