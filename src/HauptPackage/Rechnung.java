package HauptPackage;

import java.util.ArrayList;
import java.util.Date;

public class Rechnung {
    private Kunde kunde;
    private Date datum;
    private static int rechnungsnummer=10000;

    private ArrayList<Position> posis;

    Rechnung(){
        datum=new Date();
        this.rechnungsnummer+=1;
    }

    Rechnung(Kunde k){
        posis=new ArrayList<Position>();
        datum=new Date();
        kunde=k;
        this.rechnungsnummer+=1;
    }

    public String toString(){
        String a="Herr Max Musstermann\nMusterstraße 1\nMusterhaußen 9999 \n\n\nRechnung\t\t\t\t\t\t\t\t\t\t\t\tDatum: "+datum.toString()+"\n\n";
        a+= kunde.toString(rechnungsnummer);
        for (Position x:
             posis) {
            a+=x.toString();
        }
        a+="----------------------------------------------------------------------------------------\n";

        a+="\n\t\t\t\t\t\t\tMWTS:\t"+gesamtMWST()+"Euro\n\t\t\t\t\t\t\tGesamt:\t"+gesamtPreis()+"Euro\n\n";


        return a;

    }

    public int gesamtMWST(){
        int a=0;
        for (Position x:
             posis) {
            a+=x.getArtikel().getMwst()*x.getMaenge();
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

