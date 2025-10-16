package atividadeLivro;
public class Livro {
private String titulo;
private String autor;
private int anoPubli;
private int quantiPag;

public Livro(String titulo, String autor, int anoPubli, int quantiPag){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPubli = anoPubli;
        this.quantiPag = quantiPag;
        
   }

   public String getTitulo(){
       return titulo;
   }  
  
   public void setTitulo(String titulo){
       this.titulo=titulo;
   } 
   
   public String getAutor(){
       return autor;
   }
   
    public void setAutor(String autor){
       this.autor=autor;
   } 

   public int getAnoPubli(){
       return anoPubli;
   } 

   public void setAnoPubli(int anoPubli){
       this.anoPubli=anoPubli;
   } 

   public int getQuantiPag(){
       return quantiPag;
   }    
   
   public void setquantiPag(int quantiPag){
       this.quantiPag=quantiPag;
   } 
   
   public int calcularTempo(){
        return quantiPag;
   }

   public void exibirInformacoes(){
    System.out.println("Título: " + titulo);
    System.out.println("Autor: " + autor);
    System.out.println("Ano de publicação: " + anoPubli);
    System.out.println("Páginas: " + quantiPag);
    System.out.println("Tempo estimado de leitura: " + calcularTempo() + " minutos");






}


}
