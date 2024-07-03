import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Deposito extends JFrame {


    private JPanel paneldeposito;
    private JTextField cant_depositar;
    private JButton buttondeposito;
    private JButton volverButton;

    public Deposito(){
        super("Ventana Deposito");
        setContentPane(paneldeposito);


        volverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu ventana_menu = new Menu();
                ventana_menu.Iniciar();
                dispose();
            }
        });
        buttondeposito.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cantidaddeposito = cant_depositar.getText();

                double numeroIntdeposito = Integer.parseInt(cantidaddeposito);



                double monto = Double.parseDouble(cant_depositar.getText());
                cuenta.getInstance().deposito(monto);
                Menu ventana_menu = new Menu();
                ventana_menu.Iniciar();
                dispose();
            }
        });
    }

    public void  Iniciar (){
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(600,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

}
