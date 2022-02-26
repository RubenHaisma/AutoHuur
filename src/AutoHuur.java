public class AutoHuur {
    private int aantalDagen;
    private Klant huurder;
    private Auto gehuurdeAuto;

    public AutoHuur(){
    }
    public void setAantalDagen(int aD){
        aantalDagen=aD;
    }
    public int getAantalDagen(){
        return aantalDagen;
    }
    public void setGehuurdeAuto(Auto gA){
        gehuurdeAuto=gA;
    }
    public Auto getGehuurdeAuto(){
        return gehuurdeAuto;
    }
    public void setHuurder(Klant k){
        huurder=k;
    }
    public Klant getHuurder(){
        return huurder;
    }
    public double totaalPrijs(){
        if(aantalDagen==0){
            return 0.0;
        }
        return aantalDagen*gehuurdeAuto.getPrijsPerDag()*((huurder.getKorting()*9)/100);
    }
    public String toString(){
        String a;
        String b;
        String c;
        if(gehuurdeAuto==null){
            a= "er is geen auto bekend\n";
        }
        else{
            a= gehuurdeAuto + "\n";
        }

        if(huurder==null){
            b=  "er is geen huurder bekend\n";
        }
        else{
            b=  huurder + "\n";
        }
        c=  "aantal dagen: " + aantalDagen + " en dat kost: " + totaalPrijs() + "\n";
        return a+b+c;


    }

}