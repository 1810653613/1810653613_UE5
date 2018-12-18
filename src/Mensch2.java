public class Mensch2
{
    private String vorname;
    private String nachname;
    private int alter;

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public Mensch2 (String vorname, String nachname, int alter)
    {
        this.vorname=vorname;
        this.nachname=nachname;
        this.alter=alter;
    }

    public void Status()
    {
        System.out.println(String.format("Mensch;%s#%s#%d", getVorname(), getNachname(), getAlter()));
    }

}
