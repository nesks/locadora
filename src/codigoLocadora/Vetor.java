/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigoLocadora;

import interfaceGrafica.PainelBuscaCodigo;
import interfaceGrafica.PainelBuscaGenero;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ind
 */
public class Vetor {
    private static ArrayList<Cliente>  cliente = new ArrayList<Cliente>() ;
    private static ArrayList<Administradores>  administradores = new ArrayList<Administradores>();
    private static ArrayList<Cd> cd = new ArrayList<Cd>();
    private static ArrayList<Dvd>  dvd = new ArrayList<Dvd>();
    private static ArrayList<Game> game = new ArrayList<Game>();
    private static ArrayList<UsuarioComum>  usuario = new ArrayList<UsuarioComum>();
    private static ArrayList<Alugados> alugados = new ArrayList<Alugados>();  
   
    
    public static void addAlugados(Alugados x){
    alugados.add(x);
    }
    
    public static void addCliente(Cliente x){
    cliente.add(x);
}
    public static void addAdministradores(Administradores x){
    administradores.add(x);
}
    public static  void addCd(Cd x){
    cd.add(x);
}
    public static  void addDvd(Dvd x){
    dvd.add(x);
}
    public static  void addGame(Game x){
    game.add(x);
}
    public static  void addUsuarioComum(UsuarioComum x){
    usuario.add(x);
}
     public static  void removeAlugados(int x){
    alugados.remove(x);
}
    
   public  static boolean verificacaoAdm(String nome, String senha){
       int i;
   for(i=0;i<administradores.size();i++){
       if(administradores.get(i).getNome().equals(nome)&&administradores.get(i).getSenha().equals(senha)){
       return true;
       }
   }
   return false;   
}

   
   
   
public static void editarPrecoDVD(){
int x;
for(x=0;x<dvd.size();x++){
dvd.get(x).DefinirPreco();
}
}

public static void editarPrecoCD(){
int x;
for(x=0;x<cd.size();x++){
cd.get(x).DefinirPreco();
}
}

public static void editarPrecoGAME(){
int x;
for(x=0;x<game.size();x++){
game.get(x).DefinirPreco();
}
}


public static String retornaTitulo(String nome){
int x;
String titulo = " ";
for(x=0;x<alugados.size();x++){
    if(nome.equals(alugados.get(x).getCliente())){
   titulo= titulo + alugados.get(x).getTitulo() + " \n ";
    }
        }
    return titulo;
}

public static void retiraAlugado(String nome){
int x;
for(x=0;x<alugados.size();x++){
    if(nome.equals(alugados.get(x).getCliente())){
      int y;
for(y=0;y<dvd.size();y++){
    if(alugados.get(x).getNumero()==dvd.get(y).getNumero()){
    dvd.get(y).setQuantidadeA();
    break;
    }}
for(y=0;y<cd.size();y++){
    if(alugados.get(x).getNumero()==cd.get(y).getNumero()){
    cd.get(y).setQuantidadeA();
    break;
    }}
for(y=0;y<game.size();y++){
    if(alugados.get(x).getNumero()==game.get(y).getNumero()){
    game.get(y).setQuantidadeA();
    break;
    }}
        removeAlugados(x);
    }
        }

}


public static double retornaValores(String nome){
int x;
double preco = 0;
for(x=0;x<alugados.size();x++){
    if(nome.equals(alugados.get(x).getCliente())){
       preco=preco + alugados.get(x).getValor();       
    }
        }
    return preco;
}

public static boolean testeNome(String nome){
int x;
for(x=0;x<cliente.size();x++){
    if(nome.equals(cliente.get(x).getNome())){
   return true;
    }
        }
        return false;
}
public static boolean testeNumeroETitulo(int numero,String titulo){
      JOptionPane.showMessageDialog(null, "Chegou no testeNumeroETitulo!");
int x;
for(x=0;x<dvd.size();x++){
    if(numero==dvd.get(x).getNumero()){
        if(dvd.get(x).getQuantidade()==0){
         JOptionPane.showMessageDialog(null, "midia escolhida esgotada!");
        }else{
            if(titulo.equals(dvd.get(x).getTitulo())){
                
        dvd.get(x).setQuantidade();
   return true;
            }
        }
    }
        }
for(x=0;x<cd.size();x++){
    if(numero==cd.get(x).getNumero()){
          if(cd.get(x).getQuantidade()==0){
         JOptionPane.showMessageDialog(null, "midia escolhida esgotada!");
        }else{
               if(titulo.equals(cd.get(x).getTitulo())){
        cd.get(x).setQuantidade();
   return true;
               }}
    }
        }
for(x=0;x<game.size();x++){
    if(numero==game.get(x).getNumero()){
          if(game.get(x).getQuantidade()==0){
         JOptionPane.showMessageDialog(null, "midia escolhida esgotada!");
        }else{
               if(titulo.equals(game.get(x).getTitulo())){
        game.get(x).setQuantidade();
   return true;
               }
               }}
        }
        return false;
}

public static double getPreco(int numero){
int x;
for(x=0;x<dvd.size();x++){
    if(numero==dvd.get(x).getNumero()){
        return dvd.get(x).getPreco();
    }
        }
for(x=0;x<cd.size();x++){
    if(numero==cd.get(x).getNumero()){
         return cd.get(x).getPreco();
    }
        }
for(x=0;x<game.size();x++){
    if(numero==game.get(x).getNumero()){
         return game.get(x).getPreco();
        }
}
return 0;
}


public static String getAutorizados(String nome){
int x,y;
for(x=0;x<cliente.size();x++){
    for(y=0;y<5;y++){
    if(nome.equals(cliente.get(x).getAutorizados(y))){
        return cliente.get(x).getNome();
    }}
        }
        return "";
}
    public static  boolean verificacaoUsu(String nome, String senha){
       int i;
     for(i=0;i<usuario.size();i++){
       if(usuario.get(i).getNome().equals(nome)&&usuario.get(i).getSenha().equals(senha)){
       return true;
       }
   }
   return false;   
}
   
  
public static boolean imprimeCodigo(int numero){
   int x;
for(x=0;x<dvd.size();x++){
    if(numero==dvd.get(x).getNumero()){
    PainelBuscaCodigo p1 = new PainelBuscaCodigo();
    p1.montarDVD(dvd.get(x).getTitulo(),dvd.get(x).getCensura(),dvd.get(x).getPreco(),dvd.get(x).getIdioma(),dvd.get(x).getGenero(),dvd.get(x).getQuantidade(),dvd.get(x).getQuantidadeA());
    p1.setVisible(true);
    return true;
    }
    }
for(x=0;x<cd.size();x++){
    if(numero==cd.get(x).getNumero()){
    PainelBuscaCodigo p1 = new PainelBuscaCodigo();
    p1.montarCD(cd.get(x).getGrupo(),cd.get(x).getNumeroDeMusicas(),cd.get(x).getCensura(),cd.get(x).getTitulo(),cd.get(x).getQuantidade(),cd.get(x).getQuantidadeA(),cd.get(x).getPreco());
    p1.setVisible(true);
    return true;
    }
    }
for(x=0;x<game.size();x++){
    if(numero==game.get(x).getNumero()){
    PainelBuscaCodigo p1 = new PainelBuscaCodigo();
    p1.montarGAME(game.get(x).getNomeDoConsole(),game.get(x).getCensura(),game.get(x).getTitulo(),cd.get(x).getQuantidade(),cd.get(x).getQuantidadeA(),game.get(x).getPreco());
    p1.setVisible(true);
    return true;
    }
    }

return false;
}   
    public static boolean imprimeGenero(String genero){
   int x;
   String nome = "";
for(x=0;x<dvd.size();x++){
    if(genero.equals(dvd.get(x).getGenero())){
    nome = nome + dvd.get(x).getTitulo() + "    \n  ";
    }
    }
if(nome!=""){
PainelBuscaGenero p3 = new PainelBuscaGenero();
p3.montarPainel(nome, genero);
p3.setVisible(true);
return true;
}else{
return false;
}
}   
    
}