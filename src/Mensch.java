public class Mensch extends Säugetier
{
    public Mensch(String Name, Integer Alter, String Geschlecht)
    {
        super(Name,Alter,Geschlecht);
    }

    @Override
    public String printAll()
    {
        return String.format("%s#%d#%s",getName(),getAlter(),getGeschlecht());
    }
}