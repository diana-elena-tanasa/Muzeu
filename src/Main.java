public class Main {
    public static void main(String[] args) {
        Muzeu muzeu = new Muzeu();
        Galerie artaEuropeana = new Galerie(1, "galeria de arta europeana");
        Galerie artaOrientala = new Galerie(2, "Galeria de arta orientala");
        Galerie artaRomaneasca = new Galerie(3, "Galeria de arta romaneasca");
        Exponat portret = new Exponat(1, "Portret de femeie", "pictura");
        Exponat naturaMoarta = new Exponat(2, "Natura Moarta", "pictura");
        Exponat covorDeRugaciune = new Exponat(3, "Covor de rugaciune", "artefact");
        Vizitator Vicky = new Vizitator(1, "Vicky");
        Vizitator Ema = new Vizitator(2, "Ema");
        Vizitator Laurentiu = new Vizitator(3, "Laurentiu");
        artaOrientala.adaugaExponat(covorDeRugaciune);
        artaRomaneasca.adaugaExponat(naturaMoarta);
        artaEuropeana.adaugaExponat(portret);
        muzeu.adaugaExponat(portret);
        muzeu.adaugaExponat(naturaMoarta);
        muzeu.adaugaExponat(covorDeRugaciune);
        System.out.println(artaOrientala.getDetaliiGalerie());
        muzeu.inregistreazaVizitator(Ema);
        muzeu.inregistreazaVizitator(Vicky);
        muzeu.inregistreazaVizitator(Laurentiu);
        muzeu.emiteBilet(artaEuropeana);
        muzeu.emiteBilet(artaOrientala);
        muzeu.emiteBilet(artaRomaneasca);
        muzeu.emiteBilet(artaRomaneasca);
        muzeu.emiteBilet(artaEuropeana);
        muzeu.emiteBilet(artaEuropeana);
        System.out.println(muzeu.raportVizitatoriPerGalerie());
    }
}