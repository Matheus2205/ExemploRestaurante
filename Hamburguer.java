public class Hamburguer {

    public String nome;
    public double valor;
    public boolean eartesanal;

    public double ValorHamburguer(boolean eartesanal) {
        if (eartesanal) {
            return valor + 8.00;
        }
        return valor;

    }

    public String ConsultarNome() {
        return nome;
    }
}
