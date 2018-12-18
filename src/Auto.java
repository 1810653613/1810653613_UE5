public class Auto extends Fahrzeug implements Comparable<Auto>
{
    //attribute
    private boolean klimaanlage;
    private int airbags;
    private String name;

    //Konstruktor
    public Auto(short reifen, String farbe, short ps, short tueren, short geschwindigkeit, int airbags,String name)
    {
        super(reifen, farbe, ps, tueren, geschwindigkeit);
        this.klimaanlage=true;
        this.airbags=airbags;
        this.name=name;
    }
    //Getter und Setter
    public boolean getKlimaanlage() {
        return klimaanlage;
    }

    public void setKlimaanlage(boolean klimaanlage) {
        this.klimaanlage = klimaanlage;
    }

    public int getAirbags() {
        return airbags;
    }

    public void setAirbags(int airbags) {
        this.airbags = airbags;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    //Auto wird aufsteigend geordnet, dh erste auto mehr ps als das zweite steht es oben
    public int compareTo(Auto o)
    {
        if (this.getPs()== o.getPs()){
            return 0;
        }
        if (this.getPs() < o.getPs()){
            return 1; //jede positive Nummer ist möglich
        }
        return -1; //jede negative Nummer ist möglich
    }
    @Override
    public String toString(){
        return "Mein Auto hat " + this.getPs() + " PS und fährt " + this.getGeschwindigkeit();
    }

}