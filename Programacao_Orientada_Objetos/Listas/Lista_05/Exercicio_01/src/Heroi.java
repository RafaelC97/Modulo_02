import jdk.jshell.Snippet;

public class Heroi {
    private int idHeroi;
    private String nomeHeroi;
    private int quantidadeDeMoedasDeOuro;

    private static int contadorID = 0;

    public Heroi(String nomeHeroi, int quantidadeDeMoedasDeOuro){
        this.idHeroi = ++contadorID;
        this.nomeHeroi = nomeHeroi;
        this.quantidadeDeMoedasDeOuro = quantidadeDeMoedasDeOuro;
    }

    public int getIdHeroi(){
        return idHeroi;
    }

    public void setIdHeroi(int idHeroi){
        this.idHeroi = idHeroi;
    }

    public String getNomeHeroi(){
        return nomeHeroi;
    }

    public void setNomeHeroi(String nomeHeroi){
        this.nomeHeroi = nomeHeroi;
    }

    public int getQuantidadeDeMoedasDeOuro(){
        return quantidadeDeMoedasDeOuro;
    }

    public void setQuantidadeDeMoedasDeOuro(int quantidadeDeMoedasDeOuro){
        this.quantidadeDeMoedasDeOuro = quantidadeDeMoedasDeOuro;
    }

}
