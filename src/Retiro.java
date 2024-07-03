import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Retiro extends JFrame{

    private JPanel RETIRO;
    private JTextField cant_Retirar;
    private JButton buttonIngresar;
    private JButton Regresar;


    public Retiro(){
        super("Transacción a realizar");
        setContentPane(RETIRO);


        Regresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu ventana_menu = new Menu();
                ventana_menu.Iniciar();
                dispose();

            }
        });
        buttonIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cantidadretiro = cant_Retirar.getText();

                double numeroIntretiro = Integer.parseInt(cantidadretiro);



                double monto = Double.parseDouble(cant_Retirar.getText());
                cuenta.getInstance().retiro(monto);
                Menu ventana_menu = new Menu();
                ventana_menu.Iniciar();
                dispose();

            }
        });
    }

    public void Iniciar() {
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }



}
