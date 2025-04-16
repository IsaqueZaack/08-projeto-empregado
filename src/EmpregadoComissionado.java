import java.text.DecimalFormat;

public class EmpregadoComissionado extends Empregado { // extends realiza a herança, definindo a superclasse
    double totalDeVendas;
    double comissao;

    public EmpregadoComissionado(long matricula, String nome, double totalDeVendas, double comissao) {
        super(matricula, nome); // é um método --> construtor da superclasse
        this.totalDeVendas = totalDeVendas;
        this.comissao = comissao;
    }

    public String getDados() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        String aux = super.getDados(); // é um objeto --> referencia a superclasse
        aux += "Total de vendas: " + df.format(totalDeVendas) + "\n";
        aux += "Comissão: " + df.format(comissao) + "%\n";
        return aux;
    }

    public double calcularSalario () {
        return totalDeVendas * comissao / 100;
    }
}


