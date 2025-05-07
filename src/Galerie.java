import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Galerie {
    private int id;
    private String numeGalerie;
    private List<Exponat> exponate;

    public Galerie(int id, String numeGalerie) {
        this.id = id;
        this.numeGalerie = numeGalerie;
        this.exponate = new ArrayList();
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumeGalerie() {
        return this.numeGalerie;
    }

    public void setNumeGalerie(String numeGalerie) {
        this.numeGalerie = numeGalerie;
    }

    public List<Exponat> getExponate() {
        return this.exponate;
    }

    public void setExponate(List<Exponat> exponate) {
        this.exponate = exponate;
    }

    public void adaugaExponat(Exponat exponat) {
        this.exponate.add(exponat);
    }

    public String getDetaliiGalerie() {
        StringBuilder str = new StringBuilder();
        str.append(this.numeGalerie).append("\n");
        Iterator var2 = this.exponate.iterator();

        while(var2.hasNext()) {
            Exponat exponat = (Exponat)var2.next();
            str.append(exponat.getId()).append(" ").append(exponat.getNume()).append(" ").append(exponat.getTip()).append("\n");
        }

        return str.toString();
    }
}
