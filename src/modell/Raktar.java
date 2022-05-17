package modell;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Raktar implements Iterable<Elelmiszer>, Serializable{
    private ArrayList<Elelmiszer> elelmiszerLista;

    public Raktar() {
        this.elelmiszerLista = new ArrayList<>();
        
       
    }
    
    public void felvesz(Elelmiszer elelmiszer){
        elelmiszerLista.add(elelmiszer);
    }

    @Override
    public Iterator<Elelmiszer> iterator() {
        return Collections.unmodifiableList(elelmiszerLista).iterator();
    }
    
    
    public List<Elelmiszer> rendezNevSzerint(){
        Collections.sort(elelmiszerLista, Elelmiszer.nevRendezo());
        return Collections.unmodifiableList(elelmiszerLista);
    }
    
    public List<Elelmiszer> rendezGyartoSzerint(){
        Collections.sort(elelmiszerLista, Elelmiszer.gyartoRendezo());
        return Collections.unmodifiableList(elelmiszerLista);
    }
}
