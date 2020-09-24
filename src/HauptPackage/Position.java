//package HauptPackage;

public class Position {
    private int maenge;
    private Artikel artikel;
    private int posNummer;

    Position(int posNummer,Artikel a,int maenge){
        artikel=a;
        this.maenge=maenge;
        this.posNummer=posNummer;
    }

    public String toString(){
        return "----------------------------------------------------------------------------------------\n"+
                posNummer+".      | "+maenge+"x\t"+artikel.getName()+"\t\t | "+artikel.getPreis()+"Euro\t\t|"+artikel.getPreis()*maenge+"Euro\n";

    }

    public Artikel getArtikel() {
        return artikel;
    }

    public int getMaenge() {
        return maenge;
    }

    public void setArtikel(Artikel artikel) {
        this.artikel = artikel;
    }

    public void setMaenge(int maenge) {
        this.maenge = maenge;
    }


}
