import java.util.ArrayList;
import java.util.List;

public class Liquidificador <T extends Alimento>{
    private T alimento;
    private List<T> liquidificador;
    
    public Liquidificador(){
        this.liquidificador = new ArrayList<>();
    }
    
    public void bater(){
        System.out.println("O alimento foi batido");
    }
    
    public void adicionarAlimento(T alimento){
        liquidificador.add(alimento);
    }
    
    public T getAlimento(){
        return this.alimento;
    }
    
    public void setAlimento(T alimento){
        this.alimento = alimento;
    }
}