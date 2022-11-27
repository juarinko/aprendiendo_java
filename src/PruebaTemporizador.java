import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class PruebaTemporizador {
    public static void main(String[] args) {

        getTime listener = new getTime();

        Timer miTemporizador = new Timer(2000, listener );
        miTemporizador.start();
        JOptionPane.showMessageDialog(null, "Press enter to stop");
    }
}

class getTime implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        Date now = new Date();

        System.out.println(now);
    }
}
