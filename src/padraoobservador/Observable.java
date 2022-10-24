package padraoobservador;
import java.util.ArrayList;

/**
 *
 * @author Vinicius Corte
 */

public class Observable {
    ArrayList<Observador> monitores = new ArrayList();
    
    public void addObservador(Observador  observador){
        this.monitores.add(observador);
    }
    public void deleteObservador(Observador observador){
        this.monitores.remove(observador);
    }
    public void notifyObservador(){
        for(Observador monitor : monitores){
            monitor.update(this);
        }
    }
}
