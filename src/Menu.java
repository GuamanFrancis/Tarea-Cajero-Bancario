import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends  JFrame{
    private JPanel Menu;
    private JRadioButton versaldo;
    private JRadioButton retiroRadioButton;
    private JRadioButton deposito;
    private JRadioButton salir;


    public Menu (){
        super("Transacción a realizar");
        setContentPane(Menu);
        versaldo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Versaldo ventana_principal = new Versaldo();
                ventana_principal.Iniciar();
                dispose();


            }
        });


        deposito.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                  Deposito ventana_deposito = new Deposito();
                  ventana_deposito.Iniciar();
                  dispose();

            }
        });
        retiroRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Retiro ventana_Menu = new Retiro();
                ventana_Menu.Iniciar();
                dispose();

            }
        });
        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Gracias por usar nuestro sistema");
                dispose();


            }
        });
    }
    public void  Iniciar (){
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(400,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
