import javax.swing.*;

public class Ekvation {
    public static void main(String[] args) {

        while(true) {
            int grad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ange ekvationens grad"));
        } if (grad =0) {
            double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Ange a"));
            JOptionPane.showMessageDialog(a);

        } else if (grad =1) {
            double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Ange a"));
            double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Ange b"));
            JOptionPane.showMessageDialog(-a/b);

        } else if (grad =2) {
            double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Ange a"));
            double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Ange b"));
            double c = Double.parseDouble(JOptionPane.showInputDialog(null, "Ange c"));
            JOptionPane.showMessageDialog(-(b/2a) +((b/(2a)^2) - b);

        } else if (grad =3) {
            double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Ange a"));
            double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Ange b"));
            double c = Double.parseDouble(JOptionPane.showInputDialog(null, "Ange c"));
            double d = Double.parseDouble(JOptionPane.showInputDialog(null, "Ange d"));
            JOptionPane.showMessageDialog();

        }


    }
}