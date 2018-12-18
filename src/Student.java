public class Student extends Mensch2
{
    private int martrikelnummer;
    private String studiengang;

    public Student(String vorname, String nachname, int alter, int martrikelnummer, String studiengang)
    {
        super (vorname, nachname, alter);
        this.martrikelnummer=martrikelnummer;
        this.studiengang=studiengang;
    }
    @Override
    public void Status()
    {
        System.out.println(String.format("Student;%s#%s#%d#%d#%s", getVorname(), getNachname(), getAlter(),getMartrikelnummer(),getStudiengang()));
    }

    public int getMartrikelnummer() {
        return martrikelnummer;
    }

    public void setMartrikelnummer(int martrikelnummer) {
        this.martrikelnummer = martrikelnummer;
    }

    public String getStudiengang() {
        return studiengang;
    }

    public void setStudiengang(String studiengang) {
        this.studiengang = studiengang;
    }
}
