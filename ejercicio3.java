import javax.swing.JOptionPane;

public class ejercicio3 {
    public static void main(String[] args) {
        String inputA = JOptionPane.showInputDialog("Piensa un número del [1 - 99]");
        int a = Integer.parseInt(inputA);

        if (a > 1 && a < 100) {
            String inputB = JOptionPane.showInputDialog("Elige el año de tu nacimiento");
            int b = Integer.parseInt(inputB);

            int r = (a * 100) - b;

            String inputF = JOptionPane.showInputDialog("Pon el año en el que estamos");
            int f = Integer.parseInt(inputF);

            int t = r + f;

            JOptionPane.showMessageDialog(null, "Procesando...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            JOptionPane.showMessageDialog(null, "Cargando...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            JOptionPane.showMessageDialog(null, "Tu edad es: Syntax error");
            JOptionPane.showMessageDialog(null, "¡No te creas🤣");
            JOptionPane.showMessageDialog(null, "Cargando...");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            JOptionPane.showMessageDialog(null, "Tu edad es: " + (t % 100));
        }
    }
}
