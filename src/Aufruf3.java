import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aufruf3
{
    public static void main (String[]args)
    {
        List<Auto> liste1= new ArrayList<>();
        liste1.add(new Auto( (short) 4,"blau",(short)190,(short)5,(short)200,(short)8,"Audi"));
        liste1.add(new Auto( (short) 4,"green",(short)125,(short)5,(short)180,(short)8,"Skoda"));
        liste1.add(new Auto( (short) 4,"yellow",(short)150,(short)5,(short)190,(short)10,"VW"));
        liste1.add(new Auto( (short) 4,"pink",(short)90,(short)3,(short)160,(short)6,"Mercedes"));
        liste1.add(new Auto( (short) 4,"grey",(short)450,(short)3,(short)280,(short)12,"BMW"));
        Collections.sort(liste1);

        for (Auto a: liste1)
        {
            System.out.println(a);
        }
    }
}
