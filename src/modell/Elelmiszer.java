package modell;

import java.text.Collator;
import java.time.LocalDate;
import java.util.Comparator;

class NevComparator implements Comparator<Elelmiszer>{

    @Override
    public int compare(Elelmiszer e1, Elelmiszer e2) {
        Collator coll = Collator.getInstance();
        return coll.compare(e1.getNev(), e2.getNev());
    }
}

class GyartoComparator implements Comparator<Elelmiszer>{

    @Override
    public int compare(Elelmiszer e1, Elelmiszer e2) {
        Collator coll = Collator.getInstance();
        return coll.compare(e1.getGyarto(), e2.getGyarto());
    }
}

public abstract class Elelmiszer{
    private String nev, gyarto;
    private LocalDate lejaratiDatum;

    public Elelmiszer(String nev, String gyarto, LocalDate lejaratiDatum) throws HibasDatumException {
        if(lejaratiDatum.isAfter(LocalDate.now())){
            throw new HibasDatumException("lejárt élelmiszer");
        }
        this.nev = nev;
        this.gyarto = gyarto;
        this.lejaratiDatum = lejaratiDatum;
    }

    public Elelmiszer(String nev, String gyarto) throws HibasDatumException {
        this(nev,gyarto,LocalDate.ofEpochDay(1));
    }

    public String getNev() {
        return nev;
    }

    public String getGyarto() {
        return gyarto;
    }
    
    public static NevComparator nevRendezo(){
        return new NevComparator();
    }
    
    public static GyartoComparator gyartoRendezo(){
        return new GyartoComparator();
    }

    @Override
    public String toString() {
        return "Elelmiszer{" + "nev=" + nev + ", gyarto=" + gyarto + ", lejaratiDatum=" + lejaratiDatum + '}';
    }
}
