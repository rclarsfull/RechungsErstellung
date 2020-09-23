package HauptPackage;

public class Artikel {
    private String beschreibung,name;
    private int lager,mwst;
    private static int artNummer=100000;
    private  double preis;

    Artikel(){
        this.artNummer=artNummer+1;
    }


    Artikel(String name,String beschreibung, int lagerBestand,int mwst,double preis){
        this.beschreibung=beschreibung;
        this.lager=lagerBestand;
        this.mwst=mwst;
        this.name=name;
        this.preis=preis;
        this.artNummer=artNummer+1;
    }



    public double getMwstberechnet(){
        return preis/100*mwst;
    }



    public void setName(String name) {
        this.name = name;
    }





    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public void setLager(int lager) {
        this.lager = lager;
    }

    public void setMwst(int mwst) {
        this.mwst = mwst;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public String getName() {
        return name;
    }

    public double getPreis() {
        return preis;
    }

    public static int getArtNummer() {
        return artNummer;
    }

    public int getLager() {
        return lager;
    }

    public int getMwst() {
        return mwst;
    }

    public String getBeschreibung() {
        return beschreibung;
    }
}
