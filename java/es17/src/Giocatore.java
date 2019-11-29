public class Giocatore {
    private final int LNOME = 20;
    private int eta;
    private double punteggio;
    private final double PUNTEGGIO_MAX = 10;
    private final double PUNTEGGIO_MIN = 0;
    private String nome;

    public Giocatore(String nome, int eta) {
        this.nome = nome;
        this.eta = (eta > 0 && eta <= 25) ? eta : 18;
        punteggio = 0;
    }

    public Giocatore(String nome, int eta, double punteggio) {
        this.nome = nome;
        this.eta = (eta > 0 && eta <= 25) ? eta : 18;
        this.punteggio = (punteggio > PUNTEGGIO_MIN && punteggio <= PUNTEGGIO_MAX) ? punteggio : 0;
    }

    public String getNome() {
        return nome;
    }

    public double getPunteggio() {
        return punteggio;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = (eta > 0 && eta <= 25) ? eta : 18;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPunteggio(double punteggio) {
        this.punteggio = (punteggio > PUNTEGGIO_MIN && punteggio <= PUNTEGGIO_MAX) ? punteggio : 0;
    }

    @Override
    public String toString() {
        String out = "";
        out = out + String.format("\n----------------------------------------\n|%s|\neta':\t\t%d\npunteggio:\t\t%d\n----------------------------------------" , nome, eta, punteggio);
        return out;
    }
}
