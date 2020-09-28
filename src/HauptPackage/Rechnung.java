//package HauptPackage;

import java.util.ArrayList;
import java.util.Date;

public class Rechnung {
    private Kunde kunde;
    private Date datum;
    private int rechnungsnummer;
    private static int autowert=10000;

    private ArrayList<Position> posis;

    Rechnung(){
        datum=new Date();
        autowert+=1;
        rechnungsnummer=autowert;
        posis=new ArrayList<Position>();
    }

    Rechnung(Kunde k,int posNummer,Artikel a,int maenge){
        posis=new ArrayList<Position>();
        this.addPosi(new Position(posNummer,a,maenge));
        datum=new Date();
        kunde=k;
        autowert+=1;
        rechnungsnummer=autowert;
    }

    public String toString(){
        String a="\n\n\nHerr Max Musstermann\nMusterstraße 1\nMusterhaußen 9999 \n\n\nRechnung\t\t\t\t\t\tDatum: "+datum.toString()+"\n\n";
        a+= kunde.toString(rechnungsnummer);
        for (Position x:
             posis) {
            a+=x.toString();
        }
        a+="----------------------------------------------------------------------------------------\n";

        a+="\n\t\t\t\t\t\t\tNETTO:\t"+this.nettoPreis()+"\tEuro\n\t\t\t\t\t\t\tMWTS:\t"+this.gesamtMWST()+"\tEuro\n\t\t\t\t\t\t\tGesamt:\t"+this.gesamtPreis()+"\tEuro\n\n";


        return a;

    }

    public int gesamtMWST(){
        int a=0;
        for (Position x:
             posis) {
            a+=x.getArtikel().getMwstberechnet()*x.getMaenge();
        }
        return a;
    }

    public int gesamtPreis(){
        int a=0;
        for (Position x:
                posis) {
            a+=x.getArtikel().getPreis()*x.getMaenge();
        }
        a+=gesamtMWST();
        return a;
    }
  
  public int nettoPreis(){
        int a=0;
        for (Position x:
                posis) {
            a+=x.getArtikel().getPreis()*x.getMaenge();
        }
        return a;
    }



    public void addPosi(Position a){
        posis.add(a);
    }

    public  void removePosi(int posNummer){
        posis.remove(posNummer-1);
    }

    public ArrayList<Position> getPosis() {
        return posis;
    }

    public Date getDatum() {
        return datum;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }

    public void setPosis(ArrayList<Position> posis) {
        this.posis = posis;
    }
}

