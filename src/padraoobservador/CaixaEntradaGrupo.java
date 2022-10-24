package padraoobservador;

/**
 *
 * @author Vinicius Corte
 */

public class CaixaEntradaGrupo extends Observable{
    private String mensagem;
    
    public String getMensagem(){
        return this.mensagem;
    }
    public void setNovaMensagem(String mensagem){
        this.mensagem = mensagem;
    }
}
