public class Main{
	public static void main(String[] args) {
	    
        Fabrica fabrica = new Fabrica();
        
        fabrica.adicionaOperario(new OperadorDeCorte());
        fabrica.adicionaOperario(new OperadorDePrensa());
        fabrica.adicionaOperario(new OperadorDeDobra());
        
        fabrica.iniciarExpediente();
	}
}
