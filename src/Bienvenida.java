import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bienvenida extends  JFrame{
    private JPanel panelbienvenida;
    private JTextField contra;
    private JButton button1;

    public Bienvenida() {
        super("pantalla de bienvenida");
        setContentPane(panelbienvenida);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String contraseña = "12345";


                String contraingresada = contra.getText();
                if (contraseña.equals(contraingresada)){
                    Menu ventana_menu = new Menu();
                    ventana_menu.Iniciar();
                    dispose(); //es para llamar el formulario y ver lo que tiene


                }else {
                    JOptionPane.showMessageDialog(null,"Intente otra vez");
                    contra.setText("");
                }



            }
        });



    }

    public void  Iniciar (){
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
