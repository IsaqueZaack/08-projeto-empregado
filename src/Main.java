public class Main {
    public static void main(String[] args) {

        Empregado[] empregado = new Empregado[3];
        empregado[0] = new EmpregadoComissionado(5555, "Isaque", 5, 10);
        empregado[1] = new EmpregadoHorista(6666, "Karla", 8, 20);
        empregado[2] = new EmpregadoComissionado(7777, "João", 6, 9);

        for (Empregado e : empregado) {
            System.out.println(e.getDados());
            System.out.println("Salário: R$" + e.calcularSalario());
            System.out.println();
        }

    }
}
