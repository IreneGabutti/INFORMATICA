public class LavoratoreConStraordinariPagati extends Lavoratore{
    private int oreStraordinarie;
    private double retribuzioneOraria = 10.0;

    public LavoratoreConStraordinariPagati(String nome, int livello, float stipendio){
        super(nome,livello, stipendio);
        if(oreStraordinarie>=0){
            this.oreStraordinarie = oreStraordinarie;
        }
        else
        {
            oreStraordinarie = 0;
        }
    }

    public void setOreStraordinarie(int oreStraordinarie){
        if(oreStraordinarie>=0){
            this.oreStraordinarie = oreStraordinarie;
        }
        else
        {
            oreStraordinarie = 0;
        }
    }

    public String stampaStipendio() {
        return "\nSalario: "+ (getStipendio() + (oreStraordinarie*retribuzioneOraria));
    }

    public String toString() {
        return "\n\tNome: " + getNome() + "\n\t\tLivello: " + getLivello() + "\n\t\tSalario: " + (getStipendio() + (oreStraordinarie*retribuzioneOraria));
    }
}