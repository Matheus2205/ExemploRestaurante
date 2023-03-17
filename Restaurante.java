import javax.swing.JOptionPane;

public class Restaurante {

        public static void main(String[] args) {

         String opcao = JOptionPane.showInputDialog("Informe o pedido \n 1.Hamburguer \n 2.Pizza \n 3. Sair");

         if(opcao.equals("2")){
             String nome = JOptionPane.showInputDialog("Informe o sabor da pizza:");
             Double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da pizza:"));

             String bordaDigitada = JOptionPane.showInputDialog("Voce deseja borda? s- SIM \n n - NAO");
             boolean bordaParaCalculo;

             if(bordaDigitada.equals("S"));{
                 bordaParaCalculo = true;

             }
             else{
                 bordaParaCalculo = false;
             }

             Pizza p = new Pizza(); // construcao do objeto
             p.nome = nome;
             p.valor = valor;

             double valorTotal = p.CalcularValor(bordaParaCalculo);

             JOptionPane.showMessageDialog(null,"Pedido",+ valorTotal, "Pedido", JOptionPane.INFORMATION_MESSAGE);

         }




    }
}
