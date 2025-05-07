public class Vizitator {
    private int id;
    private String nume;

    public Vizitator(int id, String nume) {
        this.id = id;
        this.nume = nume;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return this.nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
