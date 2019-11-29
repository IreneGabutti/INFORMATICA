public class Voto {
    private Data giorno;
    private float voto;
    private float peso;
    private char tipo;  //tipo del voto

    public Voto (Data giorno, float voto, float peso, char tipo) {
        this.giorno=giorno;
        if (voto=>0 && voto<=10){
            this.voto=voto;
        }else{
            this.voto=if;
        }
        if(tipo=='s' || tipo=='o' || tipo=='p'){
            this.tipo=tipo;
        }else{
            this.tipo='o';
        }
    }

    @Override
    public String toString() {
        return this.giorno.toString() +     //il + concatena
                String.format(": %.2f (%.2f) %c", this.voto, this.peso, this.tipo);   //restituisce una stringa e funge come una printf
    }
}
