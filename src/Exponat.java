public class Exponat {
    private int id;
    private String nume;
    private String tip;

    public Exponat(int id, String nume, String tip) {
        this.id = id;
        this.nume = nume;
        this.tip = tip;
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

    public String getTip() {
        return this.tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getDetaliiExponat() {
        return "Exponat cu id " + this.id + ", nume " + this.nume + ", tip " + this.tip;
    }

}
