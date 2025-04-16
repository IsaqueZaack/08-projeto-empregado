public abstract class Empregado {
    long matricula;
    String nome;

    public Empregado(long matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public String getDados() {
        String aux = "";
        aux += "Matrícula: " + matricula + "\n";
        aux += "Nome: " + nome + "\n";
        return aux;
    }

    public abstract double calcularSalario (); // usamos o abstract no método quando não informamos o seu corpo
}
