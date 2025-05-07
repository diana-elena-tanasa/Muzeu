import java.util.*;

public class Muzeu {
    private List<Exponat> exponate = new ArrayList();
    private List<Vizitator> vizitatori = new ArrayList();
    private List<Galerie> galerii = new ArrayList();
    private List<Bilet> bilete = new ArrayList();

    public Muzeu() {
    }

    public List<Exponat> getExponate() {
        return this.exponate;
    }

    public void setExponate(List<Exponat> exponate) {
        this.exponate = exponate;
    }

    public List<Vizitator> getVizitatori() {
        return this.vizitatori;
    }

    public void setVizitatori(List<Vizitator> vizitatori) {
        this.vizitatori = vizitatori;
    }

    public List<Galerie> getGalerii() {
        return this.galerii;
    }

    public void setGalerii(List<Galerie> galerii) {
        this.galerii = galerii;
    }

    public List<Bilet> getBilete() {
        return this.bilete;
    }

    public void setBilete(List<Bilet> bilete) {
        this.bilete = bilete;
    }

    public void adaugaExponat(Exponat exponat) {
        this.exponate.add(exponat);
    }

    public void inregistreazaVizitator(Vizitator vizitator) {
        this.vizitatori.add(vizitator);
    }

    public void emiteBilet(Galerie galerie) {
        Bilet biletDeIntrare = new Bilet(1, galerie);
        this.bilete.add(biletDeIntrare);
    }

    public void programeazaTurGhidat() {
    }

    public String raportVizitatoriPerGalerie() {
        StringBuilder str = new StringBuilder();
        Map<String, Integer> vizitatoriPerGalerie = new HashMap();
        Iterator var3 = this.bilete.iterator();

        while(var3.hasNext()) {
            Bilet bilet = (Bilet)var3.next();
            vizitatoriPerGalerie.put(bilet.getGalerie().getNumeGalerie(), (Integer)vizitatoriPerGalerie.getOrDefault(bilet.getGalerie().getNumeGalerie(), 0) + 1);
        }

        var3 = vizitatoriPerGalerie.entrySet().iterator();

        while(var3.hasNext()) {
            Map.Entry<String, Integer> entry = (Map.Entry)var3.next();
            str.append((String)entry.getKey()).append(" ").append(entry.getValue()).append("\n");
        }

        return str.toString();
    }
}
