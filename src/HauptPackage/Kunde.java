package HauptPackage;

public class Kunde {
    private String vorname;
    private String anrede;
    private String nachname;
    private String plz;
    private String adresse;
    private static int kNummer=400000;

    Kunde(){
        this.kNummer=kNummer+1;
    }

    Kunde(String anrede,String vorname,String nachname, String plz,String adresse){
        this.kNummer=kNummer+1;
        this.vorname=vorname;
        this.nachname=nachname;
        this.adresse=adresse;
        this.anrede=anrede;
        this.plz=plz;
    }

    public String toString(){
        return anrede+" "+vorname+" "+nachname+"\t\t\t\t\t\t\t\t\tKunden Nummer: "+kNummer+"\n"+adresse+"\n"+plz+"\n\n\n\n";
    }

    public String toString(int rechnungsnummer){
        return anrede+" "+vorname+" "+nachname+"\t\t\t\t\t\t\t\t\tKunden Nummer: "+kNummer+"\n"+adresse+"\t\t\t\t\t\t\t\t\t\t\tRechnungs Nummer: "+rechnungsnummer+"\n"+plz+"\n\n\n\n";
    }

}
