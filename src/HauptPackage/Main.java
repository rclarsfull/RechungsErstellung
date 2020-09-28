//package HauptPackage;

public class Main {

    public static void main(String[] args) {
    Kunde kunde1=new Kunde("Herr","Wojtek","Przybylek","64711","Unterdorf 11");
    
    Artikel art1=new Artikel("Reifen","---",10,19,100); //
    Artikel art2=new Artikel("Stift ","---",1300,19,10);
    Artikel art3=new Artikel("Fleisch","---",100,7,5);
    
    Rechnung rechung1=new Rechnung(kunde1,1,art1,5);
    
    rechung1.addPosi(new Position(2,art2,100));  //(posNR,Artikel,Stk.)
    rechung1.addPosi(new Position(3,art3,2));


    System.out.println(rechung1.toString());

    }
}
