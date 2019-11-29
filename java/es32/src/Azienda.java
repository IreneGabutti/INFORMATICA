public class Azienda {
    private String nome;
    private LavoratoreConStraordinariPagati[] arrLavoratori;
    private final int MAXLAV = 100;
    private int nLavoratori;

    public Azienda(String nome){
        this.nome=nome;
        arrLavoratori = new LavoratoreConStraordinariPagati[MAXLAV];
        nLavoratori=0;
    }

    public void addLavoratori(LavoratoreConStraordinariPagati lavoratore){
        if (nLavoratori<=MAXLAV){
            arrLavoratori[nLavoratori]=lavoratore;
            nLavoratori++;
        }
    }

    public String toString() {
        String print = "";
        for (int i = 0; i < nLavoratori; i++) {
            print += "" + arrLavoratori[i].toString() + "";
        }
        return "Nome azienda: " + nome + "\nLavoratori: " + print;
    }
}
