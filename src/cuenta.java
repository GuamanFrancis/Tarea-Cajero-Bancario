import javax.swing.*;

public class cuenta extends JFrame {

    private static cuenta valor;
    private double balance;

    private cuenta(double valorinicial) {
        this.balance = valorinicial;
    }

    public static cuenta getInstance() {
        if (valor == null) {
            valor = new cuenta(1000.00);
        }
        return valor;
    }

    public void retiro(double monto) {
        if (balance >= monto) {
            balance -= monto;
            JOptionPane.showMessageDialog(null,"Retiro exitoso: $" + monto);


        } else {
            JOptionPane.showMessageDialog(null,"Fondos insuficientes. Saldo actual: $" + balance);


        }
    }

    public void deposito(double monto) {
        balance += monto;
        JOptionPane.showMessageDialog(null,"Depósito exitoso: $" + monto);

    }

    public double getBalance() {
        return balance;
    }


}
