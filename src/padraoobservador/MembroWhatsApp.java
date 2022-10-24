package padraoobservador;

/**
 *
 * @author Vinicius Corte
 */

public class MembroWhatsApp implements Observador{
    private int numero;
    
    public int getNumero(){
        return this.numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    @Override
    public void update(Observable observador) {
        System.out.println("Mensagem recebida por WhatsApp");
    }
}
