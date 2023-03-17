public class Pizza {

    public String nome;
    public double valor;
    public boolean possuiBorda;

    public Double CalcularValor(Boolean possuiBorda) { //criado o metodo
        if (possuiBorda) {
            return valor + 5.00;
        }
        return valor;

    }
    public String ConsultarNome(){
        return nome;
    }
}