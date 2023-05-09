import java.util.ArrayList;
import java.util.List;

public class Fabrica{
    private List<Operario> operarios;
    
    public Fabrica(){
        this.operarios = new ArrayList<>();
    }
    
    public void adicionaOperario(Operario operario){
        operarios.add(operario);
    }
    
    public void iniciarExpediente(){
        System.out.println("O expediente começou!!!");
        for (Operario operario : operarios){
            operario.trabalhar();
        }
    }
       
}