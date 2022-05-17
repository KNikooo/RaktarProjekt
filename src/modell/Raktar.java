package modell;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Raktar implements Iterable<Elelmiszer>{
    ArrayList<Elelmiszer> elelmiszerLista;

    public Raktar(ArrayList<Elelmiszer> elelmiszerLista) {
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
