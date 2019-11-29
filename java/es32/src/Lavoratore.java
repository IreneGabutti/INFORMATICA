
public class Lavoratore {
    private String nome;
    private int livello;
    private float stipendio;
    private final int LIVMAX = 15;

    public Lavoratore (String nome, int livello, float stipendio){
        this.nome = nome;
        if((livello>=0) && (livello<LIVMAX)){
            this.livello = livello;
        }
        else{
            this.livello = 1;
        }
        if(stipendio >= 0){
            this.stipendio = stipendio;

        }
        else
        {
            this.stipendio = 0;
        }
    }

    public String stampaStipendio(float stipendio){
        return "Lo stipendio è: " + stipendio;
    }

    public void setStipendio(float stipendio){
        if(stipendio >= 0){
            this.stipendio = stipendio;
        }
        else
        {
            this.stipendio = 0;
        }
    }
    public void setLivello(int livello){
        if((livello>=0) && (livello<LIVMAX)){
            this.livello = livello;
        }
        else{
            this.livello = 1;
        }
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getLivello(){
        return livello;
    }
    public float getStipendio(){
        return stipendio;
    }
    public String getNome(){
        return nome;
    }

    public String toString(){
        return "\nNome: " + nome + "\n\tLivello: " + livello + "\n\tSalario: " + stipendio;
    }
}
