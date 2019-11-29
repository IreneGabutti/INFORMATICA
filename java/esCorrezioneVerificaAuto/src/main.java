import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Wrapper;

public class main {
    public static void main(String[] args){

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);
        String modello = "";
        int cilindrata = 0;
        float prezzo = 0;
        boolean err = true;
        System.out.println("Inserisci modello: ");
        try {
            modello = tastiera.readLine();
        } catch (IOException e) {
            System.out.println("Errore di IOException");
            e.printStackTrace();
        }

        System.out.println("Inserisci cilindrata: ");
        try {
            cilindrata = Integer.parseInt(tastiera.readLine());
            err=false;
        } catch (IOException e) {
            System.out.println("Errore di IOException");
            e.printStackTrace();
        }
        catch (NumberFormatException e){
            System.out.println("NON hai inserito un numero intero!");
        }
        
        System.out.println("Inserisci prezzo");
        try {
            prezzo = Float.parseFloat(tastiera.readLine());
        } catch (IOException e) {
            err=true;
            System.out.println("Errore di IOException");
            e.printStackTrace();
        }
        catch (NumberFormatException e){
            System.out.println("NON hai inserito un numero float!");
        }

        AutoVenduta av1 = new AutoVenduta(modello, cilindrata, prezzo);
        AutoVenduta av2 = new AutoVenduta("bmw" , 2000, 80000);
        AutoVenduta av3 = new AutoVenduta("fiat" , 4000, 30000);
        if(av1.isPiuCara(av2)){
            System.out.println("av1 e' piu' cara di av2");
        }else{
            System.out.println("av2 e' piu' cara di av1");
        }
         Venduta v = new Venduta("francesco" , "bassignana");
        v.add(av1);
        v.add(av2);
        v.add(av3);
        v.getMediaPrezzo();

        System.out.println(v.toString());
    }
}
