public class Bilet {
    private int id;
    private Galerie galerie;

    public Bilet(int id, Galerie galerie) {
        this.id = id;
        this.galerie = galerie;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Galerie getGalerie() {
        return this.galerie;
    }

    public void setGalerie(Galerie galerie) {
        this.galerie = galerie;
    }
}
