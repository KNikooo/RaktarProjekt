package modell;

import java.io.File;
import java.time.LocalDate;

public class Konzerv extends Elelmiszer{
    private String leiras;
    private File ajanlas;
    
    public Konzerv(String nev, String gyarto, LocalDate lejaratiDatum, String leiras, File ajanlas) throws HibasDatumException {
        super(nev, gyarto, lejaratiDatum);
        this.leiras=leiras;
        this.ajanlas=ajanlas;
    }

    public Konzerv(String leiras, String nev, String gyarto, LocalDate lejaratiDatum) throws HibasDatumException {
        super(nev, gyarto, lejaratiDatum);
        this.leiras = leiras;
    }

    public Konzerv(String leiras, File ajanlas, String nev, String gyarto) throws HibasDatumException {
        super(nev, gyarto);
        this.leiras = leiras;
        this.ajanlas = ajanlas;
    }

    public Konzerv(String leiras, String nev, String gyarto) throws HibasDatumException {
        super(nev, gyarto);
        this.leiras = leiras;
    }
    
    public void receptetMutat(){
        if(ajanlas.exists()){
            
        }else{
            
        }
    }

    @Override
    public String toString() {
        return "Konzerv{" + "leiras=" + leiras + ", ajanlas=" + ajanlas + '}';
    }
}
