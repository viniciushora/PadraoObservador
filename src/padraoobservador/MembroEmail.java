package padraoobservador;

/**
 *
 * @author Vinicius Corte
 */

public class MembroEmail implements Observador{
    private String email;
    
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    @Override
    public void update(Observable obsservador) {
        System.out.println("Mensagem recebida por e-mail");
    }
}
