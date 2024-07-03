import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Versaldo extends JFrame {


    private JPanel panelsaldo;
    private JButton Regresar;
    private JTextField mostrarsaldo;
    private JLabel toatl;
    public  double cantidadQuemada = 1000.0;


    public Versaldo(){
        super("Ventana de saldo ");
        cuenta Cuenta = cuenta.getInstance();

       //saldo = new JLabel("Saldo: $" + Cuenta.getBalance());
       // saldo.setText(toatl);


       //toatl.setText("Saldo: $"+Cuenta.getBalance());




        JTextField textoField = new JTextField();
        String texto = Double.toString(Cuenta.getBalance());
        textoField.setText(texto);
        mostrarsaldo.setText(texto);


        setContentPane(panelsaldo);



        Regresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu ventana_menu = new Menu();
                ventana_menu.Iniciar();
                dispose();
            }
        });
    }


    public void  Iniciar (){
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
