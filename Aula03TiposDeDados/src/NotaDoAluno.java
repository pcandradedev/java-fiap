import java.util.Scanner;

public class NotaDoAluno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double n1;
        double n2;
        double n3;

        System.out.println("Digite o nome do aluno: ");
        entrada.nextLine();

        System.out.println("Digite a primeira nota: ");
        n1 = entrada.nextDouble();
        System.out.println("Digite a segunda nota: ");
        n2= entrada.nextDouble();
        System.out.println("Digite a terceira nota: ");
        n3 = entrada.nextDouble();

        calcularMedia(n1, n2, n3);

        // Podemos fazer dentro do main
        double media1 = (n1+n2+n3)/3;
        System.out.println("A média do aluno é: " + media1);
    }

    // Podemos também criar um metodo que sera responsavel por calcular a media.
    public static void calcularMedia(double m1, double m2, double m3) {
        double media2 = (m1 + m2 + m3) / 3;
        System.out.println("A média do aluno é: " + media2);
    }
}
