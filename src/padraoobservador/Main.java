package padraoobservador;

/**
 *
 * @author Vinicius Corte
 */

public class Main {
    public static void main(String[] args){
        MembroEmail monitor1 = new MembroEmail();
        MembroWhatsApp monitor2 = new MembroWhatsApp();
        CaixaEntradaGrupo inbox = new CaixaEntradaGrupo();
        monitor1.setEmail("nelson.jacome@gmail.com");
        monitor2.setNumero(279454554);
        inbox.addObservador(monitor1);
        inbox.addObservador(monitor2);
        inbox.setNovaMensagem("Salve meu guerra");
        monitor2.update(inbox);
        System.out.println(inbox.getMensagem());
        inbox.setNovaMensagem("Reunião hoje");
        monitor2.update(inbox);
        System.out.println(inbox.getMensagem());
    }
}
