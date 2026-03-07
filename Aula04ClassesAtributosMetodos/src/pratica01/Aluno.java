package pratica01;

public class Aluno {
    String nome;
    String matricula;
    double nota;

    public Aluno() {

    }

    public Aluno(String nome, String matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    public void calculaMedia(double nota1, double nota2, double nota3) {
        double soma  = nota1+nota2+nota3;
        nota = soma / 3;
    }

    public void exibirInformacoes(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Média: " + this.nota);
    }
}
