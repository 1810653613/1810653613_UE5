import javax.swing.*;

public class Vergleichen {
    public static void main(String [] args){
        String var1= JOptionPane.showInputDialog("Befüllen sie diesen String");
        String var2= JOptionPane.showInputDialog("Befüllen sie diesen String");
        String var3= JOptionPane.showInputDialog("Befüllen sie diesen String");

        if(var1 .equals(var2)){
            System.out.println("var1 und var2 sind gleich");
        }
        if(var1.equals(var3)){
            System.out.println("var1 und var3 sind gleich");
        }
        if(var2.equals(var3)){
            System.out.println("var2 und var3 sind gleich");
        }
        else{
            System.out.println("keine der Eingegebenen befüllungen sind gleich");
        }

    }
}