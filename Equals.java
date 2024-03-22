import javax.swing.JOptionPane;
public class Equals {
    public static void main(String[] args){
        String resposta = JOptionPane.showInputDialog("Você quer saber um segredo? (S/N)");

        if(resposta.equals ("S")){
             JOptionPane.showMessageDialog(null, "Segredo");
        }
    }
}
