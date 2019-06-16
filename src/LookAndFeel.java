import javax.swing.*;

public class LookAndFeel {
    public static void main(String[] args) {
        UIManager.LookAndFeelInfo[] lookAndFeelInfos = UIManager.getInstalledLookAndFeels();
        for (UIManager.LookAndFeelInfo lookAndFeelInfo : lookAndFeelInfos) {
            System.out.println(lookAndFeelInfo.getName());
            System.out.println(lookAndFeelInfo.getClassName());
        }
    }
}


/*
* Nimbus
javax.swing.plaf.nimbus.NimbusLookAndFeel
* CDE/Motif
com.sun.java.swing.plaf.motif.MotifLookAndFeel
* GTK+
com.sun.java.swing.plaf.gtk.GTKLookAndFeel
 */

/*
try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
*/